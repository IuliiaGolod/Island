package statistics;

import map.Field;
import map.Cell;

public class Statistics {
    private final Field field;
    private int plants;
    private int herbivores;
    private int predators;

    public Statistics(Field field) {
        this.field = field;
        update();
    }

    public int getPlants() {
        return plants;
    }

    public int getHerbivores() {
        return herbivores;
    }

    public int getPredators() {
        return predators;
    }

    public int getAnimals() {
        return herbivores + predators;
    }

    public boolean isRunning() {
        return herbivores > 0;
    }

    public boolean isStopped() {
        return !isRunning();
    }

    public void update() {
        plants = 0;
        herbivores = 0;
        predators = 0;

        for (int i = 0; i < field.getRows(); i++) {
            for (int j = 0; j < field.getCols(); j++) {
                Cell cell = field.getGrid()[i][j];
                plants += cell.getPlants().size();
                herbivores += cell.getHerbivores().size();
                predators += cell.getPredators().size();
            }
        }
    }
}
