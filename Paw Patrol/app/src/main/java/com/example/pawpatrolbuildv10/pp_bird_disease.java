package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_bird_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout bird_disease1, bird_disease2, bird_disease3, bird_disease4, bird_disease5;
    LinearLayout bird_disease6, bird_disease7, bird_disease8, bird_disease9, bird_disease10;
    CardView birdDisease1, birdDisease2, birdDisease3, birdDisease4, birdDisease5;
    CardView birdDisease6, birdDisease7, birdDisease8, birdDisease9, birdDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_bird_disease);

        // CardView Block

        birdDisease1 = findViewById(R.id.birdDisease1);
        birdDisease2 = findViewById(R.id.birdDisease2);
        birdDisease3 = findViewById(R.id.birdDisease3);
        birdDisease4 = findViewById(R.id.birdDisease4);
        birdDisease5 = findViewById(R.id.birdDisease5);
        birdDisease6 = findViewById(R.id.birdDisease6);

        // Click Listener Block

        birdDisease1.setOnClickListener(this);
        birdDisease2.setOnClickListener(this);
        birdDisease3.setOnClickListener(this);
        birdDisease4.setOnClickListener(this);
        birdDisease5.setOnClickListener(this);
        birdDisease6.setOnClickListener(this);

        // Diseases Block

        bird_disease1 = findViewById(R.id.birddisease1);
        bird_disease2 = findViewById(R.id.birddisease2);
        bird_disease3 = findViewById(R.id.birddisease3);
        bird_disease4 = findViewById(R.id.birddisease4);
        bird_disease5 = findViewById(R.id.birddisease5);
        bird_disease6 = findViewById(R.id.birddisease6);


        // Intent Block

        Boolean tweet1 = getIntent().getExtras().getBoolean("bs1");
        Boolean tweet2 = getIntent().getExtras().getBoolean("bs2");
        Boolean tweet3 = getIntent().getExtras().getBoolean("bs3");
        Boolean tweet4 = getIntent().getExtras().getBoolean("bs4");
        Boolean tweet5 = getIntent().getExtras().getBoolean("bs5");
        Boolean tweet6 = getIntent().getExtras().getBoolean("bs6");
        Boolean tweet7 = getIntent().getExtras().getBoolean("bs7");
        Boolean tweet8 = getIntent().getExtras().getBoolean("bs8");
        Boolean tweet9 = getIntent().getExtras().getBoolean("bs9");
        Boolean tweet10 = getIntent().getExtras().getBoolean("bs10");
        Boolean tweet11 = getIntent().getExtras().getBoolean("bs11");
        Boolean tweet12 = getIntent().getExtras().getBoolean("bs12");
        Boolean tweet13 = getIntent().getExtras().getBoolean("bs13");
        Boolean tweet14 = getIntent().getExtras().getBoolean("bs14");
        Boolean tweet15 = getIntent().getExtras().getBoolean("bs15");
        Boolean tweet16 = getIntent().getExtras().getBoolean("bs16");
        Boolean tweet17 = getIntent().getExtras().getBoolean("bs17");
        Boolean tweet18 = getIntent().getExtras().getBoolean("bs18");
        Boolean tweet19 = getIntent().getExtras().getBoolean("bs19");
        Boolean tweet20 = getIntent().getExtras().getBoolean("bs20");
        Boolean tweet21 = getIntent().getExtras().getBoolean("bs21");

        if (tweet1 && tweet2 && tweet3 && tweet13 && tweet18) {

            // Salmonella

            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (tweet4 && tweet5 && tweet6 && tweet11) {

            // Bird Mites
            bird_disease1.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (tweet4 && tweet7 && tweet8 && tweet9 && tweet10) {

            // Feather Disease +
            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (tweet15 && tweet16 && tweet17 && tweet18) {

            // PoxVirus
            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (tweet2 && tweet5 && tweet12 && tweet13 && tweet14) {

            // Pacheco Disease
            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

        } else if (tweet14 && tweet19 && tweet20 && tweet21) {

            // West Nile Virus
            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);

        }
        if (tweet1) {

            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 1

            if (tweet4) {

                bird_disease3.setVisibility(View.VISIBLE);
                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet5) {

                bird_disease2.setVisibility(View.VISIBLE);
                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet6) {

                bird_disease2.setVisibility(View.VISIBLE);

            }
            if (tweet7) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet8) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet9) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet10) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet11) {

                bird_disease2.setVisibility(View.VISIBLE);

            }
            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet2) {

            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 1, 4

            if (tweet4) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet5) {

                bird_disease2.setVisibility(View.VISIBLE);
                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet6) {

                bird_disease2.setVisibility(View.VISIBLE);

            }
            if (tweet7) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet8) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet9) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet10) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet11) {

                bird_disease2.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet3) {

            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 1, 2, 3

            if (tweet4) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet5) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet4) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 2, 3

            if (tweet5) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }


        } else if (tweet5) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 2, 5

            if (tweet7) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet8) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet9) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet10) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet6) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 2


            if (tweet7) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet8) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet9) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet10) {

                bird_disease3.setVisibility(View.VISIBLE);

            }
            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet7) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (tweet11) {

                bird_disease2.setVisibility(View.VISIBLE);

            }
            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet8) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (tweet11) {

                bird_disease2.setVisibility(View.VISIBLE);

            }
            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet9) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (tweet11) {

                bird_disease2.setVisibility(View.VISIBLE);

            }
            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet10) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (tweet11) {

                bird_disease2.setVisibility(View.VISIBLE);

            }
            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet11) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 2

            if (tweet12) {

                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease4.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease4.setVisibility(View.VISIBLE);
                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet12) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 4

            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease1.setVisibility(View.VISIBLE);
                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet13) {

            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 1, 4

            if (tweet13) {

                bird_disease1.setVisibility(View.VISIBLE);

            }
            if (tweet14) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet14) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);

            // Missing CardView: 4, 6


            if (tweet15) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet16) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet17) {

                bird_disease5.setVisibility(View.VISIBLE);

            }
            if (tweet18) {

                bird_disease5.setVisibility(View.VISIBLE);

            }

        } else if (tweet15) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 5


            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet16) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 5

            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else  if (tweet17) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 5

            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet18) {

            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease6.setVisibility(View.GONE);

            // Missing CardView: 1, 5

            if (tweet19) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet20) {

                bird_disease6.setVisibility(View.VISIBLE);

            }
            if (tweet21) {

                bird_disease6.setVisibility(View.VISIBLE);

            }

        } else if (tweet19) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);

            // Missing CardView: 6

        } else if (tweet20) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);

            // Missing CardView: 6

        } else if (tweet21) {

            bird_disease1.setVisibility(View.GONE);
            bird_disease2.setVisibility(View.GONE);
            bird_disease3.setVisibility(View.GONE);
            bird_disease4.setVisibility(View.GONE);
            bird_disease5.setVisibility(View.GONE);

            // Missing CardView: 6

        }

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.birdDisease1:
                activate = new Intent(this, bird_salmonella.class);
                startActivity(activate);
                break;
            case R.id.birdDisease2:
                activate = new Intent(this, bird_mites.class);
                startActivity(activate);
                break;
            case R.id.birdDisease3:
                activate = new Intent(this, bird_feather_disease.class);
                startActivity(activate);
                break;
            case R.id.birdDisease4:
                activate = new Intent(this, bird_pacheco_disease.class);
                startActivity(activate);
                break;
            case R.id.birdDisease5:
                activate = new Intent(this, bird_pox_virus.class);
                startActivity(activate);
                break;
            case R.id.birdDisease6:
                activate = new Intent(this, bird_westnile_virus.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}