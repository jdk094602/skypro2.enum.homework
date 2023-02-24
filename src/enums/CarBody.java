package enums;

public enum CarBody{

    // Наполняем enum константами
    // Создаем их в соответствии с конструктором

    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    WAGON("Универсал"),
    OUTDOOR("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    // Создаем приватное поле
    private String nameBody;

    // Создаем конструктор, который принимает значение поля
    CarBody(String nameBody) {
        this.nameBody = nameBody;
    }

    // Создаем геттер для поля
    public String getNameBody() {
        return nameBody;
    }

    public void setNameBody(String nameBody) {
        this.nameBody = nameBody;
    }

    @Override
    public String toString() {
        return "Тип кузова: "
                + nameBody
                ;
    }
}
