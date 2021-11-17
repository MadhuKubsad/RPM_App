package com.inventica.rpmapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.inventica.rpmapp.R;
import com.inventica.rpmapp.ui.ConnectionHelper;
import com.inventica.rpmapp.ui.application.RPMApplication;

public class LoginHomeActivity extends AppCompatActivity {

    Button Login_btn,joinnow_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_home);

        Login_btn = (Button) findViewById(R.id.Login_btn);
        joinnow_btn = (Button) findViewById(R.id.joinnow_btn);

        if(ConnectionHelper.getToken(RPMApplication.getAppContext())==""){

        }else{
            startActivity(new Intent(LoginHomeActivity.this, MainActivity.class));
        }
        Login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginHomeActivity.this, SignInActivity.class));
             //   finish();
            }});
        joinnow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginHomeActivity.this, SelectionActivity.class));
                //   finish();
            }});
    }
}