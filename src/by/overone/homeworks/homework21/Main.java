package by.overone.homeworks.homework21;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Input input = new Input();
        int check;

        while (true) {

            System.out.println("Введите координаты:");

            while (true) {
                while (true){
                    check = input.enterСoordinates();
                    if (check == 1){
                        break;
                    }
                    System.out.println("Неверный ввод. Повторите:");
                }

                check = game.playerMove(input.getX(), input.getY());
                if (check == 1){
                    break;
                }else if (check == -1){
                    System.out.println("Поле уже занято. Повторите ввод:");
                }
                System.out.println("Неверный ввод. Повторите:");
            }

            game.computerMove();
            System.out.println(Field.printField());

            if(game.wining().equals("x")){
                System.out.println("Победа!!!");
                break;
            }else if (game.wining().equals("x")){
                System.out.println("Поражение(((");
                break;
            }
        }

    }
}
