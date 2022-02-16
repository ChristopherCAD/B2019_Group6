package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_dog_disease extends AppCompatActivity implements View.OnClickListener{

    LinearLayout dog_disease1, dog_disease2, dog_disease3, dog_disease4, dog_disease5;
    LinearLayout dog_disease6, dog_disease7, dog_disease8, dog_disease9, dog_disease10;
    CardView dogDisease1, dogDisease2, dogDisease3, dogDisease4, dogDisease5;
    CardView dogDisease6, dogDisease7, dogDisease8, dogDisease9, dogDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_dog_disease);

        // CardView Block

        dogDisease1 = findViewById(R.id.dogDisease1);
        dogDisease2 = findViewById(R.id.dogDisease2);
        dogDisease3 = findViewById(R.id.dogDisease3);
        dogDisease4 = findViewById(R.id.dogDisease4);
        dogDisease5 = findViewById(R.id.dogDisease5);
        dogDisease6 = findViewById(R.id.dogDisease6);
        dogDisease7 = findViewById(R.id.dogDisease7);


        // Click Listener Block

        dogDisease1.setOnClickListener(this);
        dogDisease2.setOnClickListener(this);
        dogDisease3.setOnClickListener(this);
        dogDisease4.setOnClickListener(this);
        dogDisease5.setOnClickListener(this);
        dogDisease6.setOnClickListener(this);
        dogDisease7.setOnClickListener(this);



        // Diseases Block

        dog_disease1 = findViewById(R.id.dogdisease1);
        dog_disease2 = findViewById(R.id.dogdisease2);
        dog_disease3 = findViewById(R.id.dogdisease3);
        dog_disease4 = findViewById(R.id.dogdisease4);
        dog_disease5 = findViewById(R.id.dogdisease5);
        dog_disease6 = findViewById(R.id.dogdisease6);
        dog_disease7 = findViewById(R.id.dogdisease7);


        // Intent Block

        Boolean woof1 = getIntent().getExtras().getBoolean("ds1");
        Boolean woof2 = getIntent().getExtras().getBoolean("ds2");
        Boolean woof3 = getIntent().getExtras().getBoolean("ds3");
        Boolean woof4 = getIntent().getExtras().getBoolean("ds4");
        Boolean woof5 = getIntent().getExtras().getBoolean("ds5");
        Boolean woof6 = getIntent().getExtras().getBoolean("ds6");
        Boolean woof7 = getIntent().getExtras().getBoolean("ds7");
        Boolean woof8 = getIntent().getExtras().getBoolean("ds8");
        Boolean woof9 = getIntent().getExtras().getBoolean("ds9");
        Boolean woof10 = getIntent().getExtras().getBoolean("ds10");
        Boolean woof11 = getIntent().getExtras().getBoolean("ds11");
        Boolean woof12 = getIntent().getExtras().getBoolean("ds12");
        Boolean woof13 = getIntent().getExtras().getBoolean("ds13");
        Boolean woof14 = getIntent().getExtras().getBoolean("ds14");
        Boolean woof15 = getIntent().getExtras().getBoolean("ds15");
        Boolean woof16 = getIntent().getExtras().getBoolean("ds16");
        Boolean woof17 = getIntent().getExtras().getBoolean("ds17");
        Boolean woof18 = getIntent().getExtras().getBoolean("ds18");
        Boolean woof19 = getIntent().getExtras().getBoolean("ds19");

        if (woof1 && woof2 && woof4 && woof6 && woof7) {

            // Canine Distemper

            dog_disease2.setVisibility(View.GONE);
            dog_disease3.setVisibility(View.GONE);
            dog_disease4.setVisibility(View.GONE);
            dog_disease5.setVisibility(View.GONE);
            dog_disease6.setVisibility(View.GONE);
            dog_disease7.setVisibility(View.GONE);

        } else if (woof4 && woof5 && woof8 && woof9 && woof11) {

            // Canine Parvo and Leptospirosis
            dog_disease1.setVisibility(View.GONE);
            dog_disease3.setVisibility(View.GONE);
            dog_disease4.setVisibility(View.GONE);
            dog_disease6.setVisibility(View.GONE);
            dog_disease7.setVisibility(View.GONE);

        } else if (woof9 && woof10 && woof12 && woof13) {

            // Heatstroke
            dog_disease1.setVisibility(View.GONE);
            dog_disease2.setVisibility(View.GONE);
            dog_disease3.setVisibility(View.GONE);
            dog_disease5.setVisibility(View.GONE);
            dog_disease6.setVisibility(View.GONE);
            dog_disease7.setVisibility(View.GONE);

        } else if (woof5 && woof14 && woof15 && woof17) {

            // Intestinal Parasites
            dog_disease1.setVisibility(View.GONE);
            dog_disease2.setVisibility(View.GONE);
            dog_disease3.setVisibility(View.GONE);
            dog_disease5.setVisibility(View.GONE);
            dog_disease6.setVisibility(View.GONE);
            dog_disease7.setVisibility(View.GONE);

        } else if (woof4 && woof5 && woof8 && woof16 && woof17) {

            // Leptospirosis + Parvo and Distemper
            dog_disease3.setVisibility(View.GONE);
            dog_disease4.setVisibility(View.GONE);
            dog_disease6.setVisibility(View.GONE);
            dog_disease7.setVisibility(View.GONE);

        } else if (woof3 && woof11 && woof18) {

            // Heartworms
            dog_disease1.setVisibility(View.GONE);
            dog_disease2.setVisibility(View.GONE);
            dog_disease3.setVisibility(View.GONE);
            dog_disease4.setVisibility(View.GONE);
            dog_disease5.setVisibility(View.GONE);
            dog_disease7.setVisibility(View.GONE);

        } else if (woof3 && woof8 && woof11 && woof19) {

            // Fungal Infection
            dog_disease1.setVisibility(View.GONE);
            dog_disease3.setVisibility(View.GONE);
            dog_disease4.setVisibility(View.GONE);
            dog_disease5.setVisibility(View.GONE);
            dog_disease6.setVisibility(View.GONE);

        }

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void onClick(View v) {
        Intent woof;

        switch (v.getId()) {
            case R.id.dogDisease1:
                woof = new Intent(this, dog_canine_distemper.class);
                startActivity(woof);
                break;
            case R.id.dogDisease2:
                woof = new Intent(this, dog_canine_parvo.class);
                startActivity(woof);
                break;
            case R.id.dogDisease3:
                woof = new Intent(this, dog_heatstroke.class);
                startActivity(woof);
                break;
            case R.id.dogDisease4:
                woof = new Intent(this, dog_intestinal_parasites.class);
                startActivity(woof);
                break;
            case R.id.dogDisease5:
                woof = new Intent(this, dog_leptospirosis.class);
                startActivity(woof);
                break;
            case R.id.dogDisease6:
                woof = new Intent(this, dog_heartworms.class);
                startActivity(woof);
                break;
            case R.id.dogDisease7:
                woof = new Intent(this, dog_fungal_infections.class);
                startActivity(woof);
                break;
            default:
                showToast("This content is under development.");
                break;
        }
    }
}


                    // TRY USING TAGS WITH UNIQUE ID
                    // USE TACHIYOMI FREE SOURCE APP AS REFERENCE
                    // May Luck be on your side~