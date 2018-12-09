package com.example.sharonwang.zodiakinator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;

public class HomeScreen extends AppCompatActivity {

    public Button button;
    public ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        button = (Button) findViewById(R.id.button);
        logo  = (ImageView) findViewById(R.id.logo);

        int imageResource = getResources().getIdentifier("@drawable/logo", null, this.getPackageName());
        logo.setImageResource(imageResource);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMainActivity();
            }
        });
    }

    private void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
