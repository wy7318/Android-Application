package com.minsub.user.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends Activity {
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    Typeface my = Typeface.createFromAsset(getAssets(), "pink.otf");
    Button mt = (Button)findViewById(R.id.bt1);
    mt.setTypeface(my);

    Typeface my1 = Typeface.createFromAsset(getAssets(), "pink.otf");
    Button mt1 = (Button)findViewById(R.id.bt2);
    mt1.setTypeface(my1);

   Button popular = (Button) findViewById(R.id.bt1);
    popular.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MainActivity.this, Main.class);
            // Start next activity
            startActivity(intent);
            MainActivity.this.finish();
        }
    });

    Button prepare = (Button) findViewById(R.id.bt2);
    prepare.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MainActivity.this, Tool.class);
            // Start next activity
            startActivity(intent);
            MainActivity.this.finish();
        }
    });


}


}