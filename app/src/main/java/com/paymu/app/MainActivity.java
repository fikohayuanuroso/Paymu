package com.paymu.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String email = "fikohayu@gmail.com";
    String password = "0502";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtUser = findViewById(R.id.txtEmail);
        final EditText txtPass = findViewById(R.id.txtPass);
        Button login = findViewById(R.id.Login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUser.getText().toString().equalsIgnoreCase(email)&& txtPass.getText().toString().equalsIgnoreCase(password)) {
                    startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                }else{
                    Toast.makeText(MainActivity.this, "username/password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
