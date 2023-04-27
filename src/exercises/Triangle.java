package exercises;

/*
Write a program to print the area and perimeter of a triangle by creating a class named 'Triangle'
with 3 parameters in its constructor.( in separate class ). Triangle sides are entered through
keyboard. Also check in the constructor that valid values are passed( Scanner class)
*/

public class Triangle {
    private double a, b, c, base, h, perimeter, area;

    public Triangle() {

    }

    public Triangle(double _h, double _base) {
        h = _h;
        base = _base;
    }

    public Triangle(double _a, double _b, double _c) {
        a = _a;
        b = _b;
        c = _c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void calcPerimeterOfTriangle(double a, double b, double c) {
        perimeter = a + b + c;
        System.out.println("Perimeter of the triangle is: " + perimeter);
    }

    public void areaOfTriangle() {
        area = (h * base / 2);
        System.out.println("Area of the triangle is: " + area);
    }

}
