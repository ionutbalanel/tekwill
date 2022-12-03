package com.example.tekwill_modulul_ii_lectia_6_interaciunea_fragmente_activiti;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class SecondFragment extends Fragment {
    View view;
    Button secondButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// încărcăm layout-ul pentru acest fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
// obținem referința la Button
        secondButton = (Button) view.findViewById(R.id.secondButton);
// efectuăm setOnClickListener pe primul buton
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// afișăm un mesaj
                Toast.makeText(getActivity(), "Second Fragment", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
