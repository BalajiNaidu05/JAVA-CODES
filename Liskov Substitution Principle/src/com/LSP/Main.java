package com.LSP;
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird ostrich = new Ostrich();

        bird.fly(); // Works fine
        ostrich.fly(); // Throws exception
    }
}
