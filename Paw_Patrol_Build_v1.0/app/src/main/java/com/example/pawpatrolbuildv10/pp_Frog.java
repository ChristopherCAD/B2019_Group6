package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_Frog extends AppCompatActivity {

    Button frog_Search;
    CheckBox fs1, fs2, fs3, fs4, fs5;
    CheckBox fs6, fs7, fs8, fs9, fs10;
    CheckBox fs11, fs12, fs13, fs14, fs15;
    LinearLayout frogdisease1, frogdisease2, frogdisease3, frogdisease4, frogdisease5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_frog);

        fs1 = findViewById(R.id.FS1);
        fs2 = findViewById(R.id.FS2);
        fs3 = findViewById(R.id.FS3);
        fs4 = findViewById(R.id.FS4);
        fs5 = findViewById(R.id.FS5);
        fs6 = findViewById(R.id.FS6);
        fs7 = findViewById(R.id.FS7);
        fs8 = findViewById(R.id.FS8);
        fs9 = findViewById(R.id.FS9);
        fs10 = findViewById(R.id.FS10);
        fs11 = findViewById(R.id.FS11);
        fs12 = findViewById(R.id.FS12);
        fs13 = findViewById(R.id.FS13);
        fs14 = findViewById(R.id.FS14);
        fs15 = findViewById(R.id.FS15);

        frog_Search = findViewById(R.id.frogButtonSearch);

        frogdisease1 = findViewById(R.id.frogdisease1);
        frogdisease2 = findViewById(R.id.frogdisease2);
        frogdisease3 = findViewById(R.id.frogdisease3);
        frogdisease4 = findViewById(R.id.frogdisease4);
        frogdisease5 = findViewById(R.id.frogdisease5);

        frog_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(pp_Frog.this, pp_frog_disease.class);

                if (fs1.isChecked() && fs2.isChecked() && fs3.isChecked() && fs4.isChecked()) {
                    f.putExtra("fs1", fs1.isChecked());
                    f.putExtra("fs2", fs2.isChecked());
                    f.putExtra("fs3", fs3.isChecked());
                    f.putExtra("fs4", fs4.isChecked());
                    startActivity(f);
                    //rabbit_symptom1.setBackgroundColor(Color.parseColor("#FF0000"));
                    showToast("Searching for symptom-related diseases...");

                } else if (fs5.isChecked()){
                    f.putExtra("fs5", fs5.isChecked());
                    startActivity(f);
                } else {
                    showToast("No condition here yet.");
                }

            }
        });

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}