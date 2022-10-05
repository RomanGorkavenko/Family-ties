package HWSem3OOP.service.impl;

import HWSem3OOP.data.Human;
import HWSem3OOP.data.Relative;
import HWSem3OOP.service.Writable;

import java.io.*;
import java.util.List;

public class FileWriterService implements Writable {

    @Override
    public void write(Human human, List<Relative> relatives){

        File file = new File("GetRelative.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            StringBuilder str = new StringBuilder("Объект;" + human + ";\nРодственная связь;Родственник;\n");
            for (Relative relative: relatives) {
                str.append(relative.getRelation()).append(";").append(relative.getWho()).append(";\n");
            }
            fileWriter.append(String.valueOf(str)).append("\n");
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
