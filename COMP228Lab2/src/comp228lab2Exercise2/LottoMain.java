/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab2Exercise2;

/**
 *
 * @author faiaz
 */
 import javax.swing.*;
import java.security.SecureRandom;
import java.util.Arrays;
public class LottoMain {
   
       


    private static SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {

        //Call lottoGame function
        lottoGame();
    }

    //Generate random number
    private static int generateNumber() {
            //index (0 to 8) + 1 = ( 1 to 9)
        return randomNumbers.nextInt(9) + 1;
    }
    private static void lottoGame() {

        int selectedNumber;
        String runReport;
        int count = 0;
        
        JOptionPane.showMessageDialog(null, "Welcome to Lotto. Choose a number netween 3 and 27 and if the number "
                + "you selected matches the sum of the lotto number you win", "Lotto Game", 1);

        selectedNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 3 to 27"));

        while (count < 5) {


            //Creating Lotto Object with random numbers
            Lotto Round1 = new Lotto(generateNumber(), generateNumber(), generateNumber());
            
            //auxiliary array to display information
            int[] aux = Round1.getArray();
            
            //Formatting String
            runReport = String.format("\n1st number = %d%n"
                    + "2nd number = %d%n"
                    + "3rd number = %d"
                    + "\n\nThe number you entered is: %d%n"
                    + "The sum of the numbers is: %d", aux[0], aux[1], aux[2], selectedNumber, Round1.sum());

            //Display the generated numbers
            JOptionPane.showMessageDialog(null, runReport, "Numbers generated", 1);

            // condition for win
            if (Round1.sum() == selectedNumber) {
                JOptionPane.showMessageDialog(null, "You Won the Round", "win", 1);
                break;
            } else
                count++;
        }
        
        // condition for loss
        if (count == 5)
            JOptionPane.showMessageDialog(null, "Computer Wins", "loss", 0);

    }

}
    

