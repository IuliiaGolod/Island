package organisms;

public class Herbivore extends Animal {
    public Herbivore(String name, String symbol, int steps, int max_in_cell)
    {
        super(name, symbol, AllowedSpecies.HERBIVORE, steps, max_in_cell);
    }
}
