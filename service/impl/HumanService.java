package HWSem3OOP.service.impl;

import HWSem3OOP.data.Human;

import java.util.List;

public class HumanService {

    public Human findHuman(List<Human> humanList, String name, String surname){
        Human humans;
        for (Human i: humanList) {
            if(i.getSurname().equals(surname) && i.getName().equals(name)){
                humans = i;
                return humans;
            }
        }
        return null;
    }

}
