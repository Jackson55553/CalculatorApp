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
        Button button17 = (Button) findViewById(R.id.button1);
        Button button12 = findViewById(R.id.buttonClean);
        TextView text = (TextView) findViewById(R.id.text);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int a = 1;
            text.setText(text.getText() + String.format(Locale.getDefault(), "%d", a));
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(null);
            }
        });

    }


}