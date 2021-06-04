/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228lab2Exercise3;

/**
 *
 * @author faiaz
 */
import java.util.*;
import java.lang.Math;
public class OverloadedConstructor {
    
    //method to calculate Area of square
    public static double Area(int a){
      double b = Math.pow(a,2);
        return b;
    }

    //method to calculate Area of Rectangle
    public static double Area(int a,int b){
        return (a*b);
    }

    //method to calculate Area of Triangle
    public static double Area(int a,int b,int c){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public static void main(String[] args) {
     OverloadedConstructor object = new OverloadedConstructor();
        System.out.println("Area of Square = " + object.Area(4));
        System.out.println("Area of Rectangle = " + object.Area(5,8));
        System.out.println("Area of Triangle = " + object.Area(6,10,14));
    }
}
