package FunctionLayer;

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
        
    }

    
}
