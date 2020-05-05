package com.semihoksuzoglu.colculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        resultText = (TextView) findViewById(R.id.textView);
    }

    public void sum(View view) {
        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {
            resultText.setText("Eksik değer girdiniz..");
        } else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            resultText.setText("Result: " + (a + b));
        }

    }

    public void deduct(View view) {
        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {
            resultText.setText("Eksik değer girdiniz..");
        } else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            resultText.setText("Result: " + (a - b));
        }
    }

    public void multiply(View view) {
        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {
            resultText.setText("Eksik değer girdiniz..");
        } else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            resultText.setText("Result: " + (a * b));
        }
    }

    public void divide(View view) {
        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")) {
            resultText.setText("Eksik değer girdiniz..");
        } else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            resultText.setText("Result: " + (a / b));
        }
    }
}
