package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class help extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Button back = (Button) findViewById(R.id.buttonH);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end2(view);
            }
        });

    }

    void end2 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainMenu.class);
        startActivity(goToSecond);
        finish();
    }

}
