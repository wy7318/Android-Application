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

public class RevIntro extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rev_intro);

        Typeface my = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt = (TextView)findViewById(R.id.text1);
        mt.setTypeface(my);

        Typeface my2 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt2 = (TextView)findViewById(R.id.text2);
        mt2.setTypeface(my2);

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

                Intent intent = new Intent(RevIntro.this, Schedule.class);
                // Start next activity
                startActivity(intent);
                RevIntro.this.finish();
            }
        });

        ImageButton home_bt = (ImageButton) findViewById(R.id.home_bt);
        home_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RevIntro.this, MainActivity.class);
                // Start next activity
                startActivity(intent);
                RevIntro.this.finish();
            }
        });

        Button rev_bt = (Button) findViewById(R.id.rev_bt);
        rev_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RevIntro.this, RevIntro.class);
                // Start next activity
                startActivity(intent);
                RevIntro.this.finish();
            }
        });

        Button way_bt = (Button) findViewById(R.id.way_bt);
        way_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RevIntro.this, MapsActivity.class);
                // Start next activity
                startActivity(intent);
                RevIntro.this.finish();
            }
        });

        Button church_bt = (Button) findViewById(R.id.church_bt);
        church_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RevIntro.this, Introduce.class);
                // Start next activity
                startActivity(intent);
                RevIntro.this.finish();
            }
        });

    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(RevIntro.this, MainActivity.class);
        // Start next activity
        startActivity(intent);
        RevIntro.this.finish();


    }
}