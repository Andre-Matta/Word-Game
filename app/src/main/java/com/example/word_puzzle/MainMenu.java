package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    DB db = new DB (this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button start= (Button) findViewById(R.id.start_button);
        Button help= (Button) findViewById(R.id.help_button);
        Button exit= (Button) findViewById(R.id.exit_button);



        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end1(view);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end3(view);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end2(view);
            }
        });

    }
    void end1 (View view){

        db.insert_data(1);
        db.insert_data(1);
        db.delete_rows();

        Intent goToSecond = new Intent();
        goToSecond.setClass(this, levels.class);
        startActivity(goToSecond);
        finish();
    }

    void end2 (View view){
        finish();
    }

    void end3 (View view){

        Intent goToSecond = new Intent();
        goToSecond.setClass(this, help.class);
        startActivity(goToSecond);
        finish();
    }

}