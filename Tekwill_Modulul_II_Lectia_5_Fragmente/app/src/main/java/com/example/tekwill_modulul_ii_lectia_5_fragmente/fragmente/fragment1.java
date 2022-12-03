package com.example.tekwill_modulul_ii_lectia_5_fragmente.fragmente;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tekwill_modulul_ii_lectia_5_fragmente.R;

public class fragment1 extends Fragment {
    //Definim fișierul XML al primului fragment
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }

}
