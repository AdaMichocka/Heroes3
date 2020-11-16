package pl.sdk;

import java.util.Objects;

public class Segment {

    private Point startPoint;
    private Point ednPoint;

    public Segment(Point startPoint, Point ednPoint) {
        this.startPoint = startPoint;
        this.ednPoint = ednPoint;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "startPoint=" + startPoint +
                ", ednPoint=" + ednPoint +
                ", length=" + calculateLength(this) +
                '}';
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEdnPoint() {
        return ednPoint;
    }

    public void setEdnPoint(Point ednPoint) {
        this.ednPoint = ednPoint;
    }

    @Override
    public boolean equals(Object aO) {
        return calculateLength(this) == calculateLength((Segment) aO);
    }

    private double calculateLength(Segment aSegment) {
        int diffX = aSegment.startPoint.getX() - aSegment.ednPoint.getX();
        int diffY = aSegment.startPoint.getY() - aSegment.ednPoint.getY();
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, ednPoint);
    }

    void draw() {
        System.out.println(toString());
    }
}
