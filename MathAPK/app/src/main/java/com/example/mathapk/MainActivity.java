package com.example.mathapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView num1, num2, jwbn, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num_1);
        num2 = findViewById(R.id.num_2);
        jwbn = findViewById(R.id.jwbn_);
        result = findViewById(R.id.result_);

        run_reset();

    }

    void run_reset(){
        Random myRandom = new Random();
        int Num1 = myRandom.nextInt(101 );
        int Num2 = myRandom.nextInt(101 );

        num1.setText(""+Num1);
        num2.setText(""+Num2);

        jwbn.setText("");
        result.setText("");
    }
    void printjwbn (String a){
        String text = jwbn.getText().toString();
        jwbn.setText(text+a);
    }

    public void one(View view) {
        printjwbn("1");
    }

    public void two(View view) {
        printjwbn("2");
    }

    public void three(View view) {
        printjwbn("3");
    }

    public void four(View view) {
        printjwbn("4");
    }

    public void five(View view) {
        printjwbn("5");
    }

    public void six(View view) {
        printjwbn("6");
    }

    public void seven(View view) {
        printjwbn("7");
    }

    public void eight(View view) {
        printjwbn("8");
    }

    public void nine(View view) {
        printjwbn("9");
    }

    public void zero(View view) {
        printjwbn("0");
    }

    public void next(View view) {
        run_reset();
    }

    public void enter(View view) {
        int Num1 = Integer.parseInt(num1.getText().toString());
        int Num2 = Integer.parseInt(num2.getText().toString());
        int Jwbn = Num1 + Num2;
        int get_user_jwbn = Integer.parseInt(jwbn.getText().toString());
        if(Jwbn == get_user_jwbn) {
            result.setText("BENAR!!!");
        }
        else {
            result.setText("SALAH!!!");
        }

    }

    public void reset(View view) {
        jwbn.setText("");
    }
}