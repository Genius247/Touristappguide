package com.example.phase1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Search extends AppCompatActivity {
    private WebView wv;
    Button bt;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        bt= (Button)findViewById(R.id.bt);
        et= (EditText)findViewById(R.id.search);

        wv= (WebView)findViewById(R.id.webView);
        wv.setWebViewClient(new WebViewClient());

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url1=et.getText().toString();
                String url="https://www.touropia.com/tourist-attractions-in-" + url1;
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptEnabled(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl(url);
            }
        });

        }
    }
