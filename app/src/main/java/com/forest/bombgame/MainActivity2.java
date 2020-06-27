package com.forest.bombgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private SelectPlayerLogic selectPlayerLogic;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        selectPlayerLogic = new SelectPlayerLogic(4);
        textView = findViewById(R.id.selectedPlayerView);
        final Button button2 = findViewById(R.id.secondButton);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                Log.d("debug", "button2, Perform action on click");
            }
        });
        int nextPlayer = selectPlayerLogic.getNextPlayer();
        if (nextPlayer == -1) {
            Log.d("debug", "error failed to select player");
            while (nextPlayer == -1) {
                nextPlayer = selectPlayerLogic.getNextPlayer();
            }
        }
        textView.setText("Player" + String.valueOf(nextPlayer));
    }

}