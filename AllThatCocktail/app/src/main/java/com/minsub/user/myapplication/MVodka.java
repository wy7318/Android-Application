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


public class MVodka extends Activity {
    GridView grid;
    String[] web = {
            getString(R.string.autumn),
            getString(R.string.cedarwood),
            getString(R.string.chocolate),
            getString(R.string.cosmopolitan),
            getString(R.string.espresso),
            getString(R.string.gibson),
            getString(R.string.green),
            getString(R.string.grey),
            getString(R.string.caramel),
            getString(R.string.drop),
            getString(R.string.minted),
            getString(R.string.moscow),
            getString(R.string.mudslide),
            getString(R.string.elderflower),
            getString(R.string.pomosa),
            getString(R.string.rooftop),
            getString(R.string.taylored),
            getString(R.string.sunset),
            getString(R.string.woo)

    } ;
    int[] imageId = {
            R.drawable.autumn_thyme,
            R.drawable.cedarwood,
            R.drawable.chocolate_martini,
            R.drawable.cosmopolitain,
            R.drawable.espresso_martini,
            R.drawable.gibson,
            R.drawable.green_machine,
            R.drawable.grey_goose_martini,
            R.drawable.iced_caramel_coffee,
            R.drawable.lemondrop,
            R.drawable.minted_man,
            R.drawable.moscow_mule,
            R.drawable.mudslide,
            R.drawable.pear_elder,
            R.drawable.pomosa,
            R.drawable.rooftop_lemonade,
            R.drawable.taylored_black,
            R.drawable.vodkasunset,
            R.drawable.woo_woo,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvodka);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        CustomGrid adapter = new CustomGrid(MVodka.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(MVodka.this, Autumn.class);

                    startActivity(intent);
                } else if (position == 1) {

                    Intent intent2 = new Intent(MVodka.this, Cedar.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 2) {

                    Intent intent2 = new Intent(MVodka.this, Chocolate.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 3) {

                    Intent intent2 = new Intent(MVodka.this, Cosmo.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 4) {

                    Intent intent2 = new Intent(MVodka.this, Espresso.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 5) {

                    Intent intent2 = new Intent(MVodka.this, Gibson.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 6) {

                    Intent intent2 = new Intent(MVodka.this, Green.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 7) {

                    Intent intent2 = new Intent(MVodka.this, Greygoose.class);
                    // Start next activity

                    startActivity(intent2);
                }
                else if (position == 8) {

                    Intent intent2 = new Intent(MVodka.this, CaramelCoffee.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 9) {

                    Intent intent2 = new Intent(MVodka.this, Lemondrop.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 10) {

                    Intent intent2 = new Intent(MVodka.this, Minted.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 11) {

                    Intent intent2 = new Intent(MVodka.this, Moscow.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 12) {

                    Intent intent2 = new Intent(MVodka.this, Mud.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 13) {

                    Intent intent2 = new Intent(MVodka.this, Elder.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 14) {

                    Intent intent2 = new Intent(MVodka.this, Pomosa.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 15) {

                    Intent intent2 = new Intent(MVodka.this, Rooftop.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 16) {

                    Intent intent2 = new Intent(MVodka.this, Taylored.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 17) {

                    Intent intent2 = new Intent(MVodka.this, Sunset.class);
                    // Start next activity

                    startActivity(intent2);
                }else if (position == 18) {

                    Intent intent2 = new Intent(MVodka.this, Woo.class);
                    // Start next activity

                    startActivity(intent2);
                }


            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MVodka.this, Main.class);
        // Start next activity
        startActivity(intent);
        MVodka.this.finish();
        super.onBackPressed();
    }


}