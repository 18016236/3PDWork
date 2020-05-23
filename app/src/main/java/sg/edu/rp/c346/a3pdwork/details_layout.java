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

public class details_layout extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<String> languagesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_layout);

        lv = findViewById(R.id.listViewCourseDetails);

        languagesList = new ArrayList<String>();
        languagesList.add("English");
        languagesList.add("Chinese");


        Intent i = getIntent();
        int number = i.getIntExtra("number", 0);




        ArrayAdapter<String> adapter = new ArrayAdapter<String>(details_layout.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, languagesList);
        lv.setAdapter(adapter);




        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent I = new Intent(details_layout.this, LanguagesTutorActivity.class);
                I.putExtra("numbers", id);
                startActivity(I);





            };
        });
    }
}
