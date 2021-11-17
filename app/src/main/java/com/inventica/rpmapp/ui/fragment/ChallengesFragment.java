package com.inventica.rpmapp.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.inventica.rpmapp.R;
import com.inventica.rpmapp.ui.adapter.CustomAdapter;
import com.inventica.rpmapp.ui.modles.RpmModule;
import com.inventica.rpmapp.ui.modles.itemModel;

import java.util.ArrayList;

public class ChallengesFragment extends Fragment {

    private ChallengesFragment galleryViewModel;
    String[] mobileArray = {"Notification","Manage Permissions","Privacy Policy","Terms of Use",
            "About","Send us Feedback"};
    boolean[] listImages={true, true, true, true, true,true};

    String name[] = {"chocolate", "Aubergine", "Banana", "Burger", "Cake", "Ice Cream", "Tomato", "Watermelon"};
    ArrayList<itemModel> arrayList;
    CustomAdapter adapter1;
    int[] images = {R.drawable.challenge1, R.drawable.challenge2};

    ListView listView;
    ListAdapterChallenges lAdapter;
    String[] version = {"10k Mile challenge", "20k Mile challenge"};

    String[] versionNumber = {"10k Mile", "20k Mile"};
    int[] images2 = {R.drawable.challenge3, R.drawable.challenge4,R.drawable.challenge5};

    ListView listView2;
    ListAdapterChallenges lAdapter2;
    String[] version2 = {"10k Mile challenge", "20k Mile challenge", "20k Mile challenge"};

    String[] versionNumber2 = {"10k Mile", "20k Mile","20k Mile"};

    Button btn_challenge;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
      /*  galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);*/
        View root = inflater.inflate(R.layout.fragment_challenges_temp, container, false);
        listView=(ListView) root.findViewById(R.id.challeng_list);
        listView2=(ListView) root.findViewById(R.id.join_list);
        btn_challenge = (Button) root.findViewById(R.id.btn_challenge);

        btn_challenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Fragment  fragment2 = new Create_ChallengesFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, fragment2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();               }
        });
/*        dataModels= new ArrayList<>();

        dataModels.add(new RpmModule("Sandra Adams", "sent you connection"));
        dataModels.add(new RpmModule("Imma jones", "Has invite you to participate in challenge"));
        dataModels.add(new RpmModule("Mark Smith", "The membership rules"));

        adapter= new CustomAdapterNotification(dataModels,getContext());
        */

        lAdapter = new ListAdapterChallenges(getActivity(), version, versionNumber, images);
        listView.setAdapter(lAdapter);
        lAdapter2 = new ListAdapterChallenges(getActivity(), version2, versionNumber2, images2);
        listView2.setAdapter(lAdapter2);
        return root;
    }
}

class ListAdapterChallenges extends BaseAdapter {

    Context context;
    private final String [] values;
    private final String [] numbers;
    private final int [] images;

    public ListAdapterChallenges(Context context, String [] values, String [] numbers, int [] images){
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
            convertView = inflater.inflate(R.layout.child_challengelist_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.Name_tv);
            viewHolder.txtVersion = (TextView) convertView.findViewById(R.id.emailId_tv);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.rpmimage_iv);
            viewHolder.days_tv = (TextView)convertView.findViewById(R.id.days_tv);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.txtName.setText(values[position]);
        viewHolder.txtVersion.setText(numbers[position]);

        viewHolder.icon.setImageResource(images[position]);

        return convertView;
    }

    private static class ViewHolder {

        TextView txtName;
        TextView txtVersion,days_tv;
        ImageView icon;

    }

}
