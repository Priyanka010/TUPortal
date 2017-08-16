package com.tuportal.example.tuportal.activity;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.tuportal.example.tuportal.R;

public class NextQusActivity extends AppCompatActivity {

    ImageView imageView;
    Toolbar mtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_qus);

        mtoolbar=(Toolbar)findViewById(R.id.tb) ;
        imageView = (ImageView) findViewById(R.id.imgg);
        Bundle bundle =getIntent().getExtras();

        if(bundle!=null){
            mtoolbar.setTitle(bundle.getString("Imagename"));
            if(mtoolbar.getTitle().toString().equalsIgnoreCase("FirstSem")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextQusActivity.this,R.drawable.resultone));

            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("SecondSem")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextQusActivity.this,R.drawable.fourth));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("two")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextQusActivity.this,R.drawable.resultone));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("sixth")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextQusActivity.this,R.drawable.resultone));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("seventh")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextQusActivity.this,R.drawable.resultone));
            }


        }
    }
}
