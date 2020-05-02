package sg.edu.rp.c346.a3pdwork;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;


import java.util.concurrent.Executor;



/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {
    Button btnSignIn, btnSignUp;
    EditText etUserName, etEmail, etPassWord,etRePassword;
    String Name, password,email,repassword;




    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_about, container,false);



        return view;


    }
}
