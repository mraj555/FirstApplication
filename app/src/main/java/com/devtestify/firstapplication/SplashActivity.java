package com.devtestify.firstapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    MediaPlayer splashSound;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashSound = MediaPlayer.create(SplashActivity.this, R.raw.splash);
        splashSound.start();

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);

                } catch (Exception e) {

                } finally {
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);

                }
                super.run();
            }
        };

        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        splashSound.release();
        finish();
    }
}
