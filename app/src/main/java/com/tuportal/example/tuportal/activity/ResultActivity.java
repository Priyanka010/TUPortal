package com.tuportal.example.tuportal.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.tuportal.example.tuportal.R;

public class ResultActivity extends AppCompatActivity {
    Toolbar toolbar;
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.result_toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);

        listView = (ListView) findViewById(R.id.listview2);
        ArrayAdapter<String> madapter =new ArrayAdapter<String>
                (ResultActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.list2));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(ResultActivity.this,NextResultActivity.class);
                intent.putExtra("Imagename",listView.getItemAtPosition(i).toString());
                startActivity(intent);

            }
        });
        listView.setAdapter(madapter);


    }
}
