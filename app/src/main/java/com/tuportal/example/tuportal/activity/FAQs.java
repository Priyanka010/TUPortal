package com.tuportal.example.tuportal.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tuportal.example.tuportal.R;

public class FAQs extends AppCompatActivity {
//private ListView myListView;
    Toolbar toolbar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        TextView textView= new TextView(this);
        textView.findViewById(R.id.txt1);
        textView.findViewById(R.id.txt2);
        textView.findViewById(R.id.txt3);
        textView.findViewById(R.id.txt4);
        textView.findViewById(R.id.txt5);
        textView.findViewById(R.id.txt6);



       // ListView myListView = (ListView) findViewById(R.id.listViewId9);
        ArrayAdapter<String> madapter = new ArrayAdapter<String>(FAQs.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.staticText1Elements));
        Toolbar toolbar = (Toolbar) findViewById(R.id.faq_toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_faq);


    }
}

