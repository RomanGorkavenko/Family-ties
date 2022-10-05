package HWSem3OOP.data;

public enum Relation {

    PARENT ("Родитель"),
    MOTHER ("Мать"),
    FATHER ("Отец"),
    HUSBAND ("Муж"),
    WIFE ("Жена"),
    CHILD ("Ребенок"),
    DAUGHTER ("Дочь"),
    BROTHER ("Брат"),
    SISTER ("Сестра"),
    UNCLE ("Дядя"),
    AUNT ("Тётя"),
    MATERNAL_GRANDFATHER ("Дед"),
    GRAND_DAUGHTER ("Внук"),
    FATHER_IN_LAW ("Тесть"),
    SON_IN_LAW ("Зять");

    private final String title;

    Relation(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
