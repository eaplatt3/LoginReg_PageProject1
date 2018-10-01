package com.example.sickl.loginreg_pageproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

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

//Main Class For Reg Page
public class Login_Reg2 extends AppCompatActivity {

    //Creating Text Field Objects;
    EditText txtEd;
    EditText txtEd1;
    EditText txtEd2;
    EditText txtEd3;
    EditText txtEd4;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"; //Pattern Required For Email Validation

    //Created Person Object
    Person pers = new Person();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__reg2);

        txtEd = findViewById(R.id.edit_firstname_reg);
        txtEd1 = findViewById(R.id.edit_lastname_reg);
        txtEd2 = findViewById(R.id.edit_dob_reg);
        txtEd3 = findViewById(R.id.edit_email_reg);
        txtEd4 = findViewById(R.id.edit_password_reg);

    }

    //Method to read info from text fields
    public void person_reg(View view) {

        //Retrieving Info from Text Fields
        String firstname = txtEd.getText().toString().trim();
        String lastname = txtEd1.getText().toString().trim();
        String dob = txtEd2.getText().toString().trim();
        String email = txtEd3.getText().toString().trim();
        String password = txtEd4.getText().toString().trim();

        //Validating User Input
        if(firstname == " " || firstname.length() < 3 || firstname.length() > 30){
            Toast.makeText(Login_Reg2.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        if(lastname == " " || lastname.length() < 3 || lastname.length() > 30){
            Toast.makeText(Login_Reg2.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        if(dob == " " || dob.length() != 8){
            Toast.makeText(Login_Reg2.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        //Validating Input Via Email Pattern
        if(email == " " || email.length() > 30 || Patterns.EMAIL_ADDRESS.matcher(emailPattern).matches()) {
            Toast.makeText(Login_Reg2.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }

        if(password == " " || password.length() < 8){
            Toast.makeText(Login_Reg2.this,"Invalid Input, Re-Enter", Toast.LENGTH_SHORT).show();
        }
        else {

            //Storing User Info In Person Class
            pers.setFirstname(firstname);
            pers.setLastname(lastname);
            pers.setBirthDate(Double.parseDouble(dob));
            pers.setEmail(email);
            pers.setPassword(password);

            finish(); //Guarantee Return to Previous Activity

        }

    }
}
