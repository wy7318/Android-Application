package com.minsub.user.newstart;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;


public class MainActivity extends Activity {

    Button introbt;
    Button click_bt;
    Button bible_bt;
    Button service_bt;
    Button board_bt;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button introbt = (Button) findViewById(R.id.introbt);
        introbt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Introduce.class);
                // Start next activity
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

        Button click_bt = (Button) findViewById(R.id.click_bt);
        click_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Today.class);
                // Start next activity
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

        Button bible_bt = (Button) findViewById(R.id.bible_bt);
        bible_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Bible.class);
                // Start next activity
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

        Button service_bt = (Button) findViewById(R.id.service_bt);
        service_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ServiceScreen.class);
                // Start next activity
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

        Button notice_bt = (Button) findViewById(R.id.notice_bt);
        notice_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Notice.class);
                // Start next activity
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

    }
}





