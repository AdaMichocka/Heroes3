package pl.sdk.gui;

import pl.sdk.GameEngine;
import pl.sdk.Point;

import java.util.ArrayList;

public class Start {

    public Start() {
        GameEngine game = new GameEngine(new ArrayList<>(), new ArrayList<>());
        game.move(new Point(5, 5));
    }
}
