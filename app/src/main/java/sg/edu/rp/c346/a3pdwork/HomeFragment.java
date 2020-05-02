package sg.edu.rp.c346.a3pdwork;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

import static sg.edu.rp.c346.a3pdwork.R.id.listViewDetails;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    ListView lvdetails;
    ArrayAdapter aa;
    ArrayList<String> detailsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lvdetails = view.findViewById(R.id.listViewDetails);

        detailsList = new ArrayList<String>();
        detailsList.add("English");
        detailsList.add("Math");
        detailsList.add("Chinese");
        detailsList.add("Biology");
        detailsList.add("Chemistry");
        detailsList.add("Physics");
        detailsList.add("Python");
        detailsList.add("Java");
        detailsList.add("SQL");
        detailsList.add("Swift");
        detailsList.add("Accounting");
        detailsList.add("Additional Math");
        detailsList.add("History");
        detailsList.add("Geography");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HomeFragment.this.getContext(),
                android.R.layout.simple_list_item_1, android.R.id.text1, detailsList);
        lvdetails.setAdapter(adapter);



        lvdetails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent I = new Intent(HomeFragment.this.getActivity(),rowActivity.class);
                I.putExtra("number",position);
                startActivity(I);

            }
        });

        // Inflate the layout for this fragment
        return view;
    }



}