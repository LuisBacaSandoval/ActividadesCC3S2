package org.example;

public class Enemy {
    private int speed; // número de celdas por turno
    private int health;//puntos de salud
    private int reward;//puntos de premio

    //constructor de la clase
    public Enemy(int speed, int health, int reward) {
        this.speed = speed;
        this.health = health;
        this.reward = reward;
    }

    //getters y setters de los atributos de la clase
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}

    public int getReward() {return reward;}
    public void setReward(int reward) {this.reward = reward;}
}