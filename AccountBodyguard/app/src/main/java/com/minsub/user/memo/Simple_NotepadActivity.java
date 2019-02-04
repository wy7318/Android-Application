package com.minsub.user.memo;

/**
 * @author Michał Moczulski
 * twitter_url: http://twitter.com/#!/moczul
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.GridView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Simple_NotepadActivity extends Activity implements
		OnItemClickListener {



	private BackPressCloseHandler backPressCloseHandler;
	int temp;

	final int DIALOG_LIST = 1;

	// Tag for debugging
	private static final String TAG = "notepad";

	// our views from layout
	private ListView noteList;
	private Button addNoteBtn;

	EditText inputSearch;
	// adapter use to populate the listview
	private ArrayAdapter<String> adapter;
	// cursor will contain notes from database
	private Cursor notes;
	// database helper
	private DBHelper dbhelper;

	// items contain notes titles
	private ArrayList<String> titles;
	private ArrayList<Item> items;

	// variable will contain the position of clicked item in listview
	private int position = 0;


	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);



		Button info_bt = (Button) findViewById(R.id.info_bt);
		info_bt.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Simple_NotepadActivity.this, Info.class);
				// Start next activity
				startActivity(intent);


			}
		});





		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder()
				//.addTestDevice(AdRequest.DEVICE_ID_EMULATOR) // 테스트 광고 요청
				.build();
		mAdView.loadAd(adRequest);


		inputSearch = (EditText) findViewById(R.id.inputSearch);
		noteList = (ListView) findViewById(R.id.noteList);
		addNoteBtn = (Button) findViewById(R.id.addNote);


		// initialization of database helper
		dbhelper = new DBHelper(getApplicationContext());

		// setting note's titles to item in listview
		setNotes();

		// setting that longclick on listview will open the context menu
		this.registerForContextMenu(noteList);

		// onClicklistener for our "new note" button
		// click on button will open CreateNote Activity
		addNoteBtn.setOnClickListener(new View.OnClickListener() {

			// 라디오버튼
			@Override
			public void onClick(View v) {
				showDialog(DIALOG_LIST);

			}
		});

		inputSearch.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
				// When user changed the Text
				Simple_NotepadActivity.this.adapter.getFilter().filter(cs);
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
										  int arg3) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
			}
		});

	}


	// 라디오 버튼
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		// 다이얼로그를 처음 생성할 때 호출됨
		Log.d("test", "onCreateDialog");
		switch (id) {
			case DIALOG_LIST :
			AlertDialog.Builder builder3 =
					new AlertDialog.Builder(Simple_NotepadActivity.this);
			final String str[] = {getString(R.string.web),getString(R.string.bank)};
			builder3.setTitle(this.getString(R.string.type))
					.setPositiveButton(getString(R.string.yes),
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int which) {
									if (str[temp].equals(getString(R.string.web))) {
										Intent intent = new Intent(Simple_NotepadActivity.this, CreateNote.class);
										// Start next activity
										startActivity(intent);



									} else if (str[temp].equals(getString(R.string.bank))) {
										Intent intent = new Intent(Simple_NotepadActivity.this, CreateNoteBank.class);
										// Start next activity
										startActivity(intent);


									}
								}
							}

								)
										.setNegativeButton(getString(R.string.no),null)

								.

								setSingleChoiceItems
										(str,// 리스트배열 목록
										 -1, // 기본 설정값
												 new DialogInterface.OnClickListener() {
									public void onClick (DialogInterface dialog,
									int which){
										temp = which;
									}
								}

								);    // 리스너

								return builder3.create();

							}
			return super.onCreateDialog(id);
	}
// 라디오 버튼

	//
	public void setNotes() {
		// init the items arrayList
		titles = new ArrayList<String>();
		items = new ArrayList<Item>();



		// getting readable database
		SQLiteDatabase db = dbhelper.getReadableDatabase();
		// getting notes from db
		// see dbhelper for more details
		notes = dbhelper.getNotes2(db);


		// this should fix the problem
		// now the activity will be managing the cursor lifecycle
		startManagingCursor(notes);

		// closing database connection !important
		// always close connection with database
		// we closing database connection here because we don't use db anymore
		db.close();

		// populating ArrayList items with notes titles
		if (notes.moveToFirst()) {
			do {
				items.add(new Item(notes.getShort(0), notes.getString(1)));
			} while (notes.moveToNext());
		}
		
		
		for (Item i : items) {
			titles.add(i.getTitle());
		}


		// creating new adapter
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, titles);
		noteList.setAdapter(adapter);
		// setting listener to the listView
		noteList.setOnItemClickListener(this);





	}

	// always when we start this activity we want to refresh the list of notes
	@Override
	protected void onResume() {
		super.onResume();
		setNotes();
	}

	// this method is called when user long clicked on listview
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		// using menuInfo to determine which item of listview was clicked
		AdapterContextMenuInfo info = (AdapterContextMenuInfo) menuInfo;
		position = info.position;
		// setting the title of context menu header
		menu.setHeaderTitle(getResources().getString(R.string.CtxMenuHeader));
		// inflating the menu from xml file
		// for details see context_menu.xml file in /res/menu folder
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.context_menu, menu);

	}

	// method is called when user clicks on contextmenu item
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// getting the textView from ListView which item was clicked
		TextView tv = (TextView) noteList.getChildAt(position);
		// getting the title of this textView
		String title = tv.getText().toString();

		// performing one of actions, depending on user choice
		switch (item.getItemId()) {

		case R.id.showNote:
				Intent mIntent = new Intent(this, OneNote.class);
				mIntent.putExtra("id", items.get(position).getId());
				startActivity(mIntent);
			break;

		case R.id.editNote:
			Intent i = new Intent(this, CreateNote.class);
			i.putExtra("id", items.get(position).getId());
			Log.d(TAG, title);
			// this is important
			// we send boolean to CreateNote activity
			// thanks to this boolean activity knows that user want to edit
			// notes
			i.putExtra("isEdit", true);
			startActivity(i);
			break;

		case R.id.removeNote:
			// removing this notes
			dbhelper.removeNote(items.get(position).getId());
			// refreshing the listView
			setNotes();
			break;

		}

		return false;

	}

	// when user click on note's title we're opening this note in OneNote
	// activity
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		TextView tv = (TextView) arg1;
		String title = tv.getText().toString();
		Intent mIntent = new Intent(this, OneNote.class);
		mIntent.putExtra("title", title);
		mIntent.putExtra("id", items.get(arg2).getId());
		startActivity(mIntent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {


		getMenuInflater().inflate(R.menu.context_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}






	//exit
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			new AlertDialog.Builder(this)
					.setIcon(android.R.drawable.ic_dialog_alert)
					.setTitle(this.getString(R.string.exit))
					.setMessage(this.getString(R.string.exit_message))
					.setPositiveButton(this.getString(R.string.yes),
							new DialogInterface.OnClickListener()
							{
								@Override
								public void onClick( DialogInterface dialog, int which )
								{
									moveTaskToBack(true);
									Simple_NotepadActivity.this.finish();
								}
							}
					).setNegativeButton(this.getString(R.string.no), null ).show();
			return true;
		}

		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		clearApplicationCache(null);
		android.os.Process.killProcess(android.os.Process.myPid() );
	}

	public void clearApplicationCache(java.io.File dir){  //종료시 모든 캐쉬 삭제
		if(dir==null) dir = getCacheDir();
		if(dir==null) return;
		java.io.File[] children = dir.listFiles();
		try{
			CookieManager cookieManager = CookieManager.getInstance();
			cookieManager.removeSessionCookie();

			for(int i=0;i<children.length;i++)
				if(children[i].isDirectory())
					clearApplicationCache(children[i]);
				else children[i].delete();
		}
		catch(Exception e){}
	}
	
}