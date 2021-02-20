package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private EditText  result;




    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.ptext1);
        n2 = (EditText) findViewById(R.id.ptext2);
        result = (EditText) findViewById ( R.id.rtext );

    }

    public void btnSub(View view) {
        int number1  = Integer.parseInt(n1.getText().toString());
        int number2 = Integer.parseInt(n2.getText().toString());
        int sum = number1 - number2 ;
       result.setText ( String.valueOf ( sum) );
    }

    public void btnSum(View view) {
        int number1  = Integer.parseInt(n1.getText().toString());
        int number2 = Integer.parseInt(n2.getText().toString());
        int sum = number1  + number2 ;
        result.setText ( String.valueOf (sum) );
    }


    public void btnDev(View view) {
        int number1  = Integer.parseInt(n1.getText().toString());
        int number2 = Integer.parseInt(n2.getText().toString());
        int sum = number1   /  number2 ;
        result.setText ( String.valueOf (sum));
    }


    public void btnMuli(View view) {
        int number1  = Integer.parseInt(n1.getText().toString());
        int number2 = Integer.parseInt(n2.getText().toString());
        int sum = number1  *  number2 ;
        result.setText ( String.valueOf ( sum ));
        }

}