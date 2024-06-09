package org.example;

public class TextBox implements Shape{

    private final String text;

    public TextBox(String text) {
        this.text = text;
    }
    @Override
    public void draw(Graphics g){//Se crea el método draw, aplicando SRP
        g.drawText(text);
    }
}