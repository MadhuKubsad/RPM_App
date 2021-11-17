package com.inventica.rpmapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.inventica.rpmapp.R;
import com.inventica.rpmapp.ui.ConnectionHelper;
import com.inventica.rpmapp.ui.application.RPMApplication;
import com.inventica.rpmapp.ui.remote.Rest_Adapter;

import org.openapitools.client.model.CountryModel;
import org.openapitools.client.model.HeightModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Yourself_MeasurementActivity extends AppCompatActivity {

    Button btn_continue;
    EditText weight_et,height_et;
    TextView tv_height,tv_weight;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourself__measurement);

        weight_et=(EditText) findViewById(R.id.weight_et);
        height_et=(EditText)findViewById(R.id.height_et);
        tv_weight=(TextView) findViewById(R.id.tv_weight);
        tv_height=(TextView)findViewById(R.id.tv_height);

        tv_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomHeightDialog();
            }
        });
        tv_height.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomHeightDialog();
            }
        });
        btn_continue=(Button) findViewById(R.id.btn_continue);
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Yourself_MeasurementActivity.this, MainActivity.class));
                //   finish();
            }
        });
    }

    void showCustomHeightDialog(){
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                getApplicationContext());
        LayoutInflater inflater = (LayoutInflater) getApplication().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.spinner_dialog, null);
        alertDialogBuilder.setView(view);
        alertDialogBuilder.setCancelable(false);
        final AlertDialog dialogView = alertDialogBuilder.create();
        dialogView.show();
        TextView title= dialogView.findViewById(R.id.textView1);
        title.setText("Height Measurement");
        spinner=dialogView.findViewById(R.id.spinner_SP);

        Button submit=dialogView.findViewById(R.id.submit_btn);
        Button cancel=dialogView.findViewById(R.id.cancel_btn);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //   Log.e("tag","name: "+challengeName.getText().toString());
                //    challengeName_tv.setText(challengeName.getText().toString());
                dialogView.cancel();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialogView.cancel();
            }
        });

    }
  /*  void showCustomHeightDialog() {
        final Dialog dialogView = new Dialog(Yourself_MeasurementActivity.this);
        dialogView.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogView.setCancelable(false);
        dialogView.setContentView(R.layout.spinner_dialog);

        TextView title= dialogView.findViewById(R.id.textView1);
        title.setText("Height Measurement");
        spinner=dialogView.findViewById(R.id.spinner_SP);

        Button submit=dialogView.findViewById(R.id.submit_btn);
        Button cancel=dialogView.findViewById(R.id.cancel_btn);

        //Now we need an AlertDialog.Builder object
       // AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());

        //setting the view of the builder to our custom view that we already inflated
     //   builder.setView(dialogView);
     //   AlertDialog alertDialog = builder.create();

        getHeightList();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //   Log.e("tag","name: "+challengeName.getText().toString());
                //    challengeName_tv.setText(challengeName.getText().toString());
                alertDialog.cancel();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialog.cancel();
            }
        });

        dialogView.show();

    }*/
      /*  //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        ViewGroup viewGroup = findViewById(android.R.id.content);

        //then we will inflate the custom alert dialog xml that we created
        View dialogView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.spinner_dialog,viewGroup, false);


        TextView title= dialogView.findViewById(R.id.textView1);
        title.setText("Height Measurement");
        spinner=dialogView.findViewById(R.id.spinner_SP);

        Button submit=dialogView.findViewById(R.id.submit_btn);
        Button cancel=dialogView.findViewById(R.id.cancel_btn);

        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();

        getHeightList();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             //   Log.e("tag","name: "+challengeName.getText().toString());
            //    challengeName_tv.setText(challengeName.getText().toString());
                alertDialog.cancel();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialog.cancel();
            }
        });
        //finally creating the alert dialog and displaying it
        alertDialog.show();
    }*/

    public void getHeightList(){

        Rest_Adapter.getDropDownApi().apiDropDownGetAllMeasureHeightGet().enqueue(new Callback<List<HeightModel>>(){
            @Override
            public void onResponse(Call<List<HeightModel>> call, Response<List<HeightModel>> response) {
                if(response.isSuccessful())
                {


                    List<HeightModel> getCountrylist_obj = response.body();
                    // List<Country> userlist_obj=response.body().;

                    Log.e("getCountrylist_obj", String.valueOf(getCountrylist_obj.get(0).getHeightMeasurementName()));
                    HeightModel[] countrylist_arrayObj= new HeightModel[getCountrylist_obj.size()];

                    List<HeightModel> countryModelList = new ArrayList<>();
                    for(int i=0;i<getCountrylist_obj.size();i++){
                        HeightModel inner_countrylst= new HeightModel();
                        inner_countrylst.setHeightMeasurementName(getCountrylist_obj.get(i).getHeightMeasurementName());
                        inner_countrylst.setId(getCountrylist_obj.get(i).getId());
                        inner_countrylst.setUnit(getCountrylist_obj.get(i).getUnit());
                        countrylist_arrayObj[i]=inner_countrylst;
                        countryModelList.add(inner_countrylst);
                    }
                    ArrayAdapter dataAdapter = new ArrayAdapter(getApplicationContext(), R.layout.spinnercenterstyle, countryModelList);
                    dataAdapter.setDropDownViewResource(R.layout.spinnercenterstyle);
                    spinner.setAdapter(dataAdapter);

                    //login_progressDoalog.dismiss();

                }
            }

            @Override
            public void onFailure(Call<List<HeightModel>> call, Throwable t) {
                Log.e("TAG", "onFailure: " + t.toString());

                Log.e("tag", "Error:" + t.getMessage());

                //   login_progressDoalog.dismiss();
                Toast.makeText(Yourself_MeasurementActivity.this, "It looks like the Internet Bandwidth is very LOW,\n please connect in good network area and Re-Try", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

