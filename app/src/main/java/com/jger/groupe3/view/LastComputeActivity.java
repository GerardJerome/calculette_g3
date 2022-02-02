package com.jger.groupe3.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.jger.groupe3.R;

public class LastComputeActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_compute);
        Button boutonPrecedent = findViewById(R.id.boutonPrecedent);
        TextView textViewCalcul = findViewById(R.id.lastCompute_textViewCalcul);
        Integer premierElement = getIntent().getIntExtra("premierElement",0);
        Integer deuxiemeElement = getIntent().getIntExtra("deuxiemeElement",0);
        String symbol = getIntent().getStringExtra("symbol");
        Double resultat = getIntent().getDoubleExtra("resultat",0.0);
        if(symbol!=null){
            textViewCalcul.setText(premierElement
                    +" "
                    +symbol
                    +" "
                    +deuxiemeElement
                    +" = "
                    +resultat);
        }else{
            textViewCalcul.setText("");
        }

        boutonPrecedent.setOnClickListener(view -> finish());
    }
}