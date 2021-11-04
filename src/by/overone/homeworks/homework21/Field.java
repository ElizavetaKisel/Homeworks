package by.overone.homeworks.homework21;


public class Field {
    static String [][] field = {{" "," "," "},
                         {" "," "," "},
                         {" "," "," "},};


    public static StringBuffer printField(){
        StringBuffer str = new StringBuffer();
        str.append(" " + field[0][0]+ " | " + field[0][1] + " | " + field[0][2]);
        str.append("\n---+---+---\n");
        str.append(" " + field[1][0]+ " | " + field[1][1] + " | " + field[1][2]);
        str.append("\n---+---+---\n");
        str.append(" " + field[2][0]+ " | " + field[2][1] + " | " + field[2][2]);
        return str;
    }

    public static boolean fullField(){
        for (int i = 0; i< field.length;i++){
            for (int j = 0; j< field[i].length; j++){
                if (field[i][j].equals(" ")){
                    return false;
                }
            }
        }
        return true;
    }

}

