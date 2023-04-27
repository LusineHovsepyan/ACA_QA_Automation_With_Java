package employee;

import enums.Seasons;

import java.util.Arrays;
import java.util.Scanner;

import static enums.Numbers.ONE;

public class Main {
    public static void main(String[] args) {
        Seasons mySeason = Seasons.WINTER;
       // System.out.println(mySeason.value);
        System.out.println(Arrays.toString(Seasons.values()));
        int count = 0;
        Employee[] employees = new  Employee[3];
        Scanner in = new Scanner(System.in);
        while (count < 3) {
            Employee employee1 = new Employee();
            System.out.print("Please enter your name: ");
            employee1.setName(in.nextLine());

            System.out.print("Please enter your year Of Joining: ");
            employee1.setYearOfJoining(in.nextInt());
            in.nextLine();
            System.out.print("Please enter your salary: ");
            employee1.setSalary(in.nextDouble());
            in.nextLine();

            System.out.print("Please enter your address: ");

            employee1.setAddress(in.nextLine(), in.nextLine(),in.nextInt());
            employees[count] = employee1;
            count++;
        }

        for (Employee employee: employees ) {
            System.out.println(employee.getEmployeeInfo());
        }
    }
}
