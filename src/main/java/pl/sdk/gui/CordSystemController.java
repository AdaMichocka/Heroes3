package pl.sdk.gui;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import pl.sdk.Point;
import pl.sdk.Segment;
import pl.sdk.SelfishSegment;

public class CordSystemController {

    @FXML
    AnchorPane pane;

    @FXML
    private void initialize() {
        Point point = new Point(1, 1);
        Point point2 = new Point(3, 1);
        Point point3 = new Point(1, 3);

        Segment s1 = new Segment(point, point2, Color.RED, 9);
        Segment s2 = new SelfishSegment(point, point3);

        pane.getChildren().addAll(s1, s2);

        s1.getStartPoint().setX(7);
        refreshGui(s1, s2);

    }

    private void refreshGui(Segment s1, Segment s2) {
        s1.refreshGui();
        s2.refreshGui();
    }

}
