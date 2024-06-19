package org.example;

//Enemigo rápido: Rápido, menos vida.
public class FastEnemyFactory implements EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Enemy(2, 50, 10);
    }
}
