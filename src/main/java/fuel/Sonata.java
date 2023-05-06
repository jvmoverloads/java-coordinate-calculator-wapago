package fuel;

public class Sonata extends Car{
    private final int DISTANCE_PER_LITER = 10;

    public Sonata(int distanceToTravel) {
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
        return "Sonata";
    }
}
