package com.minsub.user.newstart;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;



public class ServiceScreen extends Activity {

    private WebView mWebView;
    ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_sun);


        Typeface m1 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b1 = (Button)findViewById(R.id.sun_bt);
        b1.setTypeface(m1);

        Typeface m2 = Typeface.createFromAsset(getAssets(), "modern.ttf");
        Button b2 = (Button)findViewById(R.id.wed_bt);
        b2.setTypeface(m2);



        ImageButton home = (ImageButton) findViewById(R.id.home_bt);
        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ServiceScreen.this, MainActivity.class);
                // Start next activity
                startActivity(intent);
                ServiceScreen.this.finish();
            }
        });

        Button sun = (Button) findViewById(R.id.sun_bt);
        sun.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ServiceScreen.this, ServiceScreen.class);
                // Start next activity
                startActivity(intent);
                ServiceScreen.this.finish();
            }
        });

        Button wed = (Button) findViewById(R.id.wed_bt);
        wed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ServiceScreen.this, ServiceScreen2.class);
                // Start next activity
                startActivity(intent);
                ServiceScreen.this.finish();
            }
        });

        mWebView = (WebView) findViewById(R.id.activity_main_webview);

        progressBar = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://m.cafe.daum.net/msantioch/Ue44?boardType=");
        mWebView.setWebViewClient(new HelloWebViewClient());

        Toast.makeText(ServiceScreen.this, "사용하시는 요금제에 따라 인터넷 요금이 청구될 수 있습니다",
                Toast.LENGTH_LONG).show();

    }

    private class HelloWebViewClient extends WebViewClient{


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String url)
        {
            webView.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);

            progressBar.setVisibility(view.GONE);
        }

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    { //if back key is pressed
        if((keyCode == KeyEvent.KEYCODE_BACK)&& mWebView.canGoBack())
        {
            mWebView.goBack();
            return true;

        }

        return super.onKeyDown(keyCode, event);

    }


    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                ServiceScreen.this);

        // set title
        alertDialogBuilder.setTitle("Exit");

        // set dialog message
        alertDialogBuilder
                .setMessage("Do you really want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        Intent intent = new Intent(ServiceScreen.this, MainActivity.class);
                        // Start next activity
                        startActivity(intent);
                        ServiceScreen.this.finish();
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }
}