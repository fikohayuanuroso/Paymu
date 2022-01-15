package com.paymu.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    String email = "fikohayu@gmail.com";
    String password = "0502";
    String confirm = "0502";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText txtEmail = findViewById(R.id.txtRegEmaill);
        final EditText txtPass  = findViewById(R.id.txtRegPass);
        final EditText txtConfirm = findViewById(R.id.txtRegConpass);
        Button login = findViewById(R.id.Register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txtEmail.getText().toString().equalsIgnoreCase(email)&& txtPass.getText().toString().equalsIgnoreCase(password)&& txtConfirm.getText().toString().equalsIgnoreCase(confirm)) {
                    startActivity(new Intent(RegisterActivity.this, HomeActivity.class));
                }else{
                    Toast.makeText(RegisterActivity.this, "Email/Password/Confirm",Toast.LENGTH_SHORT).show();
                }
                }

        });
}}





