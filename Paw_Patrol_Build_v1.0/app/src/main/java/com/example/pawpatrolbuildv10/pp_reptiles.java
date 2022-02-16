package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_reptiles extends AppCompatActivity {

    Button lizard_Search;
    CheckBox ls1, ls2, ls3, ls4, ls5;
    CheckBox ls6, ls7, ls8, ls9, ls10;
    CheckBox ls11, ls12, ls13, ls14, ls15;
    LinearLayout reptile_disease1, reptile_disease2, reptile_disease3, reptile_disease4, reptile_disease5;
    LinearLayout reptile_disease6, reptile_disease7, reptile_disease8, reptile_disease9, reptile_disease10;
    CardView reptileDisease1, reptileDisease2, reptileDisease3, reptileDisease4, reptileDisease5;
    CardView reptileDisease6, reptileDisease7, reptileDisease8, reptileDisease9, reptileDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_reptiles);

        ls1 = findViewById(R.id.LS1);
        ls2 = findViewById(R.id.LS2);
        ls3 = findViewById(R.id.LS3);
        ls4 = findViewById(R.id.LS4);
        ls5 = findViewById(R.id.LS5);
        ls6 = findViewById(R.id.LS6);
        ls7 = findViewById(R.id.LS7);
        ls8 = findViewById(R.id.LS8);
        ls9 = findViewById(R.id.LS9);
        ls10 = findViewById(R.id.LS10);
        ls11 = findViewById(R.id.LS11);
        ls12 = findViewById(R.id.LS12);
        ls13 = findViewById(R.id.LS13);
        ls14 = findViewById(R.id.LS14);

        lizard_Search = findViewById(R.id.lizardButtonSearch);

        reptile_disease1 = findViewById(R.id.reptiledisease1);
        reptile_disease2 = findViewById(R.id.reptiledisease2);
        reptile_disease3 = findViewById(R.id.reptiledisease3);
        reptile_disease4 = findViewById(R.id.reptiledisease4);
        reptile_disease5 = findViewById(R.id.reptiledisease5);
        reptile_disease6 = findViewById(R.id.reptiledisease6);
        reptile_disease7 = findViewById(R.id.reptiledisease7);

        showToast("Click Symptoms 1 to 5 for a demo.");
        showToast("Click Symptom 6 for a comparison.");

        lizard_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(pp_reptiles.this, pp_reptile_disease.class);

                if (ls1.isChecked() && ls2.isChecked() && ls3.isChecked()) {

                    // Ear Infections

                    l.putExtra("ls1", ls1.isChecked());
                    l.putExtra("ls2", ls2.isChecked());
                    l.putExtra("ls3", ls3.isChecked());
                    startActivity(l);

                } else if (ls3.isChecked() && ls4.isChecked() && ls5.isChecked() && ls6.isChecked() && ls7.isChecked()) {

                    // Amebiasis

                    l.putExtra("ls3", ls3.isChecked());
                    l.putExtra("ls4", ls4.isChecked());
                    l.putExtra("ls5", ls5.isChecked());
                    l.putExtra("ls6", ls6.isChecked());
                    l.putExtra("ls7", ls7.isChecked());
                    startActivity(l);

                } else if (ls8.isChecked() && ls9.isChecked() && ls13.isChecked()) {

                    // Mouth Rot + Herpesvirus

                    l.putExtra("ls8", ls8.isChecked());
                    l.putExtra("ls9", ls9.isChecked());
                    l.putExtra("ls13", ls13.isChecked());
                    startActivity(l);

                } else if (ls10.isChecked() && ls11.isChecked() && ls12.isChecked()) {

                    // Metabolic Bone Disease

                    l.putExtra("ls10", ls10.isChecked());
                    l.putExtra("ls11", ls11.isChecked());
                    l.putExtra("ls12", ls12.isChecked());
                    startActivity(l);

                } else if (ls8.isChecked() && ls9.isChecked() && ls13.isChecked() && ls14.isChecked()) {

                    // HerpesVirus + Mouth Rot

                    l.putExtra("ls8", ls8.isChecked());
                    l.putExtra("ls9", ls9.isChecked());
                    l.putExtra("ls13", ls13.isChecked());
                    l.putExtra("ls14", ls14.isChecked());
                    startActivity(l);

                } else if (ls3.isChecked() && ls6.isChecked() && ls14.isChecked()) {

                    // Fungal Infections

                    l.putExtra("ls3", ls3.isChecked());
                    l.putExtra("ls6", ls6.isChecked());
                    l.putExtra("ls14", ls14.isChecked());
                    startActivity(l);

                }
            }
        });

    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}