package com.jger.groupe3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class LastComputeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_compute);
        Button boutonPrecedent = findViewById(R.id.boutonPrecedent);
        boutonPrecedent.setOnClickListener(view -> finish());
    }
}