package employee;

/*
Write a program that would print the information (name, year of joining, salary, workingHours,
address) of three employees by creating a class named 'employee'.

The output should be as follows:
    Name, Year of joining, Salary, Address
    Robert, 2004, 2000$, 64C - WallStreet
    Sam, 2020, 1300$, 68D - WallStreet
    John, 2019, 1000$, 26B - WallStreet
*/

public class Employee {
    private static String company;
    private String name;
    private int yearOfJoining;
    private double salary;

    Employee(String name, int yearOfJoining, double salary, Address address) {
        setName(name);
        setYearOfJoining(yearOfJoining);
        //  setAddress(address);
        setSalary(salary);
    }

    Employee() {

    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 1100) {
            salary += 10;
        }
        this.salary = salary;
    }

    public String getEmployeeInfo() {
        return getName() + ", " + getYearOfJoining() + ", " + getSalary() + "$, " + getAddressInfo();
    }

    Address address = new Address();

    public String getAddressInfo(){
        return address.getAddress();
    }
    public class Address {
        String street, building;
        int postIndex;

        public void setAddress(String street, String building, int postIndex) {
            address.street = street;
            address.building = building;
            address.postIndex = postIndex;
        }

        public String getAddress() {
            return street + ", " + building + ", " + postIndex;
        }
    }
}
