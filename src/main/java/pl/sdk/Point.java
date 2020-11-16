package pl.sdk;

import java.util.Objects;

class Point {

    final private int x;
    final private int y;

    Point(int aX, int aY) {
        this.x = aX;
        this.y = aY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}
