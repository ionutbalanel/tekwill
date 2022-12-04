package com.example.tekwill_modulul_ii_lectia_7_intentie_explicita_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView eticheta1;
    TextView eticheta2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        eticheta1 = findViewById(R.id.textView1);
        eticheta2 = findViewById(R.id.textView2);

        eticheta1.setText(getIntent().getExtras().getString("utilizator"));
        eticheta2.setText(getIntent().getExtras().getString("parola"));
    }
}