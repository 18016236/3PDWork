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

public class MathActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<String> MathList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        lv = findViewById(R.id.listViewMath);

        MathList = new ArrayList<String>();
        MathList.add("Math");
        MathList.add("Additional Math");


        Intent i = getIntent();
        int number = i.getIntExtra("maths", 0);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MathActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, MathList);
        lv.setAdapter(adapter);




        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent I = new Intent(MathActivity.this, MathTutorsActivity.class);
                I.putExtra("Math", id);
                startActivity(I);





            };
        });
    }
}
