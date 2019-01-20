package com.example.tmntapp;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeColor(View view) {
        LinearLayout ll = (LinearLayout) findViewById(R.id.layout);
        String color;

        if (view.getId() == R.id.radio_red) {
            ll.setBackgroundColor(Color.RED);
            color = "Red";
        } else if(view.getId() == R.id.radio_blue) {
            ll.setBackgroundColor(Color.BLUE);
            color = "Blue";
        } else {
            ll.setBackgroundColor(Color.GREEN);
            color = "Green";
        }
        Log.d("Color Switch", "Changed view");
        MakeToast(color);

    }

    public void MakeToast(String text) {
        Toast.makeText(this, "The Color is now: " + text, Toast.LENGTH_LONG).show();
        Log.d("Toast", text + " toast now on screen");
    }
}

