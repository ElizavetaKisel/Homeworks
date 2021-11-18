package by.overone.homework26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        IShape iShapeCircle = (a, b) -> Math.pow(a,2)* b;
        IShape iShapeSquare = (a, b) -> a * b;
        IShape iShapeTriangle = (a, b) -> a * b / 2;

        System.out.println("Task 1: ");
        System.out.println("Circle = " + iShapeCircle.getShape(2, Math.PI));
        System.out.println("Square = " +iShapeSquare.getShape(2, 5));
        System.out.println("Triangle = " +iShapeTriangle.getShape(2, 3));

        IComparsion comparsion = (a, b) -> {
            if (a < b){
                return a;
            }else if (a > b){
                return b;
            }else {
                return 0;
            }
        };
        System.out.println("Task 2: ");
        System.out.println(comparsion.compare(5, 20));
        System.out.println(comparsion.compare(5, 5));

        Predicate<String> startString = s -> {
            if(s.startsWith("XX")){
                return true;
            }else {
                return false;
            }
        };
        List<String> list= new ArrayList<>();
        list.add("XXhgvG");
        list.add("XzhgvG");
        list.add("XX");
        System.out.println("Task 3: ");
        System.out.println(Operation.getString(list, startString));
    }
}
