package settings;

import java.util.HashMap;
import java.util.Map;

public class Settings {
    private static final Map<String, Integer> data = new HashMap<>();

    static {
        data.put("plant_growth_rate", 1); // in Milliseconds
    }

    public static int getValue(String string) {
        return data.get(string);
    }
}
