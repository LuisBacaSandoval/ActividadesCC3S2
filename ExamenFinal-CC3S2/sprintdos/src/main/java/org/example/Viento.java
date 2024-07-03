package org.example;

public class Viento implements IMedicionClimatica{
    private double velocidad;// velocidad del viento en km/h

    public Viento(double velocidad) {// constructor
        this.velocidad = velocidad;
    }
    @Override
    public double getValor() {
        return velocidad;
    }

    //Se consideran 3 tipos de viento, moderado, fuerte y huracanado
    @Override
    public boolean esBaja() {
        return velocidad <= 40;
    }
    @Override
    public boolean esNormal() {
        return velocidad > 40 && velocidad < 90;
    }
    @Override
    public boolean esAlta(){
        return velocidad >= 90;
    }
}

