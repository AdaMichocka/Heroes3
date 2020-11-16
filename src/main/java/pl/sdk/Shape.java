package pl.sdk;

import java.util.List;

public class Shape {

    private final List<Point> points;

    public Shape(List<Point> aPoints) {
        points = aPoints;
    }

    void draw() {
        for (int i = 0; i < points.size() - 1; i++) {
            Segment s = new Segment(points.get(i), points.get(i + 1));
            s.draw();
        }
        Segment s = new Segment(points.get(points.size() - 1), points.get(0));
        s.draw();
    }
}
