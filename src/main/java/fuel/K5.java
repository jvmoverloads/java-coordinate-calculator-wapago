package fuel;

public class K5 extends Car{
    private final int DISTANCE_PER_LITER = 13;

    public K5(int distanceToTravel) {
        super(distanceToTravel);
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    double getTripDistance() {
        return super.distanceToTravel;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
