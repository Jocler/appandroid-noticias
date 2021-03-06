package com.noticias_now.ui.activity;

import android.os.Bundle;
import android.os.Handler;

import com.noticias_now.R;

public class SplashActivity extends BaseActivity {

    private long TIME_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                openActivity(SplashActivity.this, LoginActivity.class);
                finish();
            }
        }, TIME_DELAY);
    }
}
