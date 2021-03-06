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

import org.openapitools.client.model.Getemail;
import org.openapitools.client.model.ModelApiResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static java.sql.DriverManager.println;

public class ResetPasswordActivity extends AppCompatActivity {

    Button reset_btn;
    EditText et_emailId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        reset_btn = (Button) findViewById(R.id.reset_btn);
        et_emailId = (EditText) findViewById(R.id.et_emailId);

        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(ResetPasswordActivity.this, ChangePasswordActivity.class));
                //  finish();

                if (validation()) {
                    Getemail getemail = new Getemail();
                    getemail.setEmail(et_emailId.getText().toString());

                    Rest_Adapter.getAccountApi().apiAccountForgotPasswordPost(getemail).enqueue(new Callback<ModelApiResponse>() {
                        @Override
                        public void onResponse(Call<ModelApiResponse> call, Response<ModelApiResponse> response) {
                            Log.e("tag", "response==" + response.message());

                            if (response.body().getStatusCode() == 200) {
                                // if(response.message().equalsIgnoreCase("Success")) {
                                Log.e("tag", "response msg==" + response.body().getMessage());
                                startActivity(new Intent(ResetPasswordActivity.this, ChangePasswordActivity.class));
                                Toast.makeText(ResetPasswordActivity.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                            } else {
                                Log.e("tag", "response msg==" + response.body().getMessage());
                                Toast.makeText(ResetPasswordActivity.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<ModelApiResponse> call, Throwable t) {
                            println("register error ${t.message}");
                        }
                    });
                }
            }});
    }

    private boolean isValidMail(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
    public boolean validation() {

        Boolean bemail = true, bpassword = true;

        if (et_emailId.getText().toString().length() == 0) {
            et_emailId.setError("Email Id is required!");
            bemail = false;
        }else{
            if(isValidMail(et_emailId.getText().toString())){

                bemail = true;

            }else{
                Toast.makeText(this, "Invalid Email Id", Toast.LENGTH_SHORT).show();
                et_emailId.setError("Invalid Email ID");
                bemail = false;
            }
        }


        if (bemail) {
            return true;
        } else {
            return false;
        }
    }
}