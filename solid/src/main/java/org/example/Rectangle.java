package org.example;

public class Rectangle implements Shape{
    private final int width;
    private final int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics g) {//Se crea el método draw, aplicando SRP
        for (int row=0; row < height; row++) {
            g.drawHorizontalLine(width);
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}