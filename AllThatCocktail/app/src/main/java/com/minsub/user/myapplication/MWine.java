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


public class MWine extends Activity {
    GridView grid;
    String[] web = {
            getString(R.string.aristocrat),
            getString(R.string.champagne),
            getString(R.string.mimosa),
            getString(R.string.sandeman)

    } ;
    int[] imageId = {
            R.drawable.aristocrat,
            R.drawable.champagne_cocktail,
            R.drawable.mimosa,
            R.drawable.sandeman_sparkler,



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mwine);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        CustomGrid adapter = new CustomGrid(MWine.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(MWine.this, Aristo.class);

                    startActivity(intent);
                } else if (position == 1) {

                    Intent intent2 = new Intent(MWine.this, Champagne.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 2) {

                    Intent intent2 = new Intent(MWine.this, Mimosa.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 3) {

                    Intent intent2 = new Intent(MWine.this, Sandeman.class);
                    // Start next activity

                    startActivity(intent2);
                }


            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MWine.this, Main.class);
        // Start next activity
        startActivity(intent);
        MWine.this.finish();
        super.onBackPressed();
    }


}