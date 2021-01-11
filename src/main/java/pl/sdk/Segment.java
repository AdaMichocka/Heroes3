package pl.sdk;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.util.Objects;

public class Segment extends Line {

    private final Color color;
    private final double strokeWidth;
    private Point startPoint;
    private Point endPoint;

    public Segment(Point aStartPoint, Point aEndPoint, Color aColor, double aStrokeWidth) {
        startPoint = aStartPoint;
        endPoint = aEndPoint;
        color = aColor;
        strokeWidth = aStrokeWidth;

        refreshGui();
    }

    public Segment(Point aStartPoint, Point aEndPoint) {
        this(aStartPoint, aEndPoint, Color.BLUE, 5);
    }

    public void refreshGui() {
        setStartX(startPoint.getX() * 50 + 50);
        setStartY(350 - startPoint.getY() * 50);
        setEndX(endPoint.getX() * 50 + 50);
        setEndY(350 - endPoint.getY() * 50);

        setStrokeWidth(strokeWidth);
        setStroke(color);
    }

    @Override
    public String toString() {
        return "Segment{" +
                "startPoint=" + startPoint +
                ", ednPoint=" + endPoint +
                ", length=" + calculateLength(this) +
                '}';
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point ednPoint) {
        this.endPoint = ednPoint;
    }

    @Override
    public boolean equals(Object aO) {
        return calculateLength(this) == calculateLength((Segment) aO);
    }

    private double calculateLength(Segment aSegment) {
        int diffX = aSegment.startPoint.getX() - aSegment.endPoint.getX();
        int diffY = aSegment.startPoint.getY() - aSegment.endPoint.getY();
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(startPoint, endPoint);
//    }

    void draw() {
        System.out.println(toString());
    }
}
