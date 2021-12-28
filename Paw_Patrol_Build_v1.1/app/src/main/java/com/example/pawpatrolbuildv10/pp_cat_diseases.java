package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_cat_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout cat_disease1, cat_disease2, cat_disease3, cat_disease4, cat_disease5;
    LinearLayout cat_disease6, cat_disease7, cat_disease8;
    CardView catDisease1, catDisease2, catDisease3,catDisease4,catDisease5;
    CardView catDisease6, catDisease7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_cat_diseases);

        // CardView Block

        catDisease1 = findViewById(R.id.catDisease1);
        catDisease2 = findViewById(R.id.catDisease2);
        catDisease3 = findViewById(R.id.catDisease3);
        catDisease4 = findViewById(R.id.catDisease4);
        catDisease5 = findViewById(R.id.catDisease5);
        catDisease6 = findViewById(R.id.catDisease6);
        catDisease7 = findViewById(R.id.catDisease7);

        // Click Listener Block

        catDisease1.setOnClickListener(this);
        catDisease2.setOnClickListener(this);
        catDisease3.setOnClickListener(this);
        catDisease4.setOnClickListener(this);
        catDisease5.setOnClickListener(this);
        catDisease6.setOnClickListener(this);
        catDisease7.setOnClickListener(this);



        // Diseases Block

        cat_disease1 = findViewById(R.id.catdisease1);
        cat_disease2 = findViewById(R.id.catdisease2);
        cat_disease3 = findViewById(R.id.catdisease3);
        cat_disease4 = findViewById(R.id.catdisease4);
        cat_disease5 = findViewById(R.id.catdisease5);
        cat_disease6 = findViewById(R.id.catdisease6);
        cat_disease7 = findViewById(R.id.catdisease7);


        // Intent Block

        Boolean check1 = getIntent().getExtras().getBoolean("cs1");
        Boolean check2 = getIntent().getExtras().getBoolean("cs2");
        Boolean check3 = getIntent().getExtras().getBoolean("cs3");
        Boolean check4 = getIntent().getExtras().getBoolean("cs4");
        Boolean check5 = getIntent().getExtras().getBoolean("cs5");
        Boolean check6 = getIntent().getExtras().getBoolean("cs6");

        if (check1 && check2 && check3 && check4 && check5) {
            cat_disease1.setVisibility(View.GONE);
            cat_disease2.setVisibility(View.GONE);
            cat_disease3.setVisibility(View.GONE);
            cat_disease4.setVisibility(View.GONE);
            cat_disease5.setVisibility(View.GONE);
            cat_disease6.setVisibility(View.GONE);
            showToast("Conditions Met");
        } else if (check6) {
            cat_disease7.setVisibility(View.GONE);
        }


    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.catDisease7:
                activate = new Intent(this, disease1_rabbit.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}