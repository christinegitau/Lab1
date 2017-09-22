package com.cgitau.bbitga;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button create = (Button)  findViewById(R.id.btnCreateAccount);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent login = new Intent(SignupActivity.this, Home.class);
                startActivity(login);
            }
        });


    }

}
