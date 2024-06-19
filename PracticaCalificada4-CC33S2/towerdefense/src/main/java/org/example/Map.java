package org.example;

import java.util.*;

public class Map {
    private char[][] grid;

    public Map() {
        this.grid = new char[][] {
                {' ', ' ', 'C', ' ', ' '},
                {' ', 'C', ' ', ' ', ' '},
                {'C', ' ', ' ', 'C', 'B'},
                {' ', ' ', 'C', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '}
        };
    }
    public boolean isValidPosition(int x, int y) {
        return grid[x][y] == ' ';
    }
    public void addTower(Tower tower, int x, int y) {
        grid[x][y] = 'T';
    }
    public void addEnemy(Enemy enemy, int x, int y) {
        grid[x][y] = 'E';
    }
    public void showMap() {
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                System.out.print("["+grid[i][j]+"]");
            }
            System.out.println();
        }
    }
}

