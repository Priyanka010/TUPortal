package com.tuportal.example.tuportal.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.tuportal.example.tuportal.R;

public class SecondActivity extends AppCompatActivity {
Toolbar mtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mtoolbar=(Toolbar)findViewById(R.id.toolbar1);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mtoolbar.setTitle(bundle.getString("listname"));
            }
        }
    }
