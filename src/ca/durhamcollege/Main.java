/*
 * Author      @ Nick Sturch-Flint - Kaifkhan Vakil
 * Date        @ November 13, 2020
 * Program Name@ Java Lab 1
 */


package ca.durhamcollege;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Constants
        int GAMES =   2;
        int PLAYERS = 3;
        int MIN_SCORE = 0;
        int MAX_SCORE = 300;


        //Declarations
        String[] playerNames = {"Nick", "Kaif", "Tom"};
        Scanner keyboard = new Scanner(System.in);
       // float age = 0.0f;
        boolean dirtyFlag = true;
        double playerAvg = 0;
        double totalSum = 0;
        int[][] playerGames = new int [PLAYERS][GAMES]; //2Dimensional Array

      //  for (int k = 0; k < PLAYERS; k++)
     //   {
    //        System.out.printf("Please enter player %i", k);
   //     }

        while (dirtyFlag)
        {
            try
            {
                //USE A FOR LOOP TO STORE THE DATA IN THE ARRAY - GET THE DATA BEFORE USING THE FORLOOP
                for (int i = 0; i < PLAYERS; i++) //Player counter
                {
                    System.out.printf("Please enter the scores for %s: \n", playerNames[i]);


                    for (int j = 0; j < GAMES; j++) //Game counters
                    {

                        System.out.printf("Please enter the score for game %d: ", j + 1);
                        playerGames[i][j] = keyboard.nextInt();

                    }
                }
            }
            catch(InputMismatchException inputMismatchException)
            {

            }

        //PRINT THE ARRAY
        for (int i = 0; i < PLAYERS; i++) //Player counter
        {

            System.out.printf("Printing the scores for %s: \n", playerNames[i]);
            playerAvg = 0;

            for (int j = 0; j < GAMES; j++) //Game counters
            {
                System.out.printf("Game #   %d: ", j + 1);
                System.out.println(playerGames[i][j]);
                //take the number (as a string) and cast it as an integer, then store it in playerAvg
                playerAvg += playerGames[i][j];
            }
            System.out.printf("Average : %.1f\n", (playerAvg / GAMES));
        }
    }
}
