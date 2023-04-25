import Exercises.ActionsWithNumbers;
import Exercises.Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the first side of the triangle: ");
        Triangle.setA(in.nextDouble());
        System.out.print("Please enter the second side of the triangle: ");
        Triangle.setB(in.nextDouble());
        System.out.print("Please enter the third side of the triangle: ");
        Triangle.setC(in.nextDouble());

        Triangle perimTriangle = new Triangle(Triangle.getA(), Triangle.getB(), Triangle.getC());
        perimTriangle.perimeterOfTriangle();

        System.out.print("Please enter the Height of the triangle: ");
        Triangle.setH(in.nextDouble());
        System.out.print("Please enter the Base of the triangle: ");
        Triangle.setBase(in.nextDouble());

        Triangle areaTriangle = new Triangle(Triangle.getH(), Triangle.getBase());
        areaTriangle.areaOfTriangle();


        System.out.print("Please enter num1: ");
        ActionsWithNumbers.setNum1(in.nextDouble());
        System.out.print("Please enter num2: ");
        ActionsWithNumbers.setNum2(in.nextDouble());

        ActionsWithNumbers actionSum = new ActionsWithNumbers(ActionsWithNumbers.getNum1(), ActionsWithNumbers.getNum2());
        actionSum.sumCalc();

        System.out.print("Please enter num1: ");
        ActionsWithNumbers.setNum1(in.nextDouble());
        System.out.print("Please enter num2: ");
        ActionsWithNumbers.setNum2(in.nextDouble());

        ActionsWithNumbers actionDiff = new ActionsWithNumbers(ActionsWithNumbers.getNum1(), ActionsWithNumbers.getNum2());
        actionDiff.diffCalc();

        System.out.print("Please enter num1: ");
        ActionsWithNumbers.setNum1(in.nextDouble());
        System.out.print("Please enter num2: ");
        ActionsWithNumbers.setNum2(in.nextDouble());

        ActionsWithNumbers actionProduct = new ActionsWithNumbers(ActionsWithNumbers.getNum1(), ActionsWithNumbers.getNum2());
        actionProduct.productCalc();

    }
}