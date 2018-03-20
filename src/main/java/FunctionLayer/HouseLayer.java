package FunctionLayer;

import java.util.ArrayList;
import java.util.List;

public class HouseLayer {

    private int length;
    private int width;
    private int level;
    private List<Brick> top;
    private List<Brick> bot;
    private List<Brick> right;
    private List<Brick> left;

    public HouseLayer(int length, int width, int level) {
        this.length = length;
        this.width = width;
        this.level = level;
        top = new ArrayList<>();
        bot = new ArrayList<>();
        right = new ArrayList<>();
        left = new ArrayList<>();
        buildLayer();
    }
    
    private void buildLayer(){
        
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getLevel() {
        return level;
    }

    public List<Brick> getTop() {
        return top;
    }

    public List<Brick> getBot() {
        return bot;
    }

    public List<Brick> getRight() {
        return right;
    }

    public List<Brick> getLeft() {
        return left;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.length;
        hash = 53 * hash + this.width;
        hash = 53 * hash + this.level;
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
        final HouseLayer other = (HouseLayer) obj;
        if (this.length != other.length) {
            return false;
        }
        if (this.width != other.width) {
            return false;
        }
        if (this.level != other.level) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HouseLayer{" + '}';
    }
    
}
