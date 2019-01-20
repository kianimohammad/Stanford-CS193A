package com.example.tmntapp;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeColor(View view) {
        LinearLayout ll = (LinearLayout) findViewById(R.id.layout);

        if (view.getId() == R.id.radio_red) {
            ll.setBackgroundColor(Color.RED);
        } else if(view.getId() == R.id.radio_blue) {
            ll.setBackgroundColor(Color.BLUE);
        } else {
            ll.setBackgroundColor(Color.GREEN);
        }
    }
}

