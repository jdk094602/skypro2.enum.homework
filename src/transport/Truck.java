package transport;

public class Truck<T extends Driver> extends Transport implements Participant{
    public final String transportClass = "Грузовик";
    public char trueCategory = 'C';

    public Truck(String brand, String model, float engineVolume, T driver ) {
        super(brand, model, engineVolume,driver);
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
    public String toString() {
        return transportClass + " "
                + getBrand() + ' '
                + getModel()
                + ": объём двигателя - " + getEngineVolume()
                + "\n"
                ;
    }


}

