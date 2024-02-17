package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    WebView wV;
    EditText eT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        wV = findViewById(R.id.wV);
        wV.getSettings().setJavaScriptEnabled(true);
        eT = findViewById(R.id.eT);
        wV.setWebViewClient(new WebViewClient());
    }

    public void Clicked(View view) {
        String url = eT.getText().toString();
        wV.loadUrl(url);
    }
}