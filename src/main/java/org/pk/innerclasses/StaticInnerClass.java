package org.pk.innerclasses;

public class StaticInnerClass {
    static int score = 100;
    int match = 21;

    static class MatchClass {
        void displayBoard() {
            System.out.println("The score of the match : " + score);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.MatchClass scoreBoard = new StaticInnerClass.MatchClass();
        scoreBoard.displayBoard();
    }
}
