package com.jger.groupe3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boutonCalculer = findViewById(R.id.bouton_calculer);
        Button boutonLastCompute = findViewById(R.id.boutonDernierCalcul);
        boutonCalculer.setOnClickListener(view -> lanceActiviteCalculer());
        boutonLastCompute.setOnClickListener(view -> lanceDernierCalcul() );

    }

    private void lanceDernierCalcul() {
        Intent i = new Intent(this,LastComputeActivity.class);
        startActivity(i);
    }

    private void lanceActiviteCalculer() {
        Intent i = new Intent(this,CalculActivity.class);
        startActivity(i);
    }
}