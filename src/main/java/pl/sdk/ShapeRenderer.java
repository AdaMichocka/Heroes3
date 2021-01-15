package pl.sdk;

import javafx.scene.layout.AnchorPane;

import java.util.List;

public class ShapeRenderer {

    private final List<Point> points;

    public ShapeRenderer(List<Point> aPoints) {
        points = aPoints;
    }

    public void draw(AnchorPane aPane) {
        for (int i = 0; i < points.size() - 1; i++) {
            Segment s = new SelfishSegment(points.get(i), points.get(i + 1));
            aPane.getChildren().add(s);
        }
        Segment s = new SelfishSegment(points.get(points.size() - 1), points.get(0));
        aPane.getChildren().add(s);
    }

    public void draw() {
        for (int i = 0; i < points.size() - 1; i++) {
            Segment s = new Segment(points.get(i), points.get(i + 1));
            s.draw();
        }
        Segment s = new Segment(points.get(points.size() - 1), points.get(0));
        s.draw();
    }

    public List<Point> getPoints() {
        return points;
    }
}
