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


public class MWhisky extends Activity {
    GridView grid;
    String[] web = {
            getString(R.string.julep),
            getString(R.string.beelzebub),
            getString(R.string.rickey),
            getString(R.string.brown),
            getString(R.string.foxmulder),
            getString(R.string.fizz),
            getString(R.string.hot),
            getString(R.string.lucy),
            getString(R.string.newyork),
            getString(R.string.rob),
            getString(R.string.scotchsoda),
            getString(R.string.sour1870),
            getString(R.string.wagyu),
            getString(R.string.whiskysour),
            getString(R.string.skin),
            getString(R.string.smash)

    } ;
    int[] imageId = {
            R.drawable.apple_julep,
            R.drawable.beelzebub,
            R.drawable.bourbon_rickey,
            R.drawable.brown_derby,
            R.drawable.fox_mulder,
            R.drawable.fox_rose_fizz,
            R.drawable.hot_banana,
            R.drawable.lucy_leave,
            R.drawable.newyork_sour,
            R.drawable.rob_roy,
            R.drawable.scotch_soda,
            R.drawable.sour1870,
            R.drawable.wagyu,
            R.drawable.whiskey_sour,
            R.drawable.whisky_skin,
            R.drawable.whisky_smash,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mwhisky);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        CustomGrid adapter = new CustomGrid(MWhisky.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(MWhisky.this, AppleJulep.class);

                    startActivity(intent);
                } else if (position == 1) {

                    Intent intent2 = new Intent(MWhisky.this, Beelzebub.class);
                    // Start next activity

                    startActivity(intent2);
                } else if (position == 2) {

                    Intent intent2 = new Intent(MWhisky.this, Rickey.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 3) {

                    Intent intent2 = new Intent(MWhisky.this, Brown.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 4) {

                    Intent intent2 = new Intent(MWhisky.this, Mulder.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 5) {

                    Intent intent2 = new Intent(MWhisky.this, Rose.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 6) {

                    Intent intent2 = new Intent(MWhisky.this, Hot.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 7) {

                    Intent intent2 = new Intent(MWhisky.this, Lucy.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 8) {

                    Intent intent2 = new Intent(MWhisky.this, Newyork.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 9) {

                    Intent intent2 = new Intent(MWhisky.this, Rob.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 10) {

                    Intent intent2 = new Intent(MWhisky.this, ScotchSoda.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 11) {

                    Intent intent2 = new Intent(MWhisky.this, Sour1870.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 12) {

                    Intent intent2 = new Intent(MWhisky.this, Wagyu.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 13) {

                    Intent intent2 = new Intent(MWhisky.this, WhiskySour.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 14) {

                    Intent intent2 = new Intent(MWhisky.this, Skin.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 15) {

                    Intent intent2 = new Intent(MWhisky.this, Smash.class);
                    // Start next activity

                    startActivity(intent2);
                }


            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MWhisky.this, Main.class);
        // Start next activity
        startActivity(intent);
        MWhisky.this.finish();
        super.onBackPressed();
    }


}