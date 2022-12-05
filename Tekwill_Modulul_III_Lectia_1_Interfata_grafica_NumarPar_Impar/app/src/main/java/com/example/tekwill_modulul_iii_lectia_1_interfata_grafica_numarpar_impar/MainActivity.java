package com.example.tekwill_modulul_iii_lectia_1_interfata_grafica_numarpar_impar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean f = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // In fisierul xml am adaugat android:onClick="afiseaza"
    public void afiseaza(View view) {
        TextView t1 = findViewById(R.id.TextSalut);
        if (f) {
            t1.setText("Ai apasat un numar impar de ori");
        } else {
            t1.setText("Ai apasat un numar par de ori");
        }
        f=!(f);
    }
}