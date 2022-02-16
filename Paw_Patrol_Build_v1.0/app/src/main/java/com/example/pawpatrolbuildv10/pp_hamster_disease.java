package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_hamster_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout hamster_disease1, hamster_disease2, hamster_disease3, hamster_disease4, hamster_disease5;
    LinearLayout hamster_disease6, hamster_disease7, hamster_disease8, hamster_disease9, hamster_disease10;
    CardView hamsterDisease1, hamsterDisease2, hamsterDisease3, hamsterDisease4, hamsterDisease5;
    CardView hamsterDisease6, hamsterDisease7, hamsterDisease8, hamsterDisease9, hamsterDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_hamster_disease);

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
        hamsterDisease7.setOnClickListener(this);;
        hamsterDisease8.setOnClickListener(this);
        hamsterDisease9.setOnClickListener(this);
        hamsterDisease10.setOnClickListener(this);

        // Diseases Block

        hamster_disease1 = findViewById(R.id.hamsterdisease1);
        hamster_disease2 = findViewById(R.id.hamsterdisease2);
        hamster_disease3 = findViewById(R.id.hamsterdisease3);
        hamster_disease4 = findViewById(R.id.hamsterdisease4);
        hamster_disease5 = findViewById(R.id.hamsterdisease5);
        hamster_disease6 = findViewById(R.id.hamsterdisease6);
        hamster_disease7 = findViewById(R.id.hamsterdisease7);


        // Intent Block

        Boolean check1 = getIntent().getExtras().getBoolean("hs1");
        Boolean check2 = getIntent().getExtras().getBoolean("hs2");
        Boolean check3 = getIntent().getExtras().getBoolean("hs3");
        Boolean check4 = getIntent().getExtras().getBoolean("hs4");
        Boolean check5 = getIntent().getExtras().getBoolean("hs5");
        Boolean check6 = getIntent().getExtras().getBoolean("hs6");
        Boolean check7 = getIntent().getExtras().getBoolean("hs7");
        Boolean check8 = getIntent().getExtras().getBoolean("hs8");
        Boolean check9 = getIntent().getExtras().getBoolean("hs9");
        Boolean check10 = getIntent().getExtras().getBoolean("hs10");
        Boolean check11 = getIntent().getExtras().getBoolean("hs11");
        Boolean check12 = getIntent().getExtras().getBoolean("hs12");
        Boolean check13 = getIntent().getExtras().getBoolean("hs13");
        Boolean check14 = getIntent().getExtras().getBoolean("hs14");
        Boolean check15 = getIntent().getExtras().getBoolean("hs15");

        if (check1 && check2 && check3 && check4 && check5) {

            // Wet Tails + Tapeworms

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (check7 && check8 && check9) {

            // Atrial Thrombosis

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (check2 && check6 && check10 && check11 && check12) {

            // Tyzzer's Disease

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (check1 && check3 && check12 && check13) {

            // Salmonella

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (check1 && check2 && check5 && check6 && check13) {

            // Tapeworms + Wet Tails

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (check7 && check14 && check15) {

            // Pneumonia

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);


        }

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