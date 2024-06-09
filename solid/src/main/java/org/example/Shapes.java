package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    private final List<Shape> allShapes = new ArrayList<>();
    private final Graphics consoleGraphics;

    public Shapes(Graphics consoleGraphics) {
        this.consoleGraphics = consoleGraphics;
    }

    public void add(Shape s) {
        allShapes.add(s);
    }
    public void draw() {//
        /*for (Shape s : allShapes) {
            switch (s.getType()) {
                case "textbox":
                    var t = (TextBox) s;
                    t.draw(g);//Se aplicó SRP, la clase TextBox ahora se dibuja asi misma
                    break;
                case "rectangle":
                    var r = (Rectangle) s;
                    r.draw(g);//Se aplicó SRP, la clase Rectangle ahora se dibuja asi misma
            }
        }*///Se aplicó SRP
        allShapes.forEach(shape -> shape.draw(consoleGraphics));//luego de aplicar DIP se eliminó el switch y se reemplazo por un foreach
    }
}