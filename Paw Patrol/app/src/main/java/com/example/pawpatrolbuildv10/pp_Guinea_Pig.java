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

public class pp_Guinea_Pig extends AppCompatActivity {

    Button guinea_Search;
    CheckBox gs1, gs2, gs3, gs4, gs5;
    CheckBox gs6, gs7, gs8, gs9, gs10;
    CheckBox gs11, gs12, gs13, gs14, gs15;
    CheckBox gs16, gs17, gs18, gs19, gs20;
    CheckBox gs21, gs22, gs23, gs24, gs25;
    LinearLayout guinea_disease1, guinea_disease2, guinea_disease3, guinea_disease4, guinea_disease5;
    LinearLayout guinea_disease6, guinea_disease7, guinea_disease8, guinea_disease9, guinea_disease10;
    CardView guineaDisease1, guineaDisease2, guineaDisease3, guineaDisease4, guineaDisease5;
    CardView guineaDisease6, guineaDisease7, guineaDisease8, guineaDisease9, guineaDisease10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp_guinea_pig);


        gs1 = findViewById(R.id.GS1);
        gs2 = findViewById(R.id.GS2);
        gs3 = findViewById(R.id.GS3);
        gs4 = findViewById(R.id.GS4);
        gs5 = findViewById(R.id.GS5);
        gs6 = findViewById(R.id.GS6);
        gs7 = findViewById(R.id.GS7);
        gs8 = findViewById(R.id.GS8);
        gs9 = findViewById(R.id.GS9);
        gs10 = findViewById(R.id.GS10);
        gs11 = findViewById(R.id.GS11);
        gs12 = findViewById(R.id.GS12);
        gs13 = findViewById(R.id.GS13);
        gs14 = findViewById(R.id.GS14);
        gs15 = findViewById(R.id.GS15);
        gs16 = findViewById(R.id.GS16);
        gs17 = findViewById(R.id.GS17);
        gs18 = findViewById(R.id.GS18);
        gs19 = findViewById(R.id.GS19);

        guinea_Search = findViewById(R.id.guineaButtonSearch);

        guinea_disease1 = findViewById(R.id.guineadisease1);
        guinea_disease2 = findViewById(R.id.guineadisease2);
        guinea_disease3 = findViewById(R.id.guineadisease3);
        guinea_disease4 = findViewById(R.id.guineadisease4);
        guinea_disease5 = findViewById(R.id.guineadisease5);
        guinea_disease6 = findViewById(R.id.guineadisease6);

        guinea_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(pp_Guinea_Pig.this, pp_guinea_disease.class);
                Intent pig = new Intent(pp_Guinea_Pig.this, pp_guinea_disease.class);


                if (gs1.isChecked() && gs2.isChecked() && gs3.isChecked() && gs4.isChecked() && gs5.isChecked()) {

                    // Respiratory Infections

                    g.putExtra("gs1", gs1.isChecked());
                    g.putExtra("gs2", gs2.isChecked());
                    g.putExtra("gs3", gs3.isChecked());
                    g.putExtra("gs4", gs4.isChecked());
                    g.putExtra("gs5", gs5.isChecked());
                    startActivity(g);

                } else if (gs2.isChecked() && gs6.isChecked() && gs7.isChecked() && gs8.isChecked() && gs9.isChecked()) {

                    // Diarrhea

                    g.putExtra("gs2", gs2.isChecked());
                    g.putExtra("gs6", gs6.isChecked());
                    g.putExtra("gs7", gs7.isChecked());
                    g.putExtra("gs8", gs8.isChecked());
                    g.putExtra("gs9", gs9.isChecked());
                    startActivity(g);

                } else if (gs6.isChecked() && gs11.isChecked() && gs12.isChecked() && gs13.isChecked() && gs14.isChecked()) {

                    // Scurvy (Vitamin C defficiency)

                    g.putExtra("gs6", gs6.isChecked());
                    g.putExtra("gs11", gs11.isChecked());
                    g.putExtra("gs12", gs12.isChecked());
                    g.putExtra("gs13", gs13.isChecked());
                    g.putExtra("gs14", gs14.isChecked());
                    startActivity(g);

                } else if (gs6.isChecked() && gs15.isChecked() && gs16.isChecked() && gs17.isChecked() && gs18.isChecked()) {

                    // Abscess

                    g.putExtra("gs6", gs6.isChecked());
                    g.putExtra("gs15", gs15.isChecked());
                    g.putExtra("gs16", gs16.isChecked());
                    g.putExtra("gs17", gs17.isChecked());
                    g.putExtra("gs18", gs18.isChecked());
                    startActivity(g);

                } else if (gs6.isChecked() && gs7.isChecked() && gs8.isChecked()) {

                    // Urinary Problems

                    g.putExtra("gs6", gs6.isChecked());
                    g.putExtra("gs7", gs7.isChecked());
                    g.putExtra("gs8", gs8.isChecked());
                    startActivity(g);

                } else if (gs6.isChecked() && gs14.isChecked() && gs15.isChecked() && gs19.isChecked()) {

                    // Bumblefoot

                    g.putExtra("gs6", gs6.isChecked());
                    g.putExtra("gs14", gs14.isChecked());
                    g.putExtra("gs15", gs15.isChecked());
                    g.putExtra("gs19", gs19.isChecked());
                    startActivity(g);

                } else if (gs1.isChecked()) {

                    pig.putExtra("gs1", gs1.isChecked());

                    if (gs2.isChecked()) {

                        pig.putExtra("gs2", gs2.isChecked());

                    }
                    if (gs6.isChecked()) {

                        pig.putExtra("gs6", gs6.isChecked());

                    }
                    if (gs7.isChecked()) {

                        pig.putExtra("gs7", gs7.isChecked());

                    }
                    if (gs8.isChecked()) {

                        pig.putExtra("gs8", gs8.isChecked());

                    }
                    if (gs9.isChecked()) {

                        pig.putExtra("gs9", gs9.isChecked());

                    }
                    if (gs10.isChecked()) {

                        pig.putExtra("gs10", gs10.isChecked());

                    }
                    if (gs11.isChecked()) {

                        pig.putExtra("gs11", gs11.isChecked());

                    }
                    if (gs12.isChecked()) {

                        pig.putExtra("gs12", gs12.isChecked());

                    }
                    if (gs13.isChecked()) {

                        pig.putExtra("gs13", gs13.isChecked());

                    }
                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs2.isChecked()) {

                    pig.putExtra("gs2", gs2.isChecked());

                    if (gs6.isChecked()) {

                        pig.putExtra("gs6", gs6.isChecked());

                    }
                    if (gs7.isChecked()) {

                        pig.putExtra("gs7", gs7.isChecked());

                    }
                    if (gs8.isChecked()) {

                        pig.putExtra("gs8", gs8.isChecked());

                    }
                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs3.isChecked()) {

                    pig.putExtra("gs3", gs3.isChecked());

                    if (gs6.isChecked()) {

                        pig.putExtra("gs6", gs6.isChecked());

                    }
                    if (gs7.isChecked()) {

                        pig.putExtra("gs7", gs7.isChecked());

                    }
                    if (gs8.isChecked()) {

                        pig.putExtra("gs8", gs8.isChecked());

                    }
                    if (gs9.isChecked()) {

                        pig.putExtra("gs9", gs9.isChecked());

                    }
                    if (gs10.isChecked()) {

                        pig.putExtra("gs10", gs10.isChecked());

                    }
                    if (gs11.isChecked()) {

                        pig.putExtra("gs11", gs11.isChecked());

                    }
                    if (gs12.isChecked()) {

                        pig.putExtra("gs12", gs12.isChecked());

                    }
                    if (gs13.isChecked()) {

                        pig.putExtra("gs13", gs13.isChecked());

                    }
                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs4.isChecked()) {

                    pig.putExtra("gs4", gs4.isChecked());

                    if (gs6.isChecked()) {

                        pig.putExtra("gs6", gs6.isChecked());

                    }
                    if (gs7.isChecked()) {

                        pig.putExtra("gs7", gs7.isChecked());

                    }
                    if (gs8.isChecked()) {

                        pig.putExtra("gs8", gs8.isChecked());

                    }
                    if (gs9.isChecked()) {

                        pig.putExtra("gs9", gs9.isChecked());

                    }
                    if (gs10.isChecked()) {

                        pig.putExtra("gs10", gs10.isChecked());

                    }
                    if (gs11.isChecked()) {

                        pig.putExtra("gs11", gs11.isChecked());

                    }
                    if (gs12.isChecked()) {

                        pig.putExtra("gs12", gs12.isChecked());

                    }
                    if (gs13.isChecked()) {

                        pig.putExtra("gs13", gs13.isChecked());

                    }
                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs5.isChecked()) {

                    pig.putExtra("gs5", gs5.isChecked());

                    if (gs6.isChecked()) {

                        pig.putExtra("gs6", gs6.isChecked());

                    }
                    if (gs7.isChecked()) {

                        pig.putExtra("gs7", gs7.isChecked());

                    }
                    if (gs8.isChecked()) {

                        pig.putExtra("gs8", gs8.isChecked());

                    }
                    if (gs9.isChecked()) {

                        pig.putExtra("gs9", gs9.isChecked());

                    }
                    if (gs10.isChecked()) {

                        pig.putExtra("gs10", gs10.isChecked());

                    }
                    if (gs11.isChecked()) {

                        pig.putExtra("gs11", gs11.isChecked());

                    }
                    if (gs12.isChecked()) {

                        pig.putExtra("gs12", gs12.isChecked());

                    }
                    if (gs13.isChecked()) {

                        pig.putExtra("gs13", gs13.isChecked());

                    }
                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs6.isChecked()) {

                    pig.putExtra("gs6", gs6.isChecked());
                    startActivity(pig);

                } else if (gs7.isChecked()) {

                    pig.putExtra("gs7", gs7.isChecked());

                    if (gs11.isChecked()) {

                        pig.putExtra("gs11", gs11.isChecked());

                    }
                    if (gs12.isChecked()) {

                        pig.putExtra("gs12", gs12.isChecked());

                    }
                    if (gs13.isChecked()) {

                        pig.putExtra("gs13", gs13.isChecked());

                    }
                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs8.isChecked()) {

                    pig.putExtra("gs8", gs8.isChecked());

                    if (gs11.isChecked()) {

                        pig.putExtra("gs11", gs11.isChecked());

                    }
                    if (gs12.isChecked()) {

                        pig.putExtra("gs12", gs12.isChecked());

                    }
                    if (gs13.isChecked()) {

                        pig.putExtra("gs13", gs13.isChecked());

                    }
                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs9.isChecked()) {

                    pig.putExtra("gs9", gs9.isChecked());

                    if (gs11.isChecked()) {

                        pig.putExtra("gs11", gs11.isChecked());

                    }
                    if (gs12.isChecked()) {

                        pig.putExtra("gs12", gs12.isChecked());

                    }
                    if (gs13.isChecked()) {

                        pig.putExtra("gs13", gs13.isChecked());

                    }
                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs10.isChecked()) {

                    pig.putExtra("gs10", gs10.isChecked());

                    if (gs11.isChecked()) {

                        pig.putExtra("gs11", gs11.isChecked());

                    }
                    if (gs12.isChecked()) {

                        pig.putExtra("gs12", gs12.isChecked());

                    }
                    if (gs13.isChecked()) {

                        pig.putExtra("gs13", gs13.isChecked());

                    }
                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs11.isChecked()) {

                    pig.putExtra("gs11", gs11.isChecked());

                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs12.isChecked()) {

                    pig.putExtra("gs12", gs12.isChecked());

                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs13.isChecked()) {

                    pig.putExtra("gs13", gs13.isChecked());

                    if (gs14.isChecked()) {

                        pig.putExtra("gs14", gs14.isChecked());

                    }
                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs14.isChecked()) {

                    pig.putExtra("gs14", gs14.isChecked());

                    if (gs15.isChecked()) {

                        pig.putExtra("gs15", gs15.isChecked());

                    }
                    if (gs16.isChecked()) {

                        pig.putExtra("gs16", gs16.isChecked());

                    }
                    if (gs17.isChecked()) {

                        pig.putExtra("gs17", gs17.isChecked());

                    }
                    if (gs18.isChecked()) {

                        pig.putExtra("gs18", gs18.isChecked());

                    }
                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs15.isChecked()) {

                    pig.putExtra("gs15", gs15.isChecked());
                    startActivity(pig);

                } else if (gs16.isChecked()) {

                    pig.putExtra("gs16", gs16.isChecked());

                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs17.isChecked()) {

                    pig.putExtra("gs17", gs17.isChecked());

                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs18.isChecked()) {

                    pig.putExtra("gs18", gs18.isChecked());

                    if (gs19.isChecked()) {

                        pig.putExtra("gs19", gs19.isChecked());

                    }

                    startActivity(pig);

                } else if (gs19.isChecked()) {

                    pig.putExtra("gs19", gs19.isChecked());
                    startActivity(pig);

                }
            }
        });


    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}