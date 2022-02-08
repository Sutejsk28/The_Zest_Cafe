package com.as2developers.thezestcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends  AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashanimation);

        this.getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread td = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                }catch (Exception ex){
                        ex.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashActivity.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };td.start();
    }



}
