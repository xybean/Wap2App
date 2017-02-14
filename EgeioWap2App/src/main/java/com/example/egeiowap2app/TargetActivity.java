package com.example.egeiowap2app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    private boolean fromWap = false;
    private Uri uri;

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        tv = (TextView) findViewById(R.id.tv);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra("wap")) {
            fromWap = intent.getBooleanExtra("wap", false);
            uri = intent.getParcelableExtra("uri");
            int  task_id = intent.getIntExtra("string", -1);

            tv.setText("uri.getScheme() : " + uri.getScheme() + "\n"
                    + "uri.getHost() : " + uri.getHost() + "\n"
                    + "uri.getAuthority() : " + uri.getAuthority() + "\n"
                    + "uri.getPath() : " + uri.getPath() + "\n"
                    + "uri.getPort() : " + uri.getPort() + "\n"
                    + "uri.getUserInfo() : " + uri.getUserInfo() + "\n"
                    + "uri : " + uri.toString() + "\n"
                    + "schemeActivity task id : " + task_id + "\n"
                    + "TargetActivity task id : " + getTaskId() + "\n");
        }

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public void onBackPressed() {
        finishActivity();
        super.onBackPressed();
    }

    private void finishActivity() {
        Intent intent = new Intent(TargetActivity.this, HomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}
