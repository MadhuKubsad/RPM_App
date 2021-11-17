package com.inventica.rpmapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.inventica.rpmapp.R;

public class SetPasswordActivity extends AppCompatActivity {

    Button joinus_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_password);

        joinus_btn=(Button) findViewById(R.id.joinus_btn);
        joinus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SetPasswordActivity.this, SignInActivity.class));
                //   finish();
            }
        });
    }
}