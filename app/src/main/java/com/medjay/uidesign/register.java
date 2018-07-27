package com.medjay.uidesign;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class register extends Fragment {
    View view;
    EditText email, password, username;
    Button signin;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_register, container, false);

        email = view.findViewById(R.id.email);
        password = view.findViewById(R.id.password);
        username = view.findViewById(R.id.username);

        signin = view.findViewById(R.id.reg);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("") || password.getText().toString().equals("") || username.getText().toString().equals("")) {
                    if (email.getText().toString().equals("")) {
                        email.setError("must no be empty");
                    }
                    if (password.getText().toString().equals("")) {
                        password.setError("must no be empty");
                    }
                    if (username.getText().toString().equals("")) {
                        username.setError("must no be empty");
                    }
                } else {
                    Toast.makeText(getContext(), "sign in success", Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }
}
