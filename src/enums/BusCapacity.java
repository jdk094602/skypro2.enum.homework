package enums;

public enum BusCapacity {

    TINY(-1, 10),
    SMALL(11, 25),
    MEDIUM(40, 50),
    BIG(61,80),
    HUGE(100, 120);

    int fromCapacity;
    int toCapacity;

    BusCapacity(int fromCapacity, int toCapacity) {
        this.fromCapacity = fromCapacity;
        this.toCapacity = toCapacity;
    }

    public int getFromCapacity() {
        return fromCapacity;
    }

    public int getToCapacity() {
        return toCapacity;
    }

    public void setFromCapacity(int fromCapacity) {
        this.fromCapacity = fromCapacity;
    }

    public void setToCapacity(int toCapacity) {
        this.toCapacity = toCapacity;
    }

    @Override
    public String toString() {
        return " вместимость:"
                + (fromCapacity >= 0 ? " от " + fromCapacity + " мест" : "")
                + (toCapacity >= 0 ? " до " + toCapacity + " мест" : "" )
                ;
    }
}
