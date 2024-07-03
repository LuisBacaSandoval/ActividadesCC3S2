package org.example;

public class Temperatura implements IMedicionClimatica{
    private double temperatura;// temperatura en grados celsius

    public Temperatura(double valor) {// constructor
        this.temperatura = valor;
    }
    @Override
    public double getValor() {
        return temperatura;
    }

    //validar temperatura segun el rango,
    // se considera baja < 5
    // se considera 5<=normal<=30
    // se considera alta > 30
    @Override
    public boolean esBaja() {
        return temperatura < 5;
    }
    @Override
    public boolean esNormal(){
        return temperatura >= 5 && temperatura <= 30;
    }
    @Override
    public boolean esAlta() {
        return temperatura > 30;
    }
}
