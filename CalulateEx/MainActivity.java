package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button addBtn, subBtn, multiBtn, diviBtn;
    TextView TextResult;
    String first, second;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculate");

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        addBtn = (Button) findViewById((R.id.addBtn));
        subBtn = (Button) findViewById((R.id.subBtn));
        multiBtn = (Button) findViewById((R.id.multiBtn));
        diviBtn = (Button) findViewById((R.id.diviBtn));

        TextResult = (TextView) findViewById(R.id.TextResult);

        addBtn.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                first = num1.getText().toString();
                second = num2.getText().toString();
                result = Integer.parseInt(first) + Integer.parseInt(second);
                TextResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        subBtn.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                first = num1.getText().toString();
                second = num2.getText().toString();
                result = Integer.parseInt(first) - Integer.parseInt(second);
                TextResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        multiBtn.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                first = num1.getText().toString();
                second = num2.getText().toString();
                result = Integer.parseInt(first) * Integer.parseInt(second);
                TextResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        diviBtn.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                first = num1.getText().toString();
                second = num2.getText().toString();
                result = Integer.parseInt(first) / Integer.parseInt(second);
                TextResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
    }
}
