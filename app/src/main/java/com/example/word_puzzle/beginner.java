package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class beginner extends AppCompatActivity {
    DB db = new DB(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginner);
        final Button button1= (Button) findViewById(R.id.button12);
        Button button2= (Button) findViewById(R.id.button13);
        Button button3= (Button) findViewById(R.id.button14);
        Button button4= (Button) findViewById(R.id.button10);
        Button button5= (Button) findViewById(R.id.button15);
        Button button6= (Button) findViewById(R.id.button16);
        Button button7= (Button) findViewById(R.id.button11);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               end1(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end2(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end3(view);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end4(view);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end5(view);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end6(view);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back(view);
            }
        });
    }
    void end1 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, level1.class);
        startActivity(goToSecond);
        finish();
    }
    void end2 (View view){
        if(db.get_max_level(1)>=2){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, level2.class);
        startActivity(goToSecond);
        finish();
        }
        else
            Toast.makeText(this,"you cannot play this level" , Toast.LENGTH_SHORT ).show();

    }
    void end3 (View view){
        if(db.get_max_level(1)>=3) {
            Intent goToSecond = new Intent();
            goToSecond.setClass(this, level3.class);
            startActivity(goToSecond);
            finish();
        }
        else
        Toast.makeText(this,"you cannot play this level" , Toast.LENGTH_SHORT ).show();
    }
    void end4 (View view){
        if(db.get_max_level(1)>=4) {
            Intent goToSecond = new Intent();
            goToSecond.setClass(this, level4.class);
            startActivity(goToSecond);
            finish();
        }
        else
            Toast.makeText(this,"you cannot play this level" , Toast.LENGTH_SHORT ).show();
    }
    void end5 (View view){
        if(db.get_max_level(1)>=5) {
            Intent goToSecond = new Intent();
            goToSecond.setClass(this, level5.class);
            startActivity(goToSecond);
            finish();
        }
        else
            Toast.makeText(this,"you cannot play this level" , Toast.LENGTH_SHORT ).show();
    }
    void end6 (View view){
        if(db.get_max_level(1)>=6) {
            Intent goToSecond = new Intent();
            goToSecond.setClass(this, level6.class);
            startActivity(goToSecond);
            finish();
        }
        else
            Toast.makeText(this,"you cannot play this level" , Toast.LENGTH_SHORT ).show();
    }
    void back (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, levels.class);
        startActivity(goToSecond);
        finish();
    }
}