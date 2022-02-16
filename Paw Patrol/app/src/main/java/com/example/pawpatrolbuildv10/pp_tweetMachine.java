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

        bird_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(pp_tweetMachine.this, pp_bird_disease.class);
                Intent birb = new Intent(pp_tweetMachine.this, pp_bird_disease.class);

                if (bs1.isChecked() && bs2.isChecked() && bs3.isChecked() && bs13.isChecked() && bs18.isChecked()) {

                    // Salmonella

                    b.putExtra("bs1", bs1.isChecked());
                    b.putExtra("bs2", bs2.isChecked());
                    b.putExtra("bs3", bs3.isChecked());
                    b.putExtra("bs13", bs13.isChecked());
                    b.putExtra("bs18", bs18.isChecked());
                    startActivity(b);

                    // Try nested If for different conditions
                    // It might work, who knows...
                    // Or just put every disease in here lmao.
                    // It worked, lol

                } else if (bs4.isChecked() && bs5.isChecked() && bs6.isChecked() && bs11.isChecked()) {

                    // Bird Mites

                    b.putExtra("bs4", bs4.isChecked());
                    b.putExtra("bs5", bs5.isChecked());
                    b.putExtra("bs6", bs6.isChecked());
                    b.putExtra("bs11", bs11.isChecked());
                    startActivity(b);

                } else if (bs4.isChecked() && bs7.isChecked() && bs8.isChecked() && bs9.isChecked() && bs10.isChecked()) {

                    // Feather Disease
                    b.putExtra("bs4", bs4.isChecked());
                    b.putExtra("bs7", bs4.isChecked());
                    b.putExtra("bs8", bs4.isChecked());
                    b.putExtra("bs9", bs4.isChecked());
                    b.putExtra("bs10", bs4.isChecked());
                    startActivity(b);

                } else if (bs2.isChecked() && bs5.isChecked() && bs12.isChecked() && bs13.isChecked() && bs14.isChecked()) {

                    // Pacheco Disease
                    b.putExtra("bs2", bs2.isChecked());
                    b.putExtra("bs5", bs5.isChecked());
                    b.putExtra("bs12", bs12.isChecked());
                    b.putExtra("bs13", bs13.isChecked());
                    b.putExtra("bs14", bs14.isChecked());
                    startActivity(b);

                } else if (bs15.isChecked() && bs16.isChecked() && bs17.isChecked() && bs18.isChecked()) {

                    // PoxVirus Infection 15, 16, 17, 18
                    b.putExtra("bs15", bs15.isChecked());
                    b.putExtra("bs16", bs16.isChecked());
                    b.putExtra("bs17", bs17.isChecked());
                    b.putExtra("bs18", bs18.isChecked());
                    startActivity(b);

                } else if (bs14.isChecked() && bs19.isChecked() && bs20.isChecked() && bs21.isChecked()) {

                    // West Nile Virus
                    b.putExtra("bs14", bs14.isChecked());
                    b.putExtra("bs19", bs19.isChecked());
                    b.putExtra("bs20", bs20.isChecked());
                    b.putExtra("bs21", bs21.isChecked());
                    startActivity(b);

                } else if (bs1.isChecked()) {

                    birb.putExtra("bs1", bs1.isChecked());

                    if (bs4.isChecked()) {

                        birb.putExtra("bs4", bs4.isChecked());

                    }
                    if (bs5.isChecked()) {

                        birb.putExtra("bs5", bs5.isChecked());

                    }
                    if (bs6.isChecked()) {

                        birb.putExtra("bs6", bs6.isChecked());

                    }
                    if (bs7.isChecked()) {

                        birb.putExtra("bs7", bs7.isChecked());

                    }
                    if (bs8.isChecked()) {

                        birb.putExtra("bs8", bs8.isChecked());

                    }
                    if (bs9.isChecked()) {

                        birb.putExtra("bs9", bs9.isChecked());

                    }
                    if (bs10.isChecked()) {

                        birb.putExtra("bs10", bs10.isChecked());

                    }
                    if (bs11.isChecked()) {

                        birb.putExtra("bs11", bs11.isChecked());

                    }
                    if (bs12.isChecked()) {

                        birb.putExtra("bs2", bs2.isChecked());

                    }
                    if (bs13.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }
                    startActivity(birb);

                } else if (bs2.isChecked()) {

                    birb.putExtra("bs2", bs2.isChecked());

                    if (bs4.isChecked()) {

                        birb.putExtra("bs4", bs4.isChecked());

                    }
                    if (bs4.isChecked()) {

                        birb.putExtra("bs4", bs4.isChecked());

                    }
                    if (bs5.isChecked()) {

                        birb.putExtra("bs5", bs5.isChecked());

                    }
                    if (bs6.isChecked()) {

                        birb.putExtra("bs6", bs6.isChecked());

                    }
                    if (bs7.isChecked()) {

                        birb.putExtra("bs7", bs7.isChecked());

                    }
                    if (bs8.isChecked()) {

                        birb.putExtra("bs8", bs8.isChecked());

                    }
                    if (bs9.isChecked()) {

                        birb.putExtra("bs9", bs9.isChecked());

                    }
                    if (bs10.isChecked()) {

                        birb.putExtra("bs10", bs10.isChecked());

                    }
                    if (bs11.isChecked()) {

                        birb.putExtra("bs11", bs11.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs3.isChecked()) {

                    birb.putExtra("bs3", bs3.isChecked());

                    if (bs4.isChecked()) {

                        birb.putExtra("bs4", bs4.isChecked());

                    }
                    if (bs4.isChecked()) {

                        birb.putExtra("bs4", bs4.isChecked());

                    }
                    if (bs5.isChecked()) {

                        birb.putExtra("bs5", bs5.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs4.isChecked()) {

                    birb.putExtra("bs4", bs4.isChecked());

                    if (bs5.isChecked()) {

                        birb.putExtra("bs5", bs5.isChecked());

                    }
                    if (bs12.isChecked()) {

                        birb.putExtra("bs12", bs12.isChecked());

                    }
                    if (bs13.isChecked()) {

                        birb.putExtra("bs13", bs13.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs5.isChecked()) {

                    birb.putExtra("bs5", bs5.isChecked());


                    if (bs7.isChecked()) {

                        birb.putExtra("bs7", bs7.isChecked());

                    }
                    if (bs8.isChecked()) {

                        birb.putExtra("bs8", bs8.isChecked());

                    }
                    if (bs9.isChecked()) {

                        birb.putExtra("bs9", bs9.isChecked());

                    }
                    if (bs10.isChecked()) {

                        birb.putExtra("bs10", bs10.isChecked());

                    }
                    if (bs12.isChecked()) {

                        birb.putExtra("bs2", bs2.isChecked());

                    }
                    if (bs13.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs6.isChecked()) {

                    birb.putExtra("bs6", bs6.isChecked());


                    if (bs7.isChecked()) {

                        birb.putExtra("bs7", bs7.isChecked());

                    }
                    if (bs8.isChecked()) {

                        birb.putExtra("bs8", bs8.isChecked());

                    }
                    if (bs9.isChecked()) {

                        birb.putExtra("bs9", bs9.isChecked());

                    }
                    if (bs10.isChecked()) {

                        birb.putExtra("bs10", bs10.isChecked());

                    }
                    if (bs11.isChecked()) {

                        birb.putExtra("bs11", bs11.isChecked());

                    }
                    if (bs12.isChecked()) {

                        birb.putExtra("bs12", bs12.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs7.isChecked()) {

                    birb.putExtra("bs7", bs7.isChecked());


                    if (bs11.isChecked()) {

                        birb.putExtra("bs11", bs11.isChecked());

                    }
                    if (bs12.isChecked()) {

                        birb.putExtra("bs12", bs12.isChecked());

                    }
                    if (bs13.isChecked()) {

                        birb.putExtra("bs13", bs13.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs8.isChecked()) {

                    birb.putExtra("bs8", bs8.isChecked());


                    if (bs11.isChecked()) {

                        birb.putExtra("bs11", bs11.isChecked());

                    }
                    if (bs12.isChecked()) {

                        birb.putExtra("bs12", bs12.isChecked());

                    }
                    if (bs13.isChecked()) {

                        birb.putExtra("bs13", bs13.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs9.isChecked()) {

                    birb.putExtra("bs9", bs9.isChecked());


                    if (bs11.isChecked()) {

                        birb.putExtra("bs11", bs11.isChecked());

                    }
                    if (bs12.isChecked()) {

                        birb.putExtra("bs12", bs12.isChecked());

                    }
                    if (bs13.isChecked()) {

                        birb.putExtra("bs13", bs13.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs10.isChecked()) {

                    birb.putExtra("bs10", bs10.isChecked());


                    if (bs11.isChecked()) {

                        birb.putExtra("bs11", bs11.isChecked());

                    }
                    if (bs12.isChecked()) {

                        birb.putExtra("bs12", bs12.isChecked());

                    }
                    if (bs13.isChecked()) {

                        birb.putExtra("bs13", bs13.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs11.isChecked()) {

                    birb.putExtra("bs11", bs11.isChecked());

                    if (bs12.isChecked()) {

                        birb.putExtra("bs12", bs12.isChecked());

                    }
                    if (bs13.isChecked()) {

                        birb.putExtra("bs13", bs13.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs12.isChecked()) {

                    birb.putExtra("bs12", bs12.isChecked());

                    if (bs13.isChecked()) {

                        birb.putExtra("bs13", bs13.isChecked());

                    }
                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs13.isChecked()) {

                    birb.putExtra("bs13", bs13.isChecked());


                    if (bs14.isChecked()) {

                        birb.putExtra("bs14", bs14.isChecked());

                    }
                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }
                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs14.isChecked()) {

                    birb.putExtra("bs14", bs14.isChecked());


                    if (bs15.isChecked()) {

                        birb.putExtra("bs15", bs15.isChecked());

                    }
                    if (bs16.isChecked()) {

                        birb.putExtra("bs16", bs16.isChecked());

                    }
                    if (bs17.isChecked()) {

                        birb.putExtra("bs17", bs17.isChecked());

                    }
                    if (bs18.isChecked()) {

                        birb.putExtra("bs18", bs18.isChecked());

                    }

                    startActivity(birb);

                } else if (bs15.isChecked()) {

                    birb.putExtra("bs15", bs15.isChecked());


                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs16.isChecked()) {

                    birb.putExtra("bs16", bs16.isChecked());


                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs17.isChecked()) {

                    birb.putExtra("bs17", bs17.isChecked());

                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }
                    startActivity(birb);

                } else if (bs18.isChecked()) {

                    birb.putExtra("bs18", bs18.isChecked());

                    if (bs19.isChecked()) {

                        birb.putExtra("bs19", bs19.isChecked());

                    }
                    if (bs20.isChecked()) {

                        birb.putExtra("bs20", bs20.isChecked());

                    }
                    if (bs21.isChecked()) {

                        birb.putExtra("bs21", bs21.isChecked());

                    }

                    startActivity(birb);

                } else if (bs19.isChecked()) {

                    birb.putExtra("bs19", bs19.isChecked());
                    startActivity(birb);

                } else if (bs20.isChecked()) {

                    birb.putExtra("bs20", bs20.isChecked());
                    startActivity(birb);

                } else if (bs21.isChecked()) {

                    birb.putExtra("bs21", bs21.isChecked());
                    startActivity(birb);

                }
            }
        });

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}