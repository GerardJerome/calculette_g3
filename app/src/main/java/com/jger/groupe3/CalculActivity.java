package com.jger.groupe3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class CalculActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar,menu);
        MenuItem toolbarCalculer = menu.findItem(R.id.toolbarCalculer);
        MenuItem toolbarVider = menu.findItem(R.id.toolbarVider);
        toolbarCalculer.setOnMenuItemClickListener(menuItem -> calculResultat());
        toolbarVider.setOnMenuItemClickListener(menuItem -> videTextView());
        return true;
    }

    private boolean videTextView() {
        TextView textViewCalcul = findViewById(R.id.textViewCalcul);
        textViewCalcul.setText("");
        return true;
    }

    private boolean calculResultat() {
        // FAIS LE CALCUL
        ouvreLastComputeActivity();
        return true;
    }

    private void ouvreLastComputeActivity() {
        Intent i = new Intent(this,LastComputeActivity.class);
        startActivity(i);
    }
}