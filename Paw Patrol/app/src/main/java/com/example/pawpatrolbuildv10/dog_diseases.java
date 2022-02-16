package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class dog_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout dog_disease1, dog_disease2, dog_disease3, dog_disease4, dog_disease5;
    LinearLayout dog_disease6, dog_disease7, dog_disease8, dog_disease9, dog_disease10;
    CardView dogDisease1, dogDisease2, dogDisease3, dogDisease4, dogDisease5;
    CardView dogDisease6, dogDisease7, dogDisease8, dogDisease9, dogDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_diseases);

        // CardView Block

        dogDisease1 = findViewById(R.id.dogDisease1);
        dogDisease2 = findViewById(R.id.dogDisease2);
        dogDisease3 = findViewById(R.id.dogDisease3);
        dogDisease4 = findViewById(R.id.dogDisease4);
        dogDisease5 = findViewById(R.id.dogDisease5);
        dogDisease6 = findViewById(R.id.dogDisease6);
        dogDisease7 = findViewById(R.id.dogDisease7);


        // Click Listener Block

        dogDisease1.setOnClickListener(this);
        dogDisease2.setOnClickListener(this);
        dogDisease3.setOnClickListener(this);
        dogDisease4.setOnClickListener(this);
        dogDisease5.setOnClickListener(this);
        dogDisease6.setOnClickListener(this);
        dogDisease7.setOnClickListener(this);

        // Diseases Block

        dog_disease1 = findViewById(R.id.dogdisease1);
        dog_disease2 = findViewById(R.id.dogdisease2);
        dog_disease3 = findViewById(R.id.dogdisease3);
        dog_disease4 = findViewById(R.id.dogdisease4);
        dog_disease5 = findViewById(R.id.dogdisease5);
        dog_disease6 = findViewById(R.id.dogdisease6);
        dog_disease7 = findViewById(R.id.dogdisease7);


    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent woof;

        switch (v.getId()) {
            case R.id.dogDisease1:
                woof = new Intent(this, dog_canine_distemper.class);
                startActivity(woof);
                break;
            case R.id.dogDisease2:
                woof = new Intent(this, dog_canine_parvo.class);
                startActivity(woof);
                break;
            case R.id.dogDisease3:
                woof = new Intent(this, dog_heatstroke.class);
                startActivity(woof);
                break;
            case R.id.dogDisease4:
                woof = new Intent(this, dog_intestinal_parasites.class);
                startActivity(woof);
                break;
            case R.id.dogDisease5:
                woof = new Intent(this, dog_leptospirosis.class);
                startActivity(woof);
                break;
            case R.id.dogDisease6:
                woof = new Intent(this, dog_heartworms.class);
                startActivity(woof);
                break;
            case R.id.dogDisease7:
                woof = new Intent(this, dog_fungal_infections.class);
                startActivity(woof);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}