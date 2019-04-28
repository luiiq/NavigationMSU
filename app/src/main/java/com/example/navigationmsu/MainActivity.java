package com.example.navigationmsu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.net.Uri;
import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button navigateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





            navigateBtn = findViewById(R.id.navigateBtn);

            navigateBtn.setOnClickListener(this);

        }





        public void onClick(View v) {

            Uri gps = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");

            Intent mapIntent = new Intent(Intent.ACTION_VIEW,gps);

            mapIntent.setPackage("com.google.android.apps.maps");

            startActivity(mapIntent);

        }

    }

