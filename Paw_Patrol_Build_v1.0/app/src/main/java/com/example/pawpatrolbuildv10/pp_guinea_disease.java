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
        guineaDisease3 = findViewById(R.id.guineaDisease5);
        guineaDisease4 = findViewById(R.id.guineaDisease4);
        guineaDisease5 = findViewById(R.id.birdDisease5);
        guineaDisease6 = findViewById(R.id.birdDisease6);
        guineaDisease7 = findViewById(R.id.birdDisease7);
        guineaDisease8 = findViewById(R.id.birdDisease8);
        guineaDisease9 = findViewById(R.id.birdDisease9);
        guineaDisease10 = findViewById(R.id.birdDisease10);

        // Click Listener Block

        guineaDisease1.setOnClickListener(this);
        guineaDisease2.setOnClickListener(this);
        guineaDisease3.setOnClickListener(this);
        guineaDisease4.setOnClickListener(this);
        guineaDisease5.setOnClickListener(this);
        guineaDisease6.setOnClickListener(this);
        guineaDisease7.setOnClickListener(this);;
        guineaDisease8.setOnClickListener(this);
        guineaDisease9.setOnClickListener(this);
        guineaDisease10.setOnClickListener(this);

        // Diseases Block

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

        // Intent Block

        Boolean check1 = getIntent().getExtras().getBoolean("gs1");
        Boolean check2 = getIntent().getExtras().getBoolean("gs2");
        Boolean check3 = getIntent().getExtras().getBoolean("gs3");
        Boolean check4 = getIntent().getExtras().getBoolean("gs4");
        Boolean check5 = getIntent().getExtras().getBoolean("gs5");
        Boolean check6 = getIntent().getExtras().getBoolean("gs6");
        Boolean check7 = getIntent().getExtras().getBoolean("gs7");
        Boolean check8 = getIntent().getExtras().getBoolean("gs8");
        Boolean check9 = getIntent().getExtras().getBoolean("gs9");
        Boolean check10 = getIntent().getExtras().getBoolean("gs10");

        if (check1 && check2 && check3 && check4 && check5) {
            guinea_disease1.setVisibility(View.GONE);
            guinea_disease2.setVisibility(View.GONE);
            guinea_disease3.setVisibility(View.GONE);
            guinea_disease4.setVisibility(View.GONE);
            guinea_disease5.setVisibility(View.GONE);
            guinea_disease6.setVisibility(View.GONE);
            showToast("Conditions Met");
        } else if (check6) {
            guinea_disease1.setVisibility(View.GONE);
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