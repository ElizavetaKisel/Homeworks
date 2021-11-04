package by.overone.homeworks.homework21;

public class Game {

    public int playerMove(int x, int y){

        try {
            if (Field.field[x-1][y-1] == " "){
                Field.field[x-1][y-1] = "x";
                return 1;
            }else {
                return -1;
            }
        }
        catch (ArrayIndexOutOfBoundsException ex){
            return 0;
        }
    }

    public void computerMove(){
        int a = 0;
        int b = 3;
        while (true){
            int x = a + (int) (Math.random() * b);
            int y = a + (int) (Math.random() * b);
            if (Field.field[x][y] == " "){
                Field.field[x][y] = "o";
                break;
            }
        }

    }
}
