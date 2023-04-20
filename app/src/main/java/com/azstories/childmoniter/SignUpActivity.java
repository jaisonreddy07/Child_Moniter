package com.azstories.childmoniter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://azstories.com/index.php/my-account/");
        webView.getSettings().setJavaScriptEnabled(true);

    }
}