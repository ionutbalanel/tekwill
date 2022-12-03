package com.example.tekwill_modulul_ii_lectia_3_resurse_exersare_aplicatia_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.ActionBar;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;

import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;


public class MainActivity extends AppCompatActivity {
    private ImageSwitcher imgSwitcher;
    private Button btnViewWindows,btnViewButterfly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        imgSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in));
        imgSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out));
        btnViewWindows = (Button) findViewById(R.id.button2);
        btnViewButterfly = (Button) findViewById(R.id.button);
        imgSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView myView = new ImageView(getApplicationContext());
                myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                myView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.WRAP_CONTENT));
                return myView;
            }
        });
        btnViewWindows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext()
                        , "Vezi mașina",Toast.LENGTH_LONG).show();
                imgSwitcher.setImageResource(R.mipmap.masina);
            }
        });
        btnViewButterfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Vezi profesorul",
                        Toast.LENGTH_LONG).show();
                imgSwitcher.setImageResource(R.mipmap.profesor);
            }
        });
    }
}