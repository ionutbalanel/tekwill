package com.example.tekwill_modulul_ii_lectia_7_intentii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(getApplicationContext(), "Suntem direcționați către a doua activitate",Toast.LENGTH_LONG).show();
    }
}