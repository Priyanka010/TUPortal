package com.tuportal.example.tuportal;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class NextResultActivity extends AppCompatActivity {
ImageView imageView;
    Toolbar mtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_result);

        mtoolbar=(Toolbar)findViewById(R.id.tb) ;
        imageView = (ImageView) findViewById(R.id.img);
        Bundle bundle =getIntent().getExtras();
        if(bundle!=null){
            mtoolbar.setTitle(bundle.getString("Imagename"));
            if(mtoolbar.getTitle().toString().equalsIgnoreCase("Second semester Result 2017")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextResultActivity.this,R.drawable.resultone));
                imageView.setImageDrawable(ContextCompat.getDrawable(NextResultActivity.this,R.drawable.resultone));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("ds")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextResultActivity.this,R.drawable.fourth));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("fifth")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextResultActivity.this,R.drawable.resultone));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("sixth")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextResultActivity.this,R.drawable.resultone));
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("seventh")){
                imageView.setImageDrawable(ContextCompat.getDrawable(NextResultActivity.this,R.drawable.resultone));
            }


        }
    }
}
