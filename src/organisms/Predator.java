package organisms;

import java.util.Random;

public class Predator extends Animal {
    public Predator(String name, String symbol, int steps, int max_in_cell) {
        super(name, symbol, AllowedSpecies.PREDATOR, steps, max_in_cell);
    }
}

