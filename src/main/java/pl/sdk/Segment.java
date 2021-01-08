package pl.sdk;

import javafx.scene.shape.Line;

import java.util.Objects;

public class Segment extends Line {

    private Point startPoint;
    private Point ednPoint;

    public Segment(Point aStartPoint, Point aEndPoint) {
        this.startPoint = aStartPoint;
        this.ednPoint = aEndPoint;

        setStartX(aStartPoint.getX() * 50 + 50);
        setStartY(350 - aStartPoint.getY() * 50);
        setEndX(aEndPoint.getX() * 50 + 50);
        setEndY(350 - aEndPoint.getY() * 50);

        setStrokeWidth(5);
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
