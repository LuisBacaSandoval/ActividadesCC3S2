package org.example;

public class Tower {
    private int damage; // cantidad de daño que inflinge
    private int range;  // número de celdas a las que puede atacar desde su posición
    private int fireRate;  // turnos entre disparos

    //constructor de la clase
    public Tower(int damage, int range, int fireRate) {
        this.damage = damage;
        this.range = range;
        this.fireRate = fireRate;
    }

    //getters y setters de los atributos de la clase
    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public int getRange() { return range; }
    public void setRange(int range) { this.range = range; }

    public int getFireRate() { return fireRate; }
    public void setFireRate(int fireRate) { this.fireRate = fireRate; }
}

