package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_rabbit_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout rabbit_disease1, rabbit_disease2, rabbit_disease3;
    LinearLayout rabbit_disease4, rabbit_disease5, rabbit_disease6;
    CardView rabbitDisease1, rabbitDisease2, rabbitDisease3, rabbitDisease4, rabbitDisease5;
    CardView rabbitDisease6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_rabbit_diseases);

        // CardView Block

        rabbitDisease1 = findViewById(R.id.rabbitDisease1);
        rabbitDisease2 = findViewById(R.id.rabbitDisease2);
        rabbitDisease3 = findViewById(R.id.rabbitDisease3);
        rabbitDisease4 = findViewById(R.id.rabbitDisease4);
        rabbitDisease5 = findViewById(R.id.rabbitDisease5);
        rabbitDisease6 = findViewById(R.id.rabbitDisease6);

        // Click Listener Block

        rabbitDisease1.setOnClickListener(this);
        rabbitDisease2.setOnClickListener(this);
        rabbitDisease3.setOnClickListener(this);
        rabbitDisease4.setOnClickListener(this);
        rabbitDisease5.setOnClickListener(this);
        rabbitDisease6.setOnClickListener(this);


        // Diseases Block

        rabbit_disease1 = findViewById(R.id.rabbitdisease1);
        rabbit_disease2 = findViewById(R.id.rabbitdisease2);
        rabbit_disease3 = findViewById(R.id.rabbitdisease3);
        rabbit_disease4 = findViewById(R.id.rabbitdisease4);
        rabbit_disease5 = findViewById(R.id.rabbitdisease5);
        rabbit_disease6 = findViewById(R.id.rabbitdisease6);

        // Intent Block

        Boolean squeak1 = getIntent().getExtras().getBoolean("rs1");
        Boolean squeak2 = getIntent().getExtras().getBoolean("rs2");
        Boolean squeak3 = getIntent().getExtras().getBoolean("rs3");
        Boolean squeak4 = getIntent().getExtras().getBoolean("rs4");
        Boolean squeak5 = getIntent().getExtras().getBoolean("rs5");
        Boolean squeak6 = getIntent().getExtras().getBoolean("rs6");
        Boolean squeak7 = getIntent().getExtras().getBoolean("rs7");
        Boolean squeak8 = getIntent().getExtras().getBoolean("rs8");
        Boolean squeak9 = getIntent().getExtras().getBoolean("rs9");
        Boolean squeak10 = getIntent().getExtras().getBoolean("rs10");
        Boolean squeak11 = getIntent().getExtras().getBoolean("rs11");
        Boolean squeak12 = getIntent().getExtras().getBoolean("rs12");
        Boolean squeak13 = getIntent().getExtras().getBoolean("rs13");
        Boolean squeak14 = getIntent().getExtras().getBoolean("rs14");
        Boolean squeak15 = getIntent().getExtras().getBoolean("rs15");
        Boolean squeak16 = getIntent().getExtras().getBoolean("rs16");
        Boolean squeak17 = getIntent().getExtras().getBoolean("rs17");
        Boolean squeak18 = getIntent().getExtras().getBoolean("rs18");
        Boolean squeak19 = getIntent().getExtras().getBoolean("rs19");
        Boolean squeak20 = getIntent().getExtras().getBoolean("rs20");
        Boolean squeak21 = getIntent().getExtras().getBoolean("rs21");
        Boolean squeak22 = getIntent().getExtras().getBoolean("rs22");
        Boolean squeak23 = getIntent().getExtras().getBoolean("rs23");
        Boolean squeak24 = getIntent().getExtras().getBoolean("rs24");

        if (squeak1 && squeak2 && squeak3 && squeak4 && squeak5) {

            // Overgrown Teeth, Hairballs, and Myxomatosis

            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);

        } else if (squeak7 && squeak8 && squeak9 && squeak10 && squeak11) {

            // Snuffles

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

        } else if (squeak12 && squeak13 && squeak14 && squeak15 && squeak16) {

            // Utermine Tumours

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

        } else if (squeak17 && squeak18 && squeak19 && squeak20 && squeak21) {

            // Hemmorhagic Disease

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

        } else if (squeak2 && squeak5 && squeak6 && squeak22 && squeak23) {

            // Hairballs, Overgrown, Myxo

            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);

        } else if(squeak2 && squeak5 && squeak17 && squeak24) {

            // Myxomatosis

            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);

        } else if (squeak1) {

            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 1

            if (squeak2){

                rabbit_disease5.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak5){

                rabbit_disease3.setVisibility(View.VISIBLE);
                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease5.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak6){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak7){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10){

                rabbit_disease2.setVisibility(View.VISIBLE);
                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak11){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak2) {

            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);

            // Missing CardView: 1, 5, 6


            if (squeak5){

                rabbit_disease3.setVisibility(View.VISIBLE);
                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak7){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak11){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }

        } else if (squeak3) {

            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 1


            if (squeak5){

                rabbit_disease3.setVisibility(View.VISIBLE);
                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease5.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak6){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak7){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10){

                rabbit_disease2.setVisibility(View.VISIBLE);
                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak11){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak4) {

            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 1


            if (squeak5){

                rabbit_disease3.setVisibility(View.VISIBLE);
                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease5.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak6){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak7){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10){

                rabbit_disease2.setVisibility(View.VISIBLE);
                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak11){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak5) {

            rabbit_disease2.setVisibility(View.GONE);

            // Missing CardView: 1, 3, 4, 5, 6

            if (squeak7){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak11){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }

        } else if (squeak6) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 5


            if (squeak7){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak11){

                rabbit_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak7) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 2


            if (squeak10){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak8) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 2

            if (squeak10){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak9) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 2

            if (squeak10){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak10) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 2, 5

            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak11) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 2

            if (squeak12){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak15){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak16){

                rabbit_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak12) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak13) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak14) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak15) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak16) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (squeak17){

                rabbit_disease4.setVisibility(View.VISIBLE);
                rabbit_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak18){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak19){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak20){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak21){

                rabbit_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak17) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);

            // Missing CardView: 4, 6

            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak18) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 4


            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak19) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 4


            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak20) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 4


            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak21) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 4


            if (squeak22){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak23){

                rabbit_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak22) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 5


            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak23) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease6.setVisibility(View.GONE);

            // Missing CardView: 5


            if (squeak24){

                rabbit_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak24) {

            rabbit_disease1.setVisibility(View.GONE);
            rabbit_disease2.setVisibility(View.GONE);
            rabbit_disease3.setVisibility(View.GONE);
            rabbit_disease4.setVisibility(View.GONE);
            rabbit_disease5.setVisibility(View.GONE);

            // Missing CardView: 6

        }

        // Try the if Statement here tomorrow!!!! DON'T YOU DARE GIVE UP
        // Good job, self ;)

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View v){
        Intent activate;

        switch (v.getId()) {
            case R.id.rabbitDisease1:
                activate = new Intent(this, disease1_rabbit.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease2:
                activate = new Intent(this, rabbit_snuffles.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease3:
                activate = new Intent(this, rabbit_utermine_tumors.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease4:
                activate = new Intent(this, rabbit_hemmorhagic_disease.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease5:
                activate = new Intent(this, rabbit_hairballs.class);
                startActivity(activate);
                break;
            case R.id.rabbitDisease6:
                activate = new Intent(this, rabbit_myxomatosis.class);
                startActivity(activate);
                break;
            default:
                break;
        }
    }

}