package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class pp_Catto extends AppCompatActivity{

    Button cat_Search;
    CheckBox cs1, cs2, cs3, cs4, cs5;
    CheckBox cs6, cs7, cs8, cs9, cs10;
    CheckBox cs11, cs12, cs13, cs14, cs15;
    CheckBox cs16, cs17, cs18, cs19, cs20;
    CheckBox cs21, cs22, cs23;
    LinearLayout cat_disease1, cat_disease2, cat_disease3, cat_disease4, cat_disease5;
    LinearLayout cat_disease6, cat_disease7, cat_disease8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_catto);

        cs1 = findViewById(R.id.CS1);
        cs2 = findViewById(R.id.CS2);
        cs3 = findViewById(R.id.CS3);
        cs4 = findViewById(R.id.CS4);
        cs5 = findViewById(R.id.CS5);
        cs6 = findViewById(R.id.CS6);
        cs7 = findViewById(R.id.CS7);
        cs8 = findViewById(R.id.CS8);
        cs9 = findViewById(R.id.CS9);
        cs10 = findViewById(R.id.CS10);
        cs11 = findViewById(R.id.CS11);
        cs12 = findViewById(R.id.CS12);
        cs13 = findViewById(R.id.CS13);
        cs14 = findViewById(R.id.CS14);
        cs15 = findViewById(R.id.CS15);
        cs16 = findViewById(R.id.CS16);
        cs17 = findViewById(R.id.CS17);
        cs18 = findViewById(R.id.CS18);
        cs19 = findViewById(R.id.CS19);
        cs20 = findViewById(R.id.CS20);
        cs21 = findViewById(R.id.CS21);
        cs22 = findViewById(R.id.CS22);
        cs23 = findViewById(R.id.CS23);
        cat_Search = findViewById(R.id.catButtonSearch);

        cat_disease1 = findViewById(R.id.catdisease1);
        cat_disease2 = findViewById(R.id.catdisease2);
        cat_disease3 = findViewById(R.id.catdisease3);
        cat_disease4 = findViewById(R.id.catdisease4);
        cat_disease5 = findViewById(R.id.catdisease5);
        cat_disease6 = findViewById(R.id.catdisease6);


        cat_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(pp_Catto.this, pp_cat_diseases.class);


                if (cs1.isChecked() && cs2.isChecked () && cs3.isChecked() && cs4.isChecked() && cs5.isChecked()) {

                    c.putExtra("cs1", cs1.isChecked());
                    c.putExtra("cs2", cs2.isChecked());
                    c.putExtra("cs3", cs3.isChecked());
                    c.putExtra("cs4", cs4.isChecked());
                    c.putExtra("cs5", cs5.isChecked());
                    startActivity(c);
                } else if (cs6.isChecked()) {
                    c.putExtra("cs6", cs6.isChecked());
                    startActivity(c);
                } else {
                    showToast("This section is under development.");
                }

            }
        });



    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}