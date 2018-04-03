package main;

import functionLayer.House;
import functionLayer.Layer;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random rand = new Random();
        int length = rand.nextInt(20) + 8;
//        int length = 8;
        int width = rand.nextInt(20) + 5;
//        int width = 6;
        int height = rand.nextInt(20) + 7;
//        int height = 7;
        House h = new House(length, width, height);
        System.out.println("length = " + length + ", width = " + width + ", height = " + height);
        for (Layer l : h.getHouse()) {
            System.out.println(l);
        }
        System.out.println(h);
    }
}
