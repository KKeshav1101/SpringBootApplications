package com.example.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //Laptop laptop; again null pointer exception
    //Laptop laptop = new Laptop(); again object lifecyle not handled.

    //@Autowired
    /* connecting automatically with declaration stmt, without using application context.
       field injection, not good in this context, I need to know why.
       so use constructor or setter injection */

    @Autowired
    @Qualifier("laptop")
    private Computer computer;

    //private Laptop laptop;

    //constructor
    /*
    public Dev(Laptop laptop) { //needs no annotation! very easy to handle. setter method setDev will need autowired annotation.
        this.computer = laptop;
    }

    //setter
    @Autowired
    public void setLaptop(Laptop laptop) {
        this.computer = laptop;
    }*/

    public void build() {
        System.out.println("Working on my first spring project");
        //compile, debug, add laptop layer dependency next with Laptop
        computer.compile();
    }
}
