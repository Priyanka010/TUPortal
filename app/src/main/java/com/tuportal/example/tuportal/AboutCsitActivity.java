package com.tuportal.example.tuportal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AboutCsitActivity extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_csit);
        TextView textView = (TextView) findViewById(R.id.textview2);

       textView.setText("Bachelors of Science in Computer Science and Information Technology (B.Sc.CSIT) is a four year course affiliated to Tribhuvan University designed to provide the student with all sorts of knowledge in the field of Information Technology and Computing.\n" +
               "\n" +
                "The program involves, in addition to conventional lectures, a great deal of practical and project works.This program develops the skills that are essential for both computer professionals and IT specialists. ");

       /* mtoolbar=(Toolbar)findViewById(R.id.toolbar1);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mtoolbar.setTitle(bundle.getString("listname"));

        }*/
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.about_toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        listView = (ListView) findViewById(R.id.listview1);
        ArrayAdapter<String> madapter =new ArrayAdapter<String>(AboutCsitActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.list1));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent aboutcsit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.csitnepal.com/course-info/salient-feature.php"));
                    // aboutcsit.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(aboutcsit);
                }
                else if (i == 1) {
                    Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.csitnepal.com/course-info/eligibility.php"));
                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(pakistan);
                }

            }
        });
        listView.setAdapter(madapter);

    }
    }

