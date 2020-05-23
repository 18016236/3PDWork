package sg.edu.rp.c346.a3pdwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SciencesTutorActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Details> courses, Physics, Chemistry, Biology;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sciences);

        lv = findViewById(R.id.listViewDetails);
        Physics = new ArrayList<Details>();
        Chemistry = new ArrayList<Details>();
        Biology = new ArrayList<Details>();
        courses = new ArrayList<Details>();

        Intent i = getIntent();
        int number = i.getIntExtra("Sciences", 0);

        if (number == 0){
            courses = Physics;
            Physics.add(new Details(R.drawable.male, "Peter", "99999999","$70/hr","Physics","He is an Amazing tutor!" + " My Kids grades have improved under him"));
            Physics.add(new Details( R.drawable.male, "Larry","98888888","$1500/hr","Physics","Overpriced tutor!!"+" He gives a really bad service for that price"));
            Physics.add(new Details(R.drawable.male,"Tim", "97777777","$300/hr","Physics","He is quite good as a tutor"+" He is really patient, my kids love him"));
            Physics.add(new Details( R.drawable.female, "Maegan","97666666","$2500/hr","Physics","Booo! So overpriced!!"+" Charges so much for his service and yet my kids dont have an improvement in their own grades"));
            Physics.add(new Details(R.drawable.female, "Melinda","96666666","$10/hr","Physics","Mediocore service for the price"));
            Physics.add(new Details( R.drawable.female, "Melissa","95555555","$80/hr","Physics","She is not a very good tutor"+" She is really strict with the kids causing my kids to be terrified of her"));
            Physics.add(new Details( R.drawable.male, "Bill","94444444","$350/hr","Physics","He is very well-mannered"+" He is really gentle with the children"));
            Physics.add(new Details( R.drawable.male, "Jack","93333333","$170/hr","Physics","He teaches well"+" Excellent tutor!!"));

        } else if (number == 1){
            courses = Chemistry;
            Chemistry.add(new Details( R.drawable.male, "Yi xuan","91208917","$870/hr","English/Math/Chinese/Biology/Chemistry","He teaches well"));
        }
        else if (number == 2){
            courses = Biology;
            Biology.add(new Details( R.drawable.male, "Yi xuan","91208917","$870/hr","English/Math/Chinese/Biology/Chemistry","He teaches well"));
    }

        aa = new CustomAdapter(this,R.layout.row, courses);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                      @Override
                                      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                          Details selected = courses.get(position);

                                          Intent I = new Intent(SciencesTutorActivity.this, profileActivity.class);
                                          I.putExtra("sciences", id);
                                          startActivity(I);


                                      }
                                  }
        );}}

