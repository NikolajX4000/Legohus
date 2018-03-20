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
        buildHouse();
    }

    private void buildHouse() {
        for (int i = 1; i <= height; i++) {
            house.add(new Layer(length, width, i));
        }

    }
    
    
    
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public List<Layer> getHouse() {
        return house;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.length;
        hash = 79 * hash + this.width;
        hash = 79 * hash + this.height;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final House other = (House) obj;
        if (this.length != other.length) {
            return false;
        }
        if (this.width != other.width) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        return true;
    }
}
