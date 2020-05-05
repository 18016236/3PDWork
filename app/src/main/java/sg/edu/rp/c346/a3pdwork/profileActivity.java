package sg.edu.rp.c346.a3pdwork;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class profileActivity extends AppCompatActivity {
    TextView tvName, tvContact, tvRate, tvSpeciality, tvRecommendations;
    Button btnSend;
    ArrayAdapter aa;
    ArrayList<Details> particulars;


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

        checkPermission();

        Intent i = getIntent();
        int number = i.getIntExtra("number", 0);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:"));
                startActivity(sendIntent);
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage("5556", null, "Hello!", null, null);
            }
        });


    }

    private void checkPermission() {
        int permissionSendSMS = ContextCompat.checkSelfPermission(this,
                Manifest.permission.SEND_SMS);
        int permissionRecvSMS = ContextCompat.checkSelfPermission(this,
                Manifest.permission.RECEIVE_SMS);
        if (permissionSendSMS != PackageManager.PERMISSION_GRANTED &&
                permissionRecvSMS != PackageManager.PERMISSION_GRANTED) {
            String[] permissionNeeded = new String[]{Manifest.permission.SEND_SMS,
                    Manifest.permission.RECEIVE_SMS};
            ActivityCompat.requestPermissions(this, permissionNeeded, 1);

        }
    }
}
