package pl.sdk;

public class Point {
    private int x;
    private int y;

    public Point(int aX, int aY) {
        this.x = aX;
        this.y = aY;
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

    public double ghetDistanceToCenter() {
        return Math.sqrt(x * x + y * y);
    }
}
