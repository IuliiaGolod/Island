package organisms;

import java.util.Random;

import settings.EatingTable;

public class Animal extends Hollow {
    private final int defaultSteps;
    private int steps;

    public Animal(String name, String symbol, String species, int steps, int max_in_cell) {
        super(name, symbol, species, max_in_cell);
        this.defaultSteps = steps;
        this.steps = defaultSteps;
    }

    public int[] move() {
        int x = 0;
        int y = 0;
        steps--;
        if (steps >= 0) {
            Random rand = new Random();
            x = rand.nextInt(3) - 1;
            if (x == 0) {
                y = rand.nextInt(3) - 1;
            }
        }
        return new int[]{x, y};
    }

    public boolean eat(Hollow smt) {
        Random rand = new Random();
        return rand.nextInt(101) <= EatingTable.getData(smt.name, name);
    }

    public int stepsLeft() {
        return steps;
    }

    public boolean isTired() {
        return steps == 0;
    }

    public void relax() {
        steps = defaultSteps;
    }

}
