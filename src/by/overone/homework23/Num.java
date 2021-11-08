package by.overone.homework23;

public class Num <N extends Number>{
    private N num;

    public Num add(Num<?> x){
        return new Num();
    }

    public Num subtract(Num<?> x){
        return new Num();
    }

    public Num multiply(Num<?> x){
        return new Num();
    }

    public Num divide(Num<?> x){
        return new Num();
    }

    public N getNum() {
        return num;
    }

    public void setNum(N num) {
        this.num = num;
    }
}
