package org.example;

//Láser: Daño moderado, largo alcance.
public class LaserTowerFactory implements TowerFactory{
    @Override
    public Tower createTower() {
        return new Tower(30, 5, 1);
    }
}
