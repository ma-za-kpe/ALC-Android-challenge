package com.maku.alc40phase1challenge_android;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    private Button aboutAlc;
    private Button myProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aboutAlc =  findViewById(R.id.abtAlc);
        myProfile = findViewById(R.id.myprofile);

        aboutAlc.setOnClickListener(this);
        myProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        
        if ( v == aboutAlc ) {

            Log.d(TAG, "onClick: about ALC button clicked");
            Intent alc = new Intent(MainActivity.this, AboutALCActivity.class);
            startActivity(alc);
            
        } else if ( v == myProfile ) {

            Log.d(TAG, "onClick: my profile button clicked");
            Intent profile = new Intent(MainActivity.this, MyProfileActivity.class);
            startActivity(profile);
            
        }

    }
}
