package com.tuportal.example.tuportal.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.tuportal.example.tuportal.R;

/**
 * Created by priyanka on 12/20/16.
 */

public class AboutUs extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        Toolbar toolbar = (Toolbar) findViewById(R.id.aboutus_toolbar);
        TextView textView = (TextView) findViewById(R.id.textview);
        //textView.setText("helloooo");

    }
}
