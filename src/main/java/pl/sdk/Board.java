package pl.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Board {

    private final Map<Point, Creature> map;
    public final static int WIDTH = 20;
    public final static int HEIGHT = 15;

    Board() {
        map = new HashMap<>();
    }

    void add(Point aPoint, Creature aCreature) {
        throwExceptionWhenFieldIsTakenOrOutsideMap(aPoint);
        map.put(aPoint, aCreature);
    }

    Creature get(int aX, int aY) {
        return map.get(new Point(aX, aY));
    }

    Point get(Creature aCreature) {
        return map.keySet().stream().filter(p -> map.get(p).equals(aCreature)).findAny().get();
    }

    void move(Creature aCreature, Point aTargetPoint) {
        move(get(aCreature), aTargetPoint);
    }

    void move(Point aSourcePoint, Point aTargetPoint) {
        Creature creatureFromSourcePoint = map.get(aSourcePoint);
        throwExceptionWhenFieldIsTakenOrOutsideMap(aTargetPoint);
        map.remove(aSourcePoint);
        map.put(aTargetPoint, creatureFromSourcePoint);
    }

    private void throwExceptionWhenFieldIsTakenOrOutsideMap(Point aPoint) {
        if (aPoint.getX() < 0 || aPoint.getX() > WIDTH || aPoint.getY() < 0 || aPoint.getY() > HEIGHT || map.containsKey(aPoint)) {
            throw new IllegalArgumentException();
        }
    }

}
