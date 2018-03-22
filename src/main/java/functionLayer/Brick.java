package functionLayer;

class Brick {

    private int length;
    private int amount;

    public Brick(int length, int amount) {
        this.length = length;
        this.amount = amount;
    }

    public int getLength() {
        return length;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.length;
        hash = 17 * hash + this.amount;
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
        final Brick other = (Brick) obj;
        if (this.length != other.length) {
            return false;
        }
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(":");
        }
        return "{" + amount + " x [" + sb.toString() + "]}";
    }

}
