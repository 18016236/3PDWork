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
        detailsList.add("Languages");
        detailsList.add("Math");
        detailsList.add("Sciences");
        detailsList.add("Finance");
        detailsList.add("Programming");
        detailsList.add("Humanities");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HomeFragment.this.getContext(),
                android.R.layout.simple_list_item_1, android.R.id.text1, detailsList);
        lvdetails.setAdapter(adapter);



        lvdetails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent I = new Intent(HomeFragment.this.getActivity(), details_layout.class);
                    I.putExtra("number", position);
                    startActivity(I);
                } else if (position == 1){
                    Intent I = new Intent(HomeFragment.this.getActivity(), MathActivity.class);
                    I.putExtra("maths", position);
                    startActivity(I);
                }else if (position == 2) {
                    Intent I = new Intent(HomeFragment.this.getActivity(), SciencesActivity.class);
                    I.putExtra("sciences", position);
                    startActivity(I);
                }else if (position == 3) {
                    Intent I = new Intent(HomeFragment.this.getActivity(), FinancesActivity.class);
                    I.putExtra("finances", position);
                    startActivity(I);
                }else if (position == 4) {
                Intent I = new Intent(HomeFragment.this.getActivity(), ProgrammingActivity.class);
                I.putExtra("programming", position);
                startActivity(I);
            }  else if (position == 5) {
                Intent I = new Intent(HomeFragment.this.getActivity(), HumanitiesActivity.class);
                I.putExtra("humanities", position);
                startActivity(I);
            }
            }
        });

        // Inflate the layout for this fragment
        return view;
    }



}