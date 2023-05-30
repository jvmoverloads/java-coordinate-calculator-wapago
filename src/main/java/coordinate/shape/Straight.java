package coordinate.shape;

import coordinate.Point;
import coordinate.Points;

import java.util.List;

public class Straight extends Polygon {

    protected static final String POLYGON_NAME = "STRAIGHT";
    protected static final int POINT_NUMBER = 2;
    protected final Points points;

    public Straight(Points points) {
        super(points, POINT_NUMBER, POLYGON_NAME);
        this.points = points;
    }

    @Override
    public double calculateDistance() {
        List<Point> vertexes = points.getPoints();
        Point point1 = vertexes.get(0);
        Point point2 = vertexes.get(1);

        return point1.getDistance(point2);
    }

    @Override
    void errorMessage() {
        throw new IllegalArgumentException("선은 최소 2개의 점이 필요함.");
    }
}
