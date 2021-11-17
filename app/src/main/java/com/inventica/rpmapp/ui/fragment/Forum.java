package com.inventica.rpmapp.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;
import com.inventica.rpmapp.R;
import com.inventica.rpmapp.ui.modles.RpmModule;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Forum extends Fragment {
    public Forum() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    ArrayList<RpmModule> dataModels;
    ListView listView;
    private static CustomAdapter adapter;
    ListAdapter lAdapter;
    int[] images = {R.drawable.connection1, R.drawable.connection2, R.drawable.connection1,R.drawable.connection2, R.drawable.connection1};

    String[] version = {"Sandra Adams", "Imma jones", "Mark Smith", "Sandra Adams", "Imma jones"};

    String[] versionNumber = {"test@gmail.com", "test@gmail.com", "Ttest@gmail.com", "test@gmail.com", "test@gmail.com"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_forum, container, false);
//        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        listView=(ListView) rootView.findViewById(R.id.list);

    /*    dataModels= new ArrayList<>();

        dataModels.add(new RpmModule("Sandra Adams", "test@gmail.com"));
        dataModels.add(new RpmModule("Imma jones", "test@gmail.com"));
        dataModels.add(new RpmModule("Mark Smith", "test@gmail.com"));

        adapter= new CustomAdapter(dataModels,getContext());
        listView.setAdapter(adapter);*/

        lAdapter = new ListAdapter(getActivity(), version, versionNumber, images);
        listView.setAdapter(lAdapter);
        return rootView;
    }
    public static class ViewHolder {


        public ImageView rpmimage_iv;

        TextView name_tv;
        TextView emailId_tv;

    }
   /* public class RPMListViewAdapter extends BaseAdapter {


        public ArrayList<Farmer> projList;
        Activity activity;
        private ArrayList<Farmer> mDisplayedValues = null;

        public RPMListViewAdapter(Activity activity, ArrayList<Farmer> projList) {
            super();
            this.activity = activity;
            this.projList = projList;
            this.mDisplayedValues = projList;
        }

        @Override
        public int getCount() {
            //return projList.size();
            Log.e("size", String.valueOf(mDisplayedValues.size()));
            return mDisplayedValues.size();

        }

        @Override
        public Farmer getItem(int position) {

            //return projList.get(position);
            return mDisplayedValues.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

/           ViewHolder holder;
            LayoutInflater inflater = activity.getLayoutInflater();

            if (convertView == null) {
                convertView = inflater.inflate(R.layout.child_farmerlist_item, null);
                holder = new ViewHolder();
                holder.name_tv = (TextView) convertView.findViewById(R.id.Name_tv);
                holder.emailId_tv = (TextView) convertView.findViewById(R.id.emailId_tv);
                holder.rpmimage_iv = (ImageView) convertView.findViewById(R.id.rpmimage_iv);

                // holder.status_tv=(TextView)convertView.findViewById(R.id.status_tv);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            Farmer Obj_Class_farmerlistdetails = (Farmer) getItem(position);

//


            return convertView;
        }

    }*/

    class ListAdapter extends BaseAdapter {

        Context context;
        private final String [] values;
        private final String [] numbers;
        private final int [] images;

        public ListAdapter(Context context, String [] values, String [] numbers, int [] images){
            //super(context, R.layout.single_list_app_item, utilsArrayList);
            this.context = context;
            this.values = values;
            this.numbers = numbers;
            this.images = images;
        }

        @Override
        public int getCount() {
            return values.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


            ViewHolder viewHolder;

            final View result;

            if (convertView == null) {

                viewHolder = new ViewHolder();
                LayoutInflater inflater = LayoutInflater.from(context);
                convertView = inflater.inflate(R.layout.child_farmerlist_item, parent, false);
                viewHolder.txtName = (TextView) convertView.findViewById(R.id.Name_tv);
                viewHolder.txtVersion = (TextView) convertView.findViewById(R.id.emailId_tv);
                viewHolder.icon = (ImageView) convertView.findViewById(R.id.rpmimage_iv);

                result=convertView;

                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
                result=convertView;
            }

            viewHolder.txtName.setText(values[position]);
            viewHolder.txtVersion.setText("Version: "+numbers[position]);
            viewHolder.icon.setImageResource(images[position]);

            return convertView;
        }

        private class ViewHolder {

            TextView txtName;
            TextView txtVersion;
            ImageView icon;

        }

    }

    public static class CustomAdapter extends ArrayAdapter<RpmModule> implements View.OnClickListener{

       private ArrayList<RpmModule> dataSet;
       Context mContext;

       // View lookup cache
       private class ViewHolder {
           TextView txtName;
           TextView txtType;
           ImageView info;
       }

       public CustomAdapter(ArrayList<RpmModule> data, Context context) {
           super(context, R.layout.child_farmerlist_item, data);
           this.dataSet = data;
           this.mContext=context;

       }

       @Override
       public void onClick(View v) {

           int position=(Integer) v.getTag();
           Object object= getItem(position);
           RpmModule dataModel=(RpmModule)object;

         /*  switch (v.getId())
           {
               case R.id.item_info:
                   Snackbar.make(v, "Release date " +dataModel.getFeature(), Snackbar.LENGTH_LONG)
                           .setAction("No action", null).show();
                   break;
           }*/
       }

       private int lastPosition = -1;

       @Override
       public View getView(int position, View convertView, ViewGroup parent) {
           // Get the data item for this position
           RpmModule dataModel = getItem(position);
           // Check if an existing view is being reused, otherwise inflate the view
           ViewHolder viewHolder; // view lookup cache stored in tag

           final View result;

           if (convertView == null) {

               viewHolder = new ViewHolder();
               LayoutInflater inflater = LayoutInflater.from(getContext());
               convertView = inflater.inflate(R.layout.child_farmerlist_item, parent, false);
               viewHolder.txtName = (TextView) convertView.findViewById(R.id.Name_tv);
               viewHolder.txtType = (TextView) convertView.findViewById(R.id.emailId_tv);
               viewHolder.info = (ImageView) convertView.findViewById(R.id.rpmimage_iv);

               result=convertView;

               convertView.setTag(viewHolder);
           } else {
               viewHolder = (ViewHolder) convertView.getTag();
               result=convertView;
           }

         /*  Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
           result.startAnimation(animation);*/
           lastPosition = position;

           viewHolder.txtName.setText(dataModel.getName());
           viewHolder.txtType.setText(dataModel.getEmailId());
           viewHolder.info.setTag(position);
           // Return the completed view to render on screen
           return convertView;
       }
   }
}