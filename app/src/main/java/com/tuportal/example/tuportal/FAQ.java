package com.tuportal.example.tuportal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by priyanka on 12/20/16.
 */

public class FAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText("helloooo");

    }
}
