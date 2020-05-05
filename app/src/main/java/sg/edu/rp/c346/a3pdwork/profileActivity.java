package sg.edu.rp.c346.a3pdwork;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class profileActivity extends AppCompatActivity {
    TextView tvName, tvContact, tvRate, tvSpeciality, tvRecommendations;
    Button btnSend;
    ArrayAdapter aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        tvName = findViewById(R.id.textViewName);
        tvContact = findViewById(R.id.textViewphoneNum);
        tvRate = findViewById(R.id.textviewrate);
        tvSpeciality = findViewById(R.id.textviewSpeciality);
        tvRecommendations = findViewById(R.id.textViewRecommendations);

        btnSend = findViewById(R.id.btn_send);

        

    }
}
