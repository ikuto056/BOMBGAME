package com.forest.bombgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity4 extends AppCompatActivity {
    //TODO: 一つ前のアクティビティから値を受け取る処理を実装する
    int player = 2; //プレイヤーの番号
    int count = 3;  //爆弾を押す個数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        setExplainText();
        setBombEvent();
    }

    //NOTE: 指示テキストの更新処理
    private void setExplainText() {
        TextView explainText = findViewById(R.id.terminalViewExplainText);
        String text = "Player" + String.valueOf(player) + "\n"
                + "Press" + String.valueOf(count) + "buttons!";
        explainText.setText(text);
    }

    //NOTE: 爆弾ボタンのイベント追加処理
    private void setBombEvent() {
        View.OnClickListener event = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FloatingActionButton bomb = (FloatingActionButton) view;
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                //TODO: hide関数だと制約が落ちるので、他の方法で実装する（色とアクションをOFFにする？）
                bomb.setBackgroundColor(Color.argb(0, 0, 0, 0));
                System.out.print(bomb.getBackgroundTintList());
                bomb.setOnClickListener(null);
            }
        };
        findViewById(R.id.bomb0).setOnClickListener(event);
        findViewById(R.id.bomb1).setOnClickListener(event);
        findViewById(R.id.bomb2).setOnClickListener(event);
        findViewById(R.id.bomb3).setOnClickListener(event);
        findViewById(R.id.bomb4).setOnClickListener(event);
        findViewById(R.id.bomb5).setOnClickListener(event);
        findViewById(R.id.bomb6).setOnClickListener(event);
        findViewById(R.id.bomb7).setOnClickListener(event);
        findViewById(R.id.bomb8).setOnClickListener(event);
        findViewById(R.id.bomb9).setOnClickListener(event);
        findViewById(R.id.bomb10).setOnClickListener(event);
        findViewById(R.id.bomb11).setOnClickListener(event);
        findViewById(R.id.bomb12).setOnClickListener(event);
        findViewById(R.id.bomb13).setOnClickListener(event);
        findViewById(R.id.bomb14).setOnClickListener(event);
    }
}