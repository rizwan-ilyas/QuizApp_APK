package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String []grass={"a","c","e","i","m","n","o","r","s","u","v","w","x","z"};
    String []root={"g","j","p","q","y"};
    String []sky={"b","d","f","h","k","l","t"};
    int letterType;
    TextView txtView= (TextView) findViewById(R.id.textViewWord);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // selecting a random number
        Random random=new Random();
        letterType=random.nextInt(3);

        if(letterType==0){
            txtView.setText(grass[random.nextInt(14)]);
        }
        if(letterType==1){
            txtView.setText(root[random.nextInt(5)]);
        }
        if(letterType==2){
            txtView.setText(sky[random.nextInt(7)]);
        }
    }

    public void buttonClicked(View v){
        int[] btns={R.id.btnGrass,R.id.btnRoot,R.id.btnSky};
        if(btns[v.getId()]==letterType){
            txtView.setText("Congrats Answer");
        }
        else{
            txtView.setText("Wrong Answer");
        }
    }




}