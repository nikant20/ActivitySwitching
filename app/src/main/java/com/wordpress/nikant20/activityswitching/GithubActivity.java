package com.wordpress.nikant20.activityswitching;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by nikant on 7/5/2017.
 */

public class GithubActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.githubwebview);

        webView = (WebView) findViewById(R.id.githubWebview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://github.com/ishantk?tab=repositories");



    }
}
