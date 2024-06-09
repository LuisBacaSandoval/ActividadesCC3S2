package org.example;

public class Circle implements Shape {//Se creó la clase Circle con el fin de hacer cumplir LSP
    private final int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void draw(Graphics g) {
        g.drawCircle(radius);
    }
}