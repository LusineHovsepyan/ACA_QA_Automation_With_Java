import exercises.ActionsWithNumbers;
import exercises.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//Triangle - Perimeter Calculation

        Triangle triangle1 = new Triangle();

        System.out.print("Please enter the first side of the triangle: ");
        triangle1.setA(in.nextDouble());
        if (triangle1.getA() > 0) {
            System.out.print("Please enter the second side of the triangle: ");
            triangle1.setB(in.nextDouble());
            if (triangle1.getB() > 0) {
                System.out.print("Please enter the third side of the triangle: ");
                triangle1.setC(in.nextDouble());
                if (triangle1.getC() > triangle1.getA() + triangle1.getB()) {
                    triangle1.calcPerimeterOfTriangle(triangle1.getA(), triangle1.getB(), triangle1.getC());
                } else System.out.print("Entered value should be greater than sum of the first and second sides");
            } else System.out.print("Entered value for the second side should be greater than zero");
        } else System.out.print("Entered value for the first side should be greater than zero");

//Triangle - Area Calculation

        Triangle areaTriangle = new Triangle(triangle1.getH(), triangle1.getBase());
        System.out.print("Please enter the Height of the triangle: ");
        areaTriangle.setH(in.nextDouble());
        if (areaTriangle.getH() > 0) {
            System.out.print("Please enter the Base of the triangle: ");
            areaTriangle.setBase(in.nextDouble());
            if (areaTriangle.getBase() > 0) {
                areaTriangle.areaOfTriangle();
            } else System.out.print("Entered value should be greater than zero");
        } else System.out.print("Entered value should be greater than zero");

//ActionsWithNumbers - SUM Calculation
        ActionsWithNumbers actions = new ActionsWithNumbers(ActionsWithNumbers.getNum1(), ActionsWithNumbers.getNum2());

        System.out.print("Please enter num1: ");
        ActionsWithNumbers.setNum1(in.nextDouble());
        System.out.print("Please enter num2: ");
        ActionsWithNumbers.setNum2(in.nextDouble());

        actions.sumCalc();

//ActionsWithNumbers - Difference Calculation

        actions.diffCalc();

//ActionsWithNumbers - Product Calculation

        actions.productCalc();
    }
}