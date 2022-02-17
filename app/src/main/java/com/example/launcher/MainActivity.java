package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView flappyBirdImage, chessImage, backgammonImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        flappyBirdImage = findViewById(R.id.flappyBirdImage);
        chessImage = findViewById(R.id.chessImage);
        backgammonImage = findViewById(R.id.backgammonImage);


        flappyBirdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.kostasdrakonakis.flappybird");
                if (intent != null)
                    startActivity(intent);
            }
        });

        chessImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.example.dipanshkhandelwal.chess");
                if (intent != null)
                    startActivity(intent);
            }
        });

        backgammonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("games.mrlaki5.backgammon");
                if (intent != null)
                    startActivity(intent);
            }
        });
    }
}