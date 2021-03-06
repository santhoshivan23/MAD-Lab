package com.example.url_opener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        EditText mUrl = (EditText)findViewById(R.id.url);
        String url = mUrl.getText().toString();
        if(!url.startsWith("https://")) {
            StringBuilder sb = new StringBuilder(url);
            sb.insert(0, "https://");
            url = sb.toString();
        }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}