package com.example.buetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import ru.dimorinny.floatingtextbutton.FloatingTextButton;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT1 = "com.example.buetapp.EXTRA_TEXT1";
    public static final String EXTRA_TEXT2 = "com.example.buetapp.EXTRA_TEXT2";

    EditText name;
    EditText opinion;
    Button submit, universityList;
    FloatingTextButton call, map, mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   Toolbar toolbar = findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);

        name = (EditText) findViewById(R.id.name_text_field);
        opinion = (EditText) findViewById(R.id.opinion_text_field);
        submit = (Button) findViewById(R.id.submit);
        universityList = (Button) findViewById(R.id.university_list);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!name.getText().toString().isEmpty() && !opinion.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Thank you for your opinion, "
                            + name.getText().toString() + "!", Toast.LENGTH_SHORT).show();
                 //   name.setText("");
                  //  opinion.setText("");

                    openActivity2();
                }
                else if (name.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Please enter your name before submitting", Toast.LENGTH_SHORT).show();
                }
                else if (opinion.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please type in your opinion, "
                            + name.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        universityList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUniversityList();
            }
        });

        call = (FloatingTextButton) findViewById(R.id.call_button);
        call.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   call.setBackgroundColor(255);
                call.setTitle("Call now");
                map.setTitle("");
                mail.setTitle("");
            }
        }));

        map = (FloatingTextButton) findViewById(R.id.map);
        map.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    map.setBackgroundColor(255);
                call.setTitle("");
                map.setTitle("Open maps");
                mail.setTitle("");
            }
        }));

        mail = (FloatingTextButton) findViewById(R.id.mail);
        mail.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //    mail.setBackgroundColor(255);
                call.setTitle("");
                map.setTitle("");
                mail.setTitle("Open mail");
            }
        }));
    }

    public void openActivity2() {
        EditText editTextName = (EditText) findViewById(R.id.name_text_field);
        String name = editTextName.getText().toString();
        EditText editTextOpinion = (EditText) findViewById(R.id.opinion_text_field);
        String opinion = editTextOpinion.getText().toString();

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT1, name);
        intent.putExtra(EXTRA_TEXT2, opinion);
        startActivity(intent);
    }

    public void openUniversityList() {
        Intent intent = new Intent(this, UniversityList.class);
        startActivity(intent);
    }
}