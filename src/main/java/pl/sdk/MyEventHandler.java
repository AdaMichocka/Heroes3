package pl.sdk;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class MyEventHandler implements EventHandler<MouseEvent> {


    @Override
    public void handle(MouseEvent aMouseEvent) {
        ((Segment) aMouseEvent.getSource()).setStroke(Color.YELLOW);
    }
}
