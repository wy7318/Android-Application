package com.minsub.user.newstart;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
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



public class Notice extends Activity {

    private WebView mWebView;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bible);


        ImageButton home = (ImageButton) findViewById(R.id.home_bt);
        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Notice.this, MainActivity.class);
                // Start next activity
                startActivity(intent);
                Notice.this.finish();
            }
        });



        mWebView = (WebView) findViewById(R.id.activity_main_webview);

        progressBar = (ProgressBar) findViewById(R.id.progressBar1);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://m.cafe.daum.net/msantioch/P8UC?boardType=");
        mWebView.setWebViewClient(new HelloWebViewClient());

        Toast.makeText(Notice.this, "사용하시는 요금제에 따라 인터넷 요금이 청구될 수 있습니다",
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
                Notice.this);

        // set title
        alertDialogBuilder.setTitle("Exit");

        // set dialog message
        alertDialogBuilder
                .setMessage("Do you really want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        Intent intent = new Intent(Notice.this, MainActivity.class);
                        // Start next activity
                        startActivity(intent);
                        Notice.this.finish();
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