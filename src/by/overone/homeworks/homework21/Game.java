package by.overone.homeworks.homework21;

public class Game {

    public boolean playerMove(int x, int y){

        if (Field.field[x-1][y-1] == " "){
            Field.field[x-1][y-1] = "x";
            return true;
        }else {
            return false;
        }
    }

    public void computerMove(){
        int a = 0;
        int b = 2;
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
