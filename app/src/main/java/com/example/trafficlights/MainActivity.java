package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button stopButton;
    private Button goButton;
    private Button waitButton;
    private ImageView redLight;
    private ImageView greenLight;
    private ImageView yellowLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        registerChangeListener();

    }

    private void initialize(){
        stopButton = findViewById(R.id.btn_red_stop);
        goButton = findViewById(R.id.btn_green_go);
        waitButton = findViewById(R.id.btn_yellow_wait);
        redLight = findViewById(R.id.iv_red_light);
        greenLight = findViewById(R.id.iv_green_light);
        yellowLight = findViewById(R.id.iv_yellow_light);
    }

    private void registerChangeListener(){
        stopButton.setOnClickListener(stopButtonListener);
        goButton.setOnClickListener(goButtonListener);
        waitButton.setOnClickListener(waitButtonListener);
    }

    private View.OnClickListener stopButtonListener = new View.OnClickListener(){
        public void onClick(View v){
            goButton.setVisibility(View.VISIBLE);
            stopButton.setVisibility(View.INVISIBLE);
            waitButton.setVisibility(View.INVISIBLE);
            greenLight.setVisibility(View.VISIBLE);
            redLight.setVisibility(View.INVISIBLE);
            yellowLight.setVisibility(View.INVISIBLE);
        }
    };

    private View.OnClickListener goButtonListener = new View.OnClickListener(){
        public void onClick(View v){
            goButton.setVisibility(View.INVISIBLE);
            stopButton.setVisibility(View.INVISIBLE);
            waitButton.setVisibility(View.VISIBLE);
            greenLight.setVisibility(View.INVISIBLE);
            redLight.setVisibility(View.INVISIBLE);
            yellowLight.setVisibility(View.VISIBLE);
        }
    };

    private View.OnClickListener waitButtonListener = new View.OnClickListener(){
        public void onClick(View v){
            goButton.setVisibility(View.INVISIBLE);
            stopButton.setVisibility(View.VISIBLE);
            waitButton.setVisibility(View.INVISIBLE);
            greenLight.setVisibility(View.INVISIBLE);
            redLight.setVisibility(View.VISIBLE);
            yellowLight.setVisibility(View.INVISIBLE);
        }
    };
}