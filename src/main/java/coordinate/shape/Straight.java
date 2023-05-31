package coordinate.shape;

import coordinate.Point;
import coordinate.Points;

public class Straight extends Polygon {

    protected static final String POLYGON_NAME = "STRAIGHT";
    protected static final int POINT_NUMBER = 2;
    protected final Points points;

    public Straight(Points points) {
        super(points, POINT_NUMBER, POLYGON_NAME);
        this.points = points;
    }

    public static double calculateDistance(Point point1, Point point2) {
        int x1 = point1.getX();
        int y1 = point1.getY();

        int x2 = point2.getX();
        int y2 = point2.getY();


        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    @Override
    void errorMessage() {
        throw new IllegalArgumentException("선은 최소 2개의 점이 필요함.");
    }
}
