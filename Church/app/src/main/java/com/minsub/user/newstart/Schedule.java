package com.minsub.user.newstart;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Schedule extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);

        Typeface my = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt = (TextView)findViewById(R.id.text1);
        mt.setTypeface(my);

        Typeface my2 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt2 = (TextView)findViewById(R.id.text2);
        mt2.setTypeface(my2);

        Typeface my3 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt3 = (TextView)findViewById(R.id.text3);
        mt3.setTypeface(my3);

        Typeface my4 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt4 = (TextView)findViewById(R.id.text4);
        mt4.setTypeface(my4);

        Typeface my5 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt5 = (TextView)findViewById(R.id.text5);
        mt5.setTypeface(my5);

        Typeface my6 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt6 = (TextView)findViewById(R.id.text6);
        mt6.setTypeface(my6);

        Typeface my7 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt7 = (TextView)findViewById(R.id.text7);
        mt7.setTypeface(my7);

        Typeface my8 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt8 = (TextView)findViewById(R.id.text8);
        mt8.setTypeface(my8);

        Typeface m1 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b1 = (Button)findViewById(R.id.church_bt);
        b1.setTypeface(m1);

        Typeface m2 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b2 = (Button)findViewById(R.id.way_bt);
        b2.setTypeface(m2);

        Typeface m3 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b3 = (Button)findViewById(R.id.rev_bt);
        b3.setTypeface(m3);

        Typeface m4 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b4 = (Button)findViewById(R.id.sch_bt);
        b4.setTypeface(m4);

        Button sch_bt = (Button) findViewById(R.id.sch_bt);
        sch_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Schedule.this, Schedule.class);
                // Start next activity
                startActivity(intent);
                Schedule.this.finish();
            }
        });


        ImageButton home_bt = (ImageButton) findViewById(R.id.home_bt);
        home_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Schedule.this, MainActivity.class);
                // Start next activity
                startActivity(intent);
                Schedule.this.finish();
            }
        });

        Button rev_bt = (Button) findViewById(R.id.rev_bt);
        rev_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Schedule.this, RevIntro.class);
                // Start next activity
                startActivity(intent);
                Schedule.this.finish();
            }
        });

        Button way_bt = (Button) findViewById(R.id.way_bt);
        way_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Schedule.this, MapsActivity.class);
                // Start next activity
                startActivity(intent);
                Schedule.this.finish();
            }
        });

        Button church_bt = (Button) findViewById(R.id.church_bt);
        church_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Schedule.this, Introduce.class);
                // Start next activity
                startActivity(intent);
                Schedule.this.finish();
            }
        });

    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Schedule.this, MainActivity.class);
        // Start next activity
        startActivity(intent);
        Schedule.this.finish();


    }
}
