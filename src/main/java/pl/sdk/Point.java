package pl.sdk;

import javafx.scene.shape.Line;

import java.util.Objects;

public class Point extends Line {
    private int x;
    private int y;
    private double distanceToCenter;

    public Point(int aX, int aY) {
        this.x = aX;
        this.y = aY;

        distanceToCenter = Math.sqrt(x * x + y * y);

        setStartX(aX * 50 + 50);
        setStartY(350 - aY * 50);
        setEndX(aX * 50 + 50);
        setEndY(350 - aY * 50);

        setStrokeWidth(5);
    }

    public Point(Point aPoint1) {
        this(aPoint1.x, aPoint1.y); //constructor chain. tak robić!
    }

    public int getX() {
        return x;
    }

    public void setX(int aX) {
        this.x = aX;
    }

    public int getY() {
        return y;
    }

    public void setY(int aY) {
        this.y = aY;
    }

    double getDistanceToCenter() {
        return distanceToCenter;
    }

    void setDistanceToCenter(double aDistanceToCenter) {
        distanceToCenter = aDistanceToCenter;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        Point point = (Point) aO;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Point(x, y);
    }
}
