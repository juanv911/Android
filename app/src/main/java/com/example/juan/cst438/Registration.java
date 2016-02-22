package com.example.juan.cst438;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity implements View.OnClickListener{
    EditText name,lastName,username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        name = (EditText)findViewById(R.id.name);
        lastName = (EditText)findViewById(R.id.lastName);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        Button register = (Button) findViewById(R.id.registerbtn);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.registerbtn){
            String nameStr = name.getText().toString();
            String lastNameStr = lastName.getText().toString();
            String usernameStr = username.getText().toString();
            String passwordStr = password.getText().toString();

            String type = "registration";
            BackgroundProcess process = new BackgroundProcess(this);
            process.execute(type, nameStr,lastNameStr,usernameStr,passwordStr);

        }
    }
}