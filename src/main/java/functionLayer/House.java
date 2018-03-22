package functionLayer;

import java.util.ArrayList;
import java.util.List;

public class House {

    private int length;
    private int width;
    private int height;
    private List<Layer> house;
    private List<Brick> bricks;

    public House(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        house = new ArrayList<>();
        bricks = new ArrayList<>();
        buildHouse();
        brickList();
    }

    private void buildHouse() {
        for (int i = 1; i <= height; i++) {
            house.add(new Layer(length, width, i));
        }

    }

    private void brickList() {
        int amount4 = 0;
        int amount2 = 0;
        int amount1 = 0;
        for (Layer l : house) {
            for (Brick b : l.getBricks()) {
                switch (b.getLength()) {
                    case 4: amount4 += b.getAmount(); break;
                    case 2: amount2 += b.getAmount(); break;
                    case 1: amount1 += b.getAmount(); break;
                }
            }
        }
        bricks.add(new Brick(4, amount4));
        bricks.add(new Brick(2, amount2));
        bricks.add(new Brick(1, amount1));
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
    
    @Override
    public String toString() {
        int amount4 = 0;
        int amount2 = 0;
        int amount1 = 0;
        for (Brick b : bricks) {
            switch (b.getLength()) {
                case (4): amount4 = b.getAmount(); break;
                case (2): amount2 = b.getAmount(); break;
                case (1): amount1 = b.getAmount(); break;
            }

        }
        return amount4 + " x [::::] " + amount2 + " x [::] " + amount1 + " x [:]";
    }
}
