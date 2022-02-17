package com.sreenath;

public class SnakeAndLadder {

    public static final int NO_MOVE = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    int endPosition = 100;
    int playerPosition = 0;
    int noOfTimesDiceRoll = 0;
    int newPosition = 0;
    String player = " ";

    SnakeAndLadder(String player){
        this.player = player;
    }

    public int rollDice() {
        int diceVal = (int) ((Math.random() * 10) % 6) + 1;
        noOfTimesDiceRoll += 1;
        System.out.println("Dice Value : " + diceVal);
        newPosition = checkOption(diceVal);
        return newPosition;
    }

    public int checkOption(int diceValue) {
        int option = (int) ((Math.random() * 10) % 3);
        switch(option) {
            case LADDER :
                System.out.println(player + " took a ladder ");
                playerPosition = playerPosition + diceValue;
                break;
            case SNAKE :
                System.out.println(player + " bitten by snake");
                playerPosition = playerPosition - diceValue;
                break;
            default :
                System.out.println(player + " has no move");
                break;
        }

        if(playerPosition < 0) {
            playerPosition = 0;
        }
        else if(playerPosition > 100)
        {
            playerPosition = playerPosition - diceValue;
        }

        if(option == 1) {
            rollDice();
        }

        return playerPosition;
    }

    public boolean checkWinning() {
        if(playerPosition == endPosition) {
            System.out.println(player + " won the game");
            System.out.println(player + " rolled dice " + noOfTimesDiceRoll + " times");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SnakeAndLadder player1 = new SnakeAndLadder("Player1");
        SnakeAndLadder player2 = new SnakeAndLadder("Player2");

        String strPlayer1 = player1.player;
        String strPlayer2 = player2.player;

        System.out.println(strPlayer1 + " starting position : " + player1.playerPosition);
        System.out.println(strPlayer2 + " starting position : " + player2.playerPosition);

        while ( true ) {

            System.out.println(strPlayer1 + " turn");
            player1.rollDice();
            System.out.println(strPlayer1 + " reached position " + player1.playerPosition);
            if(player1.checkWinning())
                break;

            System.out.println(strPlayer2 + " turn");
            player2.rollDice();
            System.out.println(strPlayer2 + " reached position " + player2.playerPosition);
            if(player2.checkWinning())
                break;

        }
    }
}
