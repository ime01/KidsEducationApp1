package com.example.flowz.kidseducationapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView questions;
    RadioGroup question1_options, question2_options, question3_options, question4_options, question5_options;
    RadioButton optionA, optionB, optionC, optionD, option3C,option4C,option5A;
    RadioButton option2A, option2B, option2C, option2D, option2E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);


        question1_options = findViewById(R.id.Question_1_Options);
        question2_options = findViewById(R.id.Question_2_Options);
        question3_options = findViewById(R.id.Question_3_Options);
        question4_options = findViewById(R.id.Question_4_Options);
        question5_options = findViewById(R.id.Question_5_Options);

        optionC = findViewById(R.id.option_C);
        optionB = findViewById(R.id.option_B);
        optionA = findViewById(R.id.option_A);
        optionD = findViewById(R.id.option_D);
        option2B = findViewById(R.id.Option_2B);

        option3C = findViewById(R.id.Option_3C);
        option4C = findViewById(R.id.Option_4C);
        option5A = findViewById(R.id.Option_5A);

        optionC.setChecked(true);
        option2B.setChecked(true);
        option3C.setChecked(true);
        option4C.setChecked(true);
        option5A.setChecked(true);

    }
}
