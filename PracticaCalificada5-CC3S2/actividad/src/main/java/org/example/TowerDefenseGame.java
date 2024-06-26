package org.example;

import java.util.*;

public class TowerDefenseGame {
    private Map map;
    private Player player;
    private List<Wave> waves;
    public TowerDefenseGame() {
        this.map = new Map();
        this.player = new Player();
        this.waves = new ArrayList<>();
    }
    public void placeTower(Tower tower, int x, int y) {
        map.placeTower(tower, x, y);
    }
    public void startWave() {
        Wave wave = new Wave();
        waves.add(wave);
        wave.start();
    }
    public void gameState() {
        System.out.println(map);
        System.out.println("Puntuación: " + player.getScore());
        System.out.println("Vida de la base: " + player.getBaseHealth());
    }

    public static void main(String[] args) {
        TowerDefenseGame towerDefenseGame = new TowerDefenseGame();
        System.out.print("Ingresa tu movimiento(Cannon 1 2): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Movimiento: " + input);
        towerDefenseGame.startWave();
        towerDefenseGame.gameState();
    }
}