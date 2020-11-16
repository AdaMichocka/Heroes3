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

    void moveCreature(Point aSourcePoint, Point aTargetPoint) {
        Creature creatureFromSourcePoint = map.get(aSourcePoint);
        if (map.containsKey(aTargetPoint)) {
            throw new IllegalArgumentException();
        }
        map.remove(aSourcePoint);
        map.put(aTargetPoint, creatureFromSourcePoint);
    }

}
