package com.example.buetapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class UniversityList extends AppCompatActivity {
    public static final String TAG = "UniversityList";
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.university_activity);

//        home = (Button)findViewById(R.id.back_button);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openMainActivity();
//            }
//        });

        ListView uniListView = (ListView)findViewById(R.id.list_view);

        University buet = new University("BUET", "207");
        University cuet = new University("CUET", "1292");
        University ruet = new University("RUET", "1166");

        University du = new University("DU", "1000");

        ArrayList <University> uniList = new ArrayList<>();
        uniList.add(buet);
        uniList.add(cuet);
        uniList.add(ruet);
        uniList.add(du);

        uniListAdapter adapter = new uniListAdapter(this, R.layout.adapter_uni_list, uniList);
        uniListView.setAdapter(adapter);

    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}