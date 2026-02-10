package src.abs;

public enum SpotTypes {
    COMPACT(2.0),
    REGULAR(5.0),
    HANDICAPPED(2.0), // Note: Special logic applies for card holders
    RESERVED(10.0);

    private final double baseRate;

    SpotTypes(double baseRate) {
        this.baseRate = baseRate;
    }

    public double getBaseRate() {
        return baseRate;
    }
}
