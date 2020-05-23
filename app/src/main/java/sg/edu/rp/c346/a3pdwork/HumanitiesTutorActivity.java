package sg.edu.rp.c346.a3pdwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HumanitiesTutorActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Details> courses, History;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humanities);

        lv = findViewById(R.id.listViewDetails);
        History = new ArrayList<Details>();

        Intent i = getIntent();
        int number = i.getIntExtra("humanities", 0);

        if (number == 0) {
            courses = History;
            History.add(new Details( R.drawable.male,"Yi xuan", "99123467","$70/hr","English/Math/Chinese/Biology/Chemistry","My kid loves him!"));
            History.add(new Details( R.drawable.female, "Shu Jing","90874512","$85/hr","Chinese/History/Math/Python" ,"He takes great effort in teaching the kids!"));
            History.add(new Details( R.drawable.male,"Zhen nan", "99123467","$70/hr","English/Chinese/Java/Python","My kid loves him!"));
            History.add(new Details( R.drawable.female, "Yujia","90874512","$85/hr","Chinese/History/Math" ,"He takes great effort in teaching the kids!"));
            History.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
            History.add(new Details( R.drawable.male, "Gary","90874512","$85/hr","Chinese/History/Math" ,"He takes great effort in teaching the kids!"));

        }

        aa = new CustomAdapter(this,R.layout.row, courses);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                      @Override
                                      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                          Details selected = courses.get(position);
                                          Intent I = new Intent(HumanitiesTutorActivity.this, profileActivity.class);
                                          I.putExtra("Humanities", id);
                                          startActivity(I);


                                      }
                                  }
        );}}

