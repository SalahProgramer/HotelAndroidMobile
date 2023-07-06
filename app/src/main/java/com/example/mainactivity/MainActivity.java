package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mainActivity_btn_login;
    TextView text;
    ImageView imageView;
    private Animation top, bottom,bottom2;

    private Button mainActivity_btn_sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity_btn_login = findViewById(R.id.mainActivity_btn_login);
        mainActivity_btn_sign = findViewById(R.id.mainActivity_btn_signup);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        top = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        bottom2 = AnimationUtils.loadAnimation(this, R.anim.bottom);

        text = findViewById(R.id.textView2);
        imageView = findViewById(R.id.imageView2);

        text.setAnimation(top);
        imageView.setAnimation(top);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               mainActivity_btn_login.setVisibility(View.VISIBLE);
        mainActivity_btn_login.setAnimation(bottom);

            }
        }, 2500);

 Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {
                 mainActivity_btn_sign.setVisibility(View.VISIBLE);
        mainActivity_btn_sign.setAnimation(bottom2);
            }
        }, 4500);
//

//
    }

    public void Login(View view) {
        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }

    public void SignUp(View view) {
        Intent loginIntent = new Intent(this, SignupCustomerActivity.class);
        startActivity(loginIntent);
    }
}