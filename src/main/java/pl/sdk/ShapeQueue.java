package pl.sdk;

import java.util.Queue;

public class ShapeQueue {

    private final Queue<Point> points;


    public ShapeQueue(Queue<Point> aPoints) {
        points = aPoints;
    }

    public void draw() {
        Point head = points.peek();
        for (int i = 0; i <= points.size(); i++) {
            Segment s = new Segment(points.poll(), points.peek());
            s.draw();
        }
        Segment s = new Segment(points.poll(), head);
        s.draw();
    }
}
