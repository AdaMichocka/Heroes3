package pl.sdk.gui;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

class MapTile extends Rectangle {
    public MapTile() {
        super(40, 40, Color.WHITE);
        setStroke(Color.BLACK);
    }
}
