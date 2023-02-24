package enums;

public enum TruckCapacity {
    N1 (-1F, 3.5F ) ,
    N2 (3.5F,12F),
    N3 (12F, -1F);

    private float fromWeight ;
    private float toWeight ;

    TruckCapacity(float fromWeight, float toWeight) {
        this.fromWeight = fromWeight;
        this.toWeight = toWeight;
    }

    public float getFromWeight() {
        return fromWeight;
    }

    public float getToWeight() {
        return toWeight;
    }

    public void setFromWeight(float fromWeight) {
        this.fromWeight = fromWeight;
    }

    public void setToWeight(float toWeight) {
        this.toWeight = toWeight;
    }

    @Override
    public String toString() {
        return " грузоподъёмность:"
                + (fromWeight >= 0 ? " от " + fromWeight + " тонн" : "")
                + (toWeight >= 0 ? " до " + toWeight + " тонн" : "" )
        ;
    }
}
