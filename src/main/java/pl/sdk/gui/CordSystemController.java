package pl.sdk.gui;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import pl.sdk.Point;
import pl.sdk.Segment;

public class CordSystemController {

    @FXML
    AnchorPane pane;

    @FXML
    private void initialize() {
        Point point = new Point(1, 1);
        Point point2 = new Point(2, 2);
        pane.getChildren().add(new Segment(point, point2));

    }

}
