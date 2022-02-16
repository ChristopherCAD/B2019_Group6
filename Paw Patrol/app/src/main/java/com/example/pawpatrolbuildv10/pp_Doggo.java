package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pp_Doggo extends AppCompatActivity {

    Button dog_Search;
    CheckBox ds1, ds2, ds3, ds4, ds5;
    CheckBox ds6, ds7, ds8, ds9, ds10;
    CheckBox ds11, ds12, ds13, ds14, ds15;
    CheckBox ds16, ds17, ds18, ds19, ds20, ds21;
    // LinearLayout Diseases
    LinearLayout dog_disease1, dog_disease2, dog_disease3, dog_disease4, dog_disease5;
    LinearLayout dog_disease6, dog_disease7, dog_disease8, dog_disease9, dog_disease10;
    CardView dogDisease1, dogDisease2, dogDisease3, dogDisease4, dogDisease5;
    CardView dogDisease6, dogDisease7, dogDisease8, dogDisease9, dogDisease10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_doggo);

        ds1 = findViewById(R.id.DS1);
        ds2 = findViewById(R.id.DS2);
        ds3 = findViewById(R.id.DS3);
        ds4 = findViewById(R.id.DS4);
        ds5 = findViewById(R.id.DS5);
        ds6 = findViewById(R.id.DS6);
        ds7 = findViewById(R.id.DS7);
        ds8 = findViewById(R.id.DS8);
        ds9 = findViewById(R.id.DS9);
        ds10 = findViewById(R.id.DS10);
        ds11 = findViewById(R.id.DS11);
        ds12 = findViewById(R.id.DS12);
        ds13 = findViewById(R.id.DS13);
        ds14 = findViewById(R.id.DS14);
        ds15 = findViewById(R.id.DS15);
        ds16 = findViewById(R.id.DS16);
        ds17 = findViewById(R.id.DS17);
        ds18 = findViewById(R.id.DS18);
        ds19 = findViewById(R.id.DS19);

        dog_disease1 = findViewById(R.id.dogdisease1);
        dog_disease2 = findViewById(R.id.dogdisease2);
        dog_disease3 = findViewById(R.id.dogdisease3);
        dog_disease4 = findViewById(R.id.dogdisease4);
        dog_disease5 = findViewById(R.id.dogdisease5);
        dog_disease6 = findViewById(R.id.dogdisease6);
        dog_disease7 = findViewById(R.id.dogdisease7);

        dog_Search = findViewById(R.id.doggoButtonSearch);
        dog_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(pp_Doggo.this, pp_dog_disease.class);
                Intent doggo = new Intent(pp_Doggo.this, pp_dog_disease.class);

                if (ds1.isChecked() && ds2.isChecked() && ds4.isChecked() && ds6.isChecked() && ds7.isChecked()) {

                    // Canine Distemper

                    d.putExtra("ds1", ds1.isChecked());
                    d.putExtra("ds2", ds2.isChecked());
                    d.putExtra("ds4", ds4.isChecked());
                    d.putExtra("ds6", ds6.isChecked());
                    d.putExtra("ds7", ds7.isChecked());
                    startActivity(d);

                } else if (ds4.isChecked() && ds5.isChecked() && ds8.isChecked() && ds9.isChecked() && ds11.isChecked()) {

                    // Canine Parvo + Leptospirosis
                    d.putExtra("ds4",ds4.isChecked());
                    d.putExtra("ds5",ds5.isChecked());
                    d.putExtra("ds8",ds8.isChecked());
                    d.putExtra("ds9",ds9.isChecked());
                    d.putExtra("ds11",ds11.isChecked());
                    startActivity(d);

                } else if (ds9.isChecked() && ds10.isChecked() && ds12.isChecked() && ds13.isChecked()) {

                    // Heatstroke

                    d.putExtra("ds9", ds9.isChecked());
                    d.putExtra("ds10", ds10.isChecked());
                    d.putExtra("ds12", ds12.isChecked());
                    d.putExtra("ds13", ds13.isChecked());
                    startActivity(d);

                } else if (ds5.isChecked() && ds14.isChecked() && ds15.isChecked() && ds17.isChecked()) {

                    // Intestinal Parasites
                    d.putExtra("ds5", ds5.isChecked());
                    d.putExtra("ds14", ds14.isChecked());
                    d.putExtra("ds15", ds15.isChecked());
                    d.putExtra("ds17", ds17.isChecked());
                    startActivity(d);

                } else if (ds4.isChecked() && ds5.isChecked() && ds8.isChecked() && ds16.isChecked() && ds17.isChecked()) {

                    // Leptospirosis
                    d.putExtra("ds4", ds4.isChecked());
                    d.putExtra("ds5", ds5.isChecked());
                    d.putExtra("ds8", ds8.isChecked());
                    d.putExtra("ds16", ds16.isChecked());
                    d.putExtra("ds17", ds17.isChecked());
                    startActivity(d);

                } else if (ds3.isChecked() && ds11.isChecked() && ds18.isChecked()) {

                    // Heartworms +
                    d.putExtra("ds3", ds3.isChecked());
                    d.putExtra("ds11", ds11.isChecked());
                    d.putExtra("ds18", ds18.isChecked());
                    startActivity(d);
                } else if (ds3.isChecked() && ds8.isChecked() && ds11.isChecked() && ds19.isChecked()) {

                    // Fungal Infections + Parvo and Leptospirosis
                    d.putExtra("ds3", ds3.isChecked());
                    d.putExtra("ds8", ds8.isChecked());
                    d.putExtra("ds11", ds11.isChecked());
                    d.putExtra("ds19", ds19.isChecked());
                    startActivity(d);

                } else if (ds1.isChecked()) {

                    doggo.putExtra("ds1", ds1.isChecked());

                    if (ds3.isChecked()) {

                        doggo.putExtra("ds3", ds3.isChecked());

                    }
                    if (ds4.isChecked()) {

                        doggo.putExtra("ds4", ds4.isChecked());

                    }
                    if (ds5.isChecked()) {

                        doggo.putExtra("ds5", ds5.isChecked());

                    }
                    if (ds8.isChecked()) {

                        doggo.putExtra("ds8", ds8.isChecked());

                    }
                    if (ds9.isChecked()) {

                        doggo.putExtra("ds9", ds9.isChecked());

                    }
                    if (ds10.isChecked()) {

                        doggo.putExtra("ds10", ds10.isChecked());

                    }
                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds12.isChecked()) {

                        doggo.putExtra("ds12", ds12.isChecked());

                    }
                    if (ds13.isChecked()) {

                        doggo.putExtra("ds13", ds13.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }
                    startActivity(doggo);

                } else if (ds2.isChecked()) {

                    doggo.putExtra("ds2", ds2.isChecked());

                    if (ds3.isChecked()) {

                        doggo.putExtra("ds3", ds3.isChecked());

                    }
                    if (ds4.isChecked()) {

                        doggo.putExtra("ds4", ds4.isChecked());

                    }
                    if (ds5.isChecked()) {

                        doggo.putExtra("ds5", ds5.isChecked());

                    }
                    if (ds8.isChecked()) {

                        doggo.putExtra("ds8", ds8.isChecked());

                    }
                    if (ds9.isChecked()) {

                        doggo.putExtra("ds9", ds9.isChecked());

                    }
                    if (ds10.isChecked()) {

                        doggo.putExtra("ds10", ds10.isChecked());

                    }
                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds12.isChecked()) {

                        doggo.putExtra("ds12", ds12.isChecked());

                    }
                    if (ds13.isChecked()) {

                        doggo.putExtra("ds13", ds13.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds3.isChecked()) {

                    doggo.putExtra("ds3", ds3.isChecked());

                    if (ds4.isChecked()) {

                        doggo.putExtra("ds4", ds4.isChecked());

                    }
                    if (ds5.isChecked()) {

                        doggo.putExtra("ds5", ds5.isChecked());

                    }
                    if (ds8.isChecked()) {

                        doggo.putExtra("ds8", ds8.isChecked());

                    }
                    if (ds9.isChecked()) {

                        doggo.putExtra("ds9", ds9.isChecked());

                    }
                    if (ds10.isChecked()) {

                        doggo.putExtra("ds10", ds10.isChecked());

                    }
                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds12.isChecked()) {

                        doggo.putExtra("ds12", ds12.isChecked());

                    }
                    if (ds13.isChecked()) {

                        doggo.putExtra("ds13", ds13.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds4.isChecked()) {

                    doggo.putExtra("ds4", ds4.isChecked());

                    if (ds8.isChecked()) {

                        doggo.putExtra("ds8", ds8.isChecked());

                    }
                    if (ds9.isChecked()) {

                        doggo.putExtra("ds9", ds9.isChecked());

                    }
                    if (ds10.isChecked()) {

                        doggo.putExtra("ds10", ds10.isChecked());

                    }
                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds12.isChecked()) {

                        doggo.putExtra("ds12", ds12.isChecked());

                    }
                    if (ds13.isChecked()) {

                        doggo.putExtra("ds13", ds13.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds5.isChecked()) {

                    doggo.putExtra("ds5", ds5.isChecked());

                    if (ds8.isChecked()) {

                        doggo.putExtra("ds8", ds8.isChecked());

                    }
                    if (ds9.isChecked()) {

                        doggo.putExtra("ds9", ds9.isChecked());

                    }
                    if (ds10.isChecked()) {

                        doggo.putExtra("ds10", ds10.isChecked());

                    }
                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds12.isChecked()) {

                        doggo.putExtra("ds12", ds12.isChecked());

                    }
                    if (ds13.isChecked()) {

                        doggo.putExtra("ds13", ds13.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds6.isChecked()) {

                    doggo.putExtra("ds6", ds6.isChecked());

                    if (ds8.isChecked()) {

                        doggo.putExtra("ds8", ds8.isChecked());

                    }
                    if (ds9.isChecked()) {

                        doggo.putExtra("ds9", ds9.isChecked());

                    }
                    if (ds10.isChecked()) {

                        doggo.putExtra("ds10", ds10.isChecked());

                    }
                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds12.isChecked()) {

                        doggo.putExtra("ds12", ds12.isChecked());

                    }
                    if (ds13.isChecked()) {

                        doggo.putExtra("ds13", ds13.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds7.isChecked()) {

                    doggo.putExtra("ds7", ds7.isChecked());

                    if (ds8.isChecked()) {

                        doggo.putExtra("ds8", ds8.isChecked());

                    }
                    if (ds9.isChecked()) {

                        doggo.putExtra("ds9", ds9.isChecked());

                    }
                    if (ds10.isChecked()) {

                        doggo.putExtra("ds10", ds10.isChecked());

                    }
                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds12.isChecked()) {

                        doggo.putExtra("ds12", ds12.isChecked());

                    }
                    if (ds13.isChecked()) {

                        doggo.putExtra("ds13", ds13.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds8.isChecked()) {

                    doggo.putExtra("ds8", ds8.isChecked());

                    if (ds9.isChecked()) {

                        doggo.putExtra("ds9", ds9.isChecked());

                    }
                    if (ds10.isChecked()) {

                        doggo.putExtra("ds10", ds10.isChecked());

                    }
                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds12.isChecked()) {

                        doggo.putExtra("ds12", ds12.isChecked());

                    }
                    if (ds13.isChecked()) {

                        doggo.putExtra("ds13", ds13.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds9.isChecked()) {

                    doggo.putExtra("ds9", ds9.isChecked());

                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds10.isChecked()) {

                    doggo.putExtra("ds10", ds10.isChecked());

                    if (ds11.isChecked()) {

                        doggo.putExtra("ds11", ds11.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds11.isChecked()) {

                    doggo.putExtra("ds11", ds11.isChecked());

                    if (ds12.isChecked()) {

                        doggo.putExtra("ds12", ds12.isChecked());

                    }
                    if (ds13.isChecked()) {

                        doggo.putExtra("ds13", ds13.isChecked());

                    }
                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds12.isChecked()) {

                    doggo.putExtra("ds12", ds12.isChecked());

                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds13.isChecked()) {

                    doggo.putExtra("ds13", ds13.isChecked());

                    if (ds14.isChecked()) {

                        doggo.putExtra("ds14", ds14.isChecked());

                    }
                    if (ds15.isChecked()) {

                        doggo.putExtra("ds15", ds15.isChecked());

                    }
                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds14.isChecked()) {

                    doggo.putExtra("ds14", ds14.isChecked());

                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds15.isChecked()) {

                    doggo.putExtra("ds15", ds15.isChecked());

                    if (ds16.isChecked()) {

                        doggo.putExtra("ds16", ds16.isChecked());

                    }
                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds16.isChecked()) {

                    doggo.putExtra("ds16", ds16.isChecked());

                    if (ds17.isChecked()) {

                        doggo.putExtra("ds17", ds17.isChecked());

                    }
                    if (ds18.isChecked()) {

                        doggo.putExtra("ds18", ds18.isChecked());

                    }
                    if (ds19.isChecked()) {

                        doggo.putExtra("ds19", ds19.isChecked());

                    }

                    startActivity(doggo);

                } else if (ds17.isChecked()) {

                    doggo.putExtra("ds17", ds17.isChecked());
                    startActivity(doggo);

                } else if (ds18.isChecked()) {

                    doggo.putExtra("ds18", ds18.isChecked());
                    startActivity(doggo);

                } else if (ds19.isChecked()) {

                    doggo.putExtra("ds19", ds19.isChecked());
                    startActivity(doggo);

                }

            }
        });


    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}