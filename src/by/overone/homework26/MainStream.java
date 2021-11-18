package by.overone.homework26;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aba");
        list.add("bbb");
        list.add("aabb");

        System.out.println("Task 9: ");
        list.stream().filter(s -> s.startsWith("aa")).forEach(System.out::println);

    }
}
