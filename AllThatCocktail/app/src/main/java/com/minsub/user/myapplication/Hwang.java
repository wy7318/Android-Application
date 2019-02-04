package com.minsub.user.myapplication;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by USER on 2016-02-27.
 */
public class Hwang extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hwang);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Typeface my = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt = (TextView)findViewById(R.id.text1);
        mt.setTypeface(my);

        Typeface my1 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt1 = (TextView)findViewById(R.id.text2);
        mt1.setTypeface(my1);

        Typeface my2 = Typeface.createFromAsset(getAssets(), "pink.otf");
        TextView mt2 = (TextView)findViewById(R.id.text);
        mt2.setTypeface(my2);


    }

}