package com.example.egeiowap2app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        System.out.println("==================>>>>>>>>>TopActivity.onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("==================>>>>>>>>>TopActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("==================>>>>>>>>>TopActivity.onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("==================>>>>>>>>>TopActivity.onStop()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("==================>>>>>>>>>TopActivity.onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("==================>>>>>>>>>TopActivity.onDestroy()");
    }
}
