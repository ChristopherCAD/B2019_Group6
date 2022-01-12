package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class pp_Rabbit extends AppCompatActivity {

    Button rabbit_Search;
    CheckBox rs1, rs2, rs3, rs4, rs5;
    CheckBox rs6, rs7, rs8, rs9, rs10;
    CheckBox rs11, rs12, rs13, rs14, rs15;
    CheckBox rs16, rs17, rs18, rs19, rs20;
    CheckBox rs21, rs22, rs23, rs24, rs25;
    LinearLayout rabbit_disease1, rabbit_disease2, rabbit_disease3;
    LinearLayout rabbit_disease4, rabbit_disease5, rabbit_disease6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_rabbit);

        rs1 = findViewById(R.id.RS1);
        rs2 = findViewById(R.id.RS2);
        rs3 = findViewById(R.id.RS3);
        rs4 = findViewById(R.id.RS4);
        rs5 = findViewById(R.id.RS5);
        rs6 = findViewById(R.id.RS6);
        rs7 = findViewById(R.id.RS7);
        rs8 = findViewById(R.id.RS8);
        rs9 = findViewById(R.id.RS9);
        rs10 = findViewById(R.id.RS10);
        rs11 = findViewById(R.id.RS11);
        rs12 = findViewById(R.id.RS12);
        rs13 = findViewById(R.id.RS13);
        rs14 = findViewById(R.id.RS14);
        rs15 = findViewById(R.id.RS15);
        rs16 = findViewById(R.id.RS16);
        rs17 = findViewById(R.id.RS17);
        rs18 = findViewById(R.id.RS18);
        rs19 = findViewById(R.id.RS19);
        rs20 = findViewById(R.id.RS20);


        rabbit_Search = findViewById(R.id.rabbitButtonSearch);

        rabbit_disease1 = findViewById(R.id.rabbitdisease1);
        rabbit_disease2 = findViewById(R.id.rabbitdisease2);
        rabbit_disease3 = findViewById(R.id.rabbitdisease3);
        rabbit_disease4 = findViewById(R.id.rabbitdisease4);
        rabbit_disease5 = findViewById(R.id.rabbitdisease5);
        rabbit_disease6 = findViewById(R.id.rabbitdisease6);

        rabbit_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(pp_Rabbit.this, pp_rabbit_diseases.class);

                if (rs1.isChecked() && rs3.isChecked() && rs4.isChecked() && rs2.isChecked()) {
                    r.putExtra("rs1", rs1.isChecked());
                    r.putExtra("rs2", rs2.isChecked());
                    r.putExtra("rs3", rs3.isChecked());
                    r.putExtra("rs4", rs4.isChecked());

                    startActivity(r);
                    //rabbit_symptom1.setBackgroundColor(Color.parseColor("#FF0000"));
                    showToast("Searching for symptom-related diseases...");

                } else if (rs2.isChecked() && rs5.isChecked()){
                    r.putExtra("rs2", rs2.isChecked());
                    r.putExtra("rs5", rs5.isChecked());
                    startActivity(r);
                } else {
                    showToast("No condition here yet.");
                }

            }
        });

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}