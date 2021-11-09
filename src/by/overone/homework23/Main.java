package by.overone.homework23;

public class Main {

    public static void main(String[] args) throws Exception {

        Num <Integer> intNum = new Num(7);
        Num <Byte> byteNum = new Num((byte)0);
        Num <Short> shortNum = new Num((short)32767);
        Num <Long> longNum = new Num(805400193L);
        Num <Double> doubleNum = new Num(3.3);
        Num <Float> floatNum = new Num(2.7232232f);

        try {
            System.out.print(shortNum.getNum().shortValue() + " + " + longNum.getNum().longValue() + " = ");
            var result = shortNum.add(longNum);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.print(intNum.getNum().intValue() + " - " + floatNum.getNum().floatValue() + " = ");
            var result = intNum.subtract(floatNum);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.print(byteNum.getNum().byteValue() + " * " + doubleNum.getNum().doubleValue() + " = ");
            var result = byteNum.multiply(doubleNum);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.print(floatNum.getNum().floatValue() + " * " +intNum.getNum().intValue()  + " = ");
            var result = floatNum.multiply(intNum);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.print(shortNum.getNum().shortValue()  + " / " + byteNum.getNum().byteValue() + " = ");
            var result = shortNum.divide(byteNum);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
