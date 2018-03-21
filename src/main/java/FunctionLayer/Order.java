package FunctionLayer;

public class Order {

    private int id;
    private int length;
    private int width;
    private int height;
    private int userId;

    public Order(int length, int width, int height, int userId) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.userId = userId;
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
