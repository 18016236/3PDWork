package sg.edu.rp.c346.a3pdwork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LanguagesTutorActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Details> courses,English,Chinese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        lv = findViewById(R.id.listViewDetails);
        English = new ArrayList<Details>();
        Chinese = new ArrayList<Details>();
        courses = new ArrayList<Details>();

        Intent i = getIntent();
        int number = i.getIntExtra("numbers",0);

        if (number == 0){
            courses = English;
            English.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
            English.add(new Details( R.drawable.male, "Nathan","93451820","$2500/hr","English/Math/Addtional Math/Java/Python/SQL/Swift","Overpriced tutor!!"));
            English.add(new Details(R.drawable.male,"Jian Tong", "90125837","$500/hr","English/Java/Python/SQL/Swift","He is quite good as a tutor"));
            English.add(new Details( R.drawable.female, "Syafiqah","97563482","$1500/hr","English/Java/Python","Booo! So overpriced!!"));
            English.add(new Details(R.drawable.female, "Shu jing","99999999","$80/hr","English/Chinese","Okay service for the price"));
            English.add(new Details( R.drawable.female, "Mary","92857645","$90/hr","English/Math","She is not a very good tutor"));
            English.add(new Details( R.drawable.male, "Zhen nan","92481720","$150/hr","English/Chinese/Java/Python","He is very well-mannered"));
            English.add(new Details( R.drawable.male, "Yi xuan","91208917","$870/hr","English/Math/Chinese/Biology/Chemistry","He teaches well"));
        } else if (number == 1){
            courses = Chinese;
            Chinese.add(new Details( R.drawable.male,"Yi xuan", "99123467","$70/hr","English/Math/Chinese/Biology/Chemistry","My kid loves him!"));
            Chinese.add(new Details( R.drawable.female, "Shu Jing","90874512","$85/hr","Chinese/History/Math/Python" ,"He takes great effort in teaching the kids!"));
            Chinese.add(new Details( R.drawable.male,"Zhen nan", "99123467","$70/hr","English/Chinese/Java/Python","My kid loves him!"));
            Chinese.add(new Details( R.drawable.female, "Yujia","90874512","$85/hr","Chinese/History/Math" ,"He takes great effort in teaching the kids!"));
            Chinese.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
        }

        aa = new CustomAdapter(this,R.layout.row, courses);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Details selected = courses.get(position);

                Intent I = new Intent(LanguagesTutorActivity.this, profileActivity.class);
                I.putExtra("numberss", id);
                startActivity(I);


            }
}
        );}}