package com.tuportal.example.tuportal.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.tuportal.example.tuportal.R;

public class CourseActivity extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        Toolbar toolbar = (Toolbar) findViewById(R.id.about_toolbar);
        // TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        TextView textView=(TextView) findViewById(R.id.txtad);
        textView.setTextSize(20);


    }
}
