package com.example.siddharth.berkeleyadmissionquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetupNumbers();
    }

    private void SetupNumbers() {
        TextView scoreTextView = (TextView) findViewById(R.id.score);
        scoreTextView.setText("Score: " + String.valueOf(score));

        Random randy = new Random();
        do{
            num1 = randy.nextInt(10);
            num2 = randy.nextInt(10);
        } while(num1 != num2);

        Button leftButton = (Button) findViewById(R.id.left_button);
        Button rightButton = (Button) findViewById(R.id.right_button);

        leftButton.setText(String.valueOf(num1));
        rightButton.setText(String.valueOf(num2));
    }


    public void ButtonClick(View view) {
        if((view.getId() == R.id.left_button && num1 > num2) || (view.getId() == R.id.right_button && num2 > num1)) {
            score++;
        } else {
            score--;
        }
        SetupNumbers();
    }
}
