package by.overone.homeworks.homework21;



public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Input input = new Input();
        int b;

        while (true) {
            game.computerMove();
            System.out.println(Field.printField());
            System.out.println("Введите координаты");
            input.enterСoordinates();
            b = game.playerMove(input.getX(), input.getY());

            if (b != 1) {

                while (b != 1) {
                    System.out.println("3");
                    System.out.println("Повторите ввод");
                    input.enterСoordinates();
                    b = game.playerMove(input.getX(), input.getY());
                }
            }
            System.out.println(Field.printField());


        }

    }
}
