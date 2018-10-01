package com.example.sickl.loginreg_pageproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

//Main Class For Login Page
public class Login_Reg extends AppCompatActivity {

    //Creating Text Field Objects;
    TextView txtV;
    EditText txtE1;
    EditText txtE2;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"; //Pattern Required For Email Validation

    //Created Account Object
    Account acc = new Account();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__reg);

        txtV = findViewById(R.id.text_view3);
        txtE1 = findViewById(R.id.edit_text1);
        txtE2 = findViewById(R.id.edit_text2);

        //Action Event to move from Login Page to Register Page
        txtV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNewActivity = new Intent(v.getContext(), Login_Reg2.class);
                startActivity(startNewActivity);
            }
        });
    }

    //Method to read info from text fields
    public void read_login_info(View view) {

        String login = txtE1.getText().toString().trim();

        String password = txtE2.getText().toString().trim();

        //Validating Input Via Email Pattern
        if(!login.matches(emailPattern) || login.length() < 0){
            Toast.makeText(Login_Reg.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }


        //Validating Input Based on Password Requirements
        if(password == " " || password.length() < 8){
            Toast.makeText(Login_Reg.this,"Invalid Input, Re-Enter, Must Be 8 Characters", Toast.LENGTH_SHORT).show();
        }
        else {

            //Setting Password & Login in Acc to Verify Identity
            acc.setLogin(login);
            acc.setPassword(password);

        }

    }
}

