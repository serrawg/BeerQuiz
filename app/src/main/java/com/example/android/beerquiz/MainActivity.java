package com.example.android.beerquiz;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Scroll down to get started!", Toast.LENGTH_LONG).show();
        this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    /**
     * Displays the score for the quiz when submit button is clicked
     */
    public void submitAnswers(View view) {
        int totalScore = calculateScore();
        String resultsScore = "You scored " + totalScore + " out of 6!";
        Toast.makeText(this, resultsScore, Toast.LENGTH_LONG).show();
    }

    /**
     * Calculates the score.
     */
    private int calculateScore() {
        int totalScore = questionOne() + questionTwo() + questionThree() + questionFour() + questionFive() + questionSix();

        return totalScore;
    }

    /**
     * Correct answer for question 1
     */

    public int questionOne() {
        RadioButton q1RadioButton4 = findViewById(R.id.radio4);

        if (q1RadioButton4.isChecked()) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    /**
     * Correct answer for question 2
     */
    private int questionTwo() {
        RadioButton q2RadioButton2 = findViewById(R.id.ipa_radio2);

        if (q2RadioButton2.isChecked()) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    /**
     * Correct answers for question 3
     */

    private int questionThree() {
        CheckBox q3Checkbox2 = findViewById(R.id.checkbox2);
        CheckBox q3Checkbox4 = findViewById(R.id.checkbox4);
        CheckBox q3Checkbox5 = findViewById(R.id.checkbox5);
        CheckBox q3Checkbox7 = findViewById(R.id.checkbox7);

        if (q3Checkbox2.isChecked() && q3Checkbox4.isChecked() && q3Checkbox5.isChecked() && q3Checkbox7.isChecked()) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    /**
     * Correct answer for question 4
     */
    private int questionFour() {
        RadioButton q4RadioButton4 = findViewById(R.id.head_radio4);

        if (q4RadioButton4.isChecked()) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    /**
     * Correct answer for question 5
     */

    private int questionFive() {
        EditText q5Answer = findViewById(R.id.brewery_answer);
        String text = q5Answer.getText().toString();

        if (text.equalsIgnoreCase("Deschutes Brewery")) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }

    /**
     * Correct answer for question 6
     */
    private int questionSix() {
        RadioButton q6RadioButton4 = findViewById(R.id.sanmig_radio4);

        if (q6RadioButton4.isChecked()) {
            score = 1;
        } else {
            score = 0;
        }
        return score;
    }
}