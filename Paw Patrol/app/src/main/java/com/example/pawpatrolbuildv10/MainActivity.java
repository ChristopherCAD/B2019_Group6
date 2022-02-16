package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.RelativeLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cardCat;
    CardView cardDog;
    CardView cardBird;
    CardView cardRabbit;
    CardView cardFrog;
    CardView cardLizard;
    CardView cardHamster;
    CardView cardGuinea;

    FloatingActionButton pawMenuButton, catFloat, dogFloat, birdFloat, rabbitFloat;
    FloatingActionButton frogFloat, reptileFloat, hamsterFloat, guineaFloat;
    Animation pawClose, pawOpen, rotateForward, rotateBackward;

    boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning the Variables

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

        // Floating Button Section

        pawMenuButton = (FloatingActionButton) findViewById(R.id.pawMenuButton);
        catFloat = (FloatingActionButton) findViewById(R.id.catFloat);
        dogFloat = (FloatingActionButton) findViewById(R.id.dogFloat);
        birdFloat = (FloatingActionButton) findViewById(R.id.birdFloat);
        rabbitFloat = (FloatingActionButton) findViewById(R.id.rabbitFloat);
        frogFloat = (FloatingActionButton) findViewById(R.id.frogFloat);
        reptileFloat = (FloatingActionButton) findViewById(R.id.reptileFloat);
        hamsterFloat = (FloatingActionButton) findViewById(R.id.hamsterFloat);
        guineaFloat = (FloatingActionButton) findViewById(R.id.guineaFloat);

        catFloat.setOnClickListener(this);
        dogFloat.setOnClickListener(this);
        birdFloat.setOnClickListener(this);
        rabbitFloat.setOnClickListener(this);
        frogFloat.setOnClickListener(this);
        reptileFloat.setOnClickListener(this);
        hamsterFloat.setOnClickListener(this);
        guineaFloat.setOnClickListener(this);

        // Animations

        pawClose = AnimationUtils.loadAnimation(this, R.anim.paw_close);
        pawOpen = AnimationUtils.loadAnimation(this, R.anim.paw_open);
        rotateForward = AnimationUtils.loadAnimation(this, R.anim.rotate_forward);
        rotateBackward = AnimationUtils.loadAnimation(this, R.anim.rotate_backward);

        pawMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animatePaw();

            }
        });
    }

    private void animatePaw(){

        if (isOpen){

            pawMenuButton.startAnimation(rotateForward);
            catFloat.startAnimation(pawClose);
            dogFloat.startAnimation(pawClose);
            birdFloat.startAnimation(pawClose);
            rabbitFloat.startAnimation(pawClose);
            frogFloat.startAnimation(pawClose);
            reptileFloat.startAnimation(pawClose);
            hamsterFloat.startAnimation(pawClose);
            guineaFloat.startAnimation(pawClose);

            catFloat.setClickable(false);
            dogFloat.setClickable(false);
            birdFloat.setClickable(false);
            rabbitFloat.setClickable(false);
            frogFloat.setClickable(false);
            reptileFloat.setClickable(false);
            hamsterFloat.setClickable(false);
            guineaFloat.setClickable(false);

            isOpen = false;

        } else {

            pawMenuButton.startAnimation(rotateBackward);
            catFloat.startAnimation(pawOpen);
            dogFloat.startAnimation(pawOpen);
            birdFloat.startAnimation(pawOpen);
            rabbitFloat.startAnimation(pawOpen);
            frogFloat.startAnimation(pawOpen);
            reptileFloat.startAnimation(pawOpen);
            hamsterFloat.startAnimation(pawOpen);
            guineaFloat.startAnimation(pawOpen);

            catFloat.setClickable(true);
            dogFloat.setClickable(true);
            birdFloat.setClickable(true);
            rabbitFloat.setClickable(true);
            frogFloat.setClickable(true);
            reptileFloat.setClickable(true);
            hamsterFloat.setClickable(true);
            guineaFloat.setClickable(true);

            isOpen = true;

        }

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
            case R.id.catFloat:
                i = new Intent(this, cat_diseases.class);
                startActivity(i);
                break;
            case R.id.dogFloat:
                i = new Intent(this, dog_diseases.class);
                startActivity(i);
                break;
            case R.id.birdFloat:
                i = new Intent(this, bird_diseases.class);
                startActivity(i);
                break;
            case R.id.rabbitFloat:
                i = new Intent(this, rabbit_diseases.class);
                startActivity(i);
                break;
            case R.id.frogFloat:
                i = new Intent(this, frog_diseases.class);
                startActivity(i);
                break;
            case R.id.reptileFloat:
                i = new Intent(this, reptile_diseases.class);
                startActivity(i);
                break;
            case R.id.hamsterFloat:
                i = new Intent(this, hamster_diseases.class);
                startActivity(i);
                break;
            case R.id.guineaFloat:
                i = new Intent(this, guinea_diseases.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }

    // Final Project

}