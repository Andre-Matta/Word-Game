package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class level4 extends AppCompatActivity {
    int right =0 ;
    DB db = new DB(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
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
            EditText text2 = (EditText) findViewById(R.id.text2);
            EditText text3 = (EditText) findViewById(R.id.text3);
            EditText text4 = (EditText) findViewById(R.id.text4);
            EditText text5 = (EditText) findViewById(R.id.text5);
            EditText text6 = (EditText) findViewById(R.id.text6);
            EditText text7 = (EditText) findViewById(R.id.text7);
            @Override
            public void onClick(View view) {


                 if (text2.getText().toString().isEmpty()){
                    text2.setText("c");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("c");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("c");
                } else if (text5.getText().toString().isEmpty()){
                    text5.setText("c");
                } else if (text6.getText().toString().isEmpty()){
                    text6.setText("c");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("c");
                     lose_Mess(view);
                     Finish(view);
                }

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
               if (text2.getText().toString().isEmpty()){
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
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("f");
                    lose_Mess(view);
                    Finish(view);
                }


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                 if (text2.getText().toString().isEmpty()){
                    text2.setText("e");

                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("e");
                    right++;
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("e");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("e");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("e");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("e");
                    lose_Mess(view);
                    Finish(view);
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text2.getText().toString().isEmpty()){
                    text2.setText("o");

                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("o");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("o");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("o");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("o");
                    right++;
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("o");
                    lose_Mess(view);
                    Finish(view);
                }


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text2.getText().toString().isEmpty()){
                    text2.setText("p");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("p");
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText("p");
                }
                else if(text5.getText().toString().isEmpty()) {
                    text5.setText("p");
                    right++;
                }
                else if(text6.getText().toString().isEmpty()) {
                    text6.setText("p");
                } else if(text7.getText().toString().isEmpty()) {
                    text7.setText("p");
                    lose_Mess(view);
                    Finish(view);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text2.getText().toString().isEmpty()){
                    text2.setText("a");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("a");
                }
                else if(text4.getText().toString().isEmpty() ) {
                    text4.setText("a");
                    right++;
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("a");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("a");

                }
                else if (text7.getText().toString().isEmpty()){
                    text7.setText("a");
                    lose_Mess(view);
                    Finish(view);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6= (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text2.getText().toString().isEmpty()){
                    text2.setText("t");
                    right++;
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("t");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("t");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("t");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("t");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("t");
                    if (right==5){
                        if (db.get_max_level(1) <= 4)
                            db.update_data(5,1);
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
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
               if (text2.getText().toString().isEmpty()){
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
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("s");
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
        goToSecond.putExtra("last","4");
        startActivity(goToSecond);
        finish();
    }
    public void back(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, beginner.class);
        startActivity(goToSecond);
        finish();
    }
    public void lose_Mess(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, lose.class);
        goToSecond.putExtra("last","4");
        startActivity(goToSecond);
        finish();
    }
    public void Finish(View view){
        right=0;
    }

}
