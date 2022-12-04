package com.example.tekwill_modulul_ii_lectia_7_intentie_explicita_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText caseta1;
    EditText caseta2;
    Button trimite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caseta1 = findViewById(R.id.editText1);
        caseta2 = findViewById(R.id.editText2);
        trimite = findViewById(R.id.button1);

        trimite.setOnClickListener(view -> {
            String string1 = caseta1.getText().toString();
            String string2 = caseta2.getText().toString();

            Intent it = new Intent(MainActivity.this,SecondActivity.class);
            it.putExtra("utilizator",string1);
            it.putExtra("parola",string2);
            startActivity(it);
        });
    }
}