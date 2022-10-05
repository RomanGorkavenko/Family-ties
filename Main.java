package HWSem3OOP;

import HWSem3OOP.controller.Controller;
import HWSem3OOP.data.Human;
import HWSem3OOP.data.Relation;
import HWSem3OOP.data.Relative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Relative> relativeList = new ArrayList<>();
        List<Human> humanList = new ArrayList<>();

        Human father = new Human("Игорь", "Покровский", "мужчина", 47);
        Human mather = new Human("Ирина", "Покровская", "женщина", 43);
        Human daughter = new Human("Галина", "Покровская", "женщина", 15);
        Human maternalGrandfather = new Human("Николай", "Ведерников", "мужчина", 75);

        humanList.add(father);
        humanList.add(mather);
        humanList.add(daughter);
        humanList.add(maternalGrandfather);

        relativeList.add(new Relative(father, mather, Relation.HUSBAND));
        relativeList.add(new Relative(mather, father, Relation.WIFE));
        relativeList.add(new Relative(father, daughter, Relation.FATHER));
        relativeList.add(new Relative(mather, daughter, Relation.MOTHER));
        relativeList.add(new Relative(daughter, father, Relation.DAUGHTER));
        relativeList.add(new Relative(daughter, mather, Relation.DAUGHTER));
        relativeList.add(new Relative(maternalGrandfather, daughter, Relation.MATERNAL_GRANDFATHER));
        relativeList.add(new Relative(daughter, maternalGrandfather, Relation.GRAND_DAUGHTER));
        relativeList.add(new Relative(maternalGrandfather, mather, Relation.FATHER));
        relativeList.add(new Relative(mather, maternalGrandfather, Relation.DAUGHTER));
        relativeList.add(new Relative(maternalGrandfather, father, Relation.FATHER_IN_LAW));
        relativeList.add(new Relative(father, maternalGrandfather, Relation.SON_IN_LAW));

        Controller controller = new Controller();

        controller.findAndShowFamilyTiesByFirstAndLastName("Галина", "Покровская",
                humanList, relativeList);

        controller.findAndShowFamilyTiesByFirstAndLastName("Ирина", "Покровская",
                Relation.DAUGHTER, humanList, relativeList);


    }
}
