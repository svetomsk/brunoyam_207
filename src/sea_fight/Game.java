package sea_fight;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {
    public void play() {
        Ship ship = new Ship(2, 7, 4, false);
        Ship ship1 = new Ship(5, 8, 3, true);
        List<Ship> ships = new ArrayList<>();
        ships.add(ship);
        ships.add(ship1);

        ships = new ArrayList<>();
        ship = new Ship(6, 7, 1, false);
        ship1 = new Ship(3, 2, 1, false);
        ships.add(ship);
        ships.add(ship1);

        User first = new User(new Field(ships));
        User second = new User(new Field(ships));
        View view = new View();
        Random r = new Random();
        while(true) {
            // -----------------
            view.printField(first.getVisibleField());
            System.out.println("Enter coords: ");
            Point p = view.getCoords();
            int value = second.getUserField().getValue(p.x, p.y);
            int updatedValue = value;
            if (value == Field.SHIP) {
                updatedValue = Field.CRASHED_SHIP;
            } else if (value == Field.EMPTY) {
                updatedValue = Field.MISSED;
            }
            first.getVisibleField().setValue(p.x, p.y, updatedValue);
            second.getUserField().setValue(p.x, p.y, updatedValue);

            if(second.getUserField().isAllCrashed()) {
                System.out.println("Player wins");
                break;
            }
            // random turn
            int x = 1 + r.nextInt(10);
            int y = 1 + r.nextInt(10);
            value = first.getUserField().getValue(x, y);
            updatedValue = value;
            if (value == Field.SHIP) {
                updatedValue = Field.CRASHED_SHIP;
            } else if (value == Field.EMPTY) {
                updatedValue = Field.MISSED;
            }
            first.getUserField().setValue(x, y, updatedValue);
            view.printField(first.getUserField());
            if(first.getUserField().isAllCrashed()) {
                System.out.println("Computer wins");
                break;
            }
        }
        // ------------------
//        view.printField(first.getVisibleField());
        // print field
        // request coord
        // get value from (x, y)
        // set value to visible field

    }
}
