package com.example.student.instagramclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etUserName= (EditText) findViewById(R.id.etUserEmail);
        Button  ButtonsignUp = (Button) findViewById(R.id.ButtonSignUp);
        EditText etPassword = (EditText) findViewById(R.id.etPassword);
        TextView tvOr = (TextView) findViewById(R.id.tvOr);
        TextView tvLanguage = (TextView) findViewById(R.id.tvLanguage);
        TextView tvForgot = (TextView) findViewById(R.id.tvForgot);
        TextView tvfacebook = (TextView) findViewById(R.id.tvFacebook);
        Button ButtonLogin =(Button) findViewById(R.id.ButtonLogin);
        ImageView ivLogo = (ImageView) findViewById(R.id.ivLogo);







    }
}
