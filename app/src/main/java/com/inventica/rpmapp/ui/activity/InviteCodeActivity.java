package com.inventica.rpmapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.inventica.rpmapp.R;
import com.inventica.rpmapp.ui.remote.Rest_Adapter;

import org.openapitools.client.model.ModelApiResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static java.sql.DriverManager.println;

public class InviteCodeActivity extends AppCompatActivity {

    Button submit_btn;
    EditText et_invitecode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_code);

        et_invitecode=(EditText) findViewById(R.id.et_invitecode);

        submit_btn=(Button) findViewById(R.id.submit_btn);
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                Rest_Adapter.getAccountApi().apiAccountRegisterPost(registerModel).enqueue(new Callback<ModelApiResponse>() {
                    @Override
                    public void onResponse(Call<ModelApiResponse> call, Response<ModelApiResponse> response) {
                        Log.e("tag", "response==" + response.body().getMessage());

                        //  if(response.code()==200){
                        if (response.body().getStatusCode()==200) {
                            // if (response.message().equalsIgnoreCase("Success")) {
                            startActivity(new Intent(SignUpActivity.this, PaymentActivity.class));
                            Toast.makeText(SignUpActivity.this, "Registration is successfull.", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(SignUpActivity.this, response.message(), Toast.LENGTH_LONG).show();
                        }
                        //}
                        //  } //else
                        */
/*if (response.code() == 409)
                            Toast.makeText(getApplicationContext(), "Email Id is already registered", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(getApplicationContext(), "Something went wrong. Please try later", Toast.LENGTH_LONG).show();*//*

                    }

                    @Override
                    public void onFailure(Call<ModelApiResponse> call, Throwable t) {
                        println("register error ${t.message}");
                    }
                });
*/

                startActivity(new Intent(InviteCodeActivity.this, SetPasswordActivity.class));
                //   finish();
            }
        });
    }
}