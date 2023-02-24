package transport;

import enums.BusCapacity;

public class Bus<T extends Driver> extends Transport implements Participant {
    public final String transportClass = "Автобус";
    public char trueCategory = 'D';

    BusCapacity busCapacity;

    public Bus(String brand, String model, float engineVolume, T driver, BusCapacity busCapacity)
    {
        super(brand, model, engineVolume, driver);
        this.busCapacity = busCapacity;
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

    @Override
    public String printType() {
        return busCapacity != null ? busCapacity.toString() : "Данных по транспортному средству недостаточно";
    }

    @Override
    public String toString() {
        return this.transportClass + " "
                + getBrand() + ' '
                + getModel()
                + ": объём двигателя - " + getEngineVolume()
                + " " + printType()
                + "\n"
                ;
    }

}

