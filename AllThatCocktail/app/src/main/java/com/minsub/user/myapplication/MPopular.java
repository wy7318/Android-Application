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


public class MPopular extends Activity {
    GridView grid;
    String[] web = {
            getString(R.string.alexander),
            getString(R.string.banana),
            getString(R.string.blackrussian),
            getString(R.string.bloody),
            getString(R.string.blue),
            getString(R.string.ciderhouse),
            getString(R.string.gimlet),
            getString(R.string.gintonic),
            getString(R.string.gojin),
            getString(R.string.grand),
            getString(R.string.grass),
            getString(R.string.hong),
            getString(R.string.irish),
            getString(R.string.june),
            getString(R.string.island),
            getString(R.string.margarita),
            getString(R.string.meloni),
            getString(R.string.midori),
            getString(R.string.milkiss),
            getString(R.string.mojito),
            getString(R.string.old),
            getString(R.string.rumcoke),
            getString(R.string.screw),
            getString(R.string.screwkiss),
            getString(R.string.sex),
            getString(R.string.sling),
            getString(R.string.sowon),
            getString(R.string.redbull),
            getString(R.string.whiterussian),
            getString(R.string.pisco),
            getString(R.string.patrinos),
            getString(R.string.hwang)

    } ;
    int[] imageId = {
            R.drawable.alexander,
            R.drawable.bananahoney,
            R.drawable.black_russian,
            R.drawable.bloody_mary,
            R.drawable.blue_lagoon,
            R.drawable.ciderhouse_punch,
            R.drawable.gimlet,
            R.drawable.gin_and_tonic_drink,
            R.drawable.gojin,
            R.drawable.grand_sangria,
            R.drawable.grasshopper,
            R.drawable.hong,
            R.drawable.irish_coffee,
            R.drawable.junebug,
            R.drawable.long_island,
            R.drawable.margarita,
            R.drawable.melona,
            R.drawable.midori_sour,
            R.drawable.milkiss,
            R.drawable.mojito,
            R.drawable.old_fashioned,
            R.drawable.rum_coke,
            R.drawable.screwdriver,
            R.drawable.screwkiss,
            R.drawable.sexonthebeach,
            R.drawable.singaporesling,
            R.drawable.sowon,
            R.drawable.vodka_redbull,
            R.drawable.white_russian,
            R.drawable.pisco_sour,
            R.drawable.patrinos,
            R.drawable.hwang,



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mpopular);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        CustomGrid adapter = new CustomGrid(MPopular.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(MPopular.this, Second.class);

                    startActivity(intent);
                } else if (position == 1) {

                    Intent intent2 = new Intent(MPopular.this, Banana.class);
                    // Start next activity

                    startActivity(intent2);
                }                else if (position == 2) {

                    Intent intent2 = new Intent(MPopular.this, BlackRussian.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 3) {

                    Intent intent2 = new Intent(MPopular.this, Bloody.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 4) {

                    Intent intent2 = new Intent(MPopular.this, Blue.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 5) {

                    Intent intent2 = new Intent(MPopular.this, Cider.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 6) {

                    Intent intent2 = new Intent(MPopular.this, Gimlet.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 7) {

                    Intent intent2 = new Intent(MPopular.this, GinTonic.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 8) {

                    Intent intent2 = new Intent(MPopular.this, Gojin.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 9) {

                    Intent intent2 = new Intent(MPopular.this, Sangria.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 10) {

                    Intent intent2 = new Intent(MPopular.this, Grass.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 11) {

                    Intent intent2 = new Intent(MPopular.this, Hong.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 12) {

                    Intent intent2 = new Intent(MPopular.this, Irish.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 13) {

                    Intent intent2 = new Intent(MPopular.this, June.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 14) {

                    Intent intent2 = new Intent(MPopular.this, Island.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 15) {

                    Intent intent2 = new Intent(MPopular.this, Margarita.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 16) {

                    Intent intent2 = new Intent(MPopular.this, Melona.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 17) {

                    Intent intent2 = new Intent(MPopular.this, Midori.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 18) {

                    Intent intent2 = new Intent(MPopular.this, Milkiss.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 19) {

                    Intent intent2 = new Intent(MPopular.this, Mojito.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 20) {

                    Intent intent2 = new Intent(MPopular.this, Old.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 21) {

                    Intent intent2 = new Intent(MPopular.this, RumCoke.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 22) {

                    Intent intent2 = new Intent(MPopular.this, Screwdriver.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 23) {

                    Intent intent2 = new Intent(MPopular.this, Screwkiss.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 24) {

                    Intent intent2 = new Intent(MPopular.this, Sex.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 25) {

                    Intent intent2 = new Intent(MPopular.this, Sling.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 26) {

                    Intent intent2 = new Intent(MPopular.this, Sowon.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 27) {

                    Intent intent2 = new Intent(MPopular.this, Redbull.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 28) {

                    Intent intent2 = new Intent(MPopular.this, WhiteRussian.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 29) {

                    Intent intent2 = new Intent(MPopular.this, Pisco.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 30) {

                    Intent intent2 = new Intent(MPopular.this, Patrinos.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 31) {

                    Intent intent2 = new Intent(MPopular.this, Hwang.class);
                    // Start next activity

                    startActivity(intent2);
                }


            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MPopular.this, Main.class);
        // Start next activity
        startActivity(intent);
        MPopular.this.finish();
        super.onBackPressed();
    }


}