package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_tweetMachine extends AppCompatActivity {

    Button bird_Search;
    CheckBox bs1, bs2, bs3, bs4, bs5;
    CheckBox bs6, bs7, bs8, bs9, bs10;
    CheckBox bs11, bs12, bs13, bs14, bs15;
    CheckBox bs16, bs17, bs18, bs19, bs20;
    CheckBox bs21, bs22, bs23;
    LinearLayout bird_disease1, bird_disease2, bird_disease3, bird_disease4, bird_disease5;
    LinearLayout bird_disease6, bird_disease7, bird_disease8, bird_disease9, bird_disease10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_tweet_machine);

        bs1 = findViewById(R.id.BS1);
        bs2 = findViewById(R.id.BS2);
        bs3 = findViewById(R.id.BS3);
        bs4 = findViewById(R.id.BS4);
        bs5 = findViewById(R.id.BS5);
        bs6 = findViewById(R.id.BS6);
        bs7 = findViewById(R.id.BS7);
        bs8 = findViewById(R.id.BS8);
        bs9 = findViewById(R.id.BS9);
        bs10 = findViewById(R.id.BS10);
        bs11 = findViewById(R.id.BS11);
        bs12 = findViewById(R.id.BS12);
        bs13 = findViewById(R.id.BS13);
        bs14 = findViewById(R.id.BS14);
        bs15 = findViewById(R.id.BS15);
        bs16 = findViewById(R.id.BS16);
        bs17 = findViewById(R.id.BS17);
        bs18 = findViewById(R.id.BS18);
        bs19 = findViewById(R.id.BS19);
        bs20 = findViewById(R.id.BS20);
        bs21 = findViewById(R.id.BS21);

        bird_Search = findViewById(R.id.birdButtonSearch);

        bird_disease1 = findViewById(R.id.birddisease1);
        bird_disease2 = findViewById(R.id.birddisease2);
        bird_disease3 = findViewById(R.id.birddisease3);
        bird_disease4 = findViewById(R.id.birddisease4);
        bird_disease5 = findViewById(R.id.birddisease5);
        bird_disease6 = findViewById(R.id.birddisease6);
        bird_disease7 = findViewById(R.id.birddisease7);
        bird_disease8 = findViewById(R.id.birddisease8);
        bird_disease9 = findViewById(R.id.birddisease9);
        bird_disease10 = findViewById(R.id.birddisease10);

        showToast("Click Symptoms 1 to 5 for a demo.");
        showToast("Click Symptom 6 for a comparison.");

        bird_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(pp_tweetMachine.this, pp_bird_disease.class);

                showToast("Click Symptoms 1 to 5 (for demo)" + Toast.LENGTH_LONG);

                if (bs1.isChecked() && bs2.isChecked() && bs3.isChecked() && bs4.isChecked() && bs5.isChecked()) {
                    b.putExtra("bs1", bs1.isChecked());
                    b.putExtra("bs2", bs2.isChecked());
                    b.putExtra("bs3", bs3.isChecked());
                    b.putExtra("bs4", bs4.isChecked());
                    b.putExtra("bs5", bs5.isChecked());
                    startActivity(b);
                } else if (bs6.isChecked()) {
                    b.putExtra("bs6", bs6.isChecked());
                    startActivity(b);
                } else {
                    showToast("This section is under development." + Toast.LENGTH_SHORT);
                }
            }
        });

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}