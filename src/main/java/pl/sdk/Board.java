package pl.sdk;

import java.util.HashMap;
import java.util.Map;

class Board {

    private final Map<Point, Creature> map;


    Board() {
        map = new HashMap<>();
    }

    void add(Point aPoint, Creature aCreature) {
        map.put(aPoint, aCreature);
    }

    Creature get(int aX, int aY) {
        return map.get(new Point(aX, aY));
    }
}
