package com.example.pawpatrolbuildv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class pp_Rabbit extends AppCompatActivity {

    Button rabbit_Search;
    CheckBox rs1, rs2, rs3, rs4, rs5;
    CheckBox rs6, rs7, rs8, rs9, rs10;
    CheckBox rs11, rs12, rs13, rs14, rs15;
    CheckBox rs16, rs17, rs18, rs19, rs20;
    CheckBox rs21, rs22, rs23, rs24, rs25;
    LinearLayout rabbit_disease1, rabbit_disease2, rabbit_disease3;
    LinearLayout rabbit_disease4, rabbit_disease5, rabbit_disease6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_rabbit);

        rs1 = findViewById(R.id.RS1);
        rs2 = findViewById(R.id.RS2);
        rs3 = findViewById(R.id.RS3);
        rs4 = findViewById(R.id.RS4);
        rs5 = findViewById(R.id.RS5);
        rs6 = findViewById(R.id.RS6);
        rs7 = findViewById(R.id.RS7);
        rs8 = findViewById(R.id.RS8);
        rs9 = findViewById(R.id.RS9);
        rs10 = findViewById(R.id.RS10);
        rs11 = findViewById(R.id.RS11);
        rs12 = findViewById(R.id.RS12);
        rs13 = findViewById(R.id.RS13);
        rs14 = findViewById(R.id.RS14);
        rs15 = findViewById(R.id.RS15);
        rs16 = findViewById(R.id.RS16);
        rs17 = findViewById(R.id.RS17);
        rs18 = findViewById(R.id.RS18);
        rs19 = findViewById(R.id.RS19);
        rs20 = findViewById(R.id.RS20);
        rs21 = findViewById(R.id.RS21);
        rs22 = findViewById(R.id.RS22);
        rs23 = findViewById(R.id.RS23);
        rs24 = findViewById(R.id.RS24);


        rabbit_Search = findViewById(R.id.rabbitButtonSearch);

        rabbit_disease1 = findViewById(R.id.rabbitdisease1);
        rabbit_disease2 = findViewById(R.id.rabbitdisease2);
        rabbit_disease3 = findViewById(R.id.rabbitdisease3);
        rabbit_disease4 = findViewById(R.id.rabbitdisease4);
        rabbit_disease5 = findViewById(R.id.rabbitdisease5);
        rabbit_disease6 = findViewById(R.id.rabbitdisease6);

        rabbit_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(pp_Rabbit.this, pp_rabbit_diseases.class);
                Intent bunny = new Intent(pp_Rabbit.this, pp_rabbit_diseases.class);

                if (rs1.isChecked() && rs2.isChecked() && rs3.isChecked() && rs4.isChecked() && rs5.isChecked()) {

                    // Overgrown Teeth

                    r.putExtra("rs1", rs1.isChecked());
                    r.putExtra("rs2", rs2.isChecked());
                    r.putExtra("rs3", rs3.isChecked());
                    r.putExtra("rs4", rs4.isChecked());
                    r.putExtra("rs5", rs5.isChecked());
                    startActivity(r);

                } else if (rs7.isChecked() && rs8.isChecked() && rs9.isChecked() && rs10.isChecked() && rs11.isChecked()){

                    // Snuffles

                    r.putExtra("rs7", rs7.isChecked());
                    r.putExtra("rs8", rs8.isChecked());
                    r.putExtra("rs9", rs9.isChecked());
                    r.putExtra("rs10", rs10.isChecked());
                    r.putExtra("rs11", rs11.isChecked());
                    startActivity(r);

                } else if (rs12.isChecked() && rs13.isChecked() && rs14.isChecked() && rs15.isChecked() && rs16.isChecked()) {

                    // Utermine Tumours

                    r.putExtra("rs12", rs12.isChecked());
                    r.putExtra("rs13", rs13.isChecked());
                    r.putExtra("rs14", rs14.isChecked());
                    r.putExtra("rs15", rs15.isChecked());
                    r.putExtra("rs16", rs16.isChecked());
                    startActivity(r);

                } else if (rs17.isChecked() && rs18.isChecked() && rs19.isChecked() && rs20.isChecked() && rs21.isChecked()) {

                    // Hemmorhagic Disease

                    r.putExtra("rs17", rs17.isChecked());
                    r.putExtra("rs18", rs18.isChecked());
                    r.putExtra("rs19", rs19.isChecked());
                    r.putExtra("rs20", rs20.isChecked());
                    r.putExtra("rs21", rs21.isChecked());
                    startActivity(r);

                } else if (rs2.isChecked() && rs5.isChecked() && rs6.isChecked() && rs22.isChecked() && rs23.isChecked()) {

                    // Hairballs

                    r.putExtra("rs2", rs2.isChecked());
                    r.putExtra("rs5", rs5.isChecked());
                    r.putExtra("rs6", rs6.isChecked());
                    r.putExtra("rs22", rs22.isChecked());
                    r.putExtra("rs23", rs23.isChecked());
                    startActivity(r);

                } else if (rs2.isChecked() && rs5.isChecked() && rs17.isChecked() && rs24.isChecked()) {

                    // Myxomatosis

                    r.putExtra("rs2", rs2.isChecked());
                    r.putExtra("rs5", rs5.isChecked());
                    r.putExtra("rs17", rs17.isChecked());
                    r.putExtra("rs24", rs24.isChecked());
                    startActivity(r);

                } else if (rs1.isChecked()) {

                    bunny.putExtra("rs1", rs1.isChecked());


                    if (rs2.isChecked()) {

                        bunny.putExtra("rs2", rs2.isChecked());

                    }
                    if (rs5.isChecked()) {

                        bunny.putExtra("rs5", rs5.isChecked());

                    }
                    if (rs6.isChecked()) {

                        bunny.putExtra("rs6", rs6.isChecked());

                    }
                    if (rs7.isChecked()) {

                        bunny.putExtra("rs7", rs7.isChecked());

                    }
                    if (rs8.isChecked()) {

                        bunny.putExtra("rs8", rs8.isChecked());

                    }
                    if (rs9.isChecked()) {

                        bunny.putExtra("rs9", rs9.isChecked());

                    }
                    if (rs10.isChecked()) {

                        bunny.putExtra("rs10", rs10.isChecked());

                    }
                    if (rs11.isChecked()) {

                        bunny.putExtra("rs11", rs11.isChecked());

                    }
                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs2.isChecked()) {

                    bunny.putExtra("rs2", rs2.isChecked());


                    if (rs5.isChecked()) {

                        bunny.putExtra("rs5", rs5.isChecked());

                    }
                    if (rs7.isChecked()) {

                        bunny.putExtra("rs7", rs7.isChecked());

                    }
                    if (rs8.isChecked()) {

                        bunny.putExtra("rs8", rs8.isChecked());

                    }
                    if (rs9.isChecked()) {

                        bunny.putExtra("rs9", rs9.isChecked());

                    }
                    if (rs10.isChecked()) {

                        bunny.putExtra("rs10", rs10.isChecked());

                    }
                    if (rs11.isChecked()) {

                        bunny.putExtra("rs11", rs11.isChecked());

                    }
                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs3.isChecked()) {

                    bunny.putExtra("rs3", rs3.isChecked());


                    if (rs5.isChecked()) {

                        bunny.putExtra("rs5", rs5.isChecked());

                    }
                    if (rs6.isChecked()) {

                        bunny.putExtra("rs6", rs6.isChecked());

                    }
                    if (rs7.isChecked()) {

                        bunny.putExtra("rs7", rs7.isChecked());

                    }
                    if (rs8.isChecked()) {

                        bunny.putExtra("rs8", rs8.isChecked());

                    }
                    if (rs9.isChecked()) {

                        bunny.putExtra("rs9", rs9.isChecked());

                    }
                    if (rs10.isChecked()) {

                        bunny.putExtra("rs10", rs10.isChecked());

                    }
                    if (rs11.isChecked()) {

                        bunny.putExtra("rs11", rs11.isChecked());

                    }
                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs4.isChecked()) {

                    bunny.putExtra("rs4", rs4.isChecked());


                    if (rs5.isChecked()) {

                        bunny.putExtra("rs5", rs5.isChecked());

                    }
                    if (rs6.isChecked()) {

                        bunny.putExtra("rs6", rs6.isChecked());

                    }
                    if (rs7.isChecked()) {

                        bunny.putExtra("rs7", rs7.isChecked());

                    }
                    if (rs8.isChecked()) {

                        bunny.putExtra("rs8", rs8.isChecked());

                    }
                    if (rs9.isChecked()) {

                        bunny.putExtra("rs9", rs9.isChecked());

                    }
                    if (rs10.isChecked()) {

                        bunny.putExtra("rs10", rs10.isChecked());

                    }
                    if (rs11.isChecked()) {

                        bunny.putExtra("rs11", rs11.isChecked());

                    }
                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs5.isChecked()) {

                    bunny.putExtra("rs5", rs5.isChecked());

                    if (rs7.isChecked()) {

                        bunny.putExtra("rs7", rs7.isChecked());

                    }
                    if (rs8.isChecked()) {

                        bunny.putExtra("rs8", rs8.isChecked());

                    }
                    if (rs9.isChecked()) {

                        bunny.putExtra("rs9", rs9.isChecked());

                    }
                    if (rs10.isChecked()) {

                        bunny.putExtra("rs10", rs10.isChecked());

                    }
                    if (rs11.isChecked()) {

                        bunny.putExtra("rs11", rs11.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs6.isChecked()) {

                    bunny.putExtra("rs6", rs6.isChecked());


                    if (rs7.isChecked()) {

                        bunny.putExtra("rs7", rs7.isChecked());

                    }
                    if (rs8.isChecked()) {

                        bunny.putExtra("rs8", rs8.isChecked());

                    }
                    if (rs9.isChecked()) {

                        bunny.putExtra("rs9", rs9.isChecked());

                    }
                    if (rs10.isChecked()) {

                        bunny.putExtra("rs10", rs10.isChecked());

                    }
                    if (rs11.isChecked()) {

                        bunny.putExtra("rs11", rs11.isChecked());

                    }
                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs7.isChecked()) {

                    bunny.putExtra("rs7", rs7.isChecked());

                    if (rs10.isChecked()) {

                        bunny.putExtra("rs10", rs10.isChecked());

                    }
                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs8.isChecked()) {

                    bunny.putExtra("rs8", rs8.isChecked());

                    if (rs10.isChecked()) {

                        bunny.putExtra("rs10", rs10.isChecked());

                    }
                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs9.isChecked()) {

                    bunny.putExtra("rs9", rs9.isChecked());

                    if (rs10.isChecked()) {

                        bunny.putExtra("rs10", rs10.isChecked());

                    }
                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs10.isChecked()) {

                    bunny.putExtra("rs10", rs10.isChecked());

                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs11.isChecked()) {

                    bunny.putExtra("rs1", rs1.isChecked());

                    if (rs12.isChecked()) {

                        bunny.putExtra("rs12", rs12.isChecked());

                    }
                    if (rs13.isChecked()) {

                        bunny.putExtra("rs13", rs13.isChecked());

                    }
                    if (rs14.isChecked()) {

                        bunny.putExtra("rs14", rs14.isChecked());

                    }
                    if (rs15.isChecked()) {

                        bunny.putExtra("rs15", rs15.isChecked());

                    }
                    if (rs16.isChecked()) {

                        bunny.putExtra("rs16", rs16.isChecked());

                    }
                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs12.isChecked()) {

                    bunny.putExtra("rs2", rs2.isChecked());

                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs13.isChecked()) {

                    bunny.putExtra("rs3", rs3.isChecked());

                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs14.isChecked()) {

                    bunny.putExtra("rs4", rs4.isChecked());

                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs15.isChecked()) {

                    bunny.putExtra("rs5", rs5.isChecked());

                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs16.isChecked()) {

                    bunny.putExtra("rs6", rs6.isChecked());

                    if (rs17.isChecked()) {

                        bunny.putExtra("rs17", rs17.isChecked());

                    }
                    if (rs18.isChecked()) {

                        bunny.putExtra("rs18", rs18.isChecked());

                    }
                    if (rs19.isChecked()) {

                        bunny.putExtra("rs19", rs19.isChecked());

                    }
                    if (rs20.isChecked()) {

                        bunny.putExtra("rs20", rs20.isChecked());

                    }
                    if (rs21.isChecked()) {

                        bunny.putExtra("rs21", rs1.isChecked());

                    }
                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs17.isChecked()) {

                    bunny.putExtra("rs7", rs7.isChecked());

                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs18.isChecked()) {

                    bunny.putExtra("rs8", rs8.isChecked());

                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs19.isChecked()) {

                    bunny.putExtra("rs9", rs9.isChecked());

                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs20.isChecked()) {

                    bunny.putExtra("rs10", rs10.isChecked());

                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs21.isChecked()) {

                    bunny.putExtra("rs21", rs21.isChecked());

                    if (rs22.isChecked()) {

                        bunny.putExtra("rs22", rs22.isChecked());

                    }
                    if (rs23.isChecked()) {

                        bunny.putExtra("rs23", rs23.isChecked());

                    }
                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs22.isChecked()) {

                    bunny.putExtra("rs22", rs22.isChecked());

                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs23.isChecked()) {

                    bunny.putExtra("rs23", rs23.isChecked());

                    if (rs24.isChecked()) {

                        bunny.putExtra("rs24", rs24.isChecked());

                    }

                    startActivity(bunny);

                } else if (rs24.isChecked()) {

                    bunny.putExtra("rs24", rs24.isChecked());
                    startActivity(bunny);

                }

            }
        });

    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}