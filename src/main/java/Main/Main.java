package Main;

import FunctionLayer.House;
import FunctionLayer.Layer;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random rand = new Random();
        int length = rand.nextInt(10) + 8;
        int width = rand.nextInt(10) + 6;
        int height = rand.nextInt(10) + 7;
        House h = new House(length, width, height);
        System.out.println("length = " + length + ", width = " + width);
        for (Layer l : h.getHouse()) {
            System.out.println(l);
        }
    }
}
