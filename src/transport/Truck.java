package transport;

import enums.TruckCapacity;

public class Truck<T extends Driver> extends Transport implements Participant{
    public final String transportClass = "Грузовик";
    public char trueCategory = 'C';

    TruckCapacity   truckCapacity;

    public Truck(String brand, String model, float engineVolume, T driver, TruckCapacity truckCapacity ) {
        super(brand, model, engineVolume,driver);
        this.truckCapacity = truckCapacity;
    }
    public char getTrueCategory() {
        return trueCategory;
    }
    public void pitStop() {
        System.out.println(this + "заехал на пит-стоп");
    }
    public void bestTimeLap() {
        System.out.println(this + " лучшее время круга ");
    }
    public void maxSpeedLap() {
        System.out.println(this + " максимальная скорость");
    }

    public TruckCapacity getTruckCapacity() {
        return truckCapacity;
    }
    @Override
    public String printType() {
        return truckCapacity != null ? truckCapacity.toString() : "Данных по транспортному средству недостаточно";
    }

    @Override
    public String toString() {
        return transportClass + " "
                + getBrand() + ' '
                + getModel()
                + ": объём двигателя - " + getEngineVolume()
                + " " + printType()
                + "\n"
                ;
    }


}

