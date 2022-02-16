package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_bird_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout bird_disease1, bird_disease2, bird_disease3, bird_disease4, bird_disease5;
    LinearLayout bird_disease6, bird_disease7, bird_disease8, bird_disease9, bird_disease10;
    CardView birdDisease1, birdDisease2, birdDisease3, birdDisease4, birdDisease5;
    CardView birdDisease6, birdDisease7, birdDisease8, birdDisease9, birdDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_bird_disease);

        // CardView Block

        birdDisease1 = findViewById(R.id.birdDisease1);
        birdDisease2 = findViewById(R.id.birdDisease2);
        birdDisease3 = findViewById(R.id.birdDisease3);
        birdDisease4 = findViewById(R.id.birdDisease4);
        birdDisease5 = findViewById(R.id.birdDisease5);
        birdDisease6 = findViewById(R.id.birdDisease6);
        birdDisease7 = findViewById(R.id.birdDisease7);

        // Click Listener Block

        birdDisease1.setOnClickListener(this);
        birdDisease2.setOnClickListener(this);
        birdDisease3.setOnClickListener(this);
        birdDisease4.setOnClickListener(this);
        birdDisease5.setOnClickListener(this);
        birdDisease6.setOnClickListener(this);
        birdDisease7.setOnClickListener(this);
        birdDisease8.setOnClickListener(this);
        birdDisease9.setOnClickListener(this);
        birdDisease10.setOnClickListener(this);



        // Diseases Block

        bird_disease1 = findViewById(R.id.birddisease1);
        bird_disease2 = findViewById(R.id.birddisease2);
        bird_disease3 = findViewById(R.id.birddisease3);
        bird_disease4 = findViewById(R.id.birddisease4);
        bird_disease5 = findViewById(R.id.birddisease5);
        bird_disease6 = findViewById(R.id.birddisease6);
        bird_disease7 = findViewById(R.id.birddisease7);


        // Intent Block

        Boolean check1 = getIntent().getExtras().getBoolean("bs1");
        Boolean check2 = getIntent().getExtras().getBoolean("bs2");
        Boolean check3 = getIntent().getExtras().getBoolean("bs3");
        Boolean check4 = getIntent().getExtras().getBoolean("bs4");
        Boolean check5 = getIntent().getExtras().getBoolean("bs5");
        Boolean check6 = getIntent().getExtras().getBoolean("bs6");
        Boolean check7 = getIntent().getExtras().getBoolean("bs7");
        Boolean check8 = getIntent().getExtras().getBoolean("bs8");
        Boolean check9 = getIntent().getExtras().getBoolean("bs9");
        Boolean check10 = getIntent().getExtras().getBoolean("bs10");
        Boolean check11 = getIntent().getExtras().getBoolean("bs11");
        Boolean check12 = getIntent().getExtras().getBoolean("bs12");
        Boolean check13 = getIntent().getExtras().getBoolean("bs13");
        Boolean check14 = getIntent().getExtras().getBoolean("bs14");
        Boolean check15 = getIntent().getExtras().getBoolean("bs15");
        Boolean check16 = getIntent().getExtras().getBoolean("bs16");
        Boolean check17 = getIntent().getExtras().getBoolean("bs17");
        Boolean check18 = getIntent().getExtras().getBoolean("bs18");
        Boolean check19 = getIntent().getExtras().getBoolean("bs19");
        Boolean check20 = getIntent().getExtras().getBoolean("bs20");
        Boolean check21 = getIntent().getExtras().getBoolean("bs21");

        if (check1 && check2 && check3 && check13 && check18) {

            // Salmonella

            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (check4 && check5 && check6 && check11) {

            // Bird Mites
            bird_disease1.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (check4 && check7 && check8 && check9 && check10) {

            // Feather Disease +
            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (check15 && check16 && check17 && check18) {

            // PoxVirus
            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (check2 && check5 && check12 && check13 && check14) {

            // Pacheco Disease
            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (check14 && check19 && check20 && check21) {

            // West Nile Virus
            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);

        }

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