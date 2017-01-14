package com.example.android.scorekeeperfootball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA=0;
    int scoreForTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View view)
    {
        scoreForTeamA=scoreForTeamA+1;
        displayForTeamA(scoreForTeamA);

    }

    public void addTwoForTeamA(View view)
    {
        scoreForTeamA=scoreForTeamA+2;
        displayForTeamA(scoreForTeamA);

    }

    public void addThreeForTeamA(View view)
    {
        scoreForTeamA=scoreForTeamA+3;
        displayForTeamA(scoreForTeamA);

    }

    public void addSixForTeamA(View view)
    {
        scoreForTeamA=scoreForTeamA+6;
        displayForTeamA(scoreForTeamA);

    }

    public void addOneForTeamB(View view)
    {
        scoreForTeamB=scoreForTeamB+1;
        displayForTeamB(scoreForTeamB);

    }

    public void addTwoForTeamB(View view)
    {
        scoreForTeamB=scoreForTeamB+2;
        displayForTeamB(scoreForTeamB);

    }

    public void addThreeForTeamB(View view)
    {
        scoreForTeamB=scoreForTeamB+3;
        displayForTeamB(scoreForTeamB);

    }

    public void addSixForTeamB(View view)
    {
        scoreForTeamB=scoreForTeamB+6;
        displayForTeamB(scoreForTeamB);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
