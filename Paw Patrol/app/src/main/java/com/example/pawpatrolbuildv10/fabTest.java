package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class fabTest extends AppCompatActivity {

    FloatingActionButton pawMenuButton;
    Animation pawClose, pawOpen, rotateForward, rotateBackward;

    Boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab_test);

        pawMenuButton = (FloatingActionButton) findViewById(R.id.pawMenuButton);

        pawClose = AnimationUtils.loadAnimation(this, R.anim.paw_close);
        pawOpen = AnimationUtils.loadAnimation(this, R.anim.paw_open);
        rotateForward = AnimationUtils.loadAnimation(this, R.anim.rotate_forward);
        rotateBackward = AnimationUtils.loadAnimation(this, R.anim.rotate_backward);

        pawMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animatePaw();

                Intent h = new Intent(fabTest.this, pp_cat_diseases.class);
                startActivity(h);

            }
        });
    }

    private void animatePaw(){

        if (isOpen){

            pawMenuButton.startAnimation(rotateForward);

            isOpen = false;

        } else {

            pawMenuButton.startAnimation(rotateBackward);

            isOpen = true;

        }

    }

}