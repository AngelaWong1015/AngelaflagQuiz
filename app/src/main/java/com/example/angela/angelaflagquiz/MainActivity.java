package com.example.angela.angelaflagquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnA = (Button) findViewById(R.id.buttonJapan);
        Button btnB = (Button) findViewById(R.id.buttonKorea);
        Button btnC = (Button) findViewById(R.id.buttonChina);
        final Button btnD = (Button) findViewById(R.id.buttonHK);

        final TextView result=(TextView) findViewById(R.id.textViewResult;

                btnA.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                result.setText("Incorrect");
                                                btnA.setEnabled(false);
                                            }
                                        });
                btnB.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                result.setText("Incorrect");
                                                btnB.setEnabled(false);
                                            }
                                        });
                btnC.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                result.setText("Incorrect");
                                                btnC.setEnabled(false);
                                            }
                                        });
                btnD.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        result.setText("Your answer is correct!");
                        Intent startQ2Activity = new Intent(v.getContext(), Q2.class);
                        btnD.setEnabled(true);
                    }
                });
    }
}
