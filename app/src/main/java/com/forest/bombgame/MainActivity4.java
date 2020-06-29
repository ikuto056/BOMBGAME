package com.forest.bombgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    //TODO: 一つ前のアクティビティから値を受け取る処理を実装する
    int player = 2; //プレイヤーの番号
    int count = 3;  //爆弾を押す個数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        setExplainText();
    }

    //NOTE: 指示テキストの更新処理
    private void setExplainText() {
        TextView explainText = findViewById(R.id.terminalViewExplainText);
        String text = "Player" + String.valueOf(player) + "\n"
                + "Press" + String.valueOf(count) + "buttons!";
        explainText.setText(text);
    }
}