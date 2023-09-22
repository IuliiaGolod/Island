import api.api;
import map.Field;
import organisms.*;
import statistics.Statistics;

import java.util.Scanner;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Dialog {
    public void dialog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в пространство создания острова с животными и растениями!\n" +
                "Здесь вы сможете наблюдать за интересными взаимодействиями между различными видами и узнать,\n" +
                "как они выживают на этом острове.");
        System.out.println("Прежде чем начать, пожалуйста, введите два числа, которые определят размеры острова через ENTER.\n" +
                "Первое число отвечает за количество строк, а второе - за количество столбцов.\n" +
                "Эти значения помогут создать остров и определить его размеры.");
        System.out.println("После ввода этих значений, мы сможем создать остров и запустить процесс выживания животных и растений.\n" +
                "Помните, что только сильнейшие смогут преуспеть на этом острове. Удачи!");
    }
    public void createFieldAndStatistics() {
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

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<?> animalLifecycleFuture = executor.submit(() -> api.animalLifecycle(field, statistics));
        Future<?> plantGrowthFuture = executor.submit(() -> api.plantGrowth(field, statistics));

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
}
