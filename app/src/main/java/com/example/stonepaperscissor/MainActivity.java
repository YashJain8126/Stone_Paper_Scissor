package com.example.stonepaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView compin,userin;
    TextView winner,submit;
    EditText editText;
    int userInput;
    int rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        compin=findViewById(R.id.compin);
        userin=findViewById(R.id.userin);
        winner=findViewById(R.id.winner);
        submit=findViewById(R.id.submit);
        editText=findViewById(R.id.editText);

        randomgenerator();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput=Integer.parseInt(editText.getText().toString());
                logic(rand,userInput);

            }
        });

    }

    public void randomgenerator(){
        Random random=new Random();
        rand=random.nextInt(3);
    }

    public void logic(int rand, int userInput) {
        if(userInput>2){
            Toast.makeText(this, "Please Enter Valid Input", Toast.LENGTH_SHORT).show();
        }
        if(rand==0 && userInput==0){
            userin.setImageResource(R.drawable.rockleft);
            compin.setImageResource(R.drawable.stoneright);
            winner.setText("Draw!!");
            randomgenerator();

        }
        else if(rand==1 && userInput==1){
            userin.setImageResource(R.drawable.paperleft);
            compin.setImageResource(R.drawable.paperright);
            winner.setText("Draw!!");
            randomgenerator();

        }
        else if(rand==2 && userInput==2){
            userin.setImageResource(R.drawable.scissorleft);
            compin.setImageResource(R.drawable.scissoright);
            winner.setText("Draw!!");
            randomgenerator();
        }
        else if(rand==0 && userInput==1){
            userin.setImageResource(R.drawable.paperleft);
            compin.setImageResource(R.drawable.stoneright);
            winner.setText("You Won!!");
            randomgenerator();
        }
        else if(rand==0 && userInput==2){
            userin.setImageResource(R.drawable.scissorleft);
            compin.setImageResource(R.drawable.stoneright);
            winner.setText("Computer Won!!");
            randomgenerator();
        }
        else if(rand==1 && userInput==0){
            userin.setImageResource(R.drawable.rockleft);
            compin.setImageResource(R.drawable.paperright);
            winner.setText("Computer Won!!");
            randomgenerator();
        }
        else if(rand==1 && userInput==2){
            userin.setImageResource(R.drawable.scissorleft);
            compin.setImageResource(R.drawable.paperright);
            winner.setText("You Won!!");
            randomgenerator();
        }
        else if(rand==2 && userInput==0){
            userin.setImageResource(R.drawable.rockleft);
            compin.setImageResource(R.drawable.scissoright);
            winner.setText("You Won!!");
            randomgenerator();
        }
        else if(rand==2 && userInput==1){
            userin.setImageResource(R.drawable.paperleft);
            compin.setImageResource(R.drawable.scissoright);
            winner.setText("Computer Won!!");
            randomgenerator();
        }
    }
}