package NumberGuesserGame;

import java.util.Scanner;

class Guesser {
    int numGuess;

    public int guessTheNumber() {
        Scanner scan = new Scanner(System.in);
        numGuess = scan.nextInt();
        System.out.println("Hey guesser guess the number ");
        scan.close();
        return numGuess;
    }
}

class Player {
    int numGuess;

    public void guessNumber() {
        Scanner scan = new Scanner(System.in);

        System.out.println("hey player guess the number");
        numGuess = scan.nextInt();
        scan.close();

    }
}

class Umpire {
    Guesser guesser;
    Player p1, p2, p3;

    public void getNumberFromGuesser() {
        Guesser guesser = new Guesser();
        guesser.guessTheNumber();
    }

    public void collectFromPlayers() {
        Player p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        p1.guessNumber();
        p2.guessNumber();
        p3.guessNumber();
    }

    public void calcResult() {
        System.out.println(guesser.numGuess + " " + p1.numGuess + " " + p2.numGuess + " " + p3.numGuess);
        System.out.println("logic not implemented");
        if (guesser.numGuess == p1.numGuess) {

            if (guesser.numGuess == p2.numGuess && guesser.numGuess == p3.numGuess) {
                System.out.println("all are winners");
            } else if (guesser.numGuess == p2.numGuess) {
                System.out.println("player 1 and player 2 are winners");
            } else if (guesser.numGuess == p3.numGuess) {
                System.out.println("player1 and player3 are winners");
            } else {
                System.out.println("player1 is the winner");
            }
        } else if (guesser.numGuess == p2.numGuess) {
            if (guesser.numGuess == p3.numGuess) {
                System.out.println("player2 and player3 are winners");
            } else {
                System.out.println("player2 is the winner");
            }
        } else if (guesser.numGuess == p3.numGuess) {
            System.out.println("palyer3 is the winnenr");
        } else {
            System.out.println("Losssers");
        }
    }

}

public class NumberGuess {

    public static void main(String[] args) {

        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectFromPlayers();
        umpire.calcResult();

    }
}