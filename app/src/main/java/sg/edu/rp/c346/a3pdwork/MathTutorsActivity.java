package sg.edu.rp.c346.a3pdwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MathTutorsActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Details> courses, Math, Additional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        lv = findViewById(R.id.listViewDetails);
        courses = new ArrayList<Details>();
        Additional = new ArrayList<Details>();
        Math = new ArrayList<Details>();


        Intent i = getIntent();
        int number = i.getIntExtra("Math",0);


        if (number == 0){
            courses = Math;
            Math.add(new Details( R.drawable.male,"John", "99123467","$70/hr","Chinese/Math","My kid loves him!"));
            Math.add(new Details( R.drawable.male, "Gary","90874512","$85/hr","Chinese/History/Math" ,"He takes great effort in teaching the kids!"));

        } else if (number == 1){
            courses = Additional;
            Additional.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
            Additional.add(new Details( R.drawable.male, "Nathan","93451820","$2500/hr","English/Math/Addtional Math/Java/Python/SQL/Swift","Overpriced tutor!!"));

        }

        aa = new CustomAdapter(this,R.layout.row, courses);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                      @Override
                                      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                          Details selected = courses.get(position);
                                          Intent I = new Intent(MathTutorsActivity.this, profileActivity.class);
                                          I.putExtra("mathss", id);
                                          startActivity(I);


                                      }
                                  }
        );}}



