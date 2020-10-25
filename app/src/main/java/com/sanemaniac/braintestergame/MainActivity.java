package com.sanemaniac.braintestergame;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    TextView tvTimer, tvMathEq, tvScore, tvOption1, tvOption2, tvOption3, tvOption4;
    int selectedAns;
    Boolean uiVisible = false;
    Boolean moveRight = true;
    Boolean transitionStatus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int initMiddle = -1500;
        int initTop = 1500;
        initPosition(initMiddle, initTop);
    }

    public void startGame(View view) {
        //Log.i("Start Button", "Pressed");
        if (uiVisible == false && transitionStatus == false) {
            showUi();
        } else {
            hideUi();
        }
    }

    public void hideUi() {
        Log.i("UI", "Transition Out");
        int leftTrans = 1500;
        int rightTrans = -1500;

        tvTimer = findViewById(R.id.tvTimer);
        tvMathEq = findViewById(R.id.tvMathEq);
        tvScore = findViewById(R.id.tvScore);
        tvOption1 = findViewById(R.id.tvOption1);
        tvOption2 = findViewById(R.id.tvOption2);
        tvOption3 = findViewById(R.id.tvOption3);
        tvOption4 = findViewById(R.id.tvOption4);

        if (moveRight == true) {
            Log.i("Transition", "Right");
            tvTimer.animate().translationXBy(leftTrans).setDuration(1000);
            tvMathEq.animate().translationXBy(leftTrans).setDuration(1000);
            tvScore.animate().translationXBy(leftTrans).setDuration(1000);
            tvOption1.animate().translationXBy(rightTrans).setDuration(1000);
            tvOption2.animate().translationXBy(rightTrans).setDuration(1000);
            tvOption3.animate().translationXBy(rightTrans).setDuration(1000);
            tvOption4.animate().translationXBy(rightTrans).setDuration(1000);
            moveRight = true;
        } else {
            Log.i("Transition", "Left");
            tvTimer.animate().translationXBy(rightTrans).setDuration(1000);
            tvMathEq.animate().translationXBy(rightTrans).setDuration(1000);
            tvScore.animate().translationXBy(rightTrans).setDuration(1000);
            tvOption1.animate().translationXBy(leftTrans).setDuration(1000);
            tvOption2.animate().translationXBy(leftTrans).setDuration(1000);
            tvOption3.animate().translationXBy(leftTrans).setDuration(1000);
            tvOption4.animate().translationXBy(leftTrans).setDuration(1000);
            moveRight = false;
        }

        uiVisible = false;
    }

    public void showUi() {
        Log.i("UI", "Transition In");
        int leftTrans = -1500;
        int rightTrans = 1500;

        tvTimer = findViewById(R.id.tvTimer);
        tvMathEq = findViewById(R.id.tvMathEq);
        tvScore = findViewById(R.id.tvScore);
        tvOption1 = findViewById(R.id.tvOption1);
        tvOption2 = findViewById(R.id.tvOption2);
        tvOption3 = findViewById(R.id.tvOption3);
        tvOption4 = findViewById(R.id.tvOption4);

        if (moveRight == true) {
            Log.i("Transition", "Right");
            tvTimer.animate().translationXBy(leftTrans).setDuration(1000);
            tvMathEq.animate().translationXBy(leftTrans).setDuration(1000);
            tvScore.animate().translationXBy(leftTrans).setDuration(1000);
            tvOption1.animate().translationXBy(rightTrans).setDuration(1000);
            tvOption2.animate().translationXBy(rightTrans).setDuration(1000);
            tvOption3.animate().translationXBy(rightTrans).setDuration(1000);
            tvOption4.animate().translationXBy(rightTrans).setDuration(1000);
            moveRight = true;
        } else {
            Log.i("Transition", "Left");
            tvTimer.animate().translationXBy(rightTrans).setDuration(1000);
            tvMathEq.animate().translationXBy(rightTrans).setDuration(1000);
            tvScore.animate().translationXBy(rightTrans).setDuration(1000);
            tvOption1.animate().translationXBy(leftTrans).setDuration(1000);
            tvOption2.animate().translationXBy(leftTrans).setDuration(1000);
            tvOption3.animate().translationXBy(leftTrans).setDuration(1000);
            tvOption4.animate().translationXBy(leftTrans).setDuration(1000);
            moveRight = false;
        }

        uiVisible = true;
    }

    public void initPosition(int left, int right) {
        Log.i("UI", "Set Init Position");
        tvTimer = findViewById(R.id.tvTimer);
        tvMathEq = findViewById(R.id.tvMathEq);
        tvScore = findViewById(R.id.tvScore);
        tvOption1 = findViewById(R.id.tvOption1);
        tvOption2 = findViewById(R.id.tvOption2);
        tvOption3 = findViewById(R.id.tvOption3);
        tvOption4 = findViewById(R.id.tvOption4);

        tvTimer.setX(right);
        tvMathEq.setX(right);
        tvScore.setX(right);
        tvOption1.setX(left);
        tvOption2.setX(left);
        tvOption3.setX(left);
        tvOption4.setX(left);
    }
}