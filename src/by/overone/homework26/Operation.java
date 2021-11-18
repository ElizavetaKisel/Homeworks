package by.overone.homework26;

import java.util.List;
import java.util.function.Predicate;

public class Operation {
    public static String getString(List<String> list, Predicate<String> lambda){
        String result = "";
        for (String str : list){
            if (lambda.test(str) == true){
                result = result + str + "\n";
            }
        }
        return result;
    }
}
