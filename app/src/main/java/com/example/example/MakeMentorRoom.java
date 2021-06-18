package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MakeMentorRoom extends AppCompatActivity {

    private Button mentor_back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_mentor_room);

        mentor_back_btn = findViewById(R.id. mentor_back_btn);
        mentor_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakeMentorRoom.this,Mentor.class);
                startActivity(intent);
            }
        });

    }
}