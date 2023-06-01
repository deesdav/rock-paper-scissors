package com.company;

import java.util.Scanner;

public class Game {
    public static final String reset = "\u001B[0m";
    public static final String black = "\u001B[30m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String purple = "\u001B[35m";
    public static final String cyan = "\u001B[36m";
    public static final String white = "\u001B[37m";

    public static final String black_background = "\u001B[40m";
    public static final String red_background = "\u001B[41m";
    public static final String green_background = "\u001B[42m";
    public static final String yellow_background = "\u001B[43m";
    public static final String blue_background = "\u001B[44m";
    public static final String purple_background = "\u001B[45m";
    public static final String cyan_background = "\u001B[46m";
    public static final String white_background = "\u001B[47m";

    public static final String unbold = "\033[0;0m";
    public static final String bold = "\033[0;1m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(bold + yellow + "ROCK PAPER SCISSORS" + reset);
        System.out.println(
                purple + "if your choice will equal to enemy choice, game automatically continue and you play again");
        System.out.println("type only 'rock', 'paper', 'scissors' into the console!");

        /*
         * PRAVIDLA HRY:
         * scissors stříhají paper
         * paper balí rock
         * rock tupí scissors
         */

        System.out.println(bold + yellow + "--------------------------" + reset);

        for (int i = 1; i < 4; i++) {
            System.out.println(bold + white + i);
        }

        String enemyChoice;
        String playerChoice;
        String playOrEnd;

        do {
            enemyChoice = "";
            do {

                int randomEnemyChoice = (int) Math.floor(Math.random() * 3);
                if (randomEnemyChoice == 0) {
                    enemyChoice = "rock";
                }
                if (randomEnemyChoice == 1) {
                    enemyChoice = "scissors";
                }
                if (randomEnemyChoice == 2) {
                    enemyChoice = "paper";
                } 
                    System.out.print(bold + green + "Your move: " + reset);
                playerChoice = sc.nextLine().toLowerCase();

                System.out.print(bold + red + "Opponent's move: " + reset);
                if (enemyChoice.equals("scissors")) {
                    System.out.println(unbold + purple + enemyChoice + reset);
                }
                if (enemyChoice.equals("paper")) {
                    System.out.println(unbold + yellow + enemyChoice + reset);
                }
                if (enemyChoice.equals("rock")) {
                    System.out.println(unbold + red + enemyChoice + reset);
                }
           

                // mechanismus?
                if (enemyChoice.equals("rock") && playerChoice.equals("scissors")) {
                    System.out.println(bold + red + "you lost!" + reset);

                }
                if (enemyChoice.equals("scissors") && playerChoice.equals("paper")) {
                    System.out.println(bold + red + "you lost!" + reset);

                }
                if (enemyChoice.equals("paper") && playerChoice.equals("rock")) {
                    System.out.println(bold + red + "you lost!" + reset);

                }

                if (playerChoice.equals("rock") && enemyChoice.equals("scissors")) {
                    System.out.println(bold + yellow + "you won!" + reset);

                }
                if (playerChoice.equals("scissors") && enemyChoice.equals("paper")) {
                    System.out.println(bold + yellow + "you won!" + reset);

                }
                if (playerChoice.equals("paper") && enemyChoice.equals("rock")) {
                    System.out.println(bold + yellow + "you won!" + reset);
                }

                System.out.println();
            } while ((playerChoice.equals("paper") && enemyChoice.equals("paper"))
                    || (playerChoice.equals("rock") && enemyChoice.equals("rock"))
                    || (playerChoice.equals("scissors") && enemyChoice.equals("scissors")));

            System.out.println(bold + green + "Do you want to play again? (yes/no)" + reset);
            playOrEnd = sc.nextLine();
            System.out.println();
        } while (playOrEnd.equals("yes"));
        sc.close();
    }
}
