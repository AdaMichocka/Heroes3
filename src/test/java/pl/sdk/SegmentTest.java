package pl.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SegmentTest {

    @Test
    void blabla() throws CloneNotSupportedException {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 1);
        Point point3 = new Point(1, 3);

        //   Point point1Copy = (Point) point1.clone(); //kopiowanie przez clone(), wyrzuca wyjątek, trzeba kastować
        Point point1Copy = new Point(point1); //kopiowanie przez konstruktor samokopiujący

//        Segment s1 = new Segment(point1, point2);
//        Segment s2 = new Segment(point1Copy, point3);
        //selfishsegment kopiuje w środku punkty.tak powinniśmy robić
        Segment ss1 = new SelfishSegment(point1, point2);
        Segment ss2 = new SelfishSegment(point1, point3);

        assertEquals(ss1, ss2);

        assertEquals(point1, point1Copy);
    }
}
