package com.inventica.rpmapp.ui.fragment;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.inventica.rpmapp.R;
import com.inventica.rpmapp.ui.activity.MainActivity;
import com.inventica.rpmapp.ui.activity.PaymentActivity;
import com.inventica.rpmapp.ui.activity.SignUpActivity;
import com.inventica.rpmapp.ui.adapter.CustomAdapter;
import com.inventica.rpmapp.ui.modles.itemModel;
import com.inventica.rpmapp.ui.remote.Rest_Adapter;

import org.openapitools.client.model.AddQueryDetailsModel;
import org.openapitools.client.model.CountryModel;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.QueryMaster;
import org.openapitools.client.model.QueryMasterModel;
import org.openapitools.client.model.UserQueryDetails;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Query;
import retrofit2.http.QueryName;

import static java.sql.DriverManager.println;

public class SupportFragment extends Fragment {

    private SupportFragment galleryViewModel;

    Spinner sp_query;
    Button btn_submit;
    Integer sp_queryId;
    EditText query_msg_et;
    QueryMasterModel Obj_Class_countryDetails;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      /*  galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);*/
        View root = inflater.inflate(R.layout.fragment_support, container, false);
        sp_query = (Spinner) root.findViewById(R.id.sp_query);
        btn_submit = (Button) root.findViewById(R.id.btn_submit);
        query_msg_et = (EditText) root.findViewById(R.id.query_msg_et);
        getCountryList();

        sp_query.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Obj_Class_countryDetails = (QueryMasterModel) sp_query.getSelectedItem();
                Long sp_countryIdLong = Obj_Class_countryDetails.getQueryId();
                sp_queryId = sp_countryIdLong.intValue();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddQueryDetailsModel addQueryDetailsModel=new AddQueryDetailsModel();
                addQueryDetailsModel.setQueryId(Long.valueOf(sp_queryId));
                addQueryDetailsModel.setQueryMessage(query_msg_et.getText().toString());
                Rest_Adapter.getMobileAccessoriesApi().apiMobileAccessoriesAddUserQueryDetailsPost(addQueryDetailsModel).enqueue(new Callback<ModelApiResponse>() {
                    @Override
                    public void onResponse(Call<ModelApiResponse> call, Response<ModelApiResponse> response) {
                        Log.e("tag", "response==" + response.body().getMessage());

                        //  if(response.code()==200){
                        if (response.body().getStatusCode()==200) {
                            // if (response.message().equalsIgnoreCase("Success")) {
                            startActivity(new Intent(getContext(), MainActivity.class));
                            Toast.makeText(getContext(), "Registration is successfull.", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(getContext(), response.message(), Toast.LENGTH_LONG).show();
                        }
                        //}
                        //  } //else
                        /*if (response.code() == 409)
                            Toast.makeText(getApplicationContext(), "Email Id is already registered", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(getApplicationContext(), "Something went wrong. Please try later", Toast.LENGTH_LONG).show();*/
                    }

                    @Override
                    public void onFailure(Call<ModelApiResponse> call, Throwable t) {
                        println("register error ${t.message}");
                    }
                });
            }
        });

        return root;
    }

    public void getCountryList(){

        Rest_Adapter.getMobileAccessoriesApi().apiMobileAccessoriesGetQueryMasterGet().enqueue(new Callback<List<QueryMasterModel>>(){
            @Override
            public void onResponse(Call<List<QueryMasterModel>> call, Response<List<QueryMasterModel>> response) {
                if(response.isSuccessful())
                {


                    List<QueryMasterModel> getCountrylist_obj = response.body();
                    // List<Country> userlist_obj=response.body().;

                    Log.e("getQueryName", String.valueOf(getCountrylist_obj.get(0).getQueryName()));
                    QueryMasterModel[] countrylist_arrayObj= new QueryMasterModel[getCountrylist_obj.size()];

                    List<QueryMasterModel> countryModelList = new ArrayList<>();
                    for(int i=0;i<getCountrylist_obj.size();i++){
                        QueryMasterModel inner_countrylst= new QueryMasterModel();
                        inner_countrylst.setQueryName(getCountrylist_obj.get(i).getQueryName());
                        inner_countrylst.setQueryId(getCountrylist_obj.get(i).getQueryId());
                        countrylist_arrayObj[i]=inner_countrylst;
                        countryModelList.add(inner_countrylst);
                    }
                    ArrayAdapter dataAdapter = new ArrayAdapter(getContext(), R.layout.spinnercenterstyle, countryModelList);
                    dataAdapter.setDropDownViewResource(R.layout.spinnercenterstyle);
                    sp_query.setAdapter(dataAdapter);

                    //login_progressDoalog.dismiss();

                }
            }

            @Override
            public void onFailure(Call<List<QueryMasterModel>> call, Throwable t) {
                Log.e("TAG", "onFailure: " + t.toString());

                Log.e("tag", "Error:" + t.getMessage());

                //   login_progressDoalog.dismiss();
                Toast.makeText(getActivity(), "It looks like the Internet Bandwidth is very LOW,\n please connect in good network area and Re-Try", Toast.LENGTH_SHORT).show();
            }
        });
    }
}