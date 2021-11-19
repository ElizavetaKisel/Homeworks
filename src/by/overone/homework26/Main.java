package by.overone.homework26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task 1: ");
        IShape iShapeCircle = (a, b) -> Math.pow(a,2)* b;
        IShape iShapeSquare = (a, b) -> a * b;
        IShape iShapeTriangle = (a, b) -> a * b / 2;

        System.out.println("Circle = " + iShapeCircle.getShape(2, Math.PI));
        System.out.println("Square = " +iShapeSquare.getShape(2, 5));
        System.out.println("Triangle = " +iShapeTriangle.getShape(2, 3));

        System.out.println("Task 2: ");
        IComparsion comparsion = (a, b) -> {
            if (a < b){
                return a;
            }else if (a > b){
                return b;
            }else {
                return 0;
            }
        };
        System.out.println(comparsion.compare(5, 20));
        System.out.println(comparsion.compare(5, 5));

        System.out.println("Task 3: ");
        Predicate<String> startString = s -> {
            if(s.startsWith("XX")){
                return true;
            }else {
                return false;
            }
        };
        List<String> list= new ArrayList<>();
        list.add("XXaaa");
        list.add("XaXaa");
        list.add("XX");
        list.add("aa");
        System.out.println(Operation.getString(list, startString));

        System.out.println("Task 4: ");
        int[] arr = new int[]{2,-4,9,-1,-100};
        Predicate<Integer> predicate = a -> {
            if(a > 0) {
                return true;
            }else{
                return false;
            }
        };
        for (int a: arr) {
            if(predicate.test(a)){
                System.out.println(a);
            }
        }
        System.out.println("Task 5: ");
        UnaryOperator<Double> unary = a -> Math.pow(a,2);
        System.out.println(unary.apply(7.2));
        BinaryOperator<String> binary = (s, s2) -> s + " " + s2;
        for (int i = 0; i < list.size() -1; i++){
            System.out.println(binary.apply(list.get(i), list.get(i+1)));
        }
        System.out.println("Task 6: ");
        Function<String, Double> function = s -> {
            String currency = "";
            double sum = 0;
            Pattern p1 = Pattern.compile("[a-zA-Z]+");
            Matcher m1 = p1.matcher(s);
            if (m1.find()) {
                currency = m1.group();
            }

            p1 = Pattern.compile("\\d+");
            m1 = p1.matcher(s);

            if (m1.find()) {
                sum = parseInt(m1.group());
            }

            switch (currency.toUpperCase()){
                case "BUN": return sum * 0.41;
                case "EUR": return sum * 1.14;
                case "USD": return sum;
                default:
                    return null;
            }
        };
        System.out.println(function.apply("200 bun "));
        System.out.println(function.apply("Eur 50"));

        System.out.println("Task 7: ");
        Consumer<String> consumer = s -> {
            String currency = "";
            double sum = 0;
            Pattern p1 = Pattern.compile("[a-zA-Z]+");
            Matcher m1 = p1.matcher(s);
            if (m1.find()) {
                currency = m1.group();
            }

            p1 = Pattern.compile("\\d+");
            m1 = p1.matcher(s);

            if (m1.find()) {
                sum = parseInt(m1.group());
            }

            switch (currency.toUpperCase()){
                case "BUN": System.out.println(sum * 0.41);
                break;
                case "EUR": System.out.println(sum * 1.14);
                break;
                case "USD": System.out.println(sum);
                break;
                default:
                    System.out.println("No such currency");;
            }
        };
        consumer.accept("180usd");
        consumer.accept("2r");

        System.out.println("Task 8:");
        Supplier<String> supplier = () -> {
            Scanner scan = new Scanner(System.in);
            StringBuffer str = new StringBuffer();
            return str.reverse().toString();
        };
        System.out.println();
    }
}
