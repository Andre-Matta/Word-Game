package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class levell4 extends AppCompatActivity {
    DB db = new DB(this);
    int right =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levell4);
        final Button button1= (Button) findViewById(R.id.button1);
        Button button2= (Button) findViewById(R.id.button2);
        Button button3= (Button) findViewById(R.id.button3);
        Button button4= (Button) findViewById(R.id.button4);
        Button button5= (Button) findViewById(R.id.button5);
        Button button6= (Button) findViewById(R.id.button6);
        Button button7= (Button) findViewById(R.id.button7);
        Button button= (Button) findViewById(R.id.button);
        Button button8= (Button) findViewById(R.id.button8);
        button1.setOnClickListener(new View.OnClickListener() {
            EditText text1 = (EditText) findViewById(R.id.text1);
            EditText text2 = (EditText) findViewById(R.id.text2);
            EditText text3 = (EditText) findViewById(R.id.text3);
            EditText text4 = (EditText) findViewById(R.id.text4);
            EditText text5 = (EditText) findViewById(R.id.text5);
            EditText text6 = (EditText) findViewById(R.id.text6);
            @Override
            public void onClick(View view) {
                if (text1.getText().toString().isEmpty()){
                    text1.setText("a");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("a");

                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("a");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("a");
                } else if (text5.getText().toString().isEmpty()){
                    text5.setText("a");
                    right++;
                } else if (text6.getText().toString().isEmpty()){
                    text6.setText("a");
                    lose_Mess(view);
                    Finish(view);
                }

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                if (text1.getText().toString().isEmpty()){
                    text1.setText("f");
                    right++;
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("f");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("f");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("f");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("f");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("f");
                    lose_Mess(view);
                    Finish(view);
                }


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                if (text1.getText().toString().isEmpty()){
                    text1.setText("r");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("r");
                    right++;
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("r");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("r");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("r");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("r");
                    lose_Mess(view);
                    Finish(view);
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);

                if (text1.getText().toString().isEmpty()){
                    text1.setText("d");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("d");

                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("d");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("d");
                    right++;
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("d");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("d");lose_Mess(view);
                    Finish(view);
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                if (text1.getText().toString().isEmpty()){
                    text1.setText("y");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("y");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("y");
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText("y");
                }
                else if(text5.getText().toString().isEmpty()) {
                    text5.setText("y");
                }
                else if(text6.getText().toString().isEmpty()) {
                    text6.setText("y");
                    if (right==5){
                        if (db.get_max_level(2)<=4)
                            db.update_data(5,2);
                        Win_Mess(view);
                        right =0;
                    }
                    else{
                        lose_Mess(view);
                        Finish(view);
                    }
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);

                if (text1.getText().toString().isEmpty()){
                    text1.setText("o");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("o");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("o");
                }
                else if(text4.getText().toString().isEmpty() ) {
                    text4.setText("o");

                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("o");

                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("o");
                    lose_Mess(view);
                    Finish(view);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6= (EditText) findViewById(R.id.text6);

                if (text1.getText().toString().isEmpty()){
                    text1.setText("i");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("i");

                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("i");
                    right++;
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("i");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("i");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("i");
                }

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text1 = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);

                if (text1.getText().toString().isEmpty()){
                    text1.setText("s");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("s");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("s");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("s");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("s");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("s");
                    lose_Mess(view);
                    Finish(view);
                }

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back(view);
            }
        });
    }
    public void Win_Mess(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, message.class);
        goToSecond.putExtra("last","10");
        startActivity(goToSecond);
        finish();
    }
    public void back(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, expert.class);
        startActivity(goToSecond);
        finish();
    }
    public void lose_Mess(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, lose.class);
        goToSecond.putExtra("last","10");
        startActivity(goToSecond);
        finish();
    }
    public void Finish(View view){
        right=0;
    }
}