package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class rabbit_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout rabbit_disease1, rabbit_disease2, rabbit_disease3;
    LinearLayout rabbit_disease4, rabbit_disease5, rabbit_disease6;
    CardView rabbitDisease1, rabbitDisease2, rabbitDisease3, rabbitDisease4, rabbitDisease5;
    CardView rabbitDisease6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit_diseases);

        // CardView Block

        rabbitDisease1 = findViewById(R.id.rabbitDisease1);
        rabbitDisease2 = findViewById(R.id.rabbitDisease2);
        rabbitDisease3 = findViewById(R.id.rabbitDisease3);
        rabbitDisease4 = findViewById(R.id.rabbitDisease4);
        rabbitDisease5 = findViewById(R.id.rabbitDisease5);
        rabbitDisease6 = findViewById(R.id.rabbitDisease6);

        // Click Listener Block

        rabbitDisease1.setOnClickListener(this);
        rabbitDisease2.setOnClickListener(this);
        rabbitDisease3.setOnClickListener(this);
        rabbitDisease4.setOnClickListener(this);
        rabbitDisease5.setOnClickListener(this);
        rabbitDisease6.setOnClickListener(this);


        // Diseases Block

        rabbit_disease1 = findViewById(R.id.rabbitdisease1);
        rabbit_disease2 = findViewById(R.id.rabbitdisease2);
        rabbit_disease3 = findViewById(R.id.rabbitdisease3);
        rabbit_disease4 = findViewById(R.id.rabbitdisease4);
        rabbit_disease5 = findViewById(R.id.rabbitdisease5);
        rabbit_disease6 = findViewById(R.id.rabbitdisease6);

    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View v){
        Intent activate;

        switch (v.getId()) {
            case R.id.rabbitDisease1:
                activate = new Intent(this, disease1_rabbit.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease2:
                activate = new Intent(this, rabbit_snuffles.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease3:
                activate = new Intent(this, rabbit_utermine_tumors.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease4:
                activate = new Intent(this, rabbit_hemmorhagic_disease.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease5:
                activate = new Intent(this, rabbit_hairballs.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease6:
                activate = new Intent(this, rabbit_myxomatosis.class);
                startActivity(activate);
                break;
            default:
                break;
        }
    }
}