package com.krillinator.game;

import java.util.Random;
import java.util.Scanner;


public class Dice {
    int numDice;



    Scanner sc = new Scanner(System.in);
    Random rand = new Random();





    public Dice(int numDice) {
        this.numDice = numDice;
    }

    public int getNumDice() {
        System.out.println("You will play with two dice");
        return numDice;

    }

    public void setNumDice(int numDice) {
        this.numDice = numDice;


    }


}


