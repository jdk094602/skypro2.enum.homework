package transport;

public class Driver {
    private String fio;
    private char category; // категория прав . для простоты примем, что категория у водителя может быть только одна
    private int experience; // стаж в годах

    public Driver(String fio, char category, int experience) {
        this.fio = fio;
        this.category = category;
        this.experience = experience;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель {"
                + fio
                + ": категория =" + category
                + ", cтаж =" + experience
                + '}'
                ;
    }
}
