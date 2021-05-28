package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        final int[] count = {0};

        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonPoint = (Button) findViewById(R.id.buttonPoint);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonMulti = (Button) findViewById(R.id.buttonMulti);
        Button buttonSum = (Button) findViewById(R.id.buttonSum);
        Button buttonDiv = (Button) findViewById(R.id.buttonDivision);
        Button buttonBracket = (Button) findViewById(R.id.buttonBracket);
        Button buttonClean = findViewById(R.id.buttonClean);
        Button buttonEqual = (Button) findViewById(R.id.buttonEqual);
        TextView text = (TextView) findViewById(R.id.text);

        button0.setOnClickListener(v -> {
            int a = 0;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        button1.setOnClickListener(v -> {
            int a = 1;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        button2.setOnClickListener(v -> {
            int a = 2;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        button3.setOnClickListener(v -> {
            int a = 3;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        button4.setOnClickListener(v -> {
            int a = 4;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        button5.setOnClickListener(v -> {
            int a = 5;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        button6.setOnClickListener(v -> {
            int a = 6;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        button7.setOnClickListener(v -> {
            int a = 7;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        button8.setOnClickListener(v -> {
            int a = 8;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        button9.setOnClickListener(v -> {
            int a = 9;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
        });

        buttonPoint.setOnClickListener(v -> {
            String a = ".";
            text.setText(text.getText() + a);
        });

        buttonSum.setOnClickListener(v -> {
            String a = "+";
            text.setText(text.getText() + a);
        });

        buttonDiv.setOnClickListener(v -> {
            String a = "/";
            text.setText(text.getText() + a);
        });

        buttonMinus.setOnClickListener(v -> {
            String a = "-";
            text.setText(text.getText() + a);
        });

        buttonMulti.setOnClickListener(v -> {
            String a = "*";
            text.setText(text.getText() + a);
        });

        buttonBracket.setOnClickListener(v -> {
            String a = "(";
            String b = ")";

            if (count[0] == 0){
            text.setText(text.getText() + a);
            count[0]++;
            }
            else{
                text.setText(text.getText() + b);
                count[0]--;
            }
        });

        buttonEqual.setOnClickListener(v -> {
        CalcOperations operations = new CalcOperations();
        String a = (String) text.getText();
        operations.add(a);
        text.setText(null);
        });

        buttonClean.setOnClickListener(v -> text.setText(null));
    }
}