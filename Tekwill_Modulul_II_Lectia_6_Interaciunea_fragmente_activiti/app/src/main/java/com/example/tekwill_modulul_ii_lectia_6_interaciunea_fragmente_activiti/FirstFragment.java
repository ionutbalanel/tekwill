package com.example.tekwill_modulul_ii_lectia_6_interaciunea_fragmente_activiti;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FirstFragment extends Fragment {
    View view;
    Button firstButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Încărcăm layout-ul pentru acest fragment
        view = inflater.inflate(R.layout.fragment_first, container, false);
// obținem referința la Button
        firstButton = (Button) view.findViewById(R.id.firstButton);
// efectuăm setOnClickListener pe primul buton
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// afișăm un mesaj
                Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
