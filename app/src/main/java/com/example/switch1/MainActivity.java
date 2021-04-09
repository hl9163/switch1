package com.example.switch1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch sw;

    RadioButton rd1;
    RadioButton rd2;
    RadioButton rd3;
    RadioButton rd4;
    LinearLayout ly;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = (Switch) findViewById(R.id.sw1);

        rd1 = (RadioButton) findViewById(R.id.radioButton);
        rd2 = (RadioButton) findViewById(R.id.radioButton2);
        rd3 = (RadioButton) findViewById(R.id.radioButton3);
        rd4 = (RadioButton) findViewById(R.id.radioButton4);
        ly =  (LinearLayout) findViewById(R.id.ly);
    }

    public void go(View view) {
        if (sw.isChecked()){
            if (rd1.isChecked()){
                ly.setBackgroundColor(Color.GREEN);
            }
            else if(rd2.isChecked()){
                ly.setBackgroundColor(Color.BLUE);
            }
            else if(rd3.isChecked()){
                ly.setBackgroundColor(Color.RED);
            }
            else if(rd4.isChecked()){
                ly.setBackgroundColor(Color.YELLOW);
            }
        }
        else{
            if (rd1.isChecked()){
                ly.setBackgroundColor(Color.BLUE);
            }
            else if(rd2.isChecked()){
                ly.setBackgroundColor(Color.GREEN);
            }
            else if(rd3.isChecked()){
                ly.setBackgroundColor(Color.YELLOW);
            }
            else if(rd4.isChecked()){
                ly.setBackgroundColor(Color.RED);
            }
        }
    }
}