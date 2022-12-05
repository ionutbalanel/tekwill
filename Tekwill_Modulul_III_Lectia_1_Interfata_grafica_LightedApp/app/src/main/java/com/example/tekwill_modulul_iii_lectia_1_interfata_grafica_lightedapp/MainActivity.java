package com.example.tekwill_modulul_iii_lectia_1_interfata_grafica_lightedapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout bgElement = findViewById(R.id.activity_main);
        bgElement.setBackgroundColor(Color.WHITE);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            RelativeLayout bgElement =
                    findViewById(R.id.activity_main);
            int color = ((ColorDrawable)
                    bgElement.getBackground()).getColor();
            if (color == Color.YELLOW) {
                bgElement.setBackgroundColor(Color.GREEN);
            } else {
                bgElement.setBackgroundColor(Color.YELLOW);
            }
        });

    }
}