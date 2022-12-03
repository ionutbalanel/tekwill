package com.example.tekwill_modulul_ii_lectia_6_interaciunea_fragmente_activiti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // obținem referință la Button
        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondFragment);

    // creăm evenimentul setOnClickListener pe primul buton
        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
    // încărcăm primul fragment
                loadFragment(new FirstFragment());
            }
        });
    // creăm evenimentul setOnClickListener pe al doilea buton
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
    // încărcăm fragmentul al doilea
                loadFragment(new SecondFragment());
            }
        });
    }

    private void loadFragment(Fragment fragment) {
    // creăm un FragmentManager
        FragmentManager fm = getFragmentManager();
    // creăm un FragmentTransaction pentru a începe tranzacția și înlocuim Fragmentul
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
    // înlocuim FrameLayout cu un fragment nou
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // salvarea modificărilor
    }

}