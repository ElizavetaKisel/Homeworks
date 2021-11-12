package by.overone.homework24;

import java.util.ArrayList;
import java.util.List;


public class Zodiac {
    static List<String> zodiacSign = new ArrayList<>();
    static {

        zodiacSign.add("Aries \u2648");
        zodiacSign.add("Taurus\u2649");
        zodiacSign.add("Gemini \u264A");
        zodiacSign.add("Cancer \u264B");
        zodiacSign.add("Leo \u264C");
        zodiacSign.add("Virgo \u264D");
        zodiacSign.add("Libra \u264E");
        zodiacSign.add("Scorpio \u264F");
        zodiacSign.add("Sagittarius \u2650");
        zodiacSign.add("Capricorn \u2651");
        zodiacSign.add("Aquarius \u2652");
        zodiacSign.add("Pisces \u2653");
    }
    public static String getZodiacSign(String birthMonth, int birthDay){
        String zodiac = Month.findZodiac(birthMonth, birthDay);
        return zodiac;
    }
    enum Month {
        MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31), JANUARY(31), FEBRUARY(29);

        private int days;

        Month(int days){
            this.days = days;
        }

        public static String findZodiac(String birthMonth, int birthDay){

            switch (valueOf(birthMonth.toUpperCase())){
                case MARCH:
                    if(birthDay < 21){
                        return zodiacSign.get(11);
                    }else {
                        return zodiacSign.get(0);
                    }
                case APRIL:
                    if(birthDay < 21){
                        return zodiacSign.get(0);
                    }else {
                        return zodiacSign.get(1);
                    }
                case MAY:
                    if(birthDay < 22){
                        return zodiacSign.get(1);
                    }else {
                        return zodiacSign.get(2);
                    }
                case JUNE:
                    if(birthDay < 22){
                        return zodiacSign.get(2);
                    }else {
                        return zodiacSign.get(3);
                    }
                case JULY:
                    if(birthDay < 23){
                        return zodiacSign.get(3);
                    }else {
                        return zodiacSign.get(4);
                    }
                case AUGUST:
                    if(birthDay < 22){
                        return zodiacSign.get(4);
                    }else {
                        return zodiacSign.get(5);
                    }
                case SEPTEMBER:
                    if(birthDay < 24){
                        return zodiacSign.get(5);
                    }else {
                        return zodiacSign.get(6);
                    }
                case OCTOBER:
                    if(birthDay < 24){
                        return zodiacSign.get(6);
                    }else {
                        return zodiacSign.get(7);
                    }
                case NOVEMBER:
                    if(birthDay < 23){
                        return zodiacSign.get(7);
                    }else {
                        return zodiacSign.get(8);
                    }
                case DECEMBER:
                    if(birthDay < 23){
                        return zodiacSign.get(8);
                    }else {
                        return zodiacSign.get(9);
                    }
                case JANUARY:
                    if(birthDay < 21){
                        return zodiacSign.get(9);
                    }else {
                        return zodiacSign.get(10);
                    }
                case FEBRUARY:
                    if(birthDay < 20){
                        return zodiacSign.get(10);
                    }else {
                        return zodiacSign.get(11);
                    }
            }
            return null;
        }

        public int getDays() {
            return days;
        }

        public void setDays(int days) {
            this.days = days;
        }
    }
}
