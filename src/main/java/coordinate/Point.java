package coordinate;

import java.util.ArrayList;
import java.util.List;

public class Point {

    private final List<String[]> strPointList = new ArrayList<>();
    private final int[] pointArray = new int[2];

    private final List<int[]> pointList = new ArrayList<>();

    private int x;
    private int y;

    public Point(String points) {
        pointsToList(points);
        parseStrPointList(this.strPointList);
        setPoint(pointList);
    }

    public void pointsToList(String points) {
        strPointList.add(points.split(","));
    }

    public void parseStrPointList(List<String[]> strPointList) {
        for (String[] point : strPointList) {
            pointArray[0] = Integer.parseInt(point[0]);
            pointArray[1] = Integer.parseInt(point[1]);

            pointList.add(pointArray);
        }
    }

    public void setPoint(List<int[]> pointList) {
        for (int[] point : pointList) {
            this.x = point[0];
            this.y = point[1];
        }
        System.out.println(this.x);
        System.out.println(this.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Point point) {
        int x = point.getX();
        int y = point.getY();

        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }
}
