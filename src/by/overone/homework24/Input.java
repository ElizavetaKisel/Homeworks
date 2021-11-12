package by.overone.homework24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Input {

    private String birthMonth;
    private int birthDay;
    Scanner scan = new Scanner(System.in);

    public void enterBirthday(){

        while (true) {
            String enter = scan.nextLine();

            Pattern p1 = Pattern.compile("[a-zA-Z]+");
            Matcher m1 = p1.matcher(enter);
            if (m1.find()) {
                this.birthMonth = m1.group();
            }
            p1 = Pattern.compile("\\d+");
            m1 = p1.matcher(enter);

            if (m1.find()) {
                this.birthDay = parseInt(m1.group());
            }
            try {
                if (birthDay <= Zodiac.Month.valueOf(birthMonth.toUpperCase()).getDays() & birthDay > 0) {
                    break;
                } else {
                    System.out.println("Nonexistent date. Please re-enter:");
                }
            }catch (IllegalArgumentException ex){
                System.out.println("Nonexistent month. Please re-enter:");
            }
        }
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
}
