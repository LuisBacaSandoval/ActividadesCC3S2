package org.example;

//Flecha: Daño bajo, alcance moderado, alta velocidad de disparo
public class ArrowTowerFactory implements TowerFactory{
    @Override
    public Tower createTower() {
        return new Tower(20, 3, 2);
    }
}
