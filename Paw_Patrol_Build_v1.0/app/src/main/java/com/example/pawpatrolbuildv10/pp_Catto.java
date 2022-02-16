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

    // Original Code ._. GitHub Directory

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
                Intent neko = new Intent(pp_Catto.this, pp_cat_diseases.class);

                if (cs1.isChecked() && cs2.isChecked () && cs3.isChecked() && cs4.isChecked() && cs5.isChecked()) {

                    // Cancer Symptoms + other related Illness
                    // If there are three or more similar symptoms
                    // cout >> Related Disease

                    c.putExtra("cs1", cs1.isChecked());
                    c.putExtra("cs2", cs2.isChecked());
                    c.putExtra("cs3", cs3.isChecked());
                    c.putExtra("cs4", cs4.isChecked());
                    c.putExtra("cs5", cs5.isChecked());
                    startActivity(c);

                } else if (cs3.isChecked() && cs4.isChecked() && cs10.isChecked() && cs11.isChecked() && cs12.isChecked()) {

                    // Kidney Disease Symptoms + Related Illness

                    c.putExtra("cs3", cs3.isChecked());
                    c.putExtra("cs4", cs4.isChecked());
                    c.putExtra("cs10", cs10.isChecked());
                    c.putExtra("cs11", cs11.isChecked());
                    c.putExtra("cs12", cs12.isChecked());
                    startActivity(c);

                } else if (cs13.isChecked() && cs14.isChecked() && cs21.isChecked() && cs22.isChecked()){

                    // FIV disease

                    c.putExtra("cs13", cs13.isChecked());
                    c.putExtra("cs14", cs14.isChecked());
                    c.putExtra("cs21", cs21.isChecked());
                    c.putExtra("cs22", cs22.isChecked());
                    startActivity(c);

                } else if (cs1.isChecked() && cs6.isChecked() && cs13.isChecked() && cs16.isChecked() && cs21.isChecked()) {

                    // FELV + other Diseases

                    c.putExtra("cs1", cs1.isChecked());
                    c.putExtra("cs6", cs6.isChecked());
                    c.putExtra("cs13", cs13.isChecked());
                    c.putExtra("cs16", cs16.isChecked());
                    c.putExtra("cs21", cs21.isChecked());
                    startActivity(c);

                } else if (cs17.isChecked() && cs13.isChecked() && cs7.isChecked() && cs21.isChecked() && cs6.isChecked()) {

                    // Pancreatitis +

                    c.putExtra("cs6", cs6.isChecked());
                    c.putExtra("cs7", cs7.isChecked());
                    c.putExtra("cs13", cs13.isChecked());
                    c.putExtra("cs17", cs17.isChecked());
                    c.putExtra("cs21", cs21.isChecked());
                    startActivity(c);

                } else if (cs1.isChecked() && cs18.isChecked() && cs19.isChecked() && cs20.isChecked()) {

                    // Hyperthyroidism

                    c.putExtra("cs1", cs1.isChecked());
                    c.putExtra("cs18", cs18.isChecked());
                    c.putExtra("cs19", cs19.isChecked());
                    c.putExtra("cs20", cs20.isChecked());
                    startActivity(c);
                } else if (cs1.isChecked() || cs2.isChecked() || cs3.isChecked() || cs4.isChecked() || cs5.isChecked() || cs6.isChecked() || cs7.isChecked() || cs8.isChecked() || cs9.isChecked() || cs10.isChecked()) {
                    neko.putExtra("cs1", cs1.isChecked());
                    neko.putExtra("cs2", cs2.isChecked());
                    neko.putExtra("cs3", cs3.isChecked());
                    neko.putExtra("cs4", cs4.isChecked());
                    neko.putExtra("cs5", cs5.isChecked());
                    neko.putExtra("cs6", cs6.isChecked());
                    neko.putExtra("cs7", cs7.isChecked());
                    neko.putExtra("cs8", cs8.isChecked());
                    neko.putExtra("cs9", cs9.isChecked());
                    neko.putExtra("cs10", cs10.isChecked());
                    startActivity(neko);
                } else if (cs11.isChecked() || cs12.isChecked() || cs13.isChecked() || cs14.isChecked() || cs15.isChecked() || cs16.isChecked() || cs17.isChecked() || cs18.isChecked() || cs19.isChecked() || cs20.isChecked()){
                    neko.putExtra("cs11", cs11.isChecked());
                    neko.putExtra("cs12", cs12.isChecked());
                    neko.putExtra("cs13", cs13.isChecked());
                    neko.putExtra("cs14", cs14.isChecked());
                    neko.putExtra("cs15", cs15.isChecked());
                    neko.putExtra("cs16", cs16.isChecked());
                    neko.putExtra("cs17", cs17.isChecked());
                    neko.putExtra("cs18", cs18.isChecked());
                    neko.putExtra("cs19", cs19.isChecked());
                    neko.putExtra("cs20", cs20.isChecked());
                    startActivity(neko);
                }
            }
        });



    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}