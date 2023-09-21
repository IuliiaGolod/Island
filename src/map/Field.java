package map;

import organisms.Hollow;

import java.util.Random;

import java.util.Scanner;
public class Field {
    Scanner scanner = new Scanner(System.in);
    private int rows = scanner.nextInt();
    private int cols = scanner.nextInt();
    private final Cell[][] grid;

    public Field() {
        this.rows = rows;
        this.cols = cols;
        this.grid = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public void add(Hollow animal) {
        Random rand = new Random();
        int x = rand.nextInt(rows);
        int y = rand.nextInt(cols);
        grid[x][y].add(animal);
    }

    public void show() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Cell cell = grid[i][j];
                System.out.print(cell.toString());
            }
            System.out.println();
        }
    }
}
