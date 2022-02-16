package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class frog_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout frogdisease1, frogdisease2, frogdisease3, frogdisease4;
    CardView frogDisease1, frogDisease2, frogDisease3, frogDisease4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frog_diseases);

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