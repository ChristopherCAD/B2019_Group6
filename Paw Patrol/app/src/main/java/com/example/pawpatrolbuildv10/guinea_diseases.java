package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class guinea_diseases extends AppCompatActivity implements View.OnClickListener{

    LinearLayout guinea_disease1, guinea_disease2, guinea_disease3, guinea_disease4, guinea_disease5;
    LinearLayout guinea_disease6;
    CardView guineaDisease1, guineaDisease2, guineaDisease3, guineaDisease4, guineaDisease5;
    CardView guineaDisease6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guinea_diseases);

        // CardView Block

        guineaDisease1 = findViewById(R.id.guineaDisease1);
        guineaDisease2 = findViewById(R.id.guineaDisease2);
        guineaDisease3 = findViewById(R.id.guineaDisease3);
        guineaDisease4 = findViewById(R.id.guineaDisease4);
        guineaDisease5 = findViewById(R.id.guineaDisease5);
        guineaDisease6 = findViewById(R.id.guineaDisease6);

        // Click Listener Block

        guineaDisease1.setOnClickListener(this);
        guineaDisease2.setOnClickListener(this);
        guineaDisease3.setOnClickListener(this);
        guineaDisease4.setOnClickListener(this);
        guineaDisease5.setOnClickListener(this);
        guineaDisease6.setOnClickListener(this);

        // Diseases Block

        guinea_disease1 = findViewById(R.id.guineadisease1);
        guinea_disease2 = findViewById(R.id.guineadisease2);
        guinea_disease3 = findViewById(R.id.guineadisease3);
        guinea_disease4 = findViewById(R.id.guineadisease4);
        guinea_disease5 = findViewById(R.id.guineadisease5);
        guinea_disease6 = findViewById(R.id.guineadisease6);

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