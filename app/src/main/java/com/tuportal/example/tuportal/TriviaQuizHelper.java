package com.tuportal.example.tuportal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.tuportal.example.tuportal.model.TriviaQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 1/4/2017.
 */

public class TriviaQuizHelper extends SQLiteOpenHelper {

    Context context;
    private static final String DATABASE_NAME = "DATABASEQUIZ";
    private static final int DATABASE_VERSION = 19;
    private static final String TABLE_NAME = "TRIVIAQUIZ";
    private static final String UID = "_UID";
    private static final String QUESTION = "QUESTION";
    private static final String OPTA = "OPTA";
    private static final String OPTB = "OPTB";
    private static final String OPTC = "OPTC";
    private static final String OPTD = "OPTD";
    private static final String ANSWER = "ANSWER";
    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public TriviaQuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);

    }

    public void allQuestion() {
        TriviaQuestion q1 = new TriviaQuestion("Which of the following memories is an optical memory?", "Floppy Disk", " Bubble Memories", "CD–ROM", " Core Memories", "CD–ROM");
        this.insert(q1);
        TriviaQuestion q2 = new TriviaQuestion("Which of the following is the most powerful type of computer?", "Super-micro", "Super conductor", "Supercomputer", "MegaFrame", "Supercomputer");
        this.insert(q2);
        TriviaQuestion q3 = new TriviaQuestion("Web pages are written using?", "FTP", "HTTP", "HTML", "URL", "HTML");
        this.insert(q3);
        TriviaQuestion q4 = new TriviaQuestion("Which of the following is NOT operating system?", "Dos", "Unix", "Windows NT", "Java", "Java");
        this.insert(q4);
        TriviaQuestion q5 = new TriviaQuestion("The word length of a computer is measured in", "bits", "bytes", "millimeters", "meters", "bytes");
        this.insert(q5);
        TriviaQuestion q6 = new TriviaQuestion("Compilers and Interpreters are themselves", "High level language", "Codes", "Mnemonics", "Programs", "Programs");
        this.insert(q6);

    }
    public void insert(TriviaQuestion triviaQuestion) {
        ContentValues contentvalues = new ContentValues();
       /* contentvalues.put(UID,triviaQuestion.getId());*/
        contentvalues.put(QUESTION, triviaQuestion.getQuestion());
        contentvalues.put(OPTA, triviaQuestion.getOpta());
        contentvalues.put(OPTB, triviaQuestion.getOptb());
        contentvalues.put(OPTC, triviaQuestion.getOptc());
        contentvalues.put(OPTD, triviaQuestion.getOptd());
        contentvalues.put(ANSWER, triviaQuestion.getAnswer());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_NAME, null, contentvalues);
    }
    public List<TriviaQuestion> getAllQuestion() {
        List<TriviaQuestion> que = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        String coloumns[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
        Cursor cursor = db.query(TABLE_NAME, coloumns, null, null, null, null, null);
        while (cursor.moveToNext()) {
            TriviaQuestion triviaQuestion = new TriviaQuestion();
            triviaQuestion.setId(cursor.getInt(0));
            triviaQuestion.setQuestion(cursor.getString(1));
            triviaQuestion.setOpta(cursor.getString(2));
            triviaQuestion.setOptb(cursor.getString(3));
            triviaQuestion.setOptc(cursor.getString(4));
            triviaQuestion.setOptd(cursor.getString(5));
            triviaQuestion.setAnswer(cursor.getString(6));
            que.add(triviaQuestion);
        }
        return que;
    }
}
