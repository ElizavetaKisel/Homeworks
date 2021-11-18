package by.overone.homework26;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("aba");
        list1.add("bbb");
        list1.add("aabb");

        System.out.println("Task 9: ");
        list1.stream()
                .filter(s -> s.startsWith("aa"))
                .forEach(System.out::println);

        List<Tester> list2 = new ArrayList<>();
        list2.add(new Tester(2, "bbaa"));
        list2.add(new Tester(12, "bbsvq"));
        list2.add(new Tester(4, "aabbb"));
        list2.add(new Tester(6, "bbbb"));

        System.out.println("Task 10: ");
        list2.stream()
                .filter(t -> t.getId() > 3 & t.getName().startsWith("bb"))
                .forEach(p -> System.out.println(p.toString()));
    }
}
