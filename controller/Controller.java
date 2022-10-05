package HWSem3OOP.controller;

import HWSem3OOP.data.Human;
import HWSem3OOP.data.Relation;
import HWSem3OOP.data.Relative;
import HWSem3OOP.service.impl.FileWriterService;
import HWSem3OOP.service.impl.HumanService;
import HWSem3OOP.service.impl.RelativeService;

import java.util.List;
import java.util.logging.Logger;

public class Controller {
    private final HumanService humanService;
    private final RelativeService relativeService;
    private final FileWriterService fileWriterService;

    public Controller() {
        this.humanService = new HumanService();
        this.relativeService = new RelativeService();
        this.fileWriterService = new FileWriterService();
    }

    Logger logger = Logger.getLogger(Controller.class.getName());

    /**
        * A method for searching and displaying family ties by first and last name.
        */
    public void findAndShowFamilyTiesByFirstAndLastName(String name, String surname, List<Human> humans,
                                                                  List<Relative> relatives){
        Human human = humanService.findHuman(humans, name, surname);
        logger.info("\nПоиск всех родственников для " + human);
        List<Relative> relativeList = relativeService.findRelative(human, relatives);
        fileWriterService.write(human, relativeList);
        printRelatives(relatives);
    }

        /**
        * A method for searching and displaying family ties by first and last name,
        * with an additional parameter for searching by relation.
        */
    public void findAndShowFamilyTiesByFirstAndLastName(String name, String surname, Relation relation,
                                                        List<Human> humans, List<Relative> relatives){
        Human human = humanService.findHuman(humans, name, surname);
        logger.info("\nПоиск " + relation + " для " + human);
        List<Relative> relativeList = relativeService.findRelative(human, relation, relatives);
        fileWriterService.write(human, relativeList);
        printRelatives(relativeList);
    }

    public void printRelatives(List<Relative> relatives){
        for (Relative i: relatives) {
            logger.info("Родственная связь --> " + i);
        }
    }
}
