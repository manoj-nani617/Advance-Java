package com.techouts;


import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;
    private Computer com;
    private int salary;

    public Alien(Desktop desktop) {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Alien() {
        System.out.println("Alien constructor is created");
    }

    public Alien(int salary, Computer com, int age) {
        this.salary = salary;
        this.com = com;
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void method(){

        System.out.println("Age is "+age);
        System.out.println("Salary is "+salary);
        com.compile();
    }
}
