package pl.sdk;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ShapeTest {


    @Test
    void shapeTest() {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 4));
        points.add(new Point(4, 4));
        points.add(new Point(4, 1));
        ShapeRenderer s = new ShapeRenderer(points);
        s.draw();

    }

    //TODO
    //klasa shape za pomocą kolejki i stack zamiast listy
    //zmiana klasy shape żeby przyjmowała nie punkty tylko segmenty, zobaczyc jak to bedzie wygladalo koedy 1.dodamy segment i 2.skopiowac w srodku z przesunieciem punktu startowego. sprawdzić co się stanie

}
