package org.example;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    private void run() {
        Graphics console = new ConsoleGraphics();
        // DIP: Inyectar dependencia Shapes en Graphics
        var shapes = new Shapes(console);
        // A la clase Shapes OCP se le puede agregar cualquier tipo de Shape
        // SRP cada subclase de forma, por ejemplo, Rectangle sabe cómo dibujar solo una forma // LSP cada
        //subclase de forma se puede usar donde sea que se necesite una interfaz de forma
        shapes.add(new TextBox("Hello!"));
        shapes.add(new Rectangle(32,3));
        shapes.add(new RightArrow());
        shapes.add(new Circle(5));
        shapes.draw();
    }
}