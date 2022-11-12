package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private int c=0;
    private TextView textView1;
    private Button button1;
    private EditText editText1;
    String txt,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView1);
        button1=findViewById(R.id.button1);
        editText1=findViewById(R.id.editText1);
    }




    @Override
    protected void onSaveInstanceState( Bundle outState) {
        super.onSaveInstanceState(outState);

        CharSequence txt=editText1.getText();
        CharSequence txt1=textView1.getText();
        outState.putCharSequence("savedText",  txt);
        outState.putCharSequence("saveText",  txt1);

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        CharSequence txt=savedInstanceState.getCharSequence("savedText");
        CharSequence txt1=savedInstanceState.getCharSequence("saveText");
        editText1.setText(txt);
        textView1.setText(txt1);
    }


    public void countUp(View view) {
        ++c;
        if(textView1.getText()!=null)
        {

            textView1.setText(Integer.toString(c));

        }
    }
}