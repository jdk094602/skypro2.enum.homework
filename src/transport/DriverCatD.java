package transport;

public class DriverCatD extends Driver {
    private final char trueCategory = 'D';

    public DriverCatD(String fio, char category, int experience) {
        super(fio, category, experience);
        if (category != trueCategory) {
            System.out.println(" Неправльная категоря прав у " + fio + " передано " + category + ",а ожидалась - " + trueCategory);
        }
    }


    @Override
    public String toString() {
        return "Водитель {"
                + getFio()
                + ": категория =" + getCategory()
                + ", cтаж =" + getExperience()
                + '}'
                ;
    }
}
