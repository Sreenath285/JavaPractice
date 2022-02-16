package javapractice;

public class SnakeAndLadder {
	
	public static final int NO_MOVE = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    int winningPos = 100;
    int playerPos = 0;
    int noOfDiceRoll = 0;
    int newPosition = 0;
    String player = " ";

    SnakeAndLadder(String name){
        player = name;
    }

    int rollDice() {
        int diceVal = (int) ((Math.random() * 10) % 6) + 1;
        noOfDiceRoll += 1;
        System.out.println("Dice Value : " + diceVal);
        newPosition = checkOption(diceVal);
        return newPosition;
    }

    int checkOption(int diceValue) {
        int option = (int) ((Math.random() * 10) % 3) + 1;
        switch(option) {
            case LADDER :
                System.out.println(player + " took a ladder ");
                playerPos = playerPos + diceValue;
                break;
            case SNAKE :
                System.out.println(player + " bitten by snake");
                playerPos = playerPos - diceValue;
                break;
            case NO_MOVE :
                System.out.println(player + " has no move");
                break;
        }

        if(playerPos < 0)
            playerPos = 0;
        else if(playerPos > 100)
            playerPos = playerPos - diceValue;

        if(option == 1)
            rollDice();


        return playerPos;
    }

    boolean checkWinning() {
        if(playerPos == 100) {
            System.out.println(player + " finished the game ");
            System.out.println(player + " rolled the dice " + noOfDiceRoll + " times to win the game");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SnakeAndLadder player1 = new SnakeAndLadder("Player1");
        SnakeAndLadder player2 = new SnakeAndLadder("Player2");

        String player1Name = player1.player;
        String player2Name = player2.player;

        System.out.println(player1Name + " started playing at position: " + player1.playerPos);
        System.out.println(player2Name + " started playing at position: " + player2.playerPos);


        while ( true ) {

            System.out.println(player1Name + " turn");
            player1.rollDice();
            System.out.println(player1Name + " reached position " + player1.playerPos);
            if(player1.checkWinning())
                break;

            System.out.println(player2Name + " turn");
            player2.rollDice();
            System.out.println(player2Name + " reached position " + player2.playerPos);
            if(player2.checkWinning())
                break;

        }

    }


}
