package ssgconstractor;

public class Employee {
    /*
    Create an employee class, employee has name, role, salary, in main method create employee object using constructor
     */

    String name;
    String role;
    int salary;

    Employee() {
    }

    Employee(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;


    }


    public static void main(String[] args) {

        Employee gul = new Employee("jale", "manager", 2500);
        System.out.println(gul.name);
        System.out.println(gul.role);
        System.out.println(gul.salary);

    }
}