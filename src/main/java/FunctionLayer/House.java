package FunctionLayer;

import java.util.ArrayList;
import java.util.List;

public class House {

    private int length;
    private int width;
    private int height;
    private List<Layer> house;

    public House(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        house = new ArrayList<>();
    }
    
    void buildHouse() {
        for (int i = 1; i <= height; i++) {
            house.add(new Layer(length, width, i));
        }
    }
}
