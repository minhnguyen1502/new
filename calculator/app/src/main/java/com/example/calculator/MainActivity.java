package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnAdd, btnSub, btnDiv, btnMul, btnC, btnEqual;
    EditText resultEdt, valueEdt;
    float value_1, value_2;
    boolean isAddition, isSubtraction, isMultiplication, isDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText(valueEdt.getText() + "0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_1 = Float.parseFloat(valueEdt.getText() + "");
                isAddition = true;
                valueEdt.setText(null);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_1 = Float.parseFloat(valueEdt.getText() + "");
                isSubtraction = true;
                valueEdt.setText(null);

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_1 = Float.parseFloat(valueEdt.getText() + "");
                isMultiplication = true;
                valueEdt.setText(null);

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_1 = Float.parseFloat(valueEdt.getText() + "");
                isDivision = true;
                valueEdt.setText(null);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_2 = Float.parseFloat(valueEdt.getText() + "");
                if (isAddition) {
                    resultEdt.setText(value_1 + value_2 + "");
                    isAddition = false;
                }
                if (isSubtraction) {
                    resultEdt.setText(value_1 - value_2 + "");
                    isSubtraction = false;
                }
                if (isMultiplication) {
                    resultEdt.setText(value_1 * value_2 + "");
                    isMultiplication = false;
                }
                if (isDivision) {
                    resultEdt.setText(value_1 / value_2 + "");
                    isDivision = false;
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt.setText("");
                resultEdt.setText("");
            }
        });
    }

    public void setup(){
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnAdd = findViewById(R.id.btn_plus);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnC = findViewById(R.id.btn_C);
        btnEqual = findViewById(R.id.btn_eql);
        valueEdt = findViewById(R.id.edt_value);
        resultEdt = findViewById(R.id.edt_result);
    }
}