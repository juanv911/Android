package com.example.juan.cst438;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText UsernameEt, PasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsernameEt = (EditText)findViewById(R.id.etUsername);
        PasswordEt = (EditText)findViewById(R.id.etPassword);

        Button createAccountBtn = (Button) findViewById(R.id.registerButton);
        createAccountBtn.setOnClickListener(this);
    }
    public void OnLogin(View view) {
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";
        BackgroundProcess process = new BackgroundProcess(this);
        process.execute(type, username, password);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.registerButton){
            Intent i = new Intent(this, Registration.class);
            startActivity(i);
        }

    }

}
