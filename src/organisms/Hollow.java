package organisms;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Hollow{
    protected String name;
    protected String symbol;

    protected String species;

    protected int max_in_cell;

    protected boolean isAlive;

    public Hollow(String name, String symbol, String species, int max_in_cell) {
        this.name = name;
        this.symbol = symbol;
        this.species = species;
        this.max_in_cell = max_in_cell;
        this.isAlive = true;

    }

    public void die() {
        this.isAlive = false;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isDead() {
        return !isAlive;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public boolean isEatable() {
        return isAlive && (species.equals(AllowedSpecies.PLANT) || species.equals(AllowedSpecies.HERBIVORE));
    }

    public int get_max_in_cell()
    {
        return max_in_cell;
    }
}