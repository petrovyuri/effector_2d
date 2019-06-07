package com.mrdevgo.effector2d_lib.utilits;

import java.util.Random;

public class UtilRandomGame {
    public static int getCasualNumber(int number){
        Random random = new Random();
        return random.nextInt(number);
    }

    public static int getGap(int minNumber, int maxNumber){
        return (int) ((Math.random()*++maxNumber)+minNumber);
    }
}
