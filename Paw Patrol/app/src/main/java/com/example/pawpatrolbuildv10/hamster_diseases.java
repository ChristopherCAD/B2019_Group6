package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class hamster_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout hamster_disease1, hamster_disease2, hamster_disease3, hamster_disease4, hamster_disease5;
    LinearLayout hamster_disease6, hamster_disease7;
    CardView hamsterDisease1, hamsterDisease2, hamsterDisease3, hamsterDisease4, hamsterDisease5;
    CardView hamsterDisease6, hamsterDisease7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamster_diseases);

        // CardView Block

        hamsterDisease1 = findViewById(R.id.hamsterDisease1);
        hamsterDisease2 = findViewById(R.id.hamsterDisease2);
        hamsterDisease3 = findViewById(R.id.hamsterDisease3);
        hamsterDisease4 = findViewById(R.id.hamsterDisease4);
        hamsterDisease5 = findViewById(R.id.hamsterDisease5);
        hamsterDisease6 = findViewById(R.id.hamsterDisease6);
        hamsterDisease7 = findViewById(R.id.hamsterDisease7);

        // Click Listener Block

        hamsterDisease1.setOnClickListener(this);
        hamsterDisease2.setOnClickListener(this);
        hamsterDisease3.setOnClickListener(this);
        hamsterDisease4.setOnClickListener(this);
        hamsterDisease5.setOnClickListener(this);
        hamsterDisease6.setOnClickListener(this);
        hamsterDisease7.setOnClickListener(this);

        // Diseases Block

        hamster_disease1 = findViewById(R.id.hamsterdisease1);
        hamster_disease2 = findViewById(R.id.hamsterdisease2);
        hamster_disease3 = findViewById(R.id.hamsterdisease3);
        hamster_disease4 = findViewById(R.id.hamsterdisease4);
        hamster_disease5 = findViewById(R.id.hamsterdisease5);
        hamster_disease6 = findViewById(R.id.hamsterdisease6);
        hamster_disease7 = findViewById(R.id.hamsterdisease7);

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.hamsterDisease1:
                activate = new Intent(this, hamster_wetTail.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease2:
                activate = new Intent(this, hamster_thrombosis.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease3:
                activate = new Intent(this, hamster_tyzzer_disease.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease4:
                activate = new Intent(this, hamster_salmonella.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease5:
                activate = new Intent(this, hamster_tape_worms.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease6:
                activate = new Intent(this, hamster_pneumonia.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}