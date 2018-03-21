package FunctionLayer;

import java.util.ArrayList;
import java.util.List;

public class Layer {

    private int length;
    private int width;
    private int level;
    private List<Brick> top;
    private List<Brick> bot;
    private List<Brick> right;
    private List<Brick> left;
    private List<Brick> bricks;

    public Layer(int length, int width, int level) {
        this.length = length;
        this.width = width;
        this.level = level;
        top = new ArrayList<>();
        bot = new ArrayList<>();
        right = new ArrayList<>();
        left = new ArrayList<>();
        bricks = new ArrayList<>();
        buildLayer();
        bricks = mergeLists(mergeLists(top, bot), mergeLists(right, left));
    }

    private void buildLayer() {
        if (level % 2 == 0) {
            if (level <= 6) {
                buildBotDoor(length - 4);
            } else {
                buildBot(length);
            }
            if (level >= 3 && level <= 5) {
                buildTopWindow(length - 4);
            } else {
                buildTop(length);
            }
            buildSide(width - 4);
        } else {
            buildSide(width);
            if (level <= 6) {
                buildBotDoor(length - 8);
            } else {
                buildBot(length - 4);
            }
            if (level >= 3 && level <= 5) {
                buildTopWindow(length - 8);
            } else {
                buildTop(length - 4);
            }
        }
    }

    private void buildSide(int length) {
        buildRight(length);
        buildLeft(length);
    }

    private void buildTop(int length) {
        top.add(new Brick(4, length / 4));
        length %= 4;
        top.add(new Brick(2, length / 2));
        length %= 2;
        top.add(new Brick(1, length));
    }

    private void buildTopWindow(int length) {
        int len1 = length / 2;
        int len2 = length - len1;
        int amount4 = len1 / 4;
        len1 = len1 % 4;
        int amount2 = len1 / 2;
        len1 = len1 % 2;
        int amount1 = len1;
        top.add(new Brick(4, (len2 / 4) + amount4));
        len2 %= 4;
        top.add(new Brick(2, (len2 / 2) + amount2));
        len2 %= 2;
        top.add(new Brick(1, len2 + amount1));
    }

    private void buildBot(int length) {
        bot.add(new Brick(4, length / 4));
        length %= 4;
        bot.add(new Brick(2, length / 2));
        length %= 2;
        bot.add(new Brick(1, length));
    }

    private void buildBotDoor(int length) {
        int len1 = length / 2;
        int len2 = length - len1;
        int amount4 = len1 / 4;
        len1 = len1 % 4;
        int amount2 = len1 / 2;
        len1 = len1 % 2;
        int amount1 = len1;
        bot.add(new Brick(4, (len2 / 4) + amount4));
        len2 %= 4;
        bot.add(new Brick(2, (len2 / 2) + amount2));
        len2 %= 2;
        bot.add(new Brick(1, len2 + amount1));
    }

    private void buildRight(int length) {
        right.add(new Brick(4, length / 4));
        length %= 4;
        right.add(new Brick(2, length / 2));
        length %= 2;
        right.add(new Brick(1, length));
    }

    private void buildLeft(int length) {
        left.add(new Brick(4, length / 4));
        length %= 4;
        left.add(new Brick(2, length / 2));
        length %= 2;
        left.add(new Brick(1, length));
    }

    private List<Brick> mergeLists(List<Brick> l1, List<Brick> l2) {
        List<Brick> res = new ArrayList<>();
        int amount4 = 0;
        int amount2 = 0;
        int amount1 = 0;
        for (Brick b : l1) {
            switch (b.getLength()) {
                case 4: amount4 += b.getAmount(); break;
                case 2: amount2 += b.getAmount(); break;
                case 1: amount1 += b.getAmount(); break;
            }
        }
        for (Brick b : l2) {
            switch (b.getLength()) {
                case 4: amount4 += b.getAmount(); break;
                case 2: amount2 += b.getAmount(); break;
                case 1: amount1 += b.getAmount(); break;
            }
        }
        res.add(new Brick(4, amount4));
        res.add(new Brick(2, amount2));
        res.add(new Brick(1, amount1));
        return res;
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

    public List<Brick> getBricks() {
        return bricks;
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
        final Layer other = (Layer) obj;
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
        return "Layer " + level + '{' + amount4 + " x [::::] " + amount2 + " x [::] " + amount1 + " x [:]}";
    }

}
