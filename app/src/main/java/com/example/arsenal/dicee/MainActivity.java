package com.example.arsenal.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);

        final ImageView leftDice = findViewById(R.id.diceLeft);
        final ImageView rightDice = findViewById(R.id.diceRight);
        final int[] diceFaces = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6 };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("Dicee", "the button has been pressed!");
                Random random = new Random();
                //Log.d("Dicee", "Randomizer: " + number);
                int number = random.nextInt(5);
                leftDice.setImageResource(diceFaces[number]);
                number = random.nextInt(5);
                rightDice.setImageResource(diceFaces[number]);
            }
        });


    }
}
