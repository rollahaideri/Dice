package com.krillinator.game;


import java.util.*;

public class Players {
    int numPlayer;



    Scanner sc = new Scanner(System.in);
    Dice dice = new Dice(0); // instantiate of class Dice
    ArrayList<String> players = new ArrayList(); // Keep track of players
    ArrayList<Integer> scores = new ArrayList(); // keeps track of scores of players


    public Players(int numPlayer) {
        this.numPlayer = numPlayer;
    }

    // give the user to choose quantity of players
    public int getNumPlayer() {

        do {
            System.out.print("How many player? (Select between 2-10): ");
            numPlayer = sc.nextInt();

        }while(numPlayer < 2 || numPlayer > 10);

        return numPlayer;
    }

    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;

    }
    // Constructor
    public Players(ArrayList<String> players) {
        this.players = players;
    }

    // Getter
    public ArrayList<String> getPlayers() {

        //Loop that prompts the players for their names and adds them to ArrayList
        for (int i = 0; i < numPlayer; i++) {
            System.out.print("Enter Player " + (i + 1) + "'s name: ");
            players.add(sc.next());
            scores.add(0);
        }

        // Loop that
        for(int j = 0; j < players.size(); j++){

            String name = players.get(j);
            int score = scores.get(j);
            int die1 = 0, die2 = 0;
            char b;
            Random rand = new Random();


            System.out.println(name + ", it's your turn. Your current score is " + score);
            System.out.println();

            // Gives player ability to roll the dice
            do {
                System.out.println("(Type r) to Roll the dice: ");
                b = sc.next().charAt(0);

            }while (b != 'r' && b != 'R');

            for( int k = score; k < players.size(); k += (die1 + die2)){

                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                System.out.println("You rolled a " + die1 + " and a " + die2);
                System.out.println("Your current total is " + (k + die1 + die2));
                System.out.println();

                scores.set(j, k + die1 + die2);


            }
            do {
            Integer maxValue = Collections.max(scores);
            System.out.println(scores.indexOf(maxValue));
            Integer indexOfWinner = scores.indexOf(maxValue);

            System.out.println(scores.indexOf(maxValue));

            System.out.println("Winner is: " + players.get(indexOfWinner));
            //System.out.println(players);
            //System.out.println(scores);





        }while();
        return players;
    }

    //Setter

    public void setPlayers(ArrayList<String> players) {
        this.players = players;
    }

}
