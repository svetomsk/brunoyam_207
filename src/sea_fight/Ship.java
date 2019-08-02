package sea_fight;

public class Ship {
    private int x;
    private int y;
    private int size;
    private boolean vertical;

    public Ship(int x, int y, int size, boolean vertical) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.vertical = vertical;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public boolean isVertical() {
        return vertical;
    }
}
