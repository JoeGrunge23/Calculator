package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    private String operatorPassed, valuePassed;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero,
    btnAdd, btnSubtract, btnMultiply, btnDivision, btnEquals, btnDel, btnDot;

    EditText numberField;

    float mValueOne, mValueTwo;

    boolean edtTxtAdd, edtTxtSub, edtTxtMul,edtTxtDiv;


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

        btnDot = (Button) findViewById(R.id.dot);
        btnAdd = (Button) findViewById(R.id.add);
        btnSubtract = (Button) findViewById(R.id.minus);
        btnMultiply = (Button) findViewById(R.id.multiply);
        btnDivision = (Button) findViewById(R.id.division);
        btnEquals = (Button) findViewById(R.id.equals);
        btnDel = (Button) findViewById(R.id.delete);

        numberField = (EditText) findViewById(R.id.numberField);
        numberField.setText("0");
        valuePassed = String.valueOf(String.valueOf(numberField.getText()));
        Log.i(TAG, valuePassed);
//        valuePassed = String.valueOf(numberField.getText())

//        Log.i(TAG, );

//Number Buttons
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText("1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + ".");
            }
        });

//       Operator Buttons boolean edtTxtAdd, edtTxtSub, edtTxtMul,edtTxtDiv;
//       float mValueOne, mValueTwo
//       EditText numberField;

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "+");
                //                mValueOne = Float.parseFloat(numberField.getText() + "");


//                operatorExtract = String.valueOf(Log.i(TAG, String.valueOf(numberField.getText())));

            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "-");
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "/");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "*");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(numberField.getText() + "");

                if (edtTxtAdd == true) {
                    numberField.setText(mValueOne + mValueTwo + "");
                    edtTxtAdd = false;
                }

                if (edtTxtSub == true) {
                    numberField.setText(mValueOne - mValueTwo + "");
                    edtTxtSub = false;
                }

                if (edtTxtMul == true) {
                    numberField.setText(mValueOne * mValueTwo + "");
                    edtTxtMul = false;
                }

                if (edtTxtDiv == true) {
                    numberField.setText(mValueOne / mValueTwo + "");
                    edtTxtDiv = false;
                }

            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }
//                mValueOne = Float.parseFloat(numberField.getText() + "");
}