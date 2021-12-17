package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class pp_Catto extends AppCompatActivity {

    Button cat_Search;
    CheckBox cs1, cs2, cs3, cs4, cs5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_catto);

        cs1 = findViewById(R.id.CS1);
        cs2 = findViewById(R.id.CS2);
        cs3 = findViewById(R.id.CS3);
        cs4 = findViewById(R.id.CS4);
        cs5 = findViewById(R.id.CS5);
        cat_Search = findViewById(R.id.catButtonSearch);

        cat_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c;

                if (cs1.isChecked() && cs2.isChecked() && cs3.isChecked() && cs4.isChecked() && cs5.isChecked()) {
                    showToast("Searching for symptom-related diseases...");
                    c = new Intent(pp_Catto.this, pp_Doggo.class);
                    startActivity(c);
                } else {
                    showToast("Couldn't find a related disease.");
                }

            }
        });


    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}