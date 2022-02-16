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

        // Click Listener Block

        reptileDisease1.setOnClickListener(this);
        reptileDisease2.setOnClickListener(this);
        reptileDisease3.setOnClickListener(this);
        reptileDisease4.setOnClickListener(this);
        reptileDisease5.setOnClickListener(this);
        reptileDisease6.setOnClickListener(this);

        // Diseases Block

        reptile_disease1 = findViewById(R.id.reptiledisease1);
        reptile_disease2 = findViewById(R.id.reptiledisease2);
        reptile_disease3 = findViewById(R.id.reptiledisease3);
        reptile_disease4 = findViewById(R.id.reptiledisease4);
        reptile_disease5 = findViewById(R.id.reptiledisease5);
        reptile_disease6 = findViewById(R.id.reptiledisease6);

        // Intent Block

        Boolean hiss1 = getIntent().getExtras().getBoolean("ls1");
        Boolean hiss2 = getIntent().getExtras().getBoolean("ls2");
        Boolean hiss3 = getIntent().getExtras().getBoolean("ls3");
        Boolean hiss4 = getIntent().getExtras().getBoolean("ls4");
        Boolean hiss5 = getIntent().getExtras().getBoolean("ls5");
        Boolean hiss6 = getIntent().getExtras().getBoolean("ls6");
        Boolean hiss7 = getIntent().getExtras().getBoolean("ls7");
        Boolean hiss8 = getIntent().getExtras().getBoolean("ls8");
        Boolean hiss9 = getIntent().getExtras().getBoolean("ls9");
        Boolean hiss10 = getIntent().getExtras().getBoolean("ls10");
        Boolean hiss11 = getIntent().getExtras().getBoolean("ls11");
        Boolean hiss12 = getIntent().getExtras().getBoolean("ls12");
        Boolean hiss13 = getIntent().getExtras().getBoolean("ls13");
        Boolean hiss14 = getIntent().getExtras().getBoolean("ls14");
        Boolean hiss15 = getIntent().getExtras().getBoolean("ls15");

        if (hiss1 && hiss2 && hiss3) {

            // Ear Infections

            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

        } else if (hiss3 && hiss4 && hiss5 && hiss6 && hiss7) {

            // Amebiasis

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

        } else if (hiss8 && hiss9 && hiss13) {

            // Mouth Rot + Herpesvirus

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

        } else if (hiss10 && hiss11 && hiss12) {

            // Metabolic Bone Disease

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

        } else if (hiss8 && hiss9 && hiss13 && hiss14) {

            // Herpesvirus + Mouth Rot

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

        } else if (hiss3 && hiss6 && hiss14) {

            // Fungal Infections

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);

        } else if (hiss1) {

            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 1


            if (hiss3) {

                reptile_disease2.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }
            if (hiss4) {

                reptile_disease2.setVisibility(View.VISIBLE);

            }
            if (hiss5) {

                reptile_disease2.setVisibility(View.VISIBLE);

            }
            if (hiss6) {

                reptile_disease2.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }
            if (hiss7) {

                reptile_disease2.setVisibility(View.VISIBLE);

            }
            if (hiss8) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss9) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss10) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss11) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss12) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss13) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease5.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }

        } else if (hiss2) {

            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 1

            if (hiss3) {

                reptile_disease2.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }
            if (hiss4) {

                reptile_disease2.setVisibility(View.VISIBLE);

            }
            if (hiss5) {

                reptile_disease2.setVisibility(View.VISIBLE);

            }
            if (hiss6) {

                reptile_disease2.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }
            if (hiss7) {

                reptile_disease2.setVisibility(View.VISIBLE);

            }
            if (hiss8) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss9) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss10) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss11) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss12) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss13) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease5.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }

        } else if (hiss3) {

            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);

            // Missing CardView: 1, 2, 6

            if (hiss8) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss9) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss10) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss11) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss12) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss13) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease5.setVisibility(View.VISIBLE);

            }

        } else if (hiss4) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 2

            if (hiss6) {

                reptile_disease6.setVisibility(View.VISIBLE);

            }
            if (hiss8) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss9) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss10) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss11) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss12) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss13) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease5.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }

        } else if (hiss5) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 2

            if (hiss6) {

                reptile_disease6.setVisibility(View.VISIBLE);

            }
            if (hiss8) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss9) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss10) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss11) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss12) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss13) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease5.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }

        } else if (hiss6) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);

            // Missing CardView: 2, 6


            if (hiss8) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss9) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss10) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss11) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss12) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss13) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease5.setVisibility(View.VISIBLE);

            }

        } else if (hiss7) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 2


            if (hiss8) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss9) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss10) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss11) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss12) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss13) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease5.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }

        } else if (hiss8) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 3, 5

            if (hiss10) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss11) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss12) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease6.setVisibility(View.VISIBLE);

            }

        } else if (hiss9) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 3, 5

            if (hiss10) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss11) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss12) {

                reptile_disease4.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease6.setVisibility(View.VISIBLE);

            }

        } else if (hiss10) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 4

            if (hiss13) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease5.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }

        } else if (hiss11) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 4

            if (hiss13) {

                reptile_disease3.setVisibility(View.VISIBLE);
                reptile_disease5.setVisibility(View.VISIBLE);

            }
            if (hiss14) {

                reptile_disease5.setVisibility(View.VISIBLE);
                reptile_disease6.setVisibility(View.VISIBLE);

            }

        } else if (hiss12) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 4

        } else if (hiss13) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease5.setVisibility(View.GONE);
            reptile_disease6.setVisibility(View.GONE);

            // Missing CardView: 3, 5

        } else if (hiss14) {

            reptile_disease1.setVisibility(View.GONE);
            reptile_disease2.setVisibility(View.GONE);
            reptile_disease3.setVisibility(View.GONE);
            reptile_disease4.setVisibility(View.GONE);

            // Missing CardView: 5, 6

        }

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.reptileDisease1:
                activate = new Intent(this, reptiles_earInfections.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease2:
                activate = new Intent(this, reptiles_antemoeba.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease3:
                activate = new Intent(this, reptile_mouthRot.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease4:
                activate = new Intent(this, reptiles_boneDisease.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease5:
                activate = new Intent(this, reptiles_herpesvirus.class);
                startActivity(activate);
                break;
            case R.id.reptileDisease6:
                activate = new Intent(this, reptiles_fungal_infection.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}