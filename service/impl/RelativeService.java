package HWSem3OOP.service.impl;


import HWSem3OOP.data.Human;
import HWSem3OOP.data.Relation;
import HWSem3OOP.data.Relative;

import java.util.ArrayList;
import java.util.List;

public class RelativeService {
    public List<Relative> findRelative(Human human, List<Relative> relatives) {
        List<Relative> relativeList = new ArrayList<>();
        for (Relative i : relatives) {
            if (i.getWhom() == human) {
                relativeList.add(i);
            }
        }
        return relativeList;
    }

    public List<Relative> findRelative(Human human, Relation relation, List<Relative> relatives) {
        List<Relative> relativeList = new ArrayList<>();
        for (Relative i : relatives) {
            if (i.getWhom() == human && i.getRelation() == relation) {
                relativeList.add(i);
            }
        }
        return relativeList;
    }

}
