package com.minsub.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MRum extends Activity {
    GridView grid;
    String[] web = {
            getString(R.string.claret),
            getString(R.string.daiquiri),
            getString(R.string.stormy),
            getString(R.string.flaming),
            getString(R.string.fluffy),
            getString(R.string.rumberry),
            getString(R.string.bat),
            getString(R.string.point)

    } ;
    int[] imageId = {
            R.drawable.claret_swizzle,
            R.drawable.daiquiri,
            R.drawable.darkstormy,
            R.drawable.flaming,
            R.drawable.fluffyduck,
            R.drawable.rumberry_punch,
            R.drawable.white_bat,
            R.drawable.point_reyes,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mrum);


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        CustomGrid adapter = new CustomGrid(MRum.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(MRum.this, Claret.class);

                    startActivity(intent);
                } else if (position == 1) {

                    Intent intent2 = new Intent(MRum.this, Daiquiri.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 2) {

                    Intent intent2 = new Intent(MRum.this, Stormy.class);
                    // Start next activity

                    startActivity(intent2);

                } else if (position == 3) {

                    Intent intent2 = new Intent(MRum.this, Flaming.class);
                    // Start next activity

                    startActivity(intent2);

                } else if (position == 4) {

                    Intent intent2 = new Intent(MRum.this, Fluffy.class);
                    // Start next activity

                    startActivity(intent2);

                } else if (position == 5) {

                    Intent intent2 = new Intent(MRum.this, Rumberry.class);
                    // Start next activity

                    startActivity(intent2);

                } else if (position == 6) {

                    Intent intent2 = new Intent(MRum.this, Bat.class);
                    // Start next activity

                    startActivity(intent2);

                } else if (position == 7) {

                    Intent intent2 = new Intent(MRum.this, Point.class);
                    // Start next activity

                    startActivity(intent2);

                }
                }
            }

            );

        }
        @Override
    public void onBackPressed() {
        Intent intent = new Intent(MRum.this, Main.class);
        // Start next activity
        startActivity(intent);
        MRum.this.finish();
        super.onBackPressed();
    }


}