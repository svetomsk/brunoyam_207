package sea_fight;

import java.util.List;

public class Field {
    public static final int EMPTY =         0x1b;
    public static final int SHIP =          0x10b;
    public static final int CRASHED_SHIP =  0x100b;
    public static final int MISSED =        0x1000b;

    private static final int FIELD_SIZE = 10;

    private int shipsLeft = 0;

    private int [][] data;

    public Field() {
        data = new int[FIELD_SIZE + 2][FIELD_SIZE + 2];
        for(int i = 1; i <= FIELD_SIZE; i++) {
            for(int j = 1; j <= FIELD_SIZE; j++) {
                data[i][j] = EMPTY;
            }
        }
    }

    public Field(List<Ship> ships) {
        this();
        if (!checkShips(ships)) {
            throw new IllegalArgumentException("Ships position is incorrect");
        }
    }

    private boolean isSeparate(Ship ship) {
        return true;
    }

    public int size() {
        return FIELD_SIZE;
    }

    private boolean checkShips(List<Ship> ships) {
        for(Ship ship : ships) {
            int x = ship.getX();
            int y = ship.getY();
            if(ship.isVertical()) {
                for(int i = 0; i < ship.getSize(); i++) {
                    if(isIncorrectRange(x + i, y) || data[x + i][y] != EMPTY) {
                        return false;
                    }
                    data[x + i][y] = SHIP;
                }
            } else {
                for(int i = 0; i < ship.getSize(); i++) {
                    if(isIncorrectRange(x, y + i) || data[x][y + i] != EMPTY) {
                        return false;
                    }
                    data[x][y + i] = SHIP;
                }
            }
            if(!isSeparate(ship)) {
                return false;
            }
            shipsLeft += ship.getSize();
        }
        return true;
    }

    private boolean isIncorrectRange(int x, int y) {
        return x <= 0 || x > FIELD_SIZE || y <= 0 || y > FIELD_SIZE;
    }

    public boolean setValue(int x, int y, int value) {
        if(isIncorrectRange(x, y)) {
            return false;
        }
        if(value == Field.CRASHED_SHIP) {
            shipsLeft--;
        }
        data[x][y] = value;
        return true;
    }

    public int getValue(int x, int y) {
        if(isIncorrectRange(x, y)) {
            throw new IllegalArgumentException("index out of range");
        }
        return data[x][y];
    }

    public boolean isAllCrashed() {
        return shipsLeft == 0;
    }
}
