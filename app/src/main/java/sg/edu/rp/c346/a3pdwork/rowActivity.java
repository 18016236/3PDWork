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
    ArrayList<Details> courses,English,Math,Chinese,Biology,Chemistry,Physics,Python,Java,SQL,Swift,Accounting,Additional,History;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        lv = findViewById(R.id.listViewDetails);

        courses = new ArrayList<Details>();
        English = new ArrayList<Details>();
        Math = new ArrayList<Details>();
        Chinese = new ArrayList<Details>();
        Biology = new ArrayList<Details>();
        Chemistry = new ArrayList<Details>();
        Physics = new ArrayList<Details>();
        Python = new ArrayList<Details>();
        Java = new ArrayList<Details>();
        SQL = new ArrayList<Details>();
        Swift = new ArrayList<Details>();
        Accounting = new ArrayList<Details>();
        Additional = new ArrayList<Details>();
        History = new ArrayList<Details>();


        English.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
        English.add(new Details( R.drawable.male, "Nathan","93451820","$2500/hr","English/Math/Addtional Math/Java/Python/SQL/Swift","Overpriced tutor!!"));
        English.add(new Details(R.drawable.male,"Jian Tong", "90125837","$500/hr","English/Java/Python/SQL/Swift","He is quite good as a tutor"));
        English.add(new Details( R.drawable.female, "Syafiqah","97563482","$1500/hr","English/Java/Python","Booo! So overpriced!!"));
        English.add(new Details(R.drawable.female, "Shu jing","99999999","$80/hr","English/Chinese","Okay service for the price"));
        English.add(new Details( R.drawable.female, "Mary","92857645","$90/hr","English/Math","She is not a very good tutor"));
        English.add(new Details( R.drawable.male, "Zhen nan","92481720","$150/hr","English/Chinese/Java/Python","He is very well-mannered"));
        English.add(new Details( R.drawable.male, "Yi xuan","91208917","$870/hr","English/Math/Chinese/Biology/Chemistry","He teaches well"));

        Math.add(new Details( R.drawable.male,"John", "99123467","$70/hr","Chinese/Math","My kid loves him!"));
        Math.add(new Details( R.drawable.male, "Gary","90874512","$85/hr","Chinese/History/Math" ,"He takes great effort in teaching the kids!"));

        Chinese.add(new Details( R.drawable.male,"Yi xuan", "99123467","$70/hr","English/Math/Chinese/Biology/Chemistry","My kid loves him!"));
        Chinese.add(new Details( R.drawable.female, "Shu Jing","90874512","$85/hr","Chinese/History/Math/Python" ,"He takes great effort in teaching the kids!"));
        Chinese.add(new Details( R.drawable.male,"Zhen nan", "99123467","$70/hr","English/Chinese/Java/Python","My kid loves him!"));
        Chinese.add(new Details( R.drawable.female, "Yujia","90874512","$85/hr","Chinese/History/Math" ,"He takes great effort in teaching the kids!"));
        Chinese.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));

        Biology.add(new Details( R.drawable.male, "Yi xuan","91208917","$870/hr","English/Math/Chinese/Biology/Chemistry","He teaches well"));

        Chemistry.add(new Details( R.drawable.male, "Yi xuan","91208917","$870/hr","English/Math/Chinese/Biology/Chemistry","He teaches well"));

        Physics.add(new Details(R.drawable.male, "Peter", "99999999","$70/hr","Physics","He is an Amazing tutor!" + " My Kids grades have improved under him"));
        Physics.add(new Details( R.drawable.male, "Larry","98888888","$1500/hr","Physics","Overpriced tutor!!"+" He gives a really bad service for that price"));
        Physics.add(new Details(R.drawable.male,"Tim", "97777777","$300/hr","Physics","He is quite good as a tutor"+" He is really patient, my kids love him"));
        Physics.add(new Details( R.drawable.female, "Maegan","97666666","$2500/hr","Physics","Booo! So overpriced!!"+" Charges so much for his service and yet my kids dont have an improvement in their own grades"));
        Physics.add(new Details(R.drawable.female, "Melinda","96666666","$10/hr","Physics","Mediocore service for the price"));
        Physics.add(new Details( R.drawable.female, "Melissa","95555555","$80/hr","Physics","She is not a very good tutor"+" She is really strict with the kids causing my kids to be terrified of her"));
        Physics.add(new Details( R.drawable.male, "Bill","94444444","$350/hr","Physics","He is very well-mannered"+" He is really gentle with the children"));
        Physics.add(new Details( R.drawable.male, "Jack","93333333","$170/hr","Physics","He teaches well"+" Excellent tutor!!"));


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

        Accounting.add(new Details(R.drawable.male, "Harry", "90000000","$50/hr","Accounting","He is a dedicated tutor"));
        Accounting.add(new Details( R.drawable.male, "William","93111111","$2500/hr","Accounting","Overpriced tutor!! Not worth to engage his services"));
        Accounting.add(new Details(R.drawable.male,"Phillip", "92222222","$500/hr","Accounting","My child has become more confident under him"));
        Accounting.add(new Details( R.drawable.female, "Kateson","97709238","$1500/hr","Accounting","She does not even seem to know her stuff at all, the audacity for the price"));
        Accounting.add(new Details( R.drawable.male, "Charles","92482819","$150/hr","Accounting","He is extremely well-mannered"));

        Additional.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
        Additional.add(new Details( R.drawable.male, "Nathan","93451820","$2500/hr","English/Math/Addtional Math/Java/Python/SQL/Swift","Overpriced tutor!!"));

        History.add(new Details( R.drawable.male,"Yi xuan", "99123467","$70/hr","English/Math/Chinese/Biology/Chemistry","My kid loves him!"));
        History.add(new Details( R.drawable.female, "Shu Jing","90874512","$85/hr","Chinese/History/Math/Python" ,"He takes great effort in teaching the kids!"));
        History.add(new Details( R.drawable.male,"Zhen nan", "99123467","$70/hr","English/Chinese/Java/Python","My kid loves him!"));
        History.add(new Details( R.drawable.female, "Yujia","90874512","$85/hr","Chinese/History/Math" ,"He takes great effort in teaching the kids!"));
        History.add(new Details(R.drawable.male, "Mervin", "98765432","$50/hr","English/Chinese/Math/Additional Math/History/Java/Python","He is an Amazing tutor!"));
        History.add(new Details( R.drawable.male, "Gary","90874512","$85/hr","Chinese/History/Math" ,"He takes great effort in teaching the kids!"));


        Intent i = getIntent();
        int number = i.getIntExtra("number", 0);

        if (number == 0) {
            courses = English;
        } else if (number == 1){
            courses = Math;
        }else if (number == 2){
            courses = Chinese;
        }else if (number == 3){
            courses = Biology;
        }else if (number == 4) {
            courses = Chemistry;
        }else if (number == 5) {
            courses = Physics;
        }else if (number == 6) {
            courses = Python;
        }else if (number == 7) {
            courses = Java;
        }else if (number == 8) {
            courses = SQL;
        }else if (number == 9) {
            courses = Swift;
        }else if (number == 10) {
            courses = Accounting;
        }else if (number == 11) {
            courses = Additional;
        }else {
            courses = History;
        }

        aa = new CustomAdapter(this, R.layout.row, courses);
        lv.setAdapter(aa);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Details selected = courses.get(position);

                Toast.makeText(rowActivity.this,"You have selected: "+ selected.getName()
                                + " Contact: " + selected.getPhoneNum() + " Rate: " + selected.getRate() + " Speciality: " + selected.getSpeciality() +" Recommendations: " + selected.getRecommendations(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
