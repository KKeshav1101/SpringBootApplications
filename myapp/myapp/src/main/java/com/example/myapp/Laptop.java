package com.example.myapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    //to prefer one component over the other.
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compiling your code with laptop");
    }
}
