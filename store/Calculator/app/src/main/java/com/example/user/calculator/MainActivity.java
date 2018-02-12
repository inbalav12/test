package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvScreen;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btnPlus, btnMinus, btnMult,
            btnDiv, btnEqual, btnClear, btnPowe, btnSin, btnCos, btnTan;
    private char op;
    private double lastAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScreen = (TextView) findViewById(R.id.tvScreen);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnPowe = (Button) findViewById(R.id.btnPowe);
        btnSin = (Button) findViewById(R.id.btnSin);
        btnCos = (Button) findViewById(R.id.btnCos);
        btnTan = (Button) findViewById(R.id.btnTan);
        op = '?';
        tvScreen.setText(0);
        lastAns=0;
    }
    public void click0(View view) {
        if (op != '?') {
            lastAns = Double.parseDouble(tvScreen.getText().toString());
            tvScreen.setText(String.valueOf(0));
        } else {
            double x = Double.parseDouble(tvScreen.getText().toString());
            x = x * 10 + 0;
            tvScreen.setText(String.valueOf(x));
        }
    }
    public void click1(View view) {
        if (op != '?') {
            lastAns = Double.parseDouble(tvScreen.getText().toString());
            tvScreen.setText(String.valueOf(1));
        } else {
            double x = Double.parseDouble(tvScreen.getText().toString());
            x = x * 10 + 1;
            tvScreen.setText(String.valueOf(x));
        }
    }
    public void click2(View view) {
        if (op != '?') {
            lastAns = Double.parseDouble(tvScreen.getText().toString());
            tvScreen.setText(String.valueOf(2));
        } else {
            double x = Double.parseDouble(tvScreen.getText().toString());
            x = x * 10 + 2;
            tvScreen.setText(String.valueOf(x));
        }
    }
    public void click3(View view) {
        if (op != '?') {
            lastAns = Double.parseDouble(tvScreen.getText().toString());
            tvScreen.setText(String.valueOf(3));
        } else {
            double x = Double.parseDouble(tvScreen.getText().toString());
            x = x * 10 + 3;
            tvScreen.setText(String.valueOf(x));
        }
    }
    public void click4(View view) {
        if (op != '?') {
            lastAns = Double.parseDouble(tvScreen.getText().toString());
            tvScreen.setText(String.valueOf(4));
        } else {
            double x = Double.parseDouble(tvScreen.getText().toString());
            x = x * 10 + 4;
            tvScreen.setText(String.valueOf(x));
        }
    }
    public void click5(View view) {
        if (op != '?') {
            lastAns = Double.parseDouble(tvScreen.getText().toString());
            tvScreen.setText(String.valueOf(5));
        } else {
            double x = Double.parseDouble(tvScreen.getText().toString());
            x = x * 10 + 5;
            tvScreen.setText(String.valueOf(x));
        }
    }

    public void click6(View view) {
        if (op != '?') {
            lastAns = Double.parseDouble(tvScreen.getText().toString());
            tvScreen.setText(String.valueOf(6));
        } else {
            double x = Double.parseDouble(tvScreen.getText().toString());
            x = x * 10 + 6;
            tvScreen.setText(String.valueOf(x));
        }
    }
    public void click7(View view) {
        if (op != '?') {
            lastAns = Double.parseDouble(tvScreen.getText().toString());
            tvScreen.setText(String.valueOf(7));
        } else {
            double x = Double.parseDouble(tvScreen.getText().toString());
            x = x * 10 + 7;
            tvScreen.setText(String.valueOf(x));
        }
    }
    public void click8(View view){
            if (op != '?') {
                lastAns = Double.parseDouble(tvScreen.getText().toString());
                tvScreen.setText(String.valueOf(8));
            } else {
                double x = Double.parseDouble(tvScreen.getText().toString());
                x = x * 10 + 8;
                tvScreen.setText(String.valueOf(x));
            }
        }

        public void click9 (View view){
            if (op != '?') {
                lastAns = Double.parseDouble(tvScreen.getText().toString());
                tvScreen.setText(String.valueOf(9));
            } else {
                double x = Double.parseDouble(tvScreen.getText().toString());
                x = x * 10 + 9;
                tvScreen.setText(String.valueOf(x));
            }
        }


        public void clickPlus (View view){
            op = '+';
        }


        public void clickMinus (View view){
            op = '-';
        }


        public void clickMult (View view){
            op='*';
        }


        public void clickDiv (View view){
            op='/';
        }


        public void clickEqual (View view){
            if (op == '+')
            {
                double x = lastAns + Double.parseDouble(tvScreen.getText().toString());
                tvScreen.setText(String.valueOf(x));
                op = '?';
            }
            else if (op =='-')
            {
                double x = lastAns - Double.parseDouble(tvScreen.getText().toString());
                tvScreen.setText(String.valueOf(x));
                op = '?';
            }
            else if (op =='*')
            {
                double x = lastAns * Double.parseDouble(tvScreen.getText().toString());
                tvScreen.setText(String.valueOf(x));
                op = '?';
            }
            else if (op =='/')
            {
                double y = Double.parseDouble(tvScreen.getText().toString());
                if (y != 0)
                {
                    double x = lastAns / Double.parseDouble(tvScreen.getText().toString());
                    tvScreen.setText(String.valueOf(x));
                    op = '?';
                }
                else
                {
                    Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
                }
            }
        }


        public void clickPowe(View view) { op='^'; }


        public void clickClear(View view) {
            op = '?';
            tvScreen.setText(String.valueOf(0));
            lastAns = 0;
        }


}
