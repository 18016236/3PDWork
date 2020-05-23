package sg.edu.rp.c346.a3pdwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ProgrammingTutorsActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Details> courses,Python,Java,SQL,Swift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);

        lv = findViewById(R.id.listViewDetails);

        Python.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
        Python.add(new Details( R.drawable.male, "Nathan","93451820","$2500/hr","English/Math/Addtional Math/Java/Python/SQL/Swift","Overpriced tutor!!"));
        Python.add(new Details(R.drawable.male,"Jian Tong", "90125837","$500/hr","English/Java/Python/SQL/Swift","He is quite good as a tutor"));
        Python.add(new Details( R.drawable.female, "Syafiqah","97563482","$1500/hr","English/Java/Python","Booo! So overpriced!!"));
        Python.add(new Details( R.drawable.male, "Zhen nan","92481720","$150/hr","English/Chinese/Java/Python","He is very well-mannered"));

        Java.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
        Java.add(new Details( R.drawable.male, "Nathan","93451820","$2500/hr","English/Math/Addtional Math/Java/Python/SQL/Swift","Overpriced tutor!!"));
        Java.add(new Details(R.drawable.male,"Jian Tong", "90125837","$500/hr","English/Java/Python/SQL/Swift","He is quite good as a tutor"));
        Java.add(new Details( R.drawable.female, "Syafiqah","97563482","$1500/hr","English/Java/Python","Booo! So overpriced!!"));
        Java.add(new Details( R.drawable.male, "Zhen nan","92481720","$150/hr","English/Chinese/Java/Python","He is very well-mannered"));

        SQL.add(new Details( R.drawable.male, "Nathan","93451820","$2500/hr","English/Math/Addtional Math/Java/Python/SQL/Swift","Overpriced tutor!!"));
        SQL.add(new Details(R.drawable.male,"Jian Tong", "90125837","$500/hr","English/Java/Python/SQL/Swift","He is quite good as a tutor"));

        Swift.add(new Details( R.drawable.male, "Nathan","93451820","$2500/hr","English/Math/Addtional Math/Java/Python/SQL/Swift","Overpriced tutor!!"));
        Swift.add(new Details(R.drawable.male,"Jian Tong", "90125837","$500/hr","English/Java/Python/SQL/Swift","He is quite good as a tutor"));

        Intent i = getIntent();
        int number = i.getIntExtra("programming",0);

        aa = new CustomAdapter(this,R.layout.row, courses);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                      @Override
                                      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                          Details selected = courses.get(position);
                                          Intent I = new Intent(ProgrammingTutorsActivity.this, profileActivity.class);
                                          I.putExtra("numbers", id);
                                          startActivity(I);


                                      }
                                  }
        );}}





