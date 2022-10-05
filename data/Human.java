package HWSem3OOP.data;

/*
Класс Human со своими параметрами (пример: name, surname, age, gender);
Enum Relation содержащий типы связей между людей (пример: Родитель, Ребенок, Муж и тд)
Класс Relative содержащий в себе двух людей и связь между ними (Human, Human, Relation)
Записать в 2 коллекции [люди], [отношения];
Создать сервисы для взаимодействия с Human, Relative
Создать контроллер в котором используем логику сервисов по поиску по спискам Human и Relative
в main инициализировать коллекции и вызвать контроллер
*/

public class Human {

    private String name;

    private String surname;

    private String gender;

    private int age;

    public Human(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ' ' + surname + ' ' + "пол: " + gender + ", возраст: " + age + " лет.";
    }
}
