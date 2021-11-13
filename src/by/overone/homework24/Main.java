package by.overone.homework24;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your birthday: ");
        Input input = new Input();
        input.enterBirthday();
        String zodiac = Zodiac.getZodiacSign(input.getBirthMonth(),input.getBirthDay());
        System.out.println("Your zodiac sign: " + zodiac);
        IPrediction prediction = new IPrediction() {
            @Override
            public void predict() {
                System.out.println("Prediction: \u263B ");
                System.out.println("https://horo.mail.ru/prediction/" + zodiac.toLowerCase().substring(0, zodiac.length() - 2) + "/today/");
            }
        };
        prediction.predict();
    }
}
