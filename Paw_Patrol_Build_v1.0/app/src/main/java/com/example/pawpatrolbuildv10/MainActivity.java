package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardCat;
    CardView cardDog;
    CardView cardBird;
    CardView cardRabbit;
    CardView cardFrog;
    CardView cardLizard;
    CardView cardHamster;
    CardView cardGuinea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardCat = findViewById(R.id.cardCat);
        cardDog = findViewById(R.id.cardDog);
        cardBird = findViewById(R.id.cardBird);
        cardRabbit = findViewById(R.id.cardRabbit);
        cardFrog = findViewById(R.id.cardFrog);
        cardLizard = findViewById(R.id.cardLizard);
        cardHamster = findViewById(R.id.cardHamster);
        cardGuinea = findViewById(R.id.cardGuinea);

        // Click Listener

        cardCat.setOnClickListener(this);
        cardDog.setOnClickListener(this);
        cardBird.setOnClickListener(this);
        cardRabbit.setOnClickListener(this);
        cardFrog.setOnClickListener(this);
        cardLizard.setOnClickListener(this);
        cardHamster.setOnClickListener(this);
        cardGuinea.setOnClickListener(this);


    }

    private void showToast(String message){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardCat:
                i = new Intent(this, pp_Catto.class);
                startActivity(i);
                break;
            case R.id.cardDog:
                i = new Intent(this, pp_Doggo.class);
                startActivity(i);
                break;
            case R.id.cardBird:
                i = new Intent(this, pp_tweetMachine.class);
                startActivity(i);
                break;
            case R.id.cardRabbit:
                i = new Intent(this, pp_Rabbit.class);
                startActivity(i);
                break;
            case R.id.cardFrog:
                i = new Intent(this, pp_Frog.class);
                startActivity(i);
                break;
            case R.id.cardHamster:
                i = new Intent(this, pp_Hamster.class);
                startActivity(i);
                break;
            case R.id.cardGuinea:
                i = new Intent(this, pp_Guinea_Pig.class);
                startActivity(i);
                break;
            case R.id.cardLizard:
                i = new Intent(this, pp_reptiles.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }
}