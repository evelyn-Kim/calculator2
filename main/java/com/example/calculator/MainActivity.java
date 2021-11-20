package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText EditText_show;
    EditText EditText_result;

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    Button button_plus;
    Button button_minus;
    Button button_div;
    Button button_mul;
    Button button_C;
    Button button_equ;

    private int where = 0;
    private int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText_show = findViewById(R.id.EditText_show);
        EditText_result = findViewById(R.id.EditText_result);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        button_C = findViewById(R.id.button_C);
        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        button_div = findViewById(R.id.button_div);
        button_mul = findViewById(R.id.button_mul);
        button_equ = findViewById(R.id.button_equ);

        button0.setOnClickListener(cl);
        button1.setOnClickListener(cl);
        button2.setOnClickListener(cl);
        button3.setOnClickListener(cl);
        button4.setOnClickListener(cl);
        button5.setOnClickListener(cl);
        button6.setOnClickListener(cl);
        button7.setOnClickListener(cl);
        button8.setOnClickListener(cl);
        button9.setOnClickListener(cl);
        button_C.setOnClickListener(cl);
        button_plus.setOnClickListener(cl);
        button_minus.setOnClickListener(cl);
        button_div.setOnClickListener(cl);
        button_mul.setOnClickListener(cl);
        button_equ.setOnClickListener(cl);

    }

    Button.OnClickListener cl = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view == button0) {
                EditText_show.append("0");
                EditText_result.setText(EditText_result.getText().toString() + "0");
            } else if (view == button1) {
                EditText_show.append("1");
                EditText_result.setText(EditText_result.getText().toString() + "1");
            } else if (view == button2) {
                EditText_show.append("2");
                EditText_result.setText(EditText_result.getText().toString() + "2");
            } else if (view == button3) {
                EditText_show.append("3");
                EditText_result.setText(EditText_result.getText().toString() + "3");
            } else if (view == button4) {
                EditText_show.append("4");
                EditText_result.setText(EditText_result.getText().toString() + "4");
            } else if (view == button5) {
                EditText_show.append("5");
                EditText_result.setText(EditText_result.getText().toString() + "5");
            } else if (view == button6) {
                EditText_show.append("6");
                EditText_result.setText(EditText_result.getText().toString() + "6");
            } else if (view == button7) {
                EditText_show.append("7");
                EditText_result.setText(EditText_result.getText().toString() + "7");
            } else if (view == button8) {
                EditText_show.append("8");
                EditText_result.setText(EditText_result.getText().toString() + "8");
            } else if (view == button9) {
                EditText_show.append("9");
                EditText_result.setText(EditText_result.getText().toString() + "9");
            } else if (view == button_C) {
                EditText_show.setText("");
                EditText_result.setText("");
            } else if (view == button_plus) {
                a = Integer.valueOf(EditText_result.getText().toString().trim());
                EditText_show.append("+");
                EditText_result.setText("");
                where = 1;
            } else if (view == button_minus) {
                a = Integer.valueOf(EditText_result.getText().toString().trim());
                EditText_show.append("-");
                EditText_result.setText("");
                where = 2;
            } else if (view == button_div) {
                a = Integer.valueOf(EditText_show.getText().toString().trim());
                EditText_show.append("÷");
                EditText_result.setText("");
                where = 3;
            } else if (view == button_mul) {
                a = Integer.valueOf(EditText_show.getText().toString().trim());
                EditText_show.append("×");
                EditText_result.setText("");
                where = 4;
            } else if (view == button_equ) {
                if (where == 1) {
                    a = a + Integer.valueOf(EditText_result.getText().toString().trim());
                    EditText_result.setText(Integer.toString(a));
                } else if (where == 2) {
                    a = a - Integer.valueOf(EditText_result.getText().toString().trim());
                    EditText_result.setText(Integer.toString(a));
                } else if (where == 3) {
                    a = a / Integer.valueOf(EditText_result.getText().toString().trim());
                    EditText_result.setText(Integer.toString(a));
                } else if (where == 4) {
                    a = a * Integer.valueOf(EditText_result.getText().toString().trim());
                    EditText_result.setText(Integer.toString(a));
                }
            }
        }
    };
}