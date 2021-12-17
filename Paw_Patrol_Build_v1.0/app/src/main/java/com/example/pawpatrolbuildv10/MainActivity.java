package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardCat;
    CardView cardDog;
    CardView cardBird;
    CardView cardRabbit;
    CardView cardFrog;
    CardView cardLizard;

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

        // Click Listener

        cardCat.setOnClickListener(this);
        cardDog.setOnClickListener(this);
        cardBird.setOnClickListener(this);
        cardRabbit.setOnClickListener(this);
        cardFrog.setOnClickListener(this);
        cardLizard.setOnClickListener(this);

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
                showToast("Redirecting to the nyaa~ page...");
                startActivity(i);
                break;
            case R.id.cardDog:
                i = new Intent(this, pp_Doggo.class);
                showToast("Redirecting to the pupper page...");
                startActivity(i);
                break;
            case R.id.cardBird:
                i = new Intent(this, pp_tweetMachine.class);
                showToast("Redirecting to tweet machine page...");
                startActivity(i);
                break;
            case R.id.cardRabbit:
                i = new Intent(this, pp_Rabbit.class);
                showToast("Redirecting to celery devourer page...");
                startActivity(i);
                break;
            default:
                break;

        }
    }
}