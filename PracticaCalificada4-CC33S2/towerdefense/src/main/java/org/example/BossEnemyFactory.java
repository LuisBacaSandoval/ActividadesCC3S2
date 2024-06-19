package org.example;

//Jefe: Lento, mucha vida, mayor recompensa.
public class BossEnemyFactory implements EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Enemy(1, 500, 50);
    }
}
