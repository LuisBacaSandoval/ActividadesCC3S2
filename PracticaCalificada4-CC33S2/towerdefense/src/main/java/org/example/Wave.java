package org.example;

import java.util.ArrayList;
import java.util.List;

public class Wave {
    private List<Enemy> enemies;// lista de enemigos
    private int waveNumber; //cantidad de enemigos por oleada

    //constructor de la clase
    public Wave(int waveNumber) {
        this.waveNumber = waveNumber;
        this.enemies = generateEnemies(waveNumber);
    }

    //metodo el cual genera enemigos
    private List<Enemy> generateEnemies(int waveNumber) {
        List<Enemy> enemies = new ArrayList<>();
        for (int i = 0; i < waveNumber * 5; i++) {  // más enemigos cada oleada
            enemies.add(new BasicEnemyFactory().createEnemy());
        }
        if (waveNumber % 5 == 0) {  // jefe cada 5 oleadas
            enemies.add(new BossEnemyFactory().createEnemy());
        }
        return enemies;
    }

    // Métodos para manejar el progreso de la oleada
    public List<Enemy> getEnemies() {
        return enemies;
    }
}

