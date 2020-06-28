package com.forest.bombgame;


import java.util.ArrayList;
import java.util.Random;
public class SelectPlayerLogic {
    //各プレイヤーの選ばれる確率
    private static ArrayList<Integer>players=null;
    private static int sum;
    public SelectPlayerLogic(int playerNumber){
        if(players==null||players.size()!=playerNumber) {
            SelectPlayerLogic.sum = playerNumber;
            SelectPlayerLogic.players = new ArrayList<>();
            for (int i = 0; i < playerNumber; i++) {
                players.add(1);
            }
        }
    }
    public int getNextPlayer(){
        Random r=new Random();
        int randomNum=r.nextInt(sum)+1;
        int res=-1;
        for(int i=0;i<players.size();i++){
            randomNum-=players.get(i);
            if(randomNum<=0){
                res=i+1;
                //選ばれなかったプレイヤーの確率を上げる
                for(int j=0;j<players.size();j++){
                    if(j==i)continue;
                    players.set(j,players.get(j)+1);
                }
                sum+=players.size()-1;
                break;
            }
        }
        return res;
    }
}
