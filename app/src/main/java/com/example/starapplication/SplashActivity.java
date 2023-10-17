package com.example.starapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashctivity);


        image = findViewById(R.id.imageAnime);
        image.setImageResource(R.drawable.starrouge);

        image.animate().rotation(360f).setDuration(2000);
        image.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
        image.animate().translationYBy(1000f).setDuration(2000);
        image.animate().alpha(0f).setDuration(6000);



        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(000);
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
    }
}