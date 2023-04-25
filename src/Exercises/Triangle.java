package Exercises;

/*
Write a program to print the area and perimeter of a triangle by creating a class named 'Triangle'
with 3 parameters in its constructor.( in separate class ). Triangle sides are entered through
keyboard. Also check in the constructor that valid values are passed( Scanner class)
*/

public class Triangle {
    public static double a, b, c, base, h, perimeter;

    public Triangle(double _h, double _base) {
        h = _h;
        base = _base;
    }

    public Triangle(double _a, double _b, double _c) {
        a = _a;
        b = _b;
        c = _c;
    }

    public static double getA() {
        return a;
    }
    public static void setA(double a) { Triangle.a = a;  }
    public static double getB() {
        return b;
    }
    public static void setB(double b) { Triangle.b = b; }
    public static double getC() { return c;  }
    public static void setC(double c) { Triangle.c = c;  }
    public static double getBase() {
        return base;
    }
    public static void setBase(double base) {
        Triangle.base = base;
    }
    public static double getH() {
        return h;
    }
    public static void setH(double h) {
        Triangle.h = h;
    }

    public static void perimeterOfTriangle(){
        a = getA();
        if (a > 0) {
            b = getB();
            if (b > 0) {
                c = getC();
                if (c > a + b) {
                    perimeter = a + b + c;
                }
                else System.out.println("Entered value should be greater than sum of the first and second sides");
            }
            else System.out.println("Entered value for the second side should be greater than zero");
        }
        else System.out.println("Entered value for the first side should be greater than zero");

        System.out.println("Perimeter of the triangle is: " + perimeter);
    }

    public static void areaOfTriangle() {
        System.out.println("Area of the triangle is: " + (h * base / 2));
    }


}
