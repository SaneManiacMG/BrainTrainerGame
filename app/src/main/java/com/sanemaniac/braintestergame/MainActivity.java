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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideUi();
    }

    public void startGame() {

    }

    public void hideUi() {
        Log.i("UI", "Hide");

        tvTimer = findViewById(R.id.tvTimer);
        tvMathEq = findViewById(R.id.tvMathEq);
        tvScore = findViewById(R.id.tvScore);
        tvOption1 = findViewById(R.id.tvOption1);
        tvOption2 = findViewById(R.id.tvOption2);
        tvOption3 = findViewById(R.id.tvOption3);
        tvOption4 = findViewById(R.id.tvOption4);

        tvTimer.setVisibility(View.INVISIBLE);
        tvMathEq.setVisibility(View.INVISIBLE);
        tvScore.setVisibility(View.INVISIBLE);
        tvOption1.setVisibility(View.INVISIBLE);
        tvOption2.setVisibility(View.INVISIBLE);
        tvOption3.setVisibility(View.INVISIBLE);
        tvOption4.setVisibility(View.INVISIBLE);
    }

    public void showUi() {
        Log.i("UI", "Show");
        tvTimer = findViewById(R.id.tvTimer);
        tvMathEq = findViewById(R.id.tvMathEq);
        tvScore = findViewById(R.id.tvScore);
        tvOption1 = findViewById(R.id.tvOption1);
        tvOption2 = findViewById(R.id.tvOption2);
        tvOption3 = findViewById(R.id.tvOption3);
        tvOption4 = findViewById(R.id.tvOption4);

        tvTimer.setVisibility(View.VISIBLE);
        tvMathEq.setVisibility(View.VISIBLE);
        tvScore.setVisibility(View.VISIBLE);
        tvOption1.setVisibility(View.VISIBLE);
        tvOption2.setVisibility(View.VISIBLE);
        tvOption3.setVisibility(View.VISIBLE);
        tvOption4.setVisibility(View.VISIBLE);
    }

}