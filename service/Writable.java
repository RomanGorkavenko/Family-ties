package HWSem3OOP.service;

import HWSem3OOP.data.Human;
import HWSem3OOP.data.Relative;

import java.util.List;

public interface Writable {
    void write(Human human, List<Relative> relatives);
}
