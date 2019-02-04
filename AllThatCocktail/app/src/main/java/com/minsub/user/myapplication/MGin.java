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


public class MGin extends Activity {
    GridView grid;
    String[] web = {
            getString(R.string.bronx),
            getString(R.string.clover),
            getString(R.string.cosmo1934),
            getString(R.string.french),
            getString(R.string.ginfizz),
            getString(R.string.tango),
            getString(R.string.negroni),
            getString(R.string.orange),
            getString(R.string.pinkplymouth)

    } ;
    int[] imageId = {
            R.drawable.bronx,
            R.drawable.clover_club,
            R.drawable.cosmopolitan1934,
            R.drawable.french_75,
            R.drawable.gin_fizz,
            R.drawable.last_tango,
            R.drawable.negroni,
            R.drawable.orange_blossom,
            R.drawable.pink_plymouth,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mgin);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        CustomGrid adapter = new CustomGrid(MGin.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(MGin.this, Bronx.class);

                    startActivity(intent);
                } else if (position == 1) {

                    Intent intent2 = new Intent(MGin.this, Clover.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 2) {

                    Intent intent2 = new Intent(MGin.this, Cosmo1934.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 3) {

                    Intent intent2 = new Intent(MGin.this, French75.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 4) {

                    Intent intent2 = new Intent(MGin.this, GinFizz.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 5) {

                    Intent intent2 = new Intent(MGin.this, Tango.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 6) {

                    Intent intent2 = new Intent(MGin.this, Negroni.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 7) {

                    Intent intent2 = new Intent(MGin.this, Orange.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 8) {

                    Intent intent2 = new Intent(MGin.this, PinkPlymouth.class);
                    // Start next activity

                    startActivity(intent2);
                }


            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MGin.this, Main.class);
        // Start next activity
        startActivity(intent);
        MGin.this.finish();
        super.onBackPressed();
    }


}