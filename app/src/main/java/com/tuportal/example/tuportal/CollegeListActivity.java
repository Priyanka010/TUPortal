package com.tuportal.example.tuportal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CollegeListActivity extends Activity {
Toolbar toolbar;
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.colzlist_toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_list);

        lv = (ListView) findViewById(R.id.listv);
        ArrayAdapter<String> madapter = new ArrayAdapter<String>(CollegeListActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.list4));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent aboutcsit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://aberdeen.edu.np"));
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
                else if (i == 8) {
                    Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/2nd%20Semester%20Syllabus"));
                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(pakistan);
                }
                else if (i == 9) {
                    Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kathford.edu.np"));
                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(pakistan);
                }
                else if (i == 10) {
                    Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/4th%20Semester%20Syllabus"));
                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(pakistan);
                }
                else if (i == 11) {
                    Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/5th%20Semester%20Syllabus"));
                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(pakistan);
                }
                else if (i == 12) {
                    Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/6th%20Semester%20Syllabus"));
                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(pakistan);
                }
                else if (i == 13) {
                    Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://csitprogram.blogspot.com/search/label/7th%20Semester%20Syllabus"));
                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(pakistan);
                }
                else if (i == 14) {
                    Intent pakistan = new Intent(Intent.ACTION_VIEW, Uri.parse("http://result.trinitycollege.edu.np/entrance/"));
                    //pakistan.putExtra("listname",listView.getItemAtPosition(i).toString());
                    startActivity(pakistan);
                }

            }
        });
        lv.setAdapter(madapter);


    }

    }
