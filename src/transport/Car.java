package transport;

import enums.CarBody;

public class Car<T extends Driver> extends Transport implements Participant {
    public final String transportClass = "Автомобиль";
    public char trueCategory = 'B';

    CarBody carBody;
    public Car(String brand, String model, float engineVolume, Driver driver, CarBody carBody) {
        super(brand, model, engineVolume, driver);
        this.carBody = carBody;
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
        return carBody != null ? carBody.toString() : "Данных по транспортному средству недостаточно";
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


