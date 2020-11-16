package pl.sdk;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int aX, int aY) {
        this.x = aX;
        this.y = aY;
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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getDistanceToCenter() {
        return Math.sqrt(x * x + y * y);
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
