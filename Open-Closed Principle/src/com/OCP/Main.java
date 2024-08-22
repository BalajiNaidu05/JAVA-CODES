package com.OCP;
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(3);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
    }
}