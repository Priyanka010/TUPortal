package com.tuportal.example.tuportal.activity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tuportal.example.tuportal.R;
import com.tuportal.example.tuportal.TriviaQuizHelper;
import com.tuportal.example.tuportal.model.TriviaQuestion;

import java.util.List;

/**
 * Created by priyanka on 7/28/17.
 */

public class QuizActivity extends AppCompatActivity{
    Button b1, b2, b3, b4;
    TextView tv1, tv2, tv3, tv4;
    int score =0;
    TriviaQuizHelper triviaQuizHelper;
    TriviaQuestion currentQuestion;
    List<TriviaQuestion> list;
    int qid = 0;
    int level = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tv1 = (TextView) findViewById(R.id.triviaQuestion);
        tv2 = (TextView) findViewById(R.id.triviTimer);
        b1 = (Button) findViewById(R.id.buttonA);
        b2 = (Button) findViewById(R.id.buttonB);
        b3 = (Button) findViewById(R.id.buttonC);
        b4 = (Button) findViewById(R.id.buttonD);
        tv3 = (TextView) findViewById(R.id.level);
        tv4 = (TextView) findViewById(R.id.score);
        CountDownTimer countDownTimer = new CountDownTimer(300 * 1000, 1000) {
            @Override
            public void onTick(long l) {
                tv2.setText("Timer:" + l / 1000 + " " + "sec");
            }

            @Override
            public void onFinish() {
                tv2.setText("TIME OUT");
                Intent intent = new Intent(QuizActivity.this, timeup.class);
                startActivity(intent);
            }
        };
        countDownTimer.start();
        triviaQuizHelper = new TriviaQuizHelper(this);
        SQLiteDatabase sqLiteDatabase = triviaQuizHelper.getWritableDatabase();
        triviaQuizHelper.allQuestion();
        list = triviaQuizHelper.getAllQuestion();
        currentQuestion = list.get(qid);
        view();
    }

    public void view() {
        tv1.setText(currentQuestion.getQuestion());
        b1.setText("A."+currentQuestion.getOpta());
        b2.setText("B."+currentQuestion.getOptb());
        b3.setText("C."+currentQuestion.getOptc());
        b4.setText("D."+currentQuestion.getOptd());
        tv3.setText("Level:"+level);
        tv4.setText("Score:"+score);
    }


    public void ButtonA(View view) {

        if (b1.getText().toString().equals("A."+currentQuestion.getAnswer())){
            score+=5;
            Toast.makeText(QuizActivity.this, "Correct answer",
                    Toast.LENGTH_SHORT).show();
            if(qid<5){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(QuizActivity.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            score -= 5;
            Toast.makeText(QuizActivity.this, "Incorrect answer Try again!",
                    Toast.LENGTH_SHORT).show();
            if (qid < 5) {

                currentQuestion = list.get(qid);
                view();
            } else {
                Intent intent = new Intent(QuizActivity.this, ResultWon.class);
                startActivity(intent);
                finish();


//            Intent intent=new Intent(QuizActivity.this,ResultPlayAgain.class);
//            Bundle b=new Bundle();
//            b.putInt("xscore",score);
//            intent.putExtras(b);
//            startActivity(intent);
//            finish();
            }
        }
    }
    public void ButtonB(View view) {
        if (b2.getText().toString().equals("B." + currentQuestion.getAnswer())) {
            score += 5;
            Toast.makeText(QuizActivity.this, "Correct answer",
                    Toast.LENGTH_SHORT).show();
            if (qid < 5) {
                qid++;
                currentQuestion = list.get(qid);
                view();
            } else {
                Intent intent = new Intent(QuizActivity.this, ResultWon.class);
                startActivity(intent);
                finish();
            }
        } else {
            score -= 5;
            Toast.makeText(QuizActivity.this, "Incorrect answer Try again!",
                    Toast.LENGTH_SHORT).show();
            if (qid < 5) {

                currentQuestion = list.get(qid);
                view();
            } else {
                Intent intent = new Intent(QuizActivity.this, ResultWon.class);
                startActivity(intent);
                finish();

//            Intent intent=new Intent(QuizActivity.this,ResultPlayAgain.class);
//            Bundle b=new Bundle();
//            b.putInt("xscore",score);
//            intent.putExtras(b);
//            startActivity(intent);
//            finish();
            }
        }
    }
    public void ButtonC(View view) {
        if (b3.getText().toString().equals("C."+currentQuestion.getAnswer())){
            score+=5;
            Toast.makeText(QuizActivity.this, "Correct answer",
                    Toast.LENGTH_SHORT).show();
            if(qid<5){
                qid++;
                currentQuestion = list.get(qid);
                view();
            }else{
                Intent intent=new Intent(QuizActivity.this,ResultWon.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            score -= 5;
            Toast.makeText(QuizActivity.this, "Incorrect answer Try again!",
                    Toast.LENGTH_SHORT).show();
            if (qid < 5) {

                currentQuestion = list.get(qid);
                view();
            } else {
                Intent intent = new Intent(QuizActivity.this, ResultWon.class);
                startActivity(intent);
                finish();

//            Intent intent=new Intent(QuizActivity.this,ResultPlayAgain.class);
//            Bundle b=new Bundle();
//            b.putInt("xscore",score);
//            intent.putExtras(b);
//            startActivity(intent);
//            finish();
            }
        }
    }
    public void ButtonD(View view) {
        if (b4.getText().toString().equals("D." + currentQuestion.getAnswer())) {
            score += 5;
            Toast.makeText(QuizActivity.this, "Correct answer",
                    Toast.LENGTH_SHORT).show();
            if (qid < 5) {
                qid++;
                currentQuestion = list.get(qid);
                view();
            } else {
                Intent intent = new Intent(QuizActivity.this, ResultWon.class);
                startActivity(intent);
                finish();
            }
        } else {
            score -= 5;
            Toast.makeText(QuizActivity.this, "Incorrect answer Try again!",
                    Toast.LENGTH_SHORT).show();
            if (qid < 5) {

                currentQuestion = list.get(qid);
                view();
            } else {
                Intent intent = new Intent(QuizActivity.this, ResultWon.class);
                startActivity(intent);
                finish();

//            Intent intent=new Intent(QuizActivity.this,ResultPlayAgain.class);
//            Bundle b=new Bundle();
//            b.putInt("xscore",score);
//            intent.putExtras(b);
//            startActivity(intent);
//            finish();
            }
        }
    }
    @Override
    public void onBackPressed() {

        finish();

    }
}

