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
        frogDisease6 = findViewById(R.id.frogDisease6);

        // Click Listener Block

        frogDisease1.setOnClickListener(this);
        frogDisease2.setOnClickListener(this);
        frogDisease3.setOnClickListener(this);
        frogDisease4.setOnClickListener(this);
        frogDisease5.setOnClickListener(this);
        frogDisease6.setOnClickListener(this);

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
        Boolean check6 = getIntent().getExtras().getBoolean("fs6");
        Boolean check7 = getIntent().getExtras().getBoolean("fs7");
        Boolean check8 = getIntent().getExtras().getBoolean("fs8");
        Boolean check9 = getIntent().getExtras().getBoolean("fs9");
        Boolean check10 = getIntent().getExtras().getBoolean("fs10");
        Boolean check11 = getIntent().getExtras().getBoolean("fs11");
        Boolean check12 = getIntent().getExtras().getBoolean("fs12");
        Boolean check13 = getIntent().getExtras().getBoolean("fs13");
        Boolean check14 = getIntent().getExtras().getBoolean("fs14");
        Boolean check15 = getIntent().getExtras().getBoolean("fs15");


        if (check1 && check2 && check3 && check4) {

            // Chytridiomycosis

            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);
            frogdisease5.setVisibility(View.GONE);

        } else if (check5 && check6 && check7 && check8 && check9) {

            // Red Leg Syndrome + Mycobacteroisis

            frogdisease1.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease5.setVisibility(View.GONE);

        } else if (check6 && check10 && check11 && check12) {

            // Obesity

            frogdisease1.setVisibility(View.GONE);
            frogdisease2.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);
            frogdisease5.setVisibility(View.GONE);

        } else if (check7 && check8 && check13 && check14 && check15) {

            // Mycobacteroisis + Red Leg Syndrome

            frogdisease1.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease5.setVisibility(View.GONE);

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
            case R.id.frogDisease2:
                croak = new Intent(this, frog_redLegSyndrome.class);
                startActivity(croak);
                break;
            case R.id.frogDisease3:
                croak = new Intent(this, frog_obesity.class);
                startActivity(croak);
                break;
            case R.id.frogDisease4:
                croak = new Intent(this, frog_mycobacteriosis.class);
                startActivity(croak);
                break;
            default:
                break;
        }
    }
}