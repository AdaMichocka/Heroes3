package pl.sdk;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class ShapeQueueTest {

    @Test
    void test() {
        Queue<Point> points = new LinkedList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 4));
        points.add(new Point(4, 4));
        points.add(new Point(4, 1));

    }

}
