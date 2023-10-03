package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtArmour,text;
    RelativeLayout relativeLayout;
    Animation txtAnimation,layoutAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = findViewById(R.id.relMain);

        txtArmour = findViewById(R.id.armour);
        text = findViewById(R.id.armour1);
        txtAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fall_down);
        layoutAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bottom_to_top);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txtArmour.setVisibility(View.VISIBLE);
                text.setVisibility(View.VISIBLE);

                txtArmour.setAnimation(txtAnimation);
                text.setAnimation(txtAnimation);

            }
        },900);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                relativeLayout.setVisibility(View.VISIBLE);
                relativeLayout.setAnimation(layoutAnimation);



            }
        },500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Home_Activity.class);
                startActivity(intent);

            }
        },6000);

    }
}