package com.example.temperatureconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    EditText e1,e2,number1;
    Button button1;
    TextView t1,t2,t3,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        number1 = (EditText) findViewById(R.id.editText3);
        button1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        result= (TextView) findViewById(R.id.textView4);
        t1.setTextColor(Color.YELLOW);
        t2.setTextColor(Color.YELLOW);
        t3.setTextColor(Color.YELLOW);
        result.setTextColor(Color.BLUE);
        e1.setBackgroundColor(Color.WHITE);
        e2.setBackgroundColor(Color.WHITE);
        number1.setBackgroundColor(Color.WHITE);
        button1.setBackgroundColor(Color.RED);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                result.setText(" ");
                double celsius,fahrenheit,kelvin;
                if (e1.getText().toString().equals("celsius")) {
                    if (e2.getText().toString().equals("fahrenheit")) {
                        celsius = Double.parseDouble(number1.getText().toString());
                        fahrenheit = ((celsius * 9) / 5) + 32;
                        result.setText(Double.toString(fahrenheit)+" Fahrenheit");
                    }
                    if (e2.getText().toString().equals("kelvin")) {
                        celsius = Double.parseDouble(number1.getText().toString());
                        kelvin = (273.15 + celsius);
                        result.setText(Double.toString(kelvin)+" Kelvin");
                    }
                }
                if (e1.getText().toString().equals("fahrenheit")) {
                    if (e2.getText().toString().equals("celsius")) {
                        fahrenheit = Double.parseDouble(number1.getText().toString());
                        celsius = (fahrenheit-32)*(0.5556);
                        result.setText(Double.toString(celsius)+" Celsius");
                    }
                    if (e2.getText().toString().equals("kelvin")) {
                        fahrenheit = Double.parseDouble(number1.getText().toString());
                        kelvin =  (5/9 * (fahrenheit - 32) + 273.15);
                        result.setText(Double.toString(kelvin)+" Kelvin");
                    }
                }
                if (e1.getText().toString().equals("kelvin")) {
                    if (e2.getText().toString().equals("fahrenheit")) {
                        kelvin = Double.parseDouble(number1.getText().toString());
                        fahrenheit= kelvin * 1.8 - 459.67;
                        result.setText(Double.toString(fahrenheit)+" Fahrenheit");
                    }
                    if (e2.getText().toString().equals("celsius")) {
                        kelvin = Double.parseDouble(number1.getText().toString());
                        celsius = kelvin - 273.15;
                        result.setText(Double.toString(celsius)+" Celsius");
                    }
                }
            }
        });
    }
}