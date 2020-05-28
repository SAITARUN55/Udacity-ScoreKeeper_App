package com.ksaitarun.udacity_scorekeeper_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    private TextView scoreViewTeamA;
    private TextView scoreViewTeamB;
    private ArrayList<String> scoreHistory = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewTeamA = findViewById(R.id.team_a_score);
        scoreViewTeamB = findViewById(R.id.team_b_score);
    }
    public void displayScoreTeamA(int score) {
        scoreViewTeamA.setText(String.valueOf(score));
    }

    public void touchdownTeamA(View view) {
        scoreTeamA += 6;
        displayScoreTeamA(scoreTeamA);
    }

    public void fieldGoalTeamA(View view) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    public void extraTwoTeamA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void extraOneTeamA(View view) {
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    public void safetyTeamA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    public void displayScoreTeamB(int score) {
        scoreViewTeamB.setText(String.valueOf(score));
    }

    public void touchdownTeamB(View view) {
        scoreTeamB += 6;
        displayScoreTeamB(scoreTeamB);
    }

    public void fieldGoalTeamB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    public void extraTwoTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    public void extraOneTeamB(View view) {
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }

    public void safetyTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}
