package by.overone.homework23;

public class Main {

    public static void main(String[] args) {
        Num <Integer> intNum = new Num(1000);
        Num <Byte> byteNum = new Num((byte)12);
        Num <Short> shortNum = new Num((short)32767);
        Num <Long> longNum = new Num(805400193L);
        Num <Double> doubleNum = new Num(3.3);
        Num <Float> floatNum = new Num(1.12322342f);

        var result = longNum.add(floatNum);
        if (result == null){
            System.out.println("Error. Out of bounds type size.");
        }else {
            System.out.println(result);
        }
    }
}
