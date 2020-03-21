package com.example.mahi.navigationd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class ignou_activity extends AppCompatActivity {

    WebView web;
    //TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ignou_activity);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i=getIntent();
        String url=i.getStringExtra("url");


        if(url!=null) {
            //tv=(TextView)findViewById(R.id.tv1);
            //tv.setEnabled(false);

            web = (WebView) findViewById(R.id.web_view);
           // web.setInitialScale(1);
            web.loadUrl(url);
            WebSettings webSettings=web.getSettings();
            webSettings.setJavaScriptEnabled(true);
            web.getSettings().setSupportZoom(true);
            web.getSettings().setBuiltInZoomControls(true);
            web.getSettings().setDisplayZoomControls(true);
            web.setWebViewClient(new browser());

        }
    }

    private  class browser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
