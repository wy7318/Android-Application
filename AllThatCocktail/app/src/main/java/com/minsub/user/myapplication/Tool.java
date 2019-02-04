package com.minsub.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by USER on 2016-03-01.
 */
public class Tool extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool);

        Typeface my = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt = (TextView)findViewById(R.id.text);
        mt.setTypeface(my);

        Typeface my1 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt1 = (TextView)findViewById(R.id.text2);
        mt1.setTypeface(my1);

        Typeface my2 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt2 = (TextView)findViewById(R.id.text3);
        mt2.setTypeface(my2);

        Typeface my3 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt3 = (TextView)findViewById(R.id.text4);
        mt3.setTypeface(my3);

        Typeface my4 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt4 = (TextView)findViewById(R.id.text5);
        mt4.setTypeface(my4);

        Typeface my5 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt5 = (TextView)findViewById(R.id.text6);
        mt5.setTypeface(my5);

        Typeface my6 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt6 = (TextView)findViewById(R.id.text7);
        mt6.setTypeface(my6);

        Typeface my7 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt7 = (TextView)findViewById(R.id.text8);
        mt7.setTypeface(my7);

        Typeface my8 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt8 = (TextView)findViewById(R.id.text9);
        mt8.setTypeface(my8);

        Typeface my9 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt9 = (TextView)findViewById(R.id.text10);
        mt9.setTypeface(my9);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Tool.this, MainActivity.class);
        // Start next activity
        startActivity(intent);
        Tool.this.finish();
        super.onBackPressed();
    }
}