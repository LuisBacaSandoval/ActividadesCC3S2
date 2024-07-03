package org.example;

public class Lluvia implements IMedicionClimatica{
    private double cantidad;// cantidad de lluvia en mm

    public Lluvia(double cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public double getValor() {
        return cantidad;
    }
    //Se consideran 3 tipos de lluvia, llovizna, intensa y muy intensa
    @Override
    public boolean esBaja() {
        return cantidad > 20 && cantidad <= 50;
    }
    @Override
    public boolean esNormal() {
        return cantidad > 50 && cantidad <= 100;
    }
    @Override
    public boolean esAlta() {
        return cantidad > 100;
    }
}

