import map.*;
import organisms.*;
import statistics.Statistics;
import api.*;

import java.util.concurrent.*;


public class Main {
    public static void main(String[] args)
    {

        Dialog dialog = new Dialog();
        dialog.dialog();

        Field field = new Field();
        for (int i = 0; i < 5; i++) {
            field.add(new Plant());
        }
        for (int i = 0; i < 2; i++) {
            field.add(new Sheep());
            field.add(new Rabbit());
            field.add(new Boar());
            field.add(new Bison());
            field.add(new Caterpillar());
            field.add(new Deer());
            field.add(new Duck());
            field.add(new Goat());
            field.add(new Horse());
            field.add(new Mouse());
        }
        for (int i = 0; i < 5; i++) {
            field.add(new Wolf());
            field.add(new Fox());
            field.add(new Eagle());
            field.add(new Bear());
            field.add(new Boa());
        }

        Statistics statistics = new Statistics(field);

        System.out.println("Start:");
        field.show();
        //api.animalLifecycle(field, statistics);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        // ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        Future<?> animalLifecycleFuture = executor.submit(() -> api.animalLifecycle(field, statistics));
        // executor.submit(() -> api.animalLifecycle(field, statistics));
        Future<?> plantGrowthFuture = executor.submit(() -> api.plantGrowth(field, statistics));
        // executor.submit(() -> api.plantGrowth(field, statistics));
        // Future<?> plantGrowthFuture = executor.scheduleAtFixedRate(() -> api.plantGrowth(field, statistics), 0, 1, TimeUnit.MILLISECONDS);
        executor.shutdown();

        try {
                animalLifecycleFuture.get();
                plantGrowthFuture.get();
                System.out.println();
                System.out.println("Result:");
                field.show();
            } catch (CancellationException e) {
                System.err.println("Task was cancelled: " + e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



        /*
        Cell cell = new Cell();
        for (int i = 0; i < 5; i++)
        {
            cell.add(new Plant());
        }

        cell.add(new Sheep());
        cell.add(new Sheep());
        cell.add(new Wolf());
        System.out.println(Storage.get("sheep"));
        cell.add_animal(sheep.breed());
        System.out.println(cell);
        api.breed_organism_in_cell(cell);
        System.out.println();
        System.out.println(cell);
        api.feedSpecies("herbivores", cell);
        api.feedSpecies("predators", cell);

         */


        /*
        Sheep sheep = new Sheep();
        Wolf wolf = new Wolf();
        Plant plant = new Plant();
        //Wolf wolf1 = new Wolf();
        //wolf.eat(sheep);
        System.out.println(wolf.eat(sheep));
        System.out.println(sheep.eat(plant));
        //System.out.println(wolf.eat(wolf1));
        */


}
