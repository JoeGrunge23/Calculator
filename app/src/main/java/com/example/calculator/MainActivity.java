package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero,
    btnAdd, btnSubtract, btnMultiply, btnDivision, btnEquals, btnDel;

    EditText numberField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.one);
        btnTwo = (Button) findViewById(R.id.two);
        btnThree = (Button) findViewById(R.id.three);
        btnFour = (Button) findViewById(R.id.four);
        btnFive = (Button) findViewById(R.id.five);
        btnSix = (Button) findViewById(R.id.six);
        btnSeven = (Button) findViewById(R.id.seven);
        btnEight = (Button) findViewById(R.id.eight);
        btnNine = (Button) findViewById(R.id.nine);
        btnZero = (Button) findViewById(R.id.zero);

        btnAdd = (Button) findViewById(R.id.add);
        btnSubtract = (Button) findViewById(R.id.minus);
        btnMultiply = (Button) findViewById(R.id.multiply);
        btnDivision = (Button) findViewById(R.id.division);
        btnEquals = (Button) findViewById(R.id.equals);
        btnDel = (Button) findViewById(R.id.delete);

        numberField = (EditText) findViewById(R.id.numberField);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "1");
            }
        });
    }
}