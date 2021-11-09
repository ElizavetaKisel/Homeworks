package by.overone.homework23;

public class Num <N extends Number>{
    private N num;
    public Num(){

    }

    public Num(N num){
       this.num = num;
    }

    public N add(Num<?> x) throws Exception{
        Double result = num.doubleValue() + x.getNum().doubleValue();
        return chooseType(result);
    }

    public N subtract(Num<?> x) throws Exception{
        Double result = num.doubleValue() - x.getNum().doubleValue();
        return chooseType(result);
    }

    public N multiply(Num<?> x) throws Exception{
        Double result = num.doubleValue() * x.getNum().doubleValue();
        return chooseType(result);
    }

    public N divide(Num<?> x) throws Exception{
        if (x.getNum().doubleValue() == 0.0){
            throw new ArithmeticException("Division by zero");
        }
        Double result = num.doubleValue() / x.getNum().doubleValue();
        System.out.println(result.doubleValue());
        return chooseType(result);
    }

    private N chooseType(Double result) throws Exception{

        Class<? extends Number> type = num.getClass();
        switch (type.getSimpleName()){
            case "Integer":
                if (result > Integer.MAX_VALUE | result < Integer.MIN_VALUE) {
                    throw new Exception("Out of Integer bounds size");
                }else {
                    return (N) (Integer) result.intValue();
                }
            case "Byte":
                if (result > Byte.MAX_VALUE | result < Byte.MIN_VALUE) {
                    throw new Exception("Out of Byte bounds size");
                }else {
                    return (N) (Byte) result.byteValue();
                }
            case "Short":
                if (result > Short.MAX_VALUE | result < Short.MIN_VALUE) {
                    throw new Exception("Out of Short bounds size");
                }else {
                    return (N) (Short) result.shortValue();
                }
            case "Long":
                if (result > Long.MAX_VALUE | result < Long.MIN_VALUE) {
                    throw new Exception("Out of Long bounds size");
                }else {
                    return (N) (Long) result.longValue();
                }
            case "Float":
                if (result == Float.POSITIVE_INFINITY | result == Float.NEGATIVE_INFINITY |
                        Float.compare(-0.0f, result.floatValue()) == 0 | Float.compare(+0.0f, result.floatValue()) == 0) {
                    throw new Exception("Out of Float bounds size");
                }else {
                    return (N) (Float) result.floatValue();
                }
            case "Double":
                if (result == Double.POSITIVE_INFINITY | result == Double.NEGATIVE_INFINITY |
                        Double.compare(-0.0f, result) == 0 | Double.compare(+0.0f, result) == 0) {
                    throw new Exception("Out of Double bounds size");
                }else {
                    return (N) result;
                }
        }

        return null;
    }

    public N getNum() {
        return num;
    }

    public void setNum(N num) {
        this.num = num;
    }
}

