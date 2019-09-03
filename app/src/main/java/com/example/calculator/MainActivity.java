package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtBox;
    private int number1, number2;
    private float result;
    private String oper;
    private String currentNumber = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtBox = (EditText) findViewById(R.id.edt01);
        edtBox.setText("0");
    }

    public void onClickButton1(View view){
        currentNumber = currentNumber + "1";
        edtBox.setText(currentNumber);
    }
    public void onClickButton2(View view){
        currentNumber = currentNumber + "2";
        edtBox.setText(currentNumber);
    }
    public void onClickButton3(View view){
        currentNumber = currentNumber + "3";
        edtBox.setText(currentNumber);
    }
    public void onClickButton4(View view){
        currentNumber = currentNumber + "4";
        edtBox.setText(currentNumber);
    }
    public void onClickButton5(View view){
        currentNumber = currentNumber + "5";
        edtBox.setText(currentNumber);
    }
    public void onClickButton6(View view){
        currentNumber = currentNumber + "6";
        edtBox.setText(currentNumber);
    }
    public void onClickButton7(View view){
        currentNumber = currentNumber + "7";
        edtBox.setText(currentNumber);
    }
    public void onClickButton8(View view){
        currentNumber = currentNumber + "8";
        edtBox.setText(currentNumber);
    }
    public void onClickButton9(View view){
        currentNumber = currentNumber + "9";
        edtBox.setText(currentNumber);
    }
    public void onClickButton0(View view){
        currentNumber = currentNumber + "0";
        edtBox.setText(currentNumber);
    }
    public void onClickButtonPlus(View view){
        number1 = Integer.parseInt(currentNumber);
        currentNumber = "0";
        oper = "+";
        edtBox.setText("");
    }

    public void onClickButtonMinus(View view){
        number1 = Integer.parseInt(currentNumber);
        currentNumber = "0";
        oper = "-";
        edtBox.setText("");
    }

    public void onClickButtonMul(View view){
        number1 = Integer.parseInt(currentNumber);
        currentNumber = "0";
        oper = "x";
        edtBox.setText("");
    }
    public void onClickButtonDiv(View view){
        number1 = Integer.parseInt(currentNumber);
        currentNumber = "0";
        oper = "/";
        edtBox.setText("");
    }

    public void onClickButtonClear(View view){
        edtBox.setText("");
        number1 = 0;
        number2 = 0;
        currentNumber = "0";
        oper = "";
        result = 0;
    }

    public void onClickEqual(View view){
        number2 = Integer.parseInt(currentNumber);

        switch (oper){
            case "+":
                result = number1 + number2;
                edtBox.setText(Float.toString(result));
                break;
            case "-":
                result = number1 - number2;
                edtBox.setText(Float.toString(result));
                break;
            case "x":
                result = number1 * number2;
                edtBox.setText(Float.toString(result));
                break;
            case "/":
                result = (float) number1 / number2;
                edtBox.setText(Float.toString(result));
                break;
            default:
                result = 0;
                edtBox.setText("");
        }
        number1 = 0;
        number2 = 0;
        currentNumber = "0";
        result = 0;
    }
}
