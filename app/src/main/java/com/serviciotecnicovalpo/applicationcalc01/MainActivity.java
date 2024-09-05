package com.serviciotecnicovalpo.applicationcalc01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText number1, number2;
    private TextView result;
    private Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.numero1);
        number2 = findViewById(R.id.numero2);
        result = findViewById(R.id.Resultado);
        buttonAdd = findViewById(R.id.buttonSumar);
        buttonSubtract = findViewById(R.id.buttonRestar);
        buttonMultiply = findViewById(R.id.buttonMultiplicar);
        buttonDivide = findViewById(R.id.buttonDividir);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int sum = num1 + num2;
                result.setText("Resultado: " + sum);
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int difference = num1 - num2;
                result.setText("Resultado: " + difference);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int product = num1 * num2;
                result.setText("Resultado: " + product);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                if (num2 != 0) {
                    int quotient = num1 / num2;
                    result.setText("Resultado: " + quotient);
                } else {
                    result.setText("Error: División por cero");
                }
            }
        });
    }
}

