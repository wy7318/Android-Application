package com.minsub.user.newstart;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Today extends Activity {
    /** Called when the activity is first created. */

    private String[] myString;
    private static final Random rgenerator = new Random();



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todaybible);


        Typeface my = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt = (TextView)findViewById(R.id.text1);
        mt.setTypeface(my);

        ImageButton home_bt = (ImageButton) findViewById(R.id.home_bt);
        home_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Today.this, MainActivity.class);
                // Start next activity
                startActivity(intent);
                Today.this.finish();
            }
        });



                Resources res = getResources();

            myString=res.getStringArray(R.array.Bible);

            String q = myString[rgenerator.nextInt(myString.length)];

            TextView tv = (TextView) findViewById(R.id.text1);
            tv.setText(q);

    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Today.this, MainActivity.class);
        // Start next activity
        startActivity(intent);
        Today.this.finish();


    }
}
