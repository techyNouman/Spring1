package org.example;

public class Alien {

    private int age;
    private Computer computer;

    public Alien(){
//        System.out.println("Object created...");
    }

    public Alien(int age) {
        this.age = age;
    }

//    public Alien(int age, Laptop laptop) {
//        this.age = age;
//        this.laptop = laptop;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("Coding...");
        computer.compile();
    }
}
