package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class bird_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout bird_disease1, bird_disease2, bird_disease3, bird_disease4, bird_disease5;
    LinearLayout bird_disease6, bird_disease7, bird_disease8, bird_disease9, bird_disease10;
    CardView birdDisease1, birdDisease2, birdDisease3, birdDisease4, birdDisease5;
    CardView birdDisease6, birdDisease7, birdDisease8, birdDisease9, birdDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_diseases);

        // CardView Block

        birdDisease1 = findViewById(R.id.birdDisease1);
        birdDisease2 = findViewById(R.id.birdDisease2);
        birdDisease3 = findViewById(R.id.birdDisease3);
        birdDisease4 = findViewById(R.id.birdDisease4);
        birdDisease5 = findViewById(R.id.birdDisease5);
        birdDisease6 = findViewById(R.id.birdDisease6);

        // Click Listener Block

        birdDisease1.setOnClickListener(this);
        birdDisease2.setOnClickListener(this);
        birdDisease3.setOnClickListener(this);
        birdDisease4.setOnClickListener(this);
        birdDisease5.setOnClickListener(this);
        birdDisease6.setOnClickListener(this);

        // Diseases Block

        bird_disease1 = findViewById(R.id.birddisease1);
        bird_disease2 = findViewById(R.id.birddisease2);
        bird_disease3 = findViewById(R.id.birddisease3);
        bird_disease4 = findViewById(R.id.birddisease4);
        bird_disease5 = findViewById(R.id.birddisease5);
        bird_disease6 = findViewById(R.id.birddisease6);


    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.birdDisease1:
                activate = new Intent(this, bird_salmonella.class);
                startActivity(activate);
                break;
            case R.id.birdDisease2:
                activate = new Intent(this, bird_mites.class);
                startActivity(activate);
                break;
            case R.id.birdDisease3:
                activate = new Intent(this, bird_feather_disease.class);
                startActivity(activate);
                break;
            case R.id.birdDisease4:
                activate = new Intent(this, bird_pacheco_disease.class);
                startActivity(activate);
                break;
            case R.id.birdDisease5:
                activate = new Intent(this, bird_pox_virus.class);
                startActivity(activate);
                break;
            case R.id.birdDisease6:
                activate = new Intent(this, bird_westnile_virus.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}