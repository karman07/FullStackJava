package com.company;

class Employee{
    int id;
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and name is " + name);
    }
}

public class Classes {
    public static void main(String[] args) {
        System.out.println("This is my custom class");
        Employee karman = new Employee();
        karman.id = 12;
        karman.name = "Karman Singh";
        karman.salary = 2;
        int salary = karman.getSalary();
        System.out.println(karman.name);
        System.out.println(karman.id);
        System.out.println(salary);
        karman.printDetails();
    }
}
