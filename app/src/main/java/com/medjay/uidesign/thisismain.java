package com.medjay.uidesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class thisismain extends AppCompatActivity {

    Button facebook, twitter, gmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thisismain);


        login fragobj = new login();
        getFragmentManager().beginTransaction().replace(R.id.frame_content, fragobj).commit();

        final TextView login = (TextView) findViewById(R.id.login);
        final TextView register = (TextView) findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register.setBackground(null);
                login.setBackgroundResource(R.drawable.button2);
                login fragobj = new login();
                getFragmentManager().beginTransaction().replace(R.id.frame_content, fragobj).commit();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setBackground(null);
                register.setBackgroundResource(R.drawable.button2);
                register fragobj = new register();
                getFragmentManager().beginTransaction().replace(R.id.frame_content, fragobj).commit();
            }
        });

        facebook = (Button) findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Facebook", Toast.LENGTH_LONG).show();
            }
        });
        twitter = (Button) findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Twitter", Toast.LENGTH_LONG).show();
            }
        });
        gmail = (Button) findViewById(R.id.google);
        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Gmail", Toast.LENGTH_LONG).show();
            }
        });
    }
}
