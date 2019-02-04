package com.minsub.user.memo;

/**
 * @author Michał Moczulski
 * twitter_url: http://twitter.com/#!/moczul
 */

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OneNote extends Activity {
	
	private static final String TAG = "notepad";
	
	//our views for display note title and content
	private TextView noteTitle;
	private TextView createdAt;
	private TextView noteID;
	private TextView notePassword;
	private TextView noteURL;
	private TextView noteContent;
	
	//dbhelper
	private DBHelper dbhelper;
	private SQLiteDatabase db;
	
	//default values for title and content variables
	private String title = "defaultTitle";
	private int id = 0;
	private String acntid = "defaultId";
	private String acntpas = "defaultPassword";
	private String url = "defaultURL";
	private String content = "defaultContent";
	private String date = "date";

	Button bt1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.onenote);

		Button bt1 = (Button) findViewById(R.id.bt1);
		bt1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(OneNote.this, Simple_NotepadActivity.class);
				// Start next activity
				startActivity(intent);
				OneNote.this.finish();
			}
		});
		
		//initialization of DBHelper
		dbhelper = new DBHelper(getApplicationContext());
		
		
		noteTitle = (TextView) findViewById(R.id.noteTitle);
		noteID = (TextView) findViewById(R.id.txt1);
		notePassword = (TextView) findViewById(R.id.txt2);
		noteURL = (TextView) findViewById(R.id.txt3);
		noteContent = (TextView) findViewById(R.id.noteContent);
		createdAt = (TextView) findViewById(R.id.createdAt);
		
		// getting intent
		Intent mIntent = getIntent();
		
		id = mIntent.getIntExtra("id", 0);
		
		
		//getting the readable database
		db = dbhelper.getReadableDatabase();
		
		//getting the note from database
		Cursor c = dbhelper.getNote(db, id);
		//closing the database connection
		db.close();
		
		//getting the content from cursor
		//getString(1) because first column is noteTitle and second is noteContent and the third column is date
		title = c.getString(0).toString();
		acntid = c.getString(1).toString();
		acntpas = c.getString(2).toString();
		url = c.getString(3).toString();
		content = c.getString(4).toString();
		date = c.getString(5).toString();
		
		//setting notes to our views
		noteTitle.setText(title);
		noteID.setText(acntid);
		notePassword.setText(acntpas);
		noteURL.setText(url);
		noteContent.setText(content);
		createdAt.setText(date);
	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(OneNote.this, Simple_NotepadActivity.class);
		// Start next activity
		startActivity(intent);
		OneNote.this.finish();
		super.onBackPressed();
	}


}
