package com.example.basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    int num1, num2;
    String operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        num1 = getIntent().getIntExtra("num1", 0);
        num2 = getIntent().getIntExtra("num2", 0);
        TextView resultText = (TextView)findViewById(R.id.result);
        operator = getIntent().getStringExtra("operator");
        float result = calculate(num1, num2, operator);
        resultText.setText(String.valueOf(result));

    }

    public float calculate(float num1, float num2, String operator) {
        switch(operator) {
            case "+" :
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
            default:
                return 0;

        }
    }
}