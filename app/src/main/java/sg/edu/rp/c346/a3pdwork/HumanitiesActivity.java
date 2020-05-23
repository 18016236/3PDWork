package sg.edu.rp.c346.a3pdwork;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HumanitiesActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<String> HumanitiesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humanities);

        lv = findViewById(R.id.listViewHumanities);

        HumanitiesList = new ArrayList<String>();
        HumanitiesList.add("History");


        Intent i = getIntent();
        int number = i.getIntExtra("humanities", 0);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(HumanitiesActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, HumanitiesList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent I = new Intent(HumanitiesActivity.this, HumanitiesTutorActivity.class);
                I.putExtra("humanities", id);
                startActivity(I);




            };
        });

    }
}
