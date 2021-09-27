package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void plus(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String str1 = myTextField.getText().toString();

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str2 = myTextField2.getText().toString();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int calc = num1 + num2;

        String ret = Integer.toString(calc);
        goToActivity(ret);
    }

    public void minus(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String str1 = myTextField.getText().toString();

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str2 = myTextField2.getText().toString();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int calc = num1 - num2;

        String ret = Integer.toString(calc);
        goToActivity(ret);
    }

    public void multiply(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String str1 = myTextField.getText().toString();

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str2 = myTextField2.getText().toString();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int calc = num1 * num2;

        String ret = Integer.toString(calc);
        goToActivity(ret);
    }

    public void divide(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String str1 = myTextField.getText().toString();

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);
        String str2 = myTextField2.getText().toString();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int calc = num1 / num2;

        String ret = Integer.toString(calc);
        goToActivity(ret);
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}