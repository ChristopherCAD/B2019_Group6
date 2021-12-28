package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_dog_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout dog_disease1, dog_disease2, dog_disease3, dog_disease4, dog_disease5;
    LinearLayout dog_disease6, dog_disease7, dog_disease8, dog_disease9, dog_disease10;
    CardView dogDisease1, dogDisease2, dogDisease3, dogDisease4, dogDisease5;
    CardView dogDisease6, dogDisease7, dogDisease8, dogDisease9, dogDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_dog_disease);

        // CardView Block

        dogDisease1 = findViewById(R.id.dogDisease1);
        dogDisease2 = findViewById(R.id.dogDisease2);
        dogDisease3 = findViewById(R.id.dogDisease3);
        dogDisease4 = findViewById(R.id.dogDisease4);
        dogDisease5 = findViewById(R.id.dogDisease5);
        dogDisease6 = findViewById(R.id.dogDisease6);
        dogDisease7 = findViewById(R.id.dogDisease7);
        dogDisease8 = findViewById(R.id.dogDisease8);
        dogDisease9 = findViewById(R.id.dogDisease9);
        dogDisease10 = findViewById(R.id.dogDisease10);


        // Click Listener Block

        dogDisease1.setOnClickListener(this);
        dogDisease2.setOnClickListener(this);
        dogDisease3.setOnClickListener(this);
        dogDisease4.setOnClickListener(this);
        dogDisease5.setOnClickListener(this);
        dogDisease6.setOnClickListener(this);
        dogDisease7.setOnClickListener(this);;
        dogDisease8.setOnClickListener(this);
        dogDisease9.setOnClickListener(this);
        dogDisease10.setOnClickListener(this);



        // Diseases Block

        dog_disease1 = findViewById(R.id.dogdisease1);
        dog_disease2 = findViewById(R.id.dogdisease2);
        dog_disease3 = findViewById(R.id.dogdisease3);
        dog_disease4 = findViewById(R.id.dogdisease4);
        dog_disease5 = findViewById(R.id.dogdisease5);
        dog_disease6 = findViewById(R.id.dogdisease6);
        dog_disease7 = findViewById(R.id.dogdisease7);
        dog_disease8 = findViewById(R.id.dogdisease8);
        dog_disease9 = findViewById(R.id.dogdisease9);
        dog_disease10 = findViewById(R.id.dogdisease10);


        // Intent Block

        Boolean check1 = getIntent().getExtras().getBoolean("ds1");
        Boolean check2 = getIntent().getExtras().getBoolean("ds2");
        Boolean check3 = getIntent().getExtras().getBoolean("ds3");
        Boolean check4 = getIntent().getExtras().getBoolean("ds4");
        Boolean check5 = getIntent().getExtras().getBoolean("ds5");
        Boolean check6 = getIntent().getExtras().getBoolean("ds6");
        Boolean check7 = getIntent().getExtras().getBoolean("ds7");
        Boolean check8 = getIntent().getExtras().getBoolean("ds8");
        Boolean check9 = getIntent().getExtras().getBoolean("ds9");
        Boolean check10 = getIntent().getExtras().getBoolean("ds10");

        if (check1 && check2 && check3 && check4 && check5) {
            dog_disease1.setVisibility(View.GONE);
            dog_disease2.setVisibility(View.GONE);
            dog_disease3.setVisibility(View.GONE);
            dog_disease4.setVisibility(View.GONE);
            dog_disease5.setVisibility(View.GONE);
            dog_disease6.setVisibility(View.GONE);
            showToast("Conditions Met");
        } else if (check6) {
            dog_disease1.setVisibility(View.GONE);
        }

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.dogDisease1:
                activate = new Intent(this, disease1_rabbit.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}