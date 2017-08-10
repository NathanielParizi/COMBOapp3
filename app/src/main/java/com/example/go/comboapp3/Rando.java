package com.example.go.comboapp3;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Rando extends AppCompatActivity {

    private TextView change;
    private Button changebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rando);

        final TextView change = (TextView) findViewById(R.id.CHANGE);
        Button mybutton = (Button) findViewById(R.id.changebtn);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Random rand = new Random();

                int randTEXT = rand.nextInt(7);

                switch (randTEXT) {
                    case 0:
                        change.setText("Strawberry");
                        break;
                    case 1:
                        change.setText("Orange");
                        break;
                    case 2:
                        change.setText("バナナ");
                        break;
                    case 3:
                        change.setText("Lemon");
                        break;
                    case 4:
                        change.setText("Pineapple");
                        break;
                    case 5:
                        change.setText("DragonFruit");
                        break;
                    case 6:
                        change.setText("Melon");
                        break;
                    case 7:
                        change.setText("Persimmon");
                        break;
                }

            }
        });


    }
}






