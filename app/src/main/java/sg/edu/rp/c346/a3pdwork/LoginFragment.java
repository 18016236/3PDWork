package sg.edu.rp.c346.a3pdwork;


import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    Button SignIn, SignUp;
    EditText etUserName, etEmail,etPassWord;
    FirebaseAuth mFirebaseAuth;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable  Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login,container,false);
        etUserName = view.findViewById(R.id.etUserName);
        etEmail = view.findViewById(R.id.et_email);
        etPassWord = view.findViewById(R.id.et_password);

        SignIn = view.findViewById(R.id.SignIn);
        SignUp = view.findViewById(R.id.SignUp);

        mFirebaseAuth = FirebaseAuth.getInstance();


        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUserName.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassWord.getText().toString();

                if (username.isEmpty()){
                    etUserName.setError("Please enter Username");
                    etUserName.requestFocus();
                }
                else if (email.isEmpty()){
                    etEmail.setError("Please enter Email address");
                    etEmail.requestFocus();
                }
                else if (password.isEmpty()){
                    etPassWord.setError("Please enter Password");
                    etPassWord.requestFocus();
                }
                else if (password.isEmpty() && email.isEmpty() && username.isEmpty()){
                    Toast.makeText(getActivity(),"Fields Are Empty!",Toast.LENGTH_SHORT).show();
                }

            }
        });

        return view;


    }
}