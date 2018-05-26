package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView team_a_score;
    TextView team_b_score;
    Button points3;
    Button points2;
    Button free_throw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team_a_score = (TextView) findViewById(R.id.team_a_score);
        team_b_score = (TextView) findViewById(R.id.team_b_score);
        points3 = (Button) findViewById(R.id.points3);
        points2 = (Button) findViewById(R.id.points2);
        free_throw = (Button) findViewById(R.id.free_throw);


    }

    public void addThreeForTeamA (View view){
        scoreTeamA += 3;
        displayA(scoreTeamA);
    }

    public void addTwoForTeamA(View view){
        scoreTeamA += 2;
        displayA(scoreTeamA);
    }

    public void addOneForTeamA(View view){
        scoreTeamA += 1;
        displayA(scoreTeamA);
    }

    public void displayA(int score){
        team_a_score.setText(String.valueOf(score));
    }

    public void displayB(int score){
        team_b_score.setText(String.valueOf(score));
    }

    public void addThreeForTeamB (View view){
        scoreTeamB += 3;
        displayB(scoreTeamB);
    }

    public void addTwoForTeamB(View view){
        scoreTeamB += 2;
        displayB(scoreTeamB);
    }

    public void addOneForTeamB(View view){
        scoreTeamB += 1;
        displayB(scoreTeamB);
    }

    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayA(scoreTeamA);
        displayB(scoreTeamB);
    }


}
