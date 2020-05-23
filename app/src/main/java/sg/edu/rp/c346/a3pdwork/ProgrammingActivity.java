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

public class ProgrammingActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<String> ProgrammingList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);

        lv = findViewById(R.id.listViewProgramming);

        ProgrammingList = new ArrayList<String>();
        ProgrammingList.add("Python");
        ProgrammingList.add("Java");
        ProgrammingList.add("SQL");
        ProgrammingList.add("Swift");



        Intent i = getIntent();
        int number = i.getIntExtra("programming", 0);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ProgrammingActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, ProgrammingList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent I = new Intent(ProgrammingActivity.this, ProgrammingTutorsActivity.class);
                I.putExtra("Programming", id);
                startActivity(I);





            };
        });
    }
}
