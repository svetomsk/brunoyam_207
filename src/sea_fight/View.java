package sea_fight;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private Scanner sc;

    public View() {
        sc = new Scanner(System.in);
    }

    public void printField(Field f) {
        System.out.print("  ");
        for(int i = 0; i < f.size(); i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for(int i = 1; i <= f.size(); i++) {
            System.out.print(i + " ");
            for(int j = 1; j <= f.size(); j++) {
                switch (f.getValue(i, j)) {
                    case Field.EMPTY: {
                        System.out.print("_ ");
                        break;
                    }
                    case Field.SHIP:
                    case Field.CRASHED_SHIP: {
                        System.out.print("# ");
                        break;
                    }
                    case Field.MISSED: {
                        System.out.print("- ");
                        break;
                    }
                }
            }
            System.out.println();
        }
    }

    public Point getCoords() {
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            return new Point(x, y);
        } catch (InputMismatchException exc) {
            return new Point(-1, -1);
        }
    }

    public void close() {
        sc.close();
    }
}
