package org.example;

public class RightArrow implements Shape {//Se creó la clase RightArrow con el fin de hacer cumplir LSP
    public void draw(Graphics g) {
        g.drawText( " \\" );
        g.drawText( "-----" );
        g.drawText( " /" );
    }
}