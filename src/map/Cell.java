package map;

import organisms.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cell {
    private final List<Plant> plants;
    private final List<Herbivore> herbivores;
    private final List<Predator> predators;
    private final Map<String, Integer> db;

    public Cell() {
        this.plants = new ArrayList<>();
        this.herbivores = new ArrayList<>();
        this.predators = new ArrayList<>();
        this.db = new HashMap<>();
    }

    public void add(Hollow organism)
    {
        if (organism.get_max_in_cell() >= db.getOrDefault(organism.getName(), 0) + 1)
        {
            switch (organism.getSpecies())
            {
                case "plant":
                    plants.add((Plant) organism);
                    break;
                case "herbivore":
                    herbivores.add((Herbivore) organism);
                    break;
                case "predator":
                    predators.add((Predator) organism);
                    break;
            }
            updateDb(organism.getName());
        }
    }

    private void updateDb(String name) {
        db.put(name, db.getOrDefault(name, 0) + 1);
    }

    public void removeAnimal(Animal animal) {
        if (animal instanceof Herbivore) {
            herbivores.remove(animal);
        } else if (animal instanceof Predator) {
            predators.remove(animal);
        }
        decrease_number(animal.getName());
    }

    private void decrease_number(String name) {
        db.put(name, db.getOrDefault(name, 0) - 1);
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public List<Predator> getPredators() {
        return predators;
    }

    public List<Animal> animals() {
        List<Animal> animals = new ArrayList<>();
        animals.addAll(herbivores);
        animals.addAll(predators);
        return animals;
    }

    public Map<String, Integer> getDb() {
        return db;
    }

    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        for (Plant plant : plants){
            s.append(plant.toString());
        }
        for (Herbivore herbivore : herbivores){
            s.append(herbivore.toString());
        }
        for (Predator predator : predators){
            s.append(predator.toString());
        }
        return "[" + s + "]";
    }

}
