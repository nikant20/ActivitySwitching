package com.wordpress.nikant20.activityswitching;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by nikant on 7/5/2017.
 */

public class SecondActivity extends AppCompatActivity{

    Button btnTutorials,btnGithub;
    //WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_second);

        btnTutorials = (Button) findViewById(R.id.btnTutorials);
        btnGithub = (Button) findViewById(R.id.btnGithub);
        //webView = (WebView) findViewById(R.id.webView);

        btnTutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });
        btnGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,GithubActivity.class);
                startActivity(intent);
            }
        });

    }

}
