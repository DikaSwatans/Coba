package com.example.dikaswatans.task_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText income;
    EditText outcome;
    Button button_1, button_2, button_3, button_4, button_5, button_6, button_7,
            button_8, button_9, button_10, button_11;
    ImageButton imageButton;
    String evalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result = (TextView) findViewById(R.id.textView2);
        final EditText income = (EditText) findViewById(R.id.income_id);
        final EditText outcome = (EditText) findViewById(R.id.outcome_id);
        Button button_1 = (Button) findViewById(R.id.button1);
        Button button_2 = (Button) findViewById(R.id.button2);
        Button button_3 = (Button) findViewById(R.id.button3);
        Button button_4 = (Button) findViewById(R.id.button4);
        Button button_5 = (Button) findViewById(R.id.button5);
        Button button_6 = (Button) findViewById(R.id.button6);
        Button button_7 = (Button) findViewById(R.id.button7);
        Button button_8 = (Button) findViewById(R.id.button8);
        Button button_9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button_11 = (Button) findViewById(R.id.button11);


        income.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                evalue = "1";
                return false;

            }
        });
        outcome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                evalue = "2";

                return false;
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (evalue == "1") {
                    income.append("1");
                }
                if (evalue == "2") {
                    outcome.append("1");


                }
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    income.append("2");
                }
                if (evalue == "2") {
                    outcome.append("2");
                }

            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    income.append("3");
                }
                if (evalue == "2") {
                    outcome.append("3");
                }

            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    income.append("4");
                }
                if (evalue == "2") {
                    outcome.append("4");
                }

            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    income.append("5");
                }
                if (evalue == "2") {
                    outcome.append("5");
                }

            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    income.append("6");
                }
                if (evalue == "2") {
                    outcome.append("6");
                }

            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    income.append("7");
                }
                if (evalue == "2") {
                    outcome.append("7");
                }

            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    income.append("8");
                }
                if (evalue == "2") {
                    outcome.append("8");
                }

            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    income.append("9");
                }
                if (evalue == "2") {
                    outcome.append("9 ");
                }

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String income_awal = income.getText().toString();
                int in_val = Integer.parseInt(income_awal);
                String outcome_awal = outcome.getText().toString();
                int out_val = Integer.parseInt(outcome_awal);
                int hasil = out_val - in_val;
                String res = String.valueOf(hasil);
                result.setText(res);

            }
        });

        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                income.setText("");
                outcome.setText("");
            }
        });
    }
}