package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class reptiles_antemoeba extends AppCompatActivity {

    Button vetFindMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptiles_antemoeba);

        vetFindMap = findViewById(R.id.vetFindMap);
        vetFindMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent find = new Intent(reptiles_antemoeba.this, PawPatrolMap.class);
                startActivity(find);

            }
        });
    }
}