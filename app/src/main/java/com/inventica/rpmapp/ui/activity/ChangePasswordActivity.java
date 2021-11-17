package com.inventica.rpmapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.inventica.rpmapp.R;

public class ChangePasswordActivity extends AppCompatActivity {

    Button changepwd_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        changepwd_btn = (Button) findViewById(R.id.changepwd_btn);

        changepwd_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChangePasswordActivity.this, LoginHomeActivity.class));
                //  finish();
            }});
    }
}