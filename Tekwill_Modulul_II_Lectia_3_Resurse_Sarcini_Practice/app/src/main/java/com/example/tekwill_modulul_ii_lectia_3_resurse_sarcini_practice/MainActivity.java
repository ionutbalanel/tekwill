package com.example.tekwill_modulul_ii_lectia_3_resurse_sarcini_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=findViewById(R.id.textView1);
    }

    public void afiseazaMesaj(View view) {
        t.setText(R.string.mesaje);
    }
}