package com.ISP;
public class Main {
    public static void main(String[] args) {
        Worker robot = new Robot();
        Worker humanWorker = new Human();
        Eater humanEater = new Human();

        robot.work();
        humanWorker.work();
        humanEater.eat();
    }
}
