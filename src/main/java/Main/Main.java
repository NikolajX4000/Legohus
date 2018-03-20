package Main;

import FunctionLayer.House;
import FunctionLayer.Layer;

public class Main {

    public static void main(String[] args) {
        House h = new House(8,6,7);
        for (Layer l : h.getHouse()) {
            System.out.println(l);
        }
    }
}
