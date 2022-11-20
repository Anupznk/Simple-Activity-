package com.example.buetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView name;
    Button backButton, universityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_TEXT1);
        String opinion = intent.getStringExtra(MainActivity.EXTRA_TEXT2);

        TextView showName = (TextView)findViewById(R.id.name);
        TextView showOp = (TextView)findViewById(R.id.opinion);

        showName.setText(name);
        showOp.setText("\""+opinion + "\"");

        backButton = (Button)findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        universityList = (Button)findViewById(R.id.university_list);
        universityList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUniversityList();
            }
        });


    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void openUniversityList() {
        Intent intent = new Intent(this, UniversityList.class);
        startActivity(intent);
    }
}