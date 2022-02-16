package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_frog_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout frogdisease1, frogdisease2, frogdisease3, frogdisease4;
    CardView frogDisease1, frogDisease2, frogDisease3, frogDisease4, frogDisease5;
    CardView frogDisease6, frogDisease7, frogDisease8, frogDisease9, frogDisease10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_frog_disease);

        // CardView Block

        frogDisease1 = findViewById(R.id.frogDisease1);
        frogDisease2 = findViewById(R.id.frogDisease2);
        frogDisease3 = findViewById(R.id.frogDisease3);
        frogDisease4 = findViewById(R.id.frogDisease4);

        // Click Listener Block

        frogDisease1.setOnClickListener(this);
        frogDisease2.setOnClickListener(this);
        frogDisease3.setOnClickListener(this);
        frogDisease4.setOnClickListener(this);

        // Diseases Block

        frogdisease1 = findViewById(R.id.frogdisease1);
        frogdisease2 = findViewById(R.id.frogdisease2);
        frogdisease3 = findViewById(R.id.frogdisease3);
        frogdisease4 = findViewById(R.id.frogdisease4);

        // Intent Block

        Boolean croak1 = getIntent().getExtras().getBoolean("fs1");
        Boolean croak2 = getIntent().getExtras().getBoolean("fs2");
        Boolean croak3 = getIntent().getExtras().getBoolean("fs3");
        Boolean croak4 = getIntent().getExtras().getBoolean("fs4");
        Boolean croak5 = getIntent().getExtras().getBoolean("fs5");
        Boolean croak6 = getIntent().getExtras().getBoolean("fs6");
        Boolean croak7 = getIntent().getExtras().getBoolean("fs7");
        Boolean croak8 = getIntent().getExtras().getBoolean("fs8");
        Boolean croak9 = getIntent().getExtras().getBoolean("fs9");
        Boolean croak10 = getIntent().getExtras().getBoolean("fs10");
        Boolean croak11 = getIntent().getExtras().getBoolean("fs11");
        Boolean croak12 = getIntent().getExtras().getBoolean("fs12");
        Boolean croak13 = getIntent().getExtras().getBoolean("fs13");
        Boolean croak14 = getIntent().getExtras().getBoolean("fs14");
        Boolean croak15 = getIntent().getExtras().getBoolean("fs15");


        if (croak1 && croak2 && croak3 && croak4) {

            // Chytridiomycosis

            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

        } else if (croak5 && croak6 && croak7 && croak8 && croak9) {

            // Red Leg Syndrome + Mycobacteroisis

            frogdisease1.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);

        } else if (croak6 && croak10 && croak11 && croak12) {

            // Obesity

            frogdisease1.setVisibility(View.GONE);
            frogdisease2.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

        } else if (croak7 && croak8 && croak13 && croak14 && croak15) {

            // Mycobacteroisis + Red Leg Syndrome

            frogdisease1.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);

        } else if (croak1) {

            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 1

            if (croak5) {

                frogdisease2.setVisibility(View.VISIBLE);

            }
            if (croak6) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak7) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak8) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak9) {

                frogdisease2.setVisibility(View.VISIBLE);

            }
            if (croak10) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak11) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak12) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak2) {

            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 1

            if (croak5) {

                frogdisease2.setVisibility(View.VISIBLE);

            }
            if (croak6) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak7) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak8) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak9) {

                frogdisease2.setVisibility(View.VISIBLE);

            }
            if (croak10) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak11) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak12) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak3) {

            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 1

            if (croak5) {

                frogdisease2.setVisibility(View.VISIBLE);

            }
            if (croak6) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak7) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak8) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak9) {

                frogdisease2.setVisibility(View.VISIBLE);

            }
            if (croak10) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak11) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak12) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak4) {

            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 1

            if (croak5) {

                frogdisease2.setVisibility(View.VISIBLE);

            }
            if (croak6) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak7) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak8) {

                frogdisease2.setVisibility(View.VISIBLE);
                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak9) {

                frogdisease2.setVisibility(View.VISIBLE);

            }
            if (croak10) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak11) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak12) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak5) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 2

            if (croak6) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak7) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak8) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak10) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak11) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak12) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak6) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 2, 3


            if (croak7) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak7) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);

            // Missing CardView: 2, 4

            if (croak8) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak10) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak11) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak12) {

                frogdisease3.setVisibility(View.VISIBLE);

            }

        } else if (croak8) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);

            // Missing CardView: 2, 4

            if (croak8) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak10) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak11) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak12) {

                frogdisease3.setVisibility(View.VISIBLE);

            }

        } else if (croak9) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 2


            if (croak10) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak11) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak12) {

                frogdisease3.setVisibility(View.VISIBLE);

            }
            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak10) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease2.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 3


            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak11) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease2.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 3

            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak12) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease2.setVisibility(View.GONE);
            frogdisease4.setVisibility(View.GONE);

            // Missing CardView: 3

            if (croak13) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak14) {

                frogdisease4.setVisibility(View.VISIBLE);

            }
            if (croak15) {

                frogdisease4.setVisibility(View.VISIBLE);

            }

        } else if (croak13) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);

            // Missing CardView: 4

        } else if (croak14) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);

            // Missing CardView: 4

        } else if (croak15) {

            frogdisease1.setVisibility(View.GONE);
            frogdisease2.setVisibility(View.GONE);
            frogdisease3.setVisibility(View.GONE);

            // Missing CardView: 4

        }

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v){
        Intent croak;

        switch (v.getId()) {
            case R.id.frogDisease1:
                croak = new Intent(this, frog_chytridiomycosis.class);
                startActivity(croak);
                break;
            case R.id.frogDisease2:
                croak = new Intent(this, frog_redLegSyndrome.class);
                startActivity(croak);
                break;
            case R.id.frogDisease3:
                croak = new Intent(this, frog_obesity.class);
                startActivity(croak);
                break;
            case R.id.frogDisease4:
                croak = new Intent(this, frog_mycobacteriosis.class);
                startActivity(croak);
                break;
            default:
                break;
        }
    }
}