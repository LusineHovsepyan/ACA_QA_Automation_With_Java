package employee;

import enums.Seasons;

import java.util.Arrays;
import java.util.Scanner;

import static enums.Numbers.ONE;

public class Main {
    public static void main(String[] args) {
        Seasons mySeason = Seasons.WINTER;
        System.out.println(mySeason.value);
        System.out.println(Arrays.toString(Seasons.values()));

        int count = 0;
        Employee[] employees = new Employee[3];
        Scanner in = new Scanner(System.in);
        while (count < 3) {

            Employee employee2 = new Employee();
            System.out.print("Please enter your name: ");
            employee2.setName(in.nextLine());

            System.out.print("Please enter your year Of Joining: ");
            employee2.setYearOfJoining(in.nextInt());
            in.nextLine();

            System.out.print("Please enter your salary: ");
            employee2.setSalary(in.nextDouble());
            in.nextLine();

            Employee.Address add = employee2.new Address();
            System.out.print("Please enter your address accordingly street, building, postIndex: ");
            add.setAddress(in.next(), in.next(), in.nextInt());

            employees[count] = employee2;
            count++;
            in.nextLine();
        }

        for (Employee employee: employees ) {
            System.out.println(employee.getEmployeeInfo());
        }
    }
}
