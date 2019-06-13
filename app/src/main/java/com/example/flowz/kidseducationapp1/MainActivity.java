package com.example.flowz.kidseducationapp1;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView questions;
    RadioGroup question1_options, question2_options, question3_options, question4_options, question5_options;
    RadioButton optionA, optionB, optionC, optionD, optionE;
    RadioButton option2A, option2B, option2C, option2D, option2E;

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1_options = findViewById(R.id.Question_1_Options);
        question2_options = findViewById(R.id.Question_2_Options);
        question3_options = findViewById(R.id.Question_3_Options);
        question4_options = findViewById(R.id.Question_4_Options);
        question5_options = findViewById(R.id.Question_5_Options);

        optionC = findViewById(R.id.option_C);
        optionB = findViewById(R.id.option_B);
        optionA = findViewById(R.id.option_A);
        optionD = findViewById(R.id.option_D);


//        question1_options.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                int selectedOptions = question1_options.getCheckedRadioButtonId();
//
//                if (selectedOptions == R.id.option_C) {
//                    optionC.setBackgroundColor(Color.GREEN);
//                    optionA.setEnabled(false);
//                    optionB.setEnabled(false);
//                    optionD.setEnabled(false);
//                } else {
//                    RadioButton wrongOption = findViewById(selectedOptions);
//                    wrongOption.setBackgroundColor(Color.RED);
//                    optionC.setBackgroundColor(Color.GREEN);
//                    optionA.setEnabled(false);
//                    optionB.setEnabled(false);
//                    optionD.setEnabled(false);
//                }
//            }
//        });

    }


    public void submit(View view) {

        int answer1 = question1_options.getCheckedRadioButtonId();
        if (answer1 == R.id.option_C) {
            score++;
        }

        if (question2_options.getCheckedRadioButtonId() == R.id.Option_2B) {
            score++;
        }
        if (question3_options.getCheckedRadioButtonId() == R.id.Option_3C) {
            score++;
        }
        if (question4_options.getCheckedRadioButtonId() == R.id.Option_4C) {
            score++;
        }
        if (question5_options.getCheckedRadioButtonId() == R.id.Option_5D) {
            score++;
        }
        if (answer1 == -1 || question2_options.getCheckedRadioButtonId() == -1 || question3_options.getCheckedRadioButtonId() == -1 ||
                question4_options.getCheckedRadioButtonId() == -1 || question5_options.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Make sure you answer all questions", Toast.LENGTH_SHORT).show();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to submit?")
                    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this, "You scored " + score, Toast.LENGTH_SHORT).show();
                            score= 0;
                            Intent openAnswers = new Intent(MainActivity.this, AnswerActivity.class);
                            startActivity(openAnswers);
                        }
                    })
                    .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    })
                    .create().show();
        }


    }
}
