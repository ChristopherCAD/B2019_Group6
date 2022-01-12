package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_frog_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout frogdisease1, frogdisease2, frogdisease3, frogdisease4, frogdisease5;
    CardView frogDisease1, frogDisease2, frogDisease3, frogDisease4, frogDisease5;
    CardView frogDisease6, frogDisease7, frogDisease8, frogDisease9, frogDisease10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_frog_disease);

        // CardView Block

        frogDisease1 = findViewById(R.id.frogDisease1);
        frogDisease2 = findViewById(R.id.frogDisease2);
        frogDisease3 = findViewById(R.id.frogDisease3);
        frogDisease4 = findViewById(R.id.frogDisease4);
        frogDisease5 = findViewById(R.id.frogDisease5);

        // Click Listener Block

        frogDisease1.setOnClickListener(this);
        frogDisease2.setOnClickListener(this);
        frogDisease3.setOnClickListener(this);
        frogDisease4.setOnClickListener(this);
        frogDisease5.setOnClickListener(this);

        // Diseases Block

        frogdisease1 = findViewById(R.id.frogdisease1);
        frogdisease2 = findViewById(R.id.frogdisease2);
        frogdisease3 = findViewById(R.id.frogdisease3);
        frogdisease4 = findViewById(R.id.frogdisease4);
        frogdisease5 = findViewById(R.id.frogdisease5);

        // Intent Block

        Boolean check1 = getIntent().getExtras().getBoolean("fs1");
        Boolean check2 = getIntent().getExtras().getBoolean("fs2");
        Boolean check3 = getIntent().getExtras().getBoolean("fs3");
        Boolean check4 = getIntent().getExtras().getBoolean("fs4");
        Boolean check5 = getIntent().getExtras().getBoolean("fs5");


        if (check1 && check2 && check3 && check4) {
            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);
            frogdisease5.setVisibility(View.GONE);
            showToast("Conditions Met");
        }
        if (check5) {
            frogdisease1.setVisibility(View.GONE);
            showToast("Conditions are met.");
        }

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v){
        Intent croak;

        switch (v.getId()) {
            case R.id.frogDisease1:
                croak = new Intent(this, frog_chytridiomycosis.class);
                startActivity(croak);
                break;
            default:
                break;
        }
    }
}