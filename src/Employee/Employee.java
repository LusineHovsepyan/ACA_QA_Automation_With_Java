package Employee;

import java.util.Scanner;


/*
Write a program that would print the information (name, year of joining, salary, workingHours,
address) of three employees by creating a class named 'Employee'.

The output should be as follows:
    Name, Year of joining, Salary, Address
    Robert, 2004, 2000$, 64C - WallStreet
    Sam, 2020, 1300$, 68D - WallStreet
    John, 2019, 1000k, 26B - WallStreet
*/

public class Employee {

    public static String name, address;
    public static int yearOfJoining;
    public static double salary;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        Employee.name = name;
        Employee.yearOfJoining = yearOfJoining;
        Employee.salary = salary;
        Employee.address = address;
    }

    public static void setName(String name) { Employee.name = name; }
    public static String getName() { return name; }

    public static void setYearOfJoining(int yearOfJoining) { Employee.yearOfJoining = yearOfJoining; }
    public static int getYearOfJoining() { return yearOfJoining; }

    public static void setSalary(double salary) { Employee.salary = salary; }
    public static double getSalary() { return salary; }

    public static void setAddress(String address) { Employee.address = address; }
    public static String getAddress() { return address; }

    public static void userInput(){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        Employee.name = in.nextLine();
        Employee.setName(Employee.name);

        System.out.print("Please enter your year Of Joining: ");
        Employee.yearOfJoining = in.nextInt();
        Employee.setYearOfJoining(Employee.yearOfJoining);

        System.out.print("Please enter your salary: ");
        Employee.salary = in.nextDouble();
        Employee.setSalary(Employee.salary);

        System.out.print("Please enter your address: ");
        Employee.address = in.nextLine();
        Employee.setAddress(Employee.address);

        System.out.print(getName() + ", ");
        System.out.print(getYearOfJoining() + ", ");
        System.out.print(getSalary() + ", ");
        System.out.print(getAddress() + ", ");
    }
}
