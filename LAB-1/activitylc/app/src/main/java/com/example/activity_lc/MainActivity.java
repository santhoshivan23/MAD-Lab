package com.example.activity_lc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("INFO", "onCreate() triggered!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("INFO", "onStart() triggered!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("INFO", "onResume() triggered!");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("INFO", "onStop() triggered!");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("INFO", "onRestart() triggered!");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("INFO", "onDestroy() triggered!");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("INFO", "onPause() triggered!");

    }


}