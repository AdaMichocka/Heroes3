package pl.sdk.gui;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

public class BattleMapController {

    @FXML
    private GridPane gridMap;

    @FXML
    void initialize() {
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 15; y++) {
                Rectangle rec = new MapTile();
                gridMap.add(rec, x,y);
            }
        }
    }

}
