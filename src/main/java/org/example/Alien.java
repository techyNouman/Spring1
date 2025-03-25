package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;

//    @Autowired
//    @Qualifier("name2")
    private Computer computer;

    public Alien(){
        System.out.println("Object created...");
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

    @Autowired
//    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("Coding...");
        computer.compile();
    }
}
