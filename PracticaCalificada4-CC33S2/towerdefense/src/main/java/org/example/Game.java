package org.example;

import java.util.List;
import java.util.Scanner;

public class Game {
    private Map map;
    private Player player;
    private Wave currentWave;

    public Game() {
        this.map = new Map();
        this.player = new Player();
        this.currentWave = new Wave(1);
    }

    public void placeTower(Tower tower, int x, int y) {
        if (map.isValidPosition(x, y)) {
            map.addTower(tower, x, y);
        } else {
            System.out.println("No se puede colocar una torre en esa posicion.");
        }
    }
    public void placeEnemy(Enemy enemy, int x, int y) {
        if (map.isValidPosition(x, y)) {
            map.addEnemy(enemy, x, y);
        } else {
            System.out.println("No se puede colocar el enemigo en esa posicion.");
        }
    }

    public Map getMap() {return map;}
    public void setMap(Map map) {this.map = map;}

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] parts;
        String tower;
        int posX;
        int posY;

        for (int i=0; i<1; i++){
            System.out.print("Place tower: ");
            input = scanner.nextLine();
            parts = input.split(" ");
            tower = parts[0];
            posX = Integer.parseInt(parts[1]);
            posY = Integer.parseInt(parts[2]);
            System.out.println("Torre "+tower+" colocada en ("+posX+","+posY+")");
            System.out.println("Oleada 1 iniciada");
            System.out.println("Enemigos en camino...");
            System.out.println("Estado del juego:");
            game.getMap().showMap();
        }

    }
}

