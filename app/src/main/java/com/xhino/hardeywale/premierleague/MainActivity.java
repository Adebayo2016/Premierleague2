package com.xhino.hardeywale.premierleague;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA (View view){
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);


    }
    public void addOneForTeamB(View view){
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);



    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.manchester);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }





}
