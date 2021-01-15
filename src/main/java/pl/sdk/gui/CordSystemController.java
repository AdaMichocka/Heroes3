package pl.sdk.gui;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import pl.sdk.Point;
import pl.sdk.Segment;
import pl.sdk.ShapeRenderer;
import pl.sdk.ShapeSelfishRenderer;

import java.util.Arrays;

public class CordSystemController {

    @FXML
    AnchorPane pane;

    @FXML
    private void initialize() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 1);
        Point point3 = new Point(3, 3);
        Point point4 = new Point(1, 3);

        ShapeRenderer shape = new ShapeRenderer(Arrays.asList(point1, point2, point3, point4));
        ShapeSelfishRenderer shape2 = new ShapeSelfishRenderer(Arrays.asList(point1, point2, point3, point4));
        shape2.draw(pane);
        shape.draw(pane);

        shape.getPoints().get(2).setX(5);

        pane.getChildren()
                .stream()
                .filter(n -> n instanceof Segment)
                .map(Segment.class::cast)
                .forEach(s -> s.refreshGui());

    }

    private void refreshGui(Segment s1, Segment s2) {
        s1.refreshGui();
        s2.refreshGui();
    }

}
