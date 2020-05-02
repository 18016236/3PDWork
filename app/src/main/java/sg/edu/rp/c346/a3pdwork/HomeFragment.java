package sg.edu.rp.c346.a3pdwork;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        String[] menuItems = {"English ", "Math", "Chinese","Biology","Chemistry","Physics","Python","Java","SQL","Swift","Accounting","Additional Math","History","Geography"};

        ListView listView = (ListView) view.findViewById(R.id.listViewDetails);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(getActivity(),"Hi! This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 1) {
                    Toast.makeText(getActivity(),"Hi! This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 2) {
                    Toast.makeText(getActivity(),"Hi! This is currently Unavailable", Toast.LENGTH_LONG).show();
                }
                else if (position == 3) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 4) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 5) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 6) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 7) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 8) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 9) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 10) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 11) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 12) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }else if (position == 13) {
                    Toast.makeText(getActivity(),"Hi!  This is currently Unavailable", Toast.LENGTH_LONG).show();
                }

            }
        });

        // Inflate the layout for this fragment
        return view;
    }


}