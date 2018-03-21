package FunctionLayer;

public class Order {

    private int id;
    private int length;
    private int width;
    private int height;
    private int userId;
    private House house;

    public Order(int length, int width, int height, int userId) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.userId = userId;
        house = new House(length, width, height);
    }

    public Order(int id, int length, int width, int height, int userId) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.height = height;
        this.userId = userId;
        house = new House(length, width, height);
    }

    public String getHouse() {
        return house.toString();
    }

    public int getId() {
        return id;
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

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

}
