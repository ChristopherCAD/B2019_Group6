package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class reptile_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout reptile_disease1, reptile_disease2, reptile_disease3, reptile_disease4, reptile_disease5;
    LinearLayout reptile_disease6;
    CardView reptileDisease1, reptileDisease2, reptileDisease3, reptileDisease4, reptileDisease5;
    CardView reptileDisease6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reptile_diseases);

        // CardView Block

        reptileDisease1 = findViewById(R.id.reptileDisease1);
        reptileDisease2 = findViewById(R.id.reptileDisease2);
        reptileDisease3 = findViewById(R.id.reptileDisease3);
        reptileDisease4 = findViewById(R.id.reptileDisease4);
        reptileDisease5 = findViewById(R.id.reptileDisease5);
        reptileDisease6 = findViewById(R.id.reptileDisease6);

        // Click Listener Block

        reptileDisease1.setOnClickListener(this);
        reptileDisease2.setOnClickListener(this);
        reptileDisease3.setOnClickListener(this);
        reptileDisease4.setOnClickListener(this);
        reptileDisease5.setOnClickListener(this);
        reptileDisease6.setOnClickListener(this);

        // Diseases Block

        reptile_disease1 = findViewById(R.id.reptiledisease1);
        reptile_disease2 = findViewById(R.id.reptiledisease2);
        reptile_disease3 = findViewById(R.id.reptiledisease3);
        reptile_disease4 = findViewById(R.id.reptiledisease4);
        reptile_disease5 = findViewById(R.id.reptiledisease5);
        reptile_disease6 = findViewById(R.id.reptiledisease6);

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.reptileDisease1:
                activate = new Intent(this, reptiles_earInfections.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease2:
                activate = new Intent(this, reptiles_antemoeba.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease3:
                activate = new Intent(this, reptile_mouthRot.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease4:
                activate = new Intent(this, reptiles_boneDisease.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease5:
                activate = new Intent(this, reptiles_herpesvirus.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease6:
                activate = new Intent(this, reptiles_fungal_infection.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}