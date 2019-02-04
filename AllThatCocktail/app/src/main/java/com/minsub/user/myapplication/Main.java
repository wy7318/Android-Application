package com.minsub.user.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;


public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);




        Typeface my0 = Typeface.createFromAsset(getAssets(), "pink.otf");
        Button mt0 = (Button)findViewById(R.id.popular);
        mt0.setTypeface(my0);

        Typeface my = Typeface.createFromAsset(getAssets(), "pink.otf");
        Button mt = (Button)findViewById(R.id.vodka);
        mt.setTypeface(my);

        Typeface my1 = Typeface.createFromAsset(getAssets(), "pink.otf");
        Button mt1 = (Button)findViewById(R.id.whisky);
        mt1.setTypeface(my1);

        Typeface my2 = Typeface.createFromAsset(getAssets(), "pink.otf");
        Button mt2 = (Button)findViewById(R.id.rum);
        mt2.setTypeface(my2);

        Typeface my3 = Typeface.createFromAsset(getAssets(), "pink.otf");
        Button mt3 = (Button)findViewById(R.id.wine);
        mt3.setTypeface(my3);

        Typeface my4 = Typeface.createFromAsset(getAssets(), "pink.otf");
        Button mt4 = (Button)findViewById(R.id.gin);
        mt4.setTypeface(my4);

        Typeface my5 = Typeface.createFromAsset(getAssets(), "pink.otf");
        Button mt5 = (Button)findViewById(R.id.tequila);
        mt5.setTypeface(my5);



        Button popular = (Button) findViewById(R.id.popular);
        popular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main.this, MPopular.class);
                // Start next activity
                startActivity(intent);
                Main.this.finish();
            }
        });

        Button gin = (Button) findViewById(R.id.gin);
        gin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main.this, MGin.class);
                // Start next activity
                startActivity(intent);
                Main.this.finish();
            }
        });
        Button rum = (Button) findViewById(R.id.rum);
        rum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main.this, MRum.class);
                // Start next activity
                startActivity(intent);
                Main.this.finish();
            }
        });
        Button tequila = (Button) findViewById(R.id.tequila);
        tequila.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main.this, MTequila.class);
                // Start next activity
                startActivity(intent);
                Main.this.finish();
            }
        });
        Button vodka = (Button) findViewById(R.id.vodka);
        vodka.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main.this, MVodka.class);
                // Start next activity
                startActivity(intent);
                Main.this.finish();
            }
        });
        Button whisky = (Button) findViewById(R.id.whisky);
        whisky.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main.this, MWhisky.class);
                // Start next activity
                startActivity(intent);
                Main.this.finish();
            }
        });
        Button wine = (Button) findViewById(R.id.wine);
        wine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main.this, MWine.class);
                // Start next activity
                startActivity(intent);
                Main.this.finish();
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Main.this, MainActivity.class);
        // Start next activity
        startActivity(intent);
        Main.this.finish();
        super.onBackPressed();
    }


}