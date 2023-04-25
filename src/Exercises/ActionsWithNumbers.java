package Exercises;
//import java.util.Scanner;
/*
Write a program to calculate the sum, difference and product of two numbers by creating a class
named 'ActionsWithNumbers' with separate methods for each operation. Numbers and action
types are entered by user.( make methods static)
*/
public class ActionsWithNumbers {

    static double num1, num2;

    public ActionsWithNumbers(double num1, double num2) {
        ActionsWithNumbers.num1 = num1;
        ActionsWithNumbers.num2 = num2;
    }

    public static double getNum1() { return num1; }
    public static void setNum1(double num1) { ActionsWithNumbers.num1 = num1; }
    public static double getNum2() { return num2; }
    public static void setNum2(double num2) { ActionsWithNumbers.num2 = num2; }

    public static void sumCalc(){
        System.out.println(num1 + num2);
    }

    public static void diffCalc(){
        System.out.println(num1 - num2);
    }

    public static void productCalc(){
        System.out.println(num1 * num2);
    }

}
