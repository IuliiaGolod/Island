package api;

import map.Cell;
import map.Field;
import organisms.*;
import statistics.Statistics;
import settings.Settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.concurrent.TimeUnit;

public class api {
    public static void feedAnimals(Field field) {
        for (int i = 0; i < field.getRows(); i++) {
            for (int j = 0; j < field.getCols(); j++) {
                Cell cell = field.getGrid()[i][j];
                feedSpecies("herbivores", cell);
                feedSpecies("predators", cell);
            }
        }
    }

    public static void feedSpecies(String species, Cell cell) {
        // Rewrite because of the table?
        List<? extends Animal> eaters;
        List<? extends Hollow> food = switch (species) {
            case "herbivores" -> {
                eaters = cell.getHerbivores();
                yield cell.getPlants();
            }
            case "predators" -> {
                eaters = cell.getPredators();
                yield cell.getHerbivores();
            }
            default -> {
                eaters = new ArrayList<>();
                yield new ArrayList<>();
            }
        };

        for (Animal eater : eaters) {
            for (Hollow size : new ArrayList<>(food)) {
                if (eater.eat(size)) {
                    food.remove(size);
                    cell.getDb().put(size.getName(), cell.getDb().get(size.getName()) - 1);
                    break;
                }
            }
        }
    }

    public static void moveAnimals(Field field) {
        for (int i = 0; i < field.getRows(); i++) {
            for (int j = 0; j < field.getCols(); j++) {
                Cell cell = field.getGrid()[i][j];
                for (Animal animal : cell.animals()) {
                    if (animal.isTired()) {
                        animal.relax();
                    } else {
                        int startX = j;
                        int startY = i;
                        int curX = startX;
                        int curY = startY;
                        int endX = startX;
                        int endY = startY;

                        while (!animal.isTired()) {
                            int[] move = animal.move();
                            int dx = move[0];
                            int dy = move[1];
                            endX = curX + dx;
                            if (endX < 0) {
                                endX = 0;
                            }
                            if (endX > field.getCols() - 1) {
                                endX = field.getCols() - 1;
                            }
                            endY = curY + dy;
                            if (endY < 0) {
                                endY = 0;
                            }
                            if (endY > field.getRows() - 1) {
                                endY = field.getRows() - 1;
                            }

                            // field.getGrid()[endY][endX].add_animal(animal);
                            field.getGrid()[endY][endX].add(animal);
                            field.getGrid()[curY][curX].removeAnimal(animal);
                            curX = endX;
                            curY = endY;
                        }

                        if (endX <= startX && endY <= startY) {
                            animal.relax();
                        }
                    }
                }
            }
        }
    }

    public static void breed_organism_in_cell(Cell cell)
    {
        for (Map.Entry<String, Integer> entry : cell.getDb().entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            for (int i = 0; i < Math.floor( (double) value / 2); i++) {
                switch (key) {
                    case "bear":
                        cell.add(new Bear());
                        break;
                    case "bison":
                        cell.add(new Bison());
                        break;
                    case "boa":
                        cell.add(new Boa());
                        break;
                    case "boar":
                        cell.add(new Boar());
                        break;
                    case "caterpillar":
                        cell.add(new Caterpillar());
                        break;
                    case "deer":
                        cell.add(new Deer());
                        break;
                    case "duck":
                        cell.add(new Duck());
                        break;
                    case "eagle":
                        cell.add(new Eagle());
                        break;
                    case "fox":
                        cell.add(new Fox());
                        break;
                    case "goat":
                        cell.add(new Goat());
                        break;
                    case "horse":
                        cell.add(new Horse());
                        break;
                    case "mouse":
                        cell.add(new Mouse());
                        break;
                    case "rabbit":
                        cell.add(new Rabbit());
                        break;
                    case "sheep":
                        cell.add(new Sheep());
                        break;
                    case "wolf":
                        cell.add(new Wolf());
                        break;
                }
            }
        }
    }

    public static void breed_animals(Field field) {
        for (int i = 0; i < field.getRows(); i++) {
            for (int j = 0; j < field.getCols(); j++) {
                Cell cell = field.getGrid()[i][j];
                breed_organism_in_cell(cell);
            }
        }
    }

    public static void animalLifecycle(Field field, Statistics event) {
        while (event.isRunning()) {
            api.feedAnimals(field);
            api.moveAnimals(field);
            api.breed_animals(field);
            event.update();
            System.out.println();
            field.show();
        }
    }

    public static void plantGrowth(Field field, Statistics statistics) {
        while (statistics.isRunning()) {
            field.add(new Plant());

            try {
                TimeUnit.MILLISECONDS.sleep(Settings.getValue("plant_growth_rate"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


