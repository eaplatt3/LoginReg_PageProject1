package com.example.sickl.loginreg_pageproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Earl Platt III
//BCS421 - Android
//9/30/2018
//App That is A Login & Registration Page
/////////////////////////////////
//Input: User Enters
//       -Username & Password
//       -First Name, Last Name,
//        Date of Birth, Email,
//Output: Allows User to Register & Login

//Class to Handle Splash Screen
public class SplashScreen extends AppCompatActivity {

    //Variables
    TextView txtVss;
    TextView txtVss2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        txtVss = findViewById(R.id.text_view_main);
        txtVss2 = findViewById(R.id.text_view_main2);

        //Events to Handle Transition to Next Activity
        txtVss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), Login_Reg.class);
                startActivity(startNewActivity);
            }
        });

        txtVss2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), Login_Reg.class);
                startActivity(startNewActivity);
            }
        });

    }
}
