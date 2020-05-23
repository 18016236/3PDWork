package sg.edu.rp.c346.a3pdwork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FinancesTutorActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Details> courses, Accounting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finances);

        lv = findViewById(R.id.listViewDetails);
        Accounting = new ArrayList<Details>();

        Intent i = getIntent();
        int number = i.getIntExtra("humanities", 0);

        if (number == 0) {
            courses = Accounting;
            Accounting.add(new Details(R.drawable.male, "Harry", "90000000","$50/hr","Accounting","He is a dedicated tutor"));
            Accounting.add(new Details( R.drawable.male, "William","93111111","$2500/hr","Accounting","Overpriced tutor!! Not worth to engage his services"));
            Accounting.add(new Details(R.drawable.male,"Phillip", "92222222","$500/hr","Accounting","My child has become more confident under him"));
            Accounting.add(new Details( R.drawable.female, "Kateson","97709238","$1500/hr","Accounting","She does not even seem to know her stuff at all, the audacity for the price"));
            Accounting.add(new Details( R.drawable.male, "Charles","92482819","$150/hr","Accounting","He is extremely well-mannered"));

        }

        aa = new CustomAdapter(this,R.layout.row, courses);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                      @Override
                                      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                          Details selected = courses.get(position);
                                          Intent I = new Intent(FinancesTutorActivity.this, profileActivity.class);
                                          I.putExtra("Finances", id);
                                          startActivity(I);


                                      }
                                  }
        );}}


