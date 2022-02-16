package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dog_intestinal_parasites extends AppCompatActivity {

    Button vetFindMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_intestinal_parasites);

        vetFindMap = findViewById(R.id.vetFindMap);
        vetFindMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent find = new Intent(dog_intestinal_parasites.this, PawPatrolMap.class);
                startActivity(find);

            }
        });

    }
}