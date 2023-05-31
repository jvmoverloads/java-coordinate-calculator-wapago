package coordinate;

import java.util.*;

public class Points {

    private final List<Point> points;
    private final int length;

    public Points(String points) {
        String[] splitPoints = splitPointsInput(points);

        this.length = splitPoints.length;
        this.points = makePoints(splitPoints);
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getLength() {
        return length;
    }

    public String[] splitPointsInput(String points) {
        points = points.replace("(","").replace(")","");

        return points.split("-");
    }

    public List<Point> makePoints(String[] splitPoints) {
        return Arrays.stream(splitPoints).map(Point::new).toList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points1 = (Points) o;
        return length == points1.length && Objects.equals(points, points1.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points, length);
    }
}
