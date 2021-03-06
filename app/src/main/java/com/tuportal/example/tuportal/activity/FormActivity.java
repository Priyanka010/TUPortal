package com.tuportal.example.tuportal.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tuportal.example.tuportal.R;
import com.tuportal.example.tuportal.model.ForumModel;

public class FormActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText subject,body,name;
    Button send;
    String sendEmail="priyanca.gyawali1@gmail.com";
//    ForumModel forumModelList=new ArrayList<ForumModel>();
    ForumModel forumModel=new ForumModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Intent intent = getIntent();
        String value = intent.getStringExtra("pica");
        name=(EditText)findViewById(R.id.name);

        subject=(EditText)findViewById(R.id.user_subject);
        body=(EditText)findViewById(R.id.user_body);
        send=(Button)findViewById(R.id.send);
        Toolbar toolbar = (Toolbar) findViewById(R.id.form_toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        forumModel.setName(name.toString());

        forumModel.setBody(body.toString());
        forumModel.setSubject(subject.toString());

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String to = "priyanka.gyawali1@gmail.com";
                String sub = subject.getText().toString();
                String mes = body.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                email.putExtra(Intent.EXTRA_SUBJECT, sub);
                email.putExtra(Intent.EXTRA_TEXT, mes);

                //need this to prompts email client only
                email.setType("message/rfc822");

               // startActivity(Intent.createChooser(email, "Choose an Email client :"));
                try {
                    startActivity(Intent.createChooser(email, "Send mail..."));
                    finish();
                    Log.i("Finished sending email", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(FormActivity.this,
                            "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("result");
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }

}

