package org.example;

//Enemigo básico: Lento, poca vida.
public class BasicEnemyFactory implements EnemyFactory{

    @Override
    public Enemy createEnemy() {
        return new Enemy(1, 100, 10);
    }
}
