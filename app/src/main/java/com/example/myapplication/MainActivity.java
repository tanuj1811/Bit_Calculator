package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b, xor, or, and, mod;
    EditText number1, number2;
    TextView answer;
    public static final String CALCULATOR_PACKAGE ="com.android.calculator2";
    public static final String CALCULATOR_CLASS ="com.android.calculator2.Calculator";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.tsbtn);
        number1 = findViewById(R.id.editTextPhone);
        number2 = findViewById(R.id.editTextPhone2);
        xor = findViewById(R.id.button1);
        or = findViewById(R.id.button2);
        and = findViewById(R.id.button3);
        mod = findViewById(R.id.button4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), calculator.class);
//                startActivity(intent);
                try {
                    PackageManager pm = getPackageManager();
//                    pm.getPackageInfo("com.sec.android.app.popupcalculator", 0);
//                    // Calculator app is installed, so we can launch it
//                    Intent intent = new Intent(Intent.ACTION_MAIN);
//                    intent.addCategory(Intent.CATEGORY_LAUNCHER);
//                    intent.setPackage("com.sec.android.app.popupcalculator");
//                    startActivity(intent);
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.setClassName("com.sec.android.app.popupcalculator", "com.sec.android.app.popupcalculator.Calculator");
                    startActivity(intent);



                } catch(Exception e) {
                    System.err.println("----->>>>>>>"+e.toString());
                }

            }
        });

        xor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int ans = a^b;
                answer = findViewById(R.id.tv1);
                answer.setText("Answer : " + ans);

            }
        });

        or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int ans = a|b;
                answer = findViewById(R.id.tv1);
                answer.setText("Answer : " + ans);

            }
        });

        and.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int ans = a&b;
                answer = findViewById(R.id.tv1);
                answer.setText("Answer : " + ans);

            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(number1.getText().toString());
                int b = Integer.parseInt(number2.getText().toString());
                int ans = a%b;
                answer = findViewById(R.id.tv1);
                answer.setText("Answer : " + ans);

            }
        });

    }

}