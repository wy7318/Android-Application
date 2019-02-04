package com.minsub.user.newstart;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        Typeface my = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt = (TextView)findViewById(R.id.text1);
        mt.setTypeface(my);

        Typeface my2 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt2 = (TextView)findViewById(R.id.text2);
        mt2.setTypeface(my2);

        Typeface my3 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt3 = (TextView)findViewById(R.id.text3);
        mt3.setTypeface(my3);

        Typeface my4 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        TextView mt4 = (TextView)findViewById(R.id.text4);
        mt4.setTypeface(my4);

        Typeface m1 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b1 = (Button)findViewById(R.id.church_bt);
        b1.setTypeface(m1);

        Typeface m2 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b2 = (Button)findViewById(R.id.way_bt);
        b2.setTypeface(m2);

        Typeface m3 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b3 = (Button)findViewById(R.id.rev_bt);
        b3.setTypeface(m3);

        Typeface m4 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b4 = (Button)findViewById(R.id.sch_bt);
        b4.setTypeface(m4);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        Button sch_bt = (Button) findViewById(R.id.sch_bt);
        sch_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MapsActivity.this, Schedule.class);
                // Start next activity
                startActivity(intent);
                MapsActivity.this.finish();
            }
        });


        ImageButton home_bt = (ImageButton) findViewById(R.id.home_bt);
        home_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MapsActivity.this, MainActivity.class);
                // Start next activity
                startActivity(intent);
                MapsActivity.this.finish();
            }
        });

        Button rev_bt = (Button) findViewById(R.id.rev_bt);
        rev_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MapsActivity.this, RevIntro.class);
                // Start next activity
                startActivity(intent);
                MapsActivity.this.finish();
            }
        });

        Button way_bt = (Button) findViewById(R.id.way_bt);
        way_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MapsActivity.this, MapsActivity.class);
                // Start next activity
                startActivity(intent);
                MapsActivity.this.finish();
            }
        });

        Button church_bt = (Button) findViewById(R.id.church_bt);
        church_bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MapsActivity.this, Introduce.class);
                // Start next activity
                startActivity(intent);
                MapsActivity.this.finish();
            }
        });
    }







    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng church = new LatLng(35.2133509,128.5604038);
        mMap.addMarker(new MarkerOptions().position(church).title("마산 열린 교회+"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(church));
        CameraUpdate camera = CameraUpdateFactory.newLatLngZoom(
                church, 16.5f);
        googleMap.animateCamera(camera);

    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(MapsActivity.this, MainActivity.class);
        // Start next activity
        startActivity(intent);
        MapsActivity.this.finish();


    }
}
