package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_reptile_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout reptile_disease1, reptile_disease2, reptile_disease3, reptile_disease4, reptile_disease5;
    LinearLayout reptile_disease6, reptile_disease7, reptile_disease8, reptile_disease9, reptile_disease10;
    CardView reptileDisease1, reptileDisease2, reptileDisease3, reptileDisease4, reptileDisease5;
    CardView reptileDisease6, reptileDisease7, reptileDisease8, reptileDisease9, reptileDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_reptile_disease);

        // CardView Block

        reptileDisease1 = findViewById(R.id.reptileDisease1);
        reptileDisease2 = findViewById(R.id.reptileDisease2);
        reptileDisease3 = findViewById(R.id.reptileDisease3);
        reptileDisease4 = findViewById(R.id.reptileDisease4);
        reptileDisease5 = findViewById(R.id.reptileDisease5);
        reptileDisease6 = findViewById(R.id.reptileDisease6);
        reptileDisease7 = findViewById(R.id.reptileDisease7);
        reptileDisease8 = findViewById(R.id.reptileDisease8);
        reptileDisease9 = findViewById(R.id.reptileDisease9);
        reptileDisease10 = findViewById(R.id.reptileDisease10);

        // Click Listener Block

        reptileDisease1.setOnClickListener(this);
        reptileDisease2.setOnClickListener(this);
        reptileDisease3.setOnClickListener(this);
        reptileDisease4.setOnClickListener(this);
        reptileDisease5.setOnClickListener(this);
        reptileDisease6.setOnClickListener(this);
        reptileDisease7.setOnClickListener(this);;
        reptileDisease8.setOnClickListener(this);
        reptileDisease9.setOnClickListener(this);
        reptileDisease10.setOnClickListener(this);

        // Diseases Block

        reptile_disease1 = findViewById(R.id.reptiledisease1);
        reptile_disease2 = findViewById(R.id.reptiledisease2);
        reptile_disease3 = findViewById(R.id.reptiledisease3);
        reptile_disease4 = findViewById(R.id.reptiledisease4);
        reptile_disease5 = findViewById(R.id.reptiledisease5);
        reptile_disease6 = findViewById(R.id.reptiledisease6);
        reptile_disease7 = findViewById(R.id.reptiledisease7);
        reptile_disease8 = findViewById(R.id.reptiledisease8);
        reptile_disease9 = findViewById(R.id.reptiledisease9);
        reptile_disease10 = findViewById(R.id.reptiledisease10);

        // Intent Block

        Boolean check1 = getIntent().getExtras().getBoolean("ls1");
        Boolean check2 = getIntent().getExtras().getBoolean("ls2");
        Boolean check3 = getIntent().getExtras().getBoolean("ls3");
        Boolean check4 = getIntent().getExtras().getBoolean("ls4");
        Boolean check5 = getIntent().getExtras().getBoolean("ls5");
        Boolean check6 = getIntent().getExtras().getBoolean("ls6");
        Boolean check7 = getIntent().getExtras().getBoolean("ls7");
        Boolean check8 = getIntent().getExtras().getBoolean("ls8");
        Boolean check9 = getIntent().getExtras().getBoolean("ls9");
        Boolean check10 = getIntent().getExtras().getBoolean("ls10");

        if (check1 && check2 && check3 && check4 && check5) {
            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);
            showToast("Conditions Met");
        } else if (check6) {
            reptile_disease7.setVisibility(View.GONE);
        }

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.reptileDisease1:
                activate = new Intent(this, disease1_rabbit.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}