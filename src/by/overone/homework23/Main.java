package by.overone.homework23;

public class Main {

    public static void main(String[] args) {
        Num <Integer> intNum = new Num(0);
        Num <Integer> intNum1 = new Num(7);
        Num <Byte> byteNum = new Num((byte)12);
        Num <Short> shortNum = new Num((short)32767);
        Num <Long> longNum = new Num(805400193L);
        Num <Double> doubleNum = new Num(3.3);
        Num <Float> floatNum = new Num(2.12322342f);

        try {
            var result = intNum1.divide(intNum);
            System.out.println(result);
            if (result == null) {
                System.out.println("Error. Out of bounds type size.");
            } else {
                System.out.println(result);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
