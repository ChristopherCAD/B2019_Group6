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

public class pp_Guinea_Pig extends AppCompatActivity {

    Button guinea_Search;
    CheckBox gs1, gs2, gs3, gs4, gs5;
    CheckBox gs6, gs7, gs8, gs9, gs10;
    CheckBox gs11, gs12, gs13, gs14, gs15;
    CheckBox gs16, gs17, gs18, gs19, gs20;
    CheckBox gs21, gs22, gs23, gs24, gs25;
    LinearLayout guinea_disease1, guinea_disease2, guinea_disease3, guinea_disease4, guinea_disease5;
    LinearLayout guinea_disease6, guinea_disease7, guinea_disease8, guinea_disease9, guinea_disease10;
    CardView guineaDisease1, guineaDisease2, guineaDisease3, guineaDisease4, guineaDisease5;
    CardView guineaDisease6, guineaDisease7, guineaDisease8, guineaDisease9, guineaDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_guinea_pig);


        gs1 = findViewById(R.id.GS1);
        gs2 = findViewById(R.id.GS2);
        gs3 = findViewById(R.id.GS3);
        gs4 = findViewById(R.id.GS4);
        gs5 = findViewById(R.id.GS5);
        gs6 = findViewById(R.id.GS6);
        gs7 = findViewById(R.id.GS7);
        gs8 = findViewById(R.id.GS8);
        gs9 = findViewById(R.id.GS9);
        gs10 = findViewById(R.id.GS10);
        gs11 = findViewById(R.id.GS11);
        gs12 = findViewById(R.id.GS12);
        gs13 = findViewById(R.id.GS13);
        gs14 = findViewById(R.id.GS14);
        gs15 = findViewById(R.id.GS15);
        gs16 = findViewById(R.id.GS16);
        gs17 = findViewById(R.id.GS17);
        gs18 = findViewById(R.id.GS18);
        gs19 = findViewById(R.id.GS19);
        gs20 = findViewById(R.id.GS20);
        gs21 = findViewById(R.id.GS21);
        gs22 = findViewById(R.id.GS22);
        gs23 = findViewById(R.id.GS23);
        gs24 = findViewById(R.id.GS24);
        gs25 = findViewById(R.id.GS25);

        guinea_Search = findViewById(R.id.guineaButtonSearch);

        guinea_disease1 = findViewById(R.id.guineadisease1);
        guinea_disease2 = findViewById(R.id.guineadisease2);
        guinea_disease3 = findViewById(R.id.guineadisease3);
        guinea_disease4 = findViewById(R.id.guineadisease4);
        guinea_disease5 = findViewById(R.id.guineadisease5);
        guinea_disease6 = findViewById(R.id.guineadisease6);
        guinea_disease7 = findViewById(R.id.guineadisease7);
        guinea_disease8 = findViewById(R.id.guineadisease8);
        guinea_disease9 = findViewById(R.id.guineadisease9);
        guinea_disease10 = findViewById(R.id.guineadisease10);

        showToast("Click Symptoms 1 to 5 for a demo.");
        showToast("Click Symptom 6 for a comparison.");

        guinea_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(pp_Guinea_Pig.this, pp_rabbit_diseases.class);


                if (gs1.isChecked() && gs2.isChecked() && gs3.isChecked() && gs4.isChecked() && gs5.isChecked()) {
                    g.putExtra("gs1", gs1.isChecked());
                    g.putExtra("gs2", gs2.isChecked());
                    g.putExtra("gs3", gs3.isChecked());
                    g.putExtra("gs4", gs4.isChecked());
                    g.putExtra("gs5", gs5.isChecked());
                    startActivity(g);

                } else if (gs6.isChecked()) {
                    g.putExtra("gs6",gs6.isChecked());
                    startActivity(g);
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