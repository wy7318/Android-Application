package com.minsub.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MTequila extends Activity {
    GridView grid;
    String[] web = {
            getString(R.string.cinco),
            getString(R.string.dana),
            getString(R.string.doralto),
            getString(R.string.horney),
            getString(R.string.juan),
            getString(R.string.paloma),
            getString(R.string.puerto),
            getString(R.string.salty),
            getString(R.string.sky),
            getString(R.string.snap),
            getString(R.string.sparklingapple),
            getString(R.string.furnace)
    } ;
    int[] imageId = {
            R.drawable.cinco_herradura,
            R.drawable.dana_scully,
            R.drawable.doralto,
            R.drawable.horney_bull,
            R.drawable.juan_collins,
            R.drawable.paloma,
            R.drawable.puerto_vallarta,
            R.drawable.salty_chihuahua,
            R.drawable.sky_cooler,
            R.drawable.snap_crackle,
            R.drawable.sparkling_apple,
            R.drawable.tequila_furnace,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mtequila);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        CustomGrid adapter = new CustomGrid(MTequila.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(MTequila.this, Cinco.class);

                    startActivity(intent);
                } else if (position == 1) {

                    Intent intent2 = new Intent(MTequila.this, Dana.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 2) {

                    Intent intent2 = new Intent(MTequila.this, Doralto.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 3) {

                    Intent intent2 = new Intent(MTequila.this, Horney.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 4) {

                    Intent intent2 = new Intent(MTequila.this, Juan.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 5) {

                    Intent intent2 = new Intent(MTequila.this, Paloma.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 6) {

                    Intent intent2 = new Intent(MTequila.this, Puerto.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 7) {

                    Intent intent2 = new Intent(MTequila.this, Chihuahua.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 8) {

                    Intent intent2 = new Intent(MTequila.this, Sky.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 9) {

                    Intent intent2 = new Intent(MTequila.this, Snap.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 10) {

                    Intent intent2 = new Intent(MTequila.this, SparklingApple.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 11) {

                    Intent intent2 = new Intent(MTequila.this, Furnace.class);
                    // Start next activity

                    startActivity(intent2);
                }


            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MTequila.this, Main.class);
        // Start next activity
        startActivity(intent);
        MTequila.this.finish();
        super.onBackPressed();
    }


}