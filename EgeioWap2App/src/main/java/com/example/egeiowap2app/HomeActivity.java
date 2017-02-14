package com.example.egeiowap2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private TextView tv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("==================>>>>>>>>>HomeActivity.onCreate()");
        Toast.makeText(this, "HomeActivity.onCreate", Toast.LENGTH_SHORT).show();

        btn = (Button) findViewById(R.id.btn);
        tv = (TextView) findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, TopActivity.class));
            }
        });

        tv.append("task id : " + getTaskId() + "\n");
        tv.append("onCreate()\n");

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("==================>>>>>>>>>HomeActivity.onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("==================>>>>>>>>>HomeActivity.onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("==================>>>>>>>>>HomeActivity.onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("==================>>>>>>>>>HomeActivity.onDestroy()");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        System.out.println("==================>>>>>>>>>HomeActivity.onNewIntent()");
        Toast.makeText(this, "HomeActivity.onNewIntent", Toast.LENGTH_SHORT).show();
    }
}
