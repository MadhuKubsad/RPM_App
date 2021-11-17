package com.inventica.rpmapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.inventica.rpmapp.R;

public class PaymentActivity extends AppCompatActivity {

    Button pay_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        pay_btn=(Button) findViewById(R.id.pay_btn);
        pay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaymentActivity.this, SignInActivity.class));
                //   finish();
            }
        });
    }
}