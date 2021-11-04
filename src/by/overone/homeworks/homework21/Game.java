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

    public String wining(){
        if (Field.field[0][0].equals(Field.field[1][1]) && Field.field[0][0].equals(Field.field[2][2])){
            return Field.field[0][0];
        }
        if (Field.field[0][2].equals(Field.field[1][1]) && Field.field[0][2].equals(Field.field[2][0])){
            return Field.field[0][2];
        }
        for (int i = 0; i< Field.field.length; i++){

            if ( Field.field[i][0].equals(Field.field[i][1]) && Field.field[i][1].equals(Field.field[i][2]) ) {
                return Field.field[i][0];
            }
            for (int j = 0; j< Field.field[i].length; j++) {
                if ( Field.field[0][j].equals(Field.field[1][j]) && Field.field[1][j].equals(Field.field[2][j]) ) {
                    return Field.field[0][j];
                }
            }
        }

       return "null";
    }
}
