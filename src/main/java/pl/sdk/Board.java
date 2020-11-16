package pl.sdk;

import java.util.HashMap;
import java.util.Map;

class Board {

    private final Map<Point, Creature> map;


    Board() {
        map = new HashMap<>();
    }

    void add(Point aPoint, Creature aCreature) {
        if (map.containsKey(aPoint)) {
            throw new IllegalArgumentException();
        }
        map.put(aPoint, aCreature);
    }

    Creature get(int aX, int aY) {
        return map.get(new Point(aX, aY));
    }

    void moveCreature(Point aPoint, Creature aCreature) {
        Point oldPoint = getKeyFromValue(map, aCreature);
        map.remove(oldPoint);
        map.put(aPoint, aCreature);
    }

    static <K, V> K getKeyFromValue(Map<K, V> map, Object value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {

            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
