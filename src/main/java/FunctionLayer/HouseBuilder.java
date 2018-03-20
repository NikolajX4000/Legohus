package FunctionLayer;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {

    private int length;
    private int width;
    private int height;
    private List<HouseLayer> house;

    public HouseBuilder(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        house = new ArrayList<>();
    }
    
    void buildHouse() {
        for (int i = 1; i <= height; i++) {
            house.add(new HouseLayer(length, width, i));
        }
    }
}
