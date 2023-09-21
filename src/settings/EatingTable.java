package settings;
import java.util.HashMap;
import java.util.Map;

public class EatingTable {
    private static final Map<String, Map<String, Integer>> data = new HashMap<>();

    static {
        Map<String, Integer> wolfData = new HashMap<>();
        wolfData.put("wolf", 0);
        wolfData.put("boa", 0);
        wolfData.put("fox", 0);
        wolfData.put("bear", 0);
        wolfData.put("eagle", 0);
        wolfData.put("horse", 0);
        wolfData.put("deer", 0);
        wolfData.put("rabbit", 0);
        wolfData.put("mouse", 0);
        wolfData.put("goat", 0);
        wolfData.put("sheep", 70);
        wolfData.put("boar", 0);
        wolfData.put("bison", 0);
        wolfData.put("duck", 0);
        wolfData.put("caterpillar", 0);
        wolfData.put("plant", 0);
        data.put("wolf", wolfData);

        Map<String, Integer> boaData = new HashMap<>();
        boaData.put("wolf", 0);
        boaData.put("boa", 0);
        boaData.put("fox", 0);
        boaData.put("bear", 80);
        boaData.put("eagle", 0);
        boaData.put("horse", 0);
        boaData.put("deer", 0);
        boaData.put("rabbit", 0);
        boaData.put("mouse", 0);
        boaData.put("goat", 0);
        boaData.put("sheep", 0);
        boaData.put("boar", 0);
        boaData.put("bison", 0);
        boaData.put("duck", 0);
        boaData.put("caterpillar", 0);
        boaData.put("plant", 0);
        data.put("boa", boaData);

        Map<String, Integer> foxData = new HashMap<>();
        foxData.put("wolf", 0);
        foxData.put("boa", 15);
        foxData.put("fox", 0);
        foxData.put("bear", 0);
        foxData.put("eagle", 10);
        foxData.put("horse", 0);
        foxData.put("deer", 0);
        foxData.put("rabbit", 0);
        foxData.put("mouse", 0);
        foxData.put("goat", 0);
        foxData.put("sheep", 0);
        foxData.put("boar", 0);
        foxData.put("bison", 0);
        foxData.put("duck", 0);
        foxData.put("caterpillar", 0);
        foxData.put("plant", 0);
        data.put("fox", foxData);

        Map<String, Integer> bearData = new HashMap<>();
        bearData.put("wolf", 0);
        bearData.put("boa", 0);
        bearData.put("fox", 0);
        bearData.put("bear", 0);
        bearData.put("eagle", 0);
        bearData.put("horse", 0);
        bearData.put("deer", 0);
        bearData.put("rabbit", 0);
        bearData.put("mouse", 0);
        bearData.put("goat", 0);
        bearData.put("sheep", 0);
        bearData.put("boar", 0);
        bearData.put("bison", 0);
        bearData.put("duck", 0);
        bearData.put("caterpillar", 0);
        bearData.put("plant", 0);
        data.put("bear", bearData);

        Map<String, Integer> eagleData = new HashMap<>();
        eagleData.put("wolf", 0);
        eagleData.put("boa", 0);
        eagleData.put("fox", 0);
        eagleData.put("bear", 0);
        eagleData.put("eagle", 0);
        eagleData.put("horse", 0);
        eagleData.put("deer", 0);
        eagleData.put("rabbit", 0);
        eagleData.put("mouse", 0);
        eagleData.put("goat", 0);
        eagleData.put("sheep", 0);
        eagleData.put("boar", 0);
        eagleData.put("bison", 0);
        eagleData.put("duck", 0);
        eagleData.put("caterpillar", 0);
        eagleData.put("plant", 0);
        data.put("eagle", eagleData);

        Map<String, Integer> horseData = new HashMap<>();
        horseData.put("wolf", 10);
        horseData.put("boa", 0);
        horseData.put("fox", 0);
        horseData.put("bear", 40);
        horseData.put("eagle", 0);
        horseData.put("horse", 0);
        horseData.put("deer", 0);
        horseData.put("rabbit", 0);
        horseData.put("mouse", 0);
        horseData.put("goat", 0);
        horseData.put("sheep", 0);
        horseData.put("boar", 0);
        horseData.put("bison", 0);
        horseData.put("duck", 0);
        horseData.put("caterpillar", 0);
        horseData.put("plant", 0);
        data.put("horse", horseData);

        Map<String, Integer> deerData = new HashMap<>();
        deerData.put("wolf", 15);
        deerData.put("boa", 0);
        deerData.put("fox", 0);
        deerData.put("bear", 80);
        deerData.put("eagle", 0);
        deerData.put("horse", 0);
        deerData.put("deer", 0);
        deerData.put("rabbit", 0);
        deerData.put("mouse", 0);
        deerData.put("goat", 0);
        deerData.put("sheep", 0);
        deerData.put("boar", 0);
        deerData.put("bison", 0);
        deerData.put("duck", 0);
        deerData.put("caterpillar", 0);
        deerData.put("plant", 0);
        data.put("deer", deerData);

        Map<String, Integer> rabbitData = new HashMap<>();
        rabbitData.put("wolf", 60);
        rabbitData.put("boa", 20);
        rabbitData.put("fox", 70);
        rabbitData.put("bear", 80);
        rabbitData.put("eagle", 90);
        rabbitData.put("horse", 0);
        rabbitData.put("deer", 0);
        rabbitData.put("rabbit", 0);
        rabbitData.put("mouse", 0);
        rabbitData.put("goat", 0);
        rabbitData.put("sheep", 0);
        rabbitData.put("boar", 0);
        rabbitData.put("bison", 0);
        rabbitData.put("duck", 0);
        rabbitData.put("caterpillar", 0);
        rabbitData.put("plant", 0);
        data.put("rabbit", rabbitData);


        Map<String, Integer> mouseData = new HashMap<>();
        mouseData.put("wolf", 80);
        mouseData.put("boa", 40);
        mouseData.put("fox", 90);
        mouseData.put("bear", 90);
        mouseData.put("eagle", 90);
        mouseData.put("horse", 0);
        mouseData.put("deer", 0);
        mouseData.put("rabbit", 0);
        mouseData.put("mouse", 0);
        mouseData.put("goat", 0);
        mouseData.put("sheep", 0);
        mouseData.put("boar", 50);
        mouseData.put("bison", 0);
        mouseData.put("duck", 0);
        mouseData.put("caterpillar", 0);
        mouseData.put("plant", 0);
        data.put("mouse", mouseData);

        Map<String, Integer> goatData = new HashMap<>();
        goatData.put("wolf", 60);
        goatData.put("boa", 0);
        goatData.put("fox", 0);
        goatData.put("bear", 70);
        goatData.put("eagle", 0);
        goatData.put("horse", 0);
        goatData.put("deer", 0);
        goatData.put("rabbit", 0);
        goatData.put("mouse", 0);
        goatData.put("goat", 0);
        goatData.put("sheep", 0);
        goatData.put("boar", 0);
        goatData.put("bison", 0);
        goatData.put("duck", 0);
        goatData.put("caterpillar", 0);
        goatData.put("plant", 0);
        data.put("mouse", goatData);

        Map<String, Integer> sheepData = new HashMap<>();
        sheepData.put("wolf", 70);
        sheepData.put("boa", 0);
        sheepData.put("fox", 0);
        sheepData.put("bear", 70);
        sheepData.put("eagle", 0);
        sheepData.put("horse", 0);
        sheepData.put("deer", 0);
        sheepData.put("rabbit", 0);
        sheepData.put("mouse", 0);
        sheepData.put("goat", 0);
        sheepData.put("sheep", 0);
        sheepData.put("boar", 0);
        sheepData.put("bison", 0);
        sheepData.put("duck", 0);
        sheepData.put("caterpillar", 0);
        sheepData.put("plant", 0);
        data.put("sheep", sheepData);

        Map<String, Integer> boarData = new HashMap<>();
        boarData.put("wolf", 15);
        boarData.put("boa", 0);
        boarData.put("fox", 0);
        boarData.put("bear", 50);
        boarData.put("eagle", 0);
        boarData.put("horse", 0);
        boarData.put("deer", 0);
        boarData.put("rabbit", 0);
        boarData.put("mouse", 0);
        boarData.put("goat", 0);
        boarData.put("sheep", 0);
        boarData.put("boar", 0);
        boarData.put("bison", 0);
        boarData.put("duck", 0);
        boarData.put("caterpillar", 0);
        boarData.put("plant", 0);
        data.put("boar", boarData);

        Map<String, Integer> bisonData = new HashMap<>();
        bisonData.put("wolf", 10);
        bisonData.put("boa", 0);
        bisonData.put("fox", 0);
        bisonData.put("bear", 20);
        bisonData.put("eagle", 0);
        bisonData.put("horse", 0);
        bisonData.put("deer", 0);
        bisonData.put("rabbit", 0);
        bisonData.put("mouse", 0);
        bisonData.put("goat", 0);
        bisonData.put("sheep", 0);
        bisonData.put("boar", 0);
        bisonData.put("bison", 0);
        bisonData.put("duck", 0);
        bisonData.put("caterpillar", 0);
        bisonData.put("plant", 0);
        data.put("bison", bisonData);

        Map<String, Integer> duckData = new HashMap<>();
        duckData.put("wolf", 40);
        duckData.put("boa", 10);
        duckData.put("fox", 60);
        duckData.put("bear", 10);
        duckData.put("eagle", 80);
        duckData.put("horse", 0);
        duckData.put("deer", 0);
        duckData.put("rabbit", 0);
        duckData.put("mouse", 0);
        duckData.put("goat", 0);
        duckData.put("sheep", 0);
        duckData.put("boar", 0);
        duckData.put("bison", 0);
        duckData.put("duck", 0);
        duckData.put("caterpillar", 0);
        duckData.put("plant", 0);
        data.put("duck", duckData);

        Map<String, Integer> caterpillarData = new HashMap<>();
        caterpillarData.put("wolf", 0);
        caterpillarData.put("boa", 0);
        caterpillarData.put("fox", 40);
        caterpillarData.put("bear", 0);
        caterpillarData.put("eagle", 0);
        caterpillarData.put("horse", 0);
        caterpillarData.put("deer", 0);
        caterpillarData.put("rabbit", 0);
        caterpillarData.put("mouse", 90);
        caterpillarData.put("goat", 0);
        caterpillarData.put("sheep", 0);
        caterpillarData.put("boar", 90);
        caterpillarData.put("bison", 0);
        caterpillarData.put("duck", 90);
        caterpillarData.put("caterpillar", 0);
        caterpillarData.put("plant", 0);
        data.put("caterpillar", caterpillarData);


        Map<String, Integer> plantData = new HashMap<>();
        plantData.put("wolf", 0);
        plantData.put("boa", 0);
        plantData.put("fox", 0);
        plantData.put("bear", 0);
        plantData.put("eagle", 0);
        plantData.put("horse", 100);
        plantData.put("deer", 100);
        plantData.put("rabbit", 100);
        plantData.put("mouse", 100);
        plantData.put("goat", 100);
        plantData.put("sheep", 100);
        plantData.put("boar", 100);
        plantData.put("bison", 100);
        plantData.put("duck", 100);
        plantData.put("caterpillar", 100);
        plantData.put("plant", 0);
        data.put("plant", plantData);

    }

    public static int getData(String animal, String predator) {
        Map<String, Integer> animalData = data.get(animal.toLowerCase());
        if (animalData == null) {
            return 0;
        }
        Integer value = animalData.get(predator.toLowerCase());
        return value == null ? 0 : value;
    }

    public static void addData(String animal, String predator, int value) {
        Map<String, Integer> animalData = data.computeIfAbsent(animal, k -> new HashMap<>());
        animalData.put(predator, animalData.getOrDefault(predator, 0) + value);
    }
}

