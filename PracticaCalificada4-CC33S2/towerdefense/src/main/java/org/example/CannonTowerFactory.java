package org.example;

//Cañón: Alto daño, corto alcance.
public class CannonTowerFactory implements TowerFactory{
    @Override
    public Tower createTower() {
        return new Tower(50, 2, 3);
    }
}
