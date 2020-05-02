package sg.edu.rp.c346.a3pdwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class rowActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Details> courses, row,details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        lv = findViewById(R.id.listViewDetails);

        courses = new ArrayList<Details>();
        row = new ArrayList<Details>();
        details = new ArrayList<Details>();

        row.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
        details.add(new Details( R.drawable.male,"John", "99123467","$70/hr","Chinese/Math","My kid loves him!"));
        details.add(new Details( R.drawable.male, "Gary","90874512","$85/hr","Chinese/History" ,"He takes great effort in teaching the kids!"));
        row.add(new Details( R.drawable.male, "Nathan","93451820","$2500/hr","English/Math/Addtional Math/Java/Python/SQL/Swift","Overpriced tutor!!"));
        row.add(new Details(R.drawable.male,"Jian Tong", "90125837","$500/hr","English/Java/Python/SQL/Swift","He is quite good as a tutor"));
        row.add(new Details( R.drawable.female, "Syafiqah","97563482","$1500/hr","English/Java/Python","Booo! So overpriced!!"));
        row.add(new Details(R.drawable.female, "Shu jing","99999999","$80/hr","English/Chinese","Okay service for the price"));
        row.add(new Details( R.drawable.female, "Mary","92857645","$90/hr","English/Math","She is not a very good tutor"));
        row.add(new Details( R.drawable.male, "Zhen nan","92481720","$150/hr","English/Chinese/Java/Python","He is very well-mannered"));
        row.add(new Details( R.drawable.male, "Yi xuan","91208917","$870/hr","English/Math/Chinese/Biology/Chemistry","He teaches well"));
        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together

        Intent i = getIntent();
        int number = i.getIntExtra("number", 0);

        if (number == 0) {
            courses = row;
        } else {
            courses = details;
        }

        aa = new CustomAdapter(this, R.layout.row, courses);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Details selected = courses.get(position);

                Toast.makeText(rowActivity.this,"You have selected: "+ selected.getName()
                                + " Contact: " + selected.getPhoneNum() + " Rate: " + selected.getRate() + " Recommendations: " + selected.getRecommendations(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
