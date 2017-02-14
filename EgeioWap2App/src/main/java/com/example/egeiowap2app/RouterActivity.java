package com.example.egeiowap2app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * 根据Scheme决定跳转到哪个目标Activity
 */
public class RouterActivity extends Activity {

    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_router);

        uri = getIntent().getData();

        new Thread(new Runnable() {
            @Override
            public void run() {
                if(hasLogin()) {
                    RouterActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            // 根据host决定跳往哪个界面
                            String host = uri.getHost();
                            switch (host) {
                                case "host-photo" : // 假如要浏览照片则跳转到浏览照片用的Activity
                                    Intent intent = new Intent(RouterActivity.this, TargetActivity.class);
                                    intent.putExtra("wap", true);
                                    intent.putExtra("uri", uri);
                                    intent.putExtra("string", getTaskId());
                                    startActivity(intent);
                                    finish();
                                    break;
                            }
                        }
                    });
                } else {
                    // 跳转到登陆界面
                }
            }
        }).start();

    }

    private boolean hasLogin(){
        try {
            // 模拟网络请求
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
