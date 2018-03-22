package functionLayer;

public class Order {

    private int id;
    private int length;
    private int width;
    private int height;
    private int userId;
    private House house;
    private String status;

    public Order(int length, int width, int height, int userId) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.userId = userId;
    }

    public Order(int id, int length, int width, int height, int userId, String status) {
        this.id = id;
        this.length = length;
        this.width = width;
        this.height = height;
        this.userId = userId;
        this.status = status;
        house = new House(length, width, height);
    }

    public String getStatus() {
        return status;
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
