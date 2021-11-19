package com.krillinator.game;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE GAME");
        System.out.println();

        Dice dice = new Dice(0);
        dice.getNumDice();
        Players players = new Players(0);
        players.getNumPlayer();
        players.getPlayers();


    }

}
