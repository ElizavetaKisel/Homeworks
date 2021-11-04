package by.overone.homeworks.homework21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private int x;
    private int y;
    Scanner scan = new Scanner(System.in);

    public int enterСoordinates(){

        try {
            x = scan.nextInt();
            y = scan.nextInt();
            return 1;
        }
        catch (InputMismatchException ex){
            scan.nextLine();
            return 0;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
