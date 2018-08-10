package com.company;

public class Basketball

{
    public static void main(String[] args)
    {
        boolean gameOver = false;
        Die dieOne = new Die();
        Die dieTwo = new Die();
        int playerOnePegPosition = 0;
        int playerTwoPegPosition = 0;

        do
        {
            dieOne.roll();
            dieTwo.roll();
            System.out.println("You rolled a: " + dieOne.getValue() + " & " + dieTwo.getValue());
            //int playerOneNextPegPosition = playerOnePegPosition + 1;

            if (dieOne.getValue() + dieTwo.getValue() == 2)
            {
                playerOnePegPosition = playerOnePegPosition + 3;
                System.out.println("You scored 3 points!");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 3)
            {
                playerOnePegPosition = playerOnePegPosition;
                System.out.println("Walking violation, you lose the ball");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 4)
            {
                playerOnePegPosition = playerOnePegPosition + 2;
                System.out.println("You scored a 2 point fieldgoal!");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 5)
            {
                playerOnePegPosition = playerOnePegPosition + 1;
                System.out.println("One point foul shot!");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 6)
            {
                playerOnePegPosition = playerOnePegPosition + 2;
                System.out.println("You scored a 2 point fieldgoal!");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 7)
            {
                playerOnePegPosition = playerOnePegPosition;
                System.out.println("Double dribble, you lose the ball");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 8)
            {
                playerOnePegPosition = playerOnePegPosition + 2;
                System.out.println("You hit 2 foul shots");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 9)
            {
                playerOnePegPosition = playerOnePegPosition;
                System.out.println("You missed a jump shot.");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 10)
            {
                playerOnePegPosition = playerOnePegPosition + 3;
                System.out.println("You hit 2 point shot and a foul shot");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 11)
            {
                playerOnePegPosition = playerOnePegPosition;
                System.out.println("Offensive foul.");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 12)
            {
                playerOnePegPosition = playerOnePegPosition + 3;
                System.out.println("You hit a 3 pointer!!!!");
            }


            if (playerOnePegPosition >= 21)
            {
                System.out.println("Player One Wins!");
                System.out.println("Other player gets a participation trophy!");
                gameOver = true;
            }

            dieOne.roll();
            dieTwo.roll();


            System.out.println("You rolled a: " + dieOne.getValue() + " & " + dieTwo.getValue());


            // int playerTwoNextPegPosition = playerTwoPegPosition + 1;

            if (dieOne.getValue() + dieTwo.getValue() == 2)
            {
                playerOnePegPosition = playerOnePegPosition + 3;
                System.out.println("You scored 3 points!");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 3)
            {
                playerOnePegPosition = playerOnePegPosition;
                System.out.println("Walking violation, you lose the ball");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 4)
            {
                playerOnePegPosition = playerOnePegPosition + 2;
                System.out.println("You scored a 2 point fieldgoal!");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 5)
            {
                playerOnePegPosition = playerOnePegPosition + 1;
                System.out.println("One point foul shot!");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 6)
            {
                playerOnePegPosition = playerOnePegPosition + 2;
                System.out.println("You scored a 2 point fieldgoal!");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 7)
            {
                playerOnePegPosition = playerOnePegPosition;
                System.out.println("Double dribble, you lose the ball");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 8)
            {
                playerOnePegPosition = playerOnePegPosition + 2;
                System.out.println("You hit 2 foul shots");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 9)
            {
                playerOnePegPosition = playerOnePegPosition;
                System.out.println("You missed a jump shot.");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 10)
            {
                playerOnePegPosition = playerOnePegPosition + 3;
                System.out.println("You hit 2 point shot and a foul shot");
            }

            if (dieOne.getValue() + dieTwo.getValue() == 11)
            {
                playerOnePegPosition = playerOnePegPosition;
                System.out.println("Offensive foul.");
            }
            if (dieOne.getValue() + dieTwo.getValue() == 12)
            {
                playerOnePegPosition = playerOnePegPosition + 3;
                System.out.println("You hit a 3 pointer!!!!");
            }


            if (playerTwoPegPosition >= 21)
            {
                System.out.println("Player Two Wins!");
                System.out.println("Other player gets a participation trophy!");
                gameOver = true;
            }
        } while (!gameOver);
    }

    private static PlayerPeg togglePlayerPeg(PlayerPeg playerOnePeg, PlayerPeg playerTwoPeg, PlayerPeg currentPlayerPeg)
    {
        PlayerPeg nextPlayer;

        if (currentPlayerPeg == playerOnePeg)
        {
            nextPlayer = playerTwoPeg;
        } else
        {
            nextPlayer = playerOnePeg;
        }

        return nextPlayer;
    }
}