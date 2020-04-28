package sg.edu.rp.c346.a3pdwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        AboutFragment register = new AboutFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.aboutContainer,  register).commit();
    }
}
