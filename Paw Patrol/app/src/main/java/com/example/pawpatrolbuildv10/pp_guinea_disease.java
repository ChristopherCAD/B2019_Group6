package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_guinea_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout guinea_disease1, guinea_disease2, guinea_disease3, guinea_disease4, guinea_disease5;
    LinearLayout guinea_disease6, guinea_disease7, guinea_disease8, guinea_disease9, guinea_disease10;
    CardView guineaDisease1, guineaDisease2, guineaDisease3, guineaDisease4, guineaDisease5;
    CardView guineaDisease6, guineaDisease7, guineaDisease8, guineaDisease9, guineaDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_guinea_disease);

        // CardView Block

        guineaDisease1 = findViewById(R.id.guineaDisease1);
        guineaDisease2 = findViewById(R.id.guineaDisease2);
        guineaDisease3 = findViewById(R.id.guineaDisease3);
        guineaDisease4 = findViewById(R.id.guineaDisease4);
        guineaDisease5 = findViewById(R.id.guineaDisease5);
        guineaDisease6 = findViewById(R.id.guineaDisease6);

        // Click Listener Block

        guineaDisease1.setOnClickListener(this);
        guineaDisease2.setOnClickListener(this);
        guineaDisease3.setOnClickListener(this);
        guineaDisease4.setOnClickListener(this);
        guineaDisease5.setOnClickListener(this);
        guineaDisease6.setOnClickListener(this);

        // Diseases Block

        guinea_disease1 = findViewById(R.id.guineadisease1);
        guinea_disease2 = findViewById(R.id.guineadisease2);
        guinea_disease3 = findViewById(R.id.guineadisease3);
        guinea_disease4 = findViewById(R.id.guineadisease4);
        guinea_disease5 = findViewById(R.id.guineadisease5);
        guinea_disease6 = findViewById(R.id.guineadisease6);

        // Intent Block

        Boolean chirp1 = getIntent().getExtras().getBoolean("gs1");
        Boolean chirp2 = getIntent().getExtras().getBoolean("gs2");
        Boolean chirp3 = getIntent().getExtras().getBoolean("gs3");
        Boolean chirp4 = getIntent().getExtras().getBoolean("gs4");
        Boolean chirp5 = getIntent().getExtras().getBoolean("gs5");
        Boolean chirp6 = getIntent().getExtras().getBoolean("gs6");
        Boolean chirp7 = getIntent().getExtras().getBoolean("gs7");
        Boolean chirp8 = getIntent().getExtras().getBoolean("gs8");
        Boolean chirp9 = getIntent().getExtras().getBoolean("gs9");
        Boolean chirp10 = getIntent().getExtras().getBoolean("gs10");
        Boolean chirp11 = getIntent().getExtras().getBoolean("gs11");
        Boolean chirp12 = getIntent().getExtras().getBoolean("gs12");
        Boolean chirp13 = getIntent().getExtras().getBoolean("gs13");
        Boolean chirp14 = getIntent().getExtras().getBoolean("gs14");
        Boolean chirp15 = getIntent().getExtras().getBoolean("gs15");
        Boolean chirp16 = getIntent().getExtras().getBoolean("gs16");
        Boolean chirp17 = getIntent().getExtras().getBoolean("gs17");
        Boolean chirp18 = getIntent().getExtras().getBoolean("gs18");
        Boolean chirp19 = getIntent().getExtras().getBoolean("gs19");

        if (chirp1 && chirp2 && chirp3 && chirp4 && chirp5) {

            // Respiratory Infections

            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

        } else if (chirp2 && chirp6 && chirp7 && chirp8 && chirp9) {

            // Diarrhea

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

        } else if (chirp6 && chirp11 && chirp12 && chirp13 && chirp14) {

            // Scurvy

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

        } else if (chirp6 && chirp15 && chirp16 && chirp17 && chirp18) {

            // Abscess

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

        } else if (chirp6 && chirp7 && chirp8) {

            // Urinary Problems

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

        } else if (chirp6 && chirp14 && chirp15 && chirp19) {

            // bumblefoot

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);

        } else if (chirp1) {

            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 1

            if (chirp2) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp6) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp7) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp8) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp9) {

                guinea_disease2.setVisibility(View.VISIBLE);

            }
            if (chirp10) {

                guinea_disease2.setVisibility(View.VISIBLE);

            }
            if (chirp11) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp12) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp13) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp14) {

                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp2) {

            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 1, 2, 3


            if (chirp6) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp7) {

                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp8) {

                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp14) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp3) {

            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 1


            if (chirp6) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp7) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp8) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp9) {

                guinea_disease2.setVisibility(View.VISIBLE);

            }
            if (chirp10) {

                guinea_disease2.setVisibility(View.VISIBLE);

            }
            if (chirp11) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp12) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp13) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp14) {

                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp4) {

            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 1


            if (chirp6) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp7) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp8) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp9) {

                guinea_disease2.setVisibility(View.VISIBLE);

            }
            if (chirp10) {

                guinea_disease2.setVisibility(View.VISIBLE);

            }
            if (chirp11) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp12) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp13) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp14) {

                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp5) {

            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 1


            if (chirp6) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp7) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp8) {

                guinea_disease2.setVisibility(View.VISIBLE);
                guinea_disease5.setVisibility(View.VISIBLE);

            }
            if (chirp9) {

                guinea_disease2.setVisibility(View.VISIBLE);

            }
            if (chirp10) {

                guinea_disease2.setVisibility(View.VISIBLE);

            }
            if (chirp11) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp12) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp13) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp14) {

                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp6) {

            guinea_disease1.setVisibility(View.GONE);

            // Missing CardView: 2, 3, 4, 5, 6


        } else if (chirp7) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 2, 5

            if (chirp11) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp12) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp13) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp14) {

                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp8) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 2, 5

            if (chirp11) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp12) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp13) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp14) {

                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp9) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 2

            if (chirp11) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp12) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp13) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp14) {

                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp10) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 2

            if (chirp11) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp12) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp13) {

                guinea_disease3.setVisibility(View.VISIBLE);

            }
            if (chirp14) {

                guinea_disease3.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp11) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (chirp14) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }


        } else if (chirp12) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (chirp14) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp13) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (chirp14) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);
                guinea_disease6.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp14) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);

            // Missing CardView: 3, 6

            if (chirp15) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp16) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp17) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp18) {

                guinea_disease4.setVisibility(View.VISIBLE);

            }
            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp15) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);

            // Missing CardView: 4, 6

        } else if (chirp16) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 4

            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp17) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 4

            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp18) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);

            // Missing CardView: 4

            if (chirp19) {

                guinea_disease6.setVisibility(View.VISIBLE);

            }

        } else if (chirp19) {

            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);

            // Missing CardView: 6

        }

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.guineaDisease1:
                activate = new Intent(this, disease1_rabbit.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}