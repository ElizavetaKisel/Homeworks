package by.overone.homework24;

public enum Month {
    MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31), JANUARY(31), FEBRUARY(29);

    private int days;

    Month(int days){
        this.days = days;
    }

    public static String zodiacSign(String birthMonth, int birthDay){

        switch (valueOf(birthMonth.toUpperCase())){
            case MARCH:
                if(birthDay < 21){
                    return "Pisces";
                }else {
                    return "Aries";
                }
            case APRIL:
                if(birthDay < 21){
                    return "Pisces";
                }else {
                    return "Taurus";
                }
            case MAY:
                if(birthDay < 22){
                    return "Taurus";
                }else {
                    return "Gemini";
                }
            case JUNE:
                if(birthDay < 22){
                    return "Gemini";
                }else {
                    return "Cancer";
                }
            case JULY:
                if(birthDay < 23){
                    return "Cancer";
                }else {
                    return "Leo";
                }
            case AUGUST:
                if(birthDay < 22){
                    return "Leo";
                }else {
                    return "Virgo";
                }
            case SEPTEMBER:
                if(birthDay < 24){
                    return "Virgo";
                }else {
                    return "Libra";
                }
            case OCTOBER:
                if(birthDay < 24){
                    return "Libra";
                }else {
                    return "Scorpio";
                }
            case NOVEMBER:
                if(birthDay < 23){
                    return "Scorpio";
                }else {
                    return "Sagittarius";
                }
            case DECEMBER:
                if(birthDay < 23){
                    return "Sagittarius";
                }else {
                    return "Capricorn";
                }
            case JANUARY:
                if(birthDay < 21){
                    return "Capricorn";
                }else {
                    return "Aquarius";
                }
            case FEBRUARY:
                if(birthDay < 20){
                    return "Aquarius";
                }else {
                    return "Pisces";
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
