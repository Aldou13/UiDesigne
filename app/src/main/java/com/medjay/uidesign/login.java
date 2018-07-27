package com.medjay.uidesign;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class login extends Fragment {
    View view;
    EditText email, password;
    Button login;
    TextView forget_password;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_login, container, false);

        email = view.findViewById(R.id.email);
        password = view.findViewById(R.id.password);

        login = view.findViewById(R.id.log);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("") || password.getText().toString().equals("")) {
                    if (email.getText().toString().equals("")) {
                        email.setError("must no be empty");
                    }
                    if (password.getText().toString().equals("")) {
                        password.setError("must no be empty");
                    }
                } else {
                    Toast.makeText(getContext(), "login success", Toast.LENGTH_LONG).show();
                }
            }
        });

        forget_password = view.findViewById(R.id.forget);
        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return view;
    }
}
