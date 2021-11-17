package com.inventica.rpmapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.inventica.rpmapp.R;

public class SelectionActivity extends AppCompatActivity {

    Button group_btn,individual_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        group_btn = (Button) findViewById(R.id.group_btn);
        individual_btn = (Button) findViewById(R.id.individual_btn);
        group_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectionActivity.this, InviteCodeActivity.class));
              //  finish();
            }});
        individual_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectionActivity.this, SignUpActivity.class));
                //  finish();
            }});
    }
}