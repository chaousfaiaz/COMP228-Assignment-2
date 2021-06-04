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

    public class Lotto {

    //Array for storing 3 numbers for lotto ticket
    private int[] lottoNumbers = new int[3];

    //Constructor receiving random numbers from 
    public Lotto(int slot1, int slot2, int slot3){

        this.lottoNumbers[0] = slot1;
        this.lottoNumbers[1] = slot2;
        this.lottoNumbers[2] = slot3;
    }
    //Method that returns the array
    public int[] getArray(){
        return this.lottoNumbers;
    }

    // method that return sum of numbers
    public int sum(){

        return (this.lottoNumbers[0]+this.lottoNumbers[1]+this.lottoNumbers[2]);

    }

}


