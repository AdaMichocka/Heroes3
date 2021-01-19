package pl.sdk;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.util.List;

public class ShapeSelfishRenderer {

    private final List<Point> points;

    public ShapeSelfishRenderer(List<Point> aPoints) {
        points = aPoints;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void draw(AnchorPane aPane) {
        for (int i = 0; i < points.size() - 1; i++) {
            Segment s = new Segment(points.get(i), points.get(i + 1), Color.RED, 9);
            aPane.getChildren().add(s);
        }
        Segment s = new Segment(points.get(points.size() - 1), points.get(0), Color.RED, 9);
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
}
