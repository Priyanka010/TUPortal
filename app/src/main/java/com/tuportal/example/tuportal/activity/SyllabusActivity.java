package com.tuportal.example.tuportal.activity;

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

import com.tuportal.example.tuportal.R;


public class SyllabusActivity extends AppCompatActivity {

    ListView listView;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

       /* mtoolbar=(Toolbar)findViewById(R.id.toolbar1);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            mtoolbar.setTitle(bundle.getString("listname"));

        }*/
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.syllabus_toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_syllabus);
        //textView.setTextSize(20);
        listView = (ListView) findViewById(R.id.l_search);
        ArrayAdapter<String> madapter = new ArrayAdapter<String>(SyllabusActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.list3));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               if (i == 0) {
                    Intent aboutcsit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/1st%20Semester%20Syllabus"));
                    // aboutcsit.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(aboutcsit);
                }
                else if (i == 1) {
                    Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/2nd%20Semester%20Syllabus"));
                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(pakistan);
                }
               else if (i == 2) {
                   Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/3rd%20Semester%20Syllabus"));
                   //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                   startActivity(pakistan);
               }
               else if (i == 3) {
                   Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/4th%20Semester%20Syllabus"));
                   //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                   startActivity(pakistan);
               }
               else if (i == 4) {
                   Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/5th%20Semester%20Syllabus"));
                   //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                   startActivity(pakistan);
               }
               else if (i == 5) {
                   Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/6th%20Semester%20Syllabus"));
                   //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                   startActivity(pakistan);
               }
               else if (i == 6) {
                   Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/7th%20Semester%20Syllabus"));
                   //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                   startActivity(pakistan);
               }
               else if (i == 7) {
                   Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/8th%20Semester%20Syllabus"));
                   //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                   startActivity(pakistan);
               }

            }
        });
        listView.setAdapter(madapter);


    }
}


