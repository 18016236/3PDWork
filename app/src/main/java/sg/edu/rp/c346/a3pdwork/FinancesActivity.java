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

public class FinancesActivity extends AppCompatActivity {
    ListView  lv;
    ArrayAdapter aa;
    ArrayList<String> FinancesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finances);

        lv = findViewById(R.id.listViewFinances);

        FinancesList = new ArrayList<String>();
        FinancesList.add("Accounting");


        Intent i = getIntent();
        int number = i.getIntExtra("finances", 0);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FinancesActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, FinancesList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent I = new Intent(FinancesActivity.this, FinancesTutorActivity.class);
                I.putExtra("Finances", id);
                startActivity(I);





            };
        });
    }
}
