package com.example.assigment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAcounter = 0;
    int teamBcounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn3add(View view){
        teamAcounter+=3;
        displayA(teamAcounter);



    }
    public void btn2add(View view){
        teamAcounter+=2;
        displayA(teamAcounter);



    }
    public void btn1add(View view){
        teamAcounter+=1;
        displayA(teamAcounter);



    }
    public void displayA(int x)
    {
        TextView v = findViewById(R.id.txtTeamA);
        v.setText(String.valueOf(x));
    }
    public void displayB(int x)
    {
        TextView v = findViewById(R.id.txtTeamB);
        v.setText(String.valueOf(x));
    }

    public void btn1addB(View view){
        teamBcounter+=1;
        displayB(teamBcounter);



    }
    public void btn2addB(View view){
        teamBcounter+=2;
        displayB(teamBcounter);



    }
    public void btn3addB(View view){
        teamBcounter+=3;
        displayB(teamBcounter);



    }
    public void reset (View view){

        teamAcounter=0;
        teamBcounter=0;
        displayB(teamBcounter);
        displayA(teamAcounter);
    }
}
