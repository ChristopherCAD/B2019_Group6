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

public class pp_Hamster extends AppCompatActivity {

    Button hamster_Search;
    CheckBox hs1, hs2, hs3, hs4, hs5;
    CheckBox hs6, hs7, hs8, hs9, hs10;
    CheckBox hs11, hs12, hs13, hs14, hs15;
    LinearLayout hamster_disease1, hamster_disease2, hamster_disease3, hamster_disease4, hamster_disease5;
    LinearLayout hamster_disease6, hamster_disease7, hamster_disease8, hamster_disease9, hamster_disease10;
    CardView hamsterDisease1, hamsterDisease2, hamsterDisease3, hamsterDisease4, hamsterDisease5;
    CardView hamsterDisease6, hamsterDisease7, hamsterDisease8, hamsterDisease9, hamsterDisease10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_hamster);

        hs1 = findViewById(R.id.HS1);
        hs2 = findViewById(R.id.HS2);
        hs3 = findViewById(R.id.HS3);
        hs4 = findViewById(R.id.HS4);
        hs5 = findViewById(R.id.HS5);
        hs6 = findViewById(R.id.HS6);
        hs7 = findViewById(R.id.HS7);
        hs8 = findViewById(R.id.HS8);
        hs9 = findViewById(R.id.HS9);
        hs10 = findViewById(R.id.HS10);
        hs11 = findViewById(R.id.HS11);
        hs12 = findViewById(R.id.HS12);
        hs13 = findViewById(R.id.HS13);
        hs14 = findViewById(R.id.HS14);
        hs15 = findViewById(R.id.HS15);

        hamster_Search = findViewById(R.id.hamsterButtonSearch);

        hamster_disease1 = findViewById(R.id.hamsterdisease1);
        hamster_disease2 = findViewById(R.id.hamsterdisease2);
        hamster_disease3 = findViewById(R.id.hamsterdisease3);
        hamster_disease4 = findViewById(R.id.hamsterdisease4);
        hamster_disease5 = findViewById(R.id.hamsterdisease5);
        hamster_disease6 = findViewById(R.id.hamsterdisease6);
        hamster_disease7 = findViewById(R.id.hamsterdisease7);


        hamster_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(pp_Hamster.this, pp_hamster_disease.class);


                if (hs1.isChecked() && hs2.isChecked() && hs3.isChecked() && hs4.isChecked() && hs5.isChecked()) {

                    // Wet Tails + Tapeworms

                    h.putExtra("hs1", hs1.isChecked());
                    h.putExtra("hs2", hs2.isChecked());
                    h.putExtra("hs3", hs3.isChecked());
                    h.putExtra("hs4", hs4.isChecked());
                    h.putExtra("hs5", hs5.isChecked());
                    startActivity(h);

                } else if (hs7.isChecked() && hs8.isChecked() && hs9.isChecked()) {

                    // Atrial Thrombosis

                    h.putExtra("hs7", hs7.isChecked());
                    h.putExtra("hs8", hs8.isChecked());
                    h.putExtra("hs9", hs9.isChecked());
                    startActivity(h);

                } else if (hs2.isChecked() && hs6.isChecked() && hs10.isChecked() && hs11.isChecked() && hs12.isChecked()) {

                    // Tyzzer's Disease

                    h.putExtra("hs2", hs2.isChecked());
                    h.putExtra("hs6", hs6.isChecked());
                    h.putExtra("hs10", hs10.isChecked());
                    h.putExtra("hs11", hs11.isChecked());
                    h.putExtra("hs12", hs12.isChecked());
                    startActivity(h);

                } else if (hs1.isChecked() && hs3.isChecked() && hs12.isChecked() && hs13.isChecked()) {

                    // Salmonella

                    h.putExtra("hs1", hs1.isChecked());
                    h.putExtra("hs3", hs3.isChecked());
                    h.putExtra("hs12", hs12.isChecked());
                    h.putExtra("hs13", hs13.isChecked());
                    startActivity(h);

                } else if (hs1.isChecked() && hs2.isChecked() && hs5.isChecked() && hs6.isChecked() && hs13.isChecked()) {

                    // Tapeworms + Wet Tails

                    h.putExtra("hs1", hs1.isChecked());
                    h.putExtra("hs2", hs2.isChecked());
                    h.putExtra("hs5", hs5.isChecked());
                    h.putExtra("hs6", hs6.isChecked());
                    h.putExtra("hs13", hs13.isChecked());
                    startActivity(h);

                } else if (hs7.isChecked() && hs14.isChecked() && hs15.isChecked()) {

                    // Pneumonia

                    h.putExtra("hs7", hs7.isChecked());
                    h.putExtra("hs14", hs14.isChecked());
                    h.putExtra("hs15", hs15.isChecked());
                    startActivity(h);

                }
            }
        });


    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}