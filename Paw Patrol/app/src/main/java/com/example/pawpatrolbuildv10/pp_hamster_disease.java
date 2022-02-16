package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_hamster_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout hamster_disease1, hamster_disease2, hamster_disease3, hamster_disease4, hamster_disease5;
    LinearLayout hamster_disease6, hamster_disease7, hamster_disease8, hamster_disease9, hamster_disease10;
    CardView hamsterDisease1, hamsterDisease2, hamsterDisease3, hamsterDisease4, hamsterDisease5;
    CardView hamsterDisease6, hamsterDisease7, hamsterDisease8, hamsterDisease9, hamsterDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_hamster_disease);

        // CardView Block

        hamsterDisease1 = findViewById(R.id.hamsterDisease1);
        hamsterDisease2 = findViewById(R.id.hamsterDisease2);
        hamsterDisease3 = findViewById(R.id.hamsterDisease3);
        hamsterDisease4 = findViewById(R.id.hamsterDisease4);
        hamsterDisease5 = findViewById(R.id.hamsterDisease5);
        hamsterDisease6 = findViewById(R.id.hamsterDisease6);
        hamsterDisease7 = findViewById(R.id.hamsterDisease7);

        // Click Listener Block

        hamsterDisease1.setOnClickListener(this);
        hamsterDisease2.setOnClickListener(this);
        hamsterDisease3.setOnClickListener(this);
        hamsterDisease4.setOnClickListener(this);
        hamsterDisease5.setOnClickListener(this);
        hamsterDisease6.setOnClickListener(this);
        hamsterDisease7.setOnClickListener(this);

        // Diseases Block

        hamster_disease1 = findViewById(R.id.hamsterdisease1);
        hamster_disease2 = findViewById(R.id.hamsterdisease2);
        hamster_disease3 = findViewById(R.id.hamsterdisease3);
        hamster_disease4 = findViewById(R.id.hamsterdisease4);
        hamster_disease5 = findViewById(R.id.hamsterdisease5);
        hamster_disease6 = findViewById(R.id.hamsterdisease6);
        hamster_disease7 = findViewById(R.id.hamsterdisease7);


        // Intent Block

        Boolean squeak1 = getIntent().getExtras().getBoolean("hs1");
        Boolean squeak2 = getIntent().getExtras().getBoolean("hs2");
        Boolean squeak3 = getIntent().getExtras().getBoolean("hs3");
        Boolean squeak4 = getIntent().getExtras().getBoolean("hs4");
        Boolean squeak5 = getIntent().getExtras().getBoolean("hs5");
        Boolean squeak6 = getIntent().getExtras().getBoolean("hs6");
        Boolean squeak7 = getIntent().getExtras().getBoolean("hs7");
        Boolean squeak8 = getIntent().getExtras().getBoolean("hs8");
        Boolean squeak9 = getIntent().getExtras().getBoolean("hs9");
        Boolean squeak10 = getIntent().getExtras().getBoolean("hs10");
        Boolean squeak11 = getIntent().getExtras().getBoolean("hs11");
        Boolean squeak12 = getIntent().getExtras().getBoolean("hs12");
        Boolean squeak13 = getIntent().getExtras().getBoolean("hs13");
        Boolean squeak14 = getIntent().getExtras().getBoolean("hs14");
        Boolean squeak15 = getIntent().getExtras().getBoolean("hs15");

        if (squeak1 && squeak2 && squeak3 && squeak4 && squeak5) {

            // Wet Tails + Tapeworms

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (squeak7 && squeak8 && squeak9) {

            // Atrial Thrombosis

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (squeak2 && squeak6 && squeak10 && squeak11 && squeak12) {

            // Tyzzer's Disease

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (squeak1 && squeak3 && squeak12 && squeak13) {

            // Salmonella

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (squeak1 && squeak2 && squeak5 && squeak6 && squeak13) {

            // Tapeworms + Wet Tails

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);


        } else if (squeak7 && squeak14 && squeak15) {

            // Pneumonia

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);


        } else if (squeak1) {

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView:  1, 4, 5

            if (squeak2) {


                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak3) {


                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak7) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak8) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak11) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak12) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak13) {

                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak2) {

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);

            // Missing CardView: 1, 3, 5

            if (squeak3) {

                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak8) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak12) {

                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak13) {

                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak3) {

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 1, 4

            if (squeak5) {

                hamster_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak6) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak7) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak11) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak12) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak4) {

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 1

            if (squeak5) {

                hamster_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak6) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak7) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak11) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak12) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak5) {

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 1, 5


            if (squeak6) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak7) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak10) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak11) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak12) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak6) {

            hamster_disease2.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 1, 5, 3

            if (squeak7) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak8) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak9) {

                hamster_disease2.setVisibility(View.VISIBLE);

            }
            if (squeak13) {

                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak7) {

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);

            // Missing CardView: 2, 6

            if (squeak10) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak11) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak12) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak13) {

                hamster_disease4.setVisibility(View.VISIBLE);
                hamster_disease5.setVisibility(View.VISIBLE);

            }

        } else if (squeak8) {

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 2


            if (squeak10) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak11) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak12) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak13) {

                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak9) {

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 2


            if (squeak10) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak11) {

                hamster_disease3.setVisibility(View.VISIBLE);

            }
            if (squeak12) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak13) {

                hamster_disease4.setVisibility(View.VISIBLE);
                hamster_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak10) {

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (squeak12) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak13) {

                hamster_disease4.setVisibility(View.VISIBLE);
                hamster_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak11) {

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 3

            if (squeak12) {

                hamster_disease3.setVisibility(View.VISIBLE);
                hamster_disease4.setVisibility(View.VISIBLE);

            }
            if (squeak13) {

                hamster_disease4.setVisibility(View.VISIBLE);
                hamster_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak12) {

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 3, 4


            if (squeak13) {

                hamster_disease5.setVisibility(View.VISIBLE);

            }
            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak13) {

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView: 4, 5


            if (squeak14) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }
            if (squeak15) {

                hamster_disease6.setVisibility(View.VISIBLE);

            }

        } else if (squeak14) {

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView:

        } else if (squeak15) {

            hamster_disease1.setVisibility(View.GONE);
            hamster_disease2.setVisibility(View.GONE);
            hamster_disease3.setVisibility(View.GONE);
            hamster_disease4.setVisibility(View.GONE);
            hamster_disease5.setVisibility(View.GONE);
            hamster_disease6.setVisibility(View.GONE);

            // Missing CardView:

        }

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent activate;

        switch (v.getId()) {
            case R.id.hamsterDisease1:
                activate = new Intent(this, hamster_wetTail.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease2:
                activate = new Intent(this, hamster_thrombosis.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease3:
                activate = new Intent(this, hamster_tyzzer_disease.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease4:
                activate = new Intent(this, hamster_salmonella.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease5:
                activate = new Intent(this, hamster_tape_worms.class);
                startActivity(activate);
                break;
            case R.id.hamsterDisease6:
                activate = new Intent(this, hamster_pneumonia.class);
                startActivity(activate);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}