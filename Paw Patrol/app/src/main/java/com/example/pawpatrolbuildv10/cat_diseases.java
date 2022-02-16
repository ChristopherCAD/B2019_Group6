package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class cat_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout cat_disease1, cat_disease2, cat_disease3, cat_disease4, cat_disease5;
    LinearLayout cat_disease6, cat_disease7, cat_disease8;
    CardView catDisease1, catDisease2, catDisease3,catDisease4,catDisease5;
    CardView catDisease6, catDisease7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_diseases);

        // CardView Block

        catDisease1 = findViewById(R.id.catDisease1);
        catDisease2 = findViewById(R.id.catDisease2);
        catDisease3 = findViewById(R.id.catDisease3);
        catDisease4 = findViewById(R.id.catDisease4);
        catDisease5 = findViewById(R.id.catDisease5);
        catDisease6 = findViewById(R.id.catDisease6);

        // Click Listener Block

        catDisease1.setOnClickListener(this);
        catDisease2.setOnClickListener(this);
        catDisease3.setOnClickListener(this);
        catDisease4.setOnClickListener(this);
        catDisease5.setOnClickListener(this);
        catDisease6.setOnClickListener(this);


        // Diseases Block

        cat_disease1 = findViewById(R.id.catdisease1);
        cat_disease2 = findViewById(R.id.catdisease2);
        cat_disease3 = findViewById(R.id.catdisease3);
        cat_disease4 = findViewById(R.id.catdisease4);
        cat_disease5 = findViewById(R.id.catdisease5);
        cat_disease6 = findViewById(R.id.catdisease6);
    }

    public void onClick(View v) {
        Intent meow;

        switch (v.getId()) {
            case R.id.catDisease1:
                meow = new Intent(this, cat_cancer.class);
                startActivity(meow);
                break;
            case R.id.catDisease2:
                meow = new Intent(this, cat_kidney_disease1.class);
                startActivity(meow);
                break;
            case R.id.catDisease3:
                meow = new Intent(this, cat_FIV.class);
                startActivity(meow);
                break;
            case R.id.catDisease4:
                meow = new Intent(this, cat_leukemia_virus.class);
                startActivity(meow);
                break;
            case R.id.catDisease5:
                meow = new Intent(this, cat_pankreatitis.class);
                startActivity(meow);
                break;
            case R.id.catDisease6:
                meow = new Intent(this, cat_hyperthyroidism.class);
                startActivity(meow);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}