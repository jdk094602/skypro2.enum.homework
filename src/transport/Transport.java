package transport;

public abstract class Transport<T extends Driver>  {
    public final String transportClass = "Транспортное средство";
    public char trueCategory = ' ';

    private final String brand;
    private final String model;
    private float engineVolume; // объем двигателя

    private T driver;

    public Transport(String brand, String model, float engineVolume, T driver

    ) {
        this.brand = brand;
        this.model = model;
        this.setEngineVolume(engineVolume);
        this.driver = driver;
    }

    private void startMoving() {
        System.out.println(this + ": начали движение...");
    }
    private void stopMoving() {
        System.out.println( this + ": остановились ... ");
    }
    private static String fillString(String checkString, String defaultString) {
        return checkString == null || checkString == "" || checkString.isBlank() ? defaultString : checkString;
    }

    public String getBrand() {
        return fillString (brand,"default");
    }

    public String getModel() {
        return fillString (model,"default");
    }

    public float getEngineVolume() {
        return engineVolume <= 0 ? 1.5F : engineVolume ;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public char getTrueCategory() {
        return trueCategory;
    }

    public String trueDriver() {
        if (this.driver == null) {
            return "Не назначен водитель для: " + this ;
        }
        return  this.driver.getCategory() == this.getTrueCategory() ?
                    ("Водитель " + this.driver + " имеет права категории " + this.driver.getCategory()
                            + " и может учавствововать в гонках на " + this )
                :
                ("Водитель " + this.driver + " имеет права категории " + this.driver.getCategory()
                        + " и НЕ может учавствововать в гонках на " + this )
        ;
    }


    @Override
    public String toString() {
        return this.transportClass + " "
                + getBrand() + ' '
                + getModel()
                + ": объём двигателя - " + getEngineVolume()
                + "\n"
        ;
    }
}

