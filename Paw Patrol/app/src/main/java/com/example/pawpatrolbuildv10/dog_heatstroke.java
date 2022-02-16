package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dog_heatstroke extends AppCompatActivity {

    Button vetFindMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_heatstroke);

        vetFindMap = findViewById(R.id.vetFindMap);
        vetFindMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent find = new Intent(dog_heatstroke.this, PawPatrolMap.class);
                startActivity(find);

            }
        });

    }
}