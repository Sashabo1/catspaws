package pl.sasha.src.hw4;

public class Hw1 {

    public static void main(String[] args) {
        double a = 10;  // хорошо было бы назвать переменные более значимо, например initialDistance, sumDistance
        double b =  0;

        for (int i = 1; i <= 7; i++) {
            b = b + a;
            a = a + (a * 0.1);
        }
        System.out.println("Всего спортсмен пробежал" + " " + b + " " + "км");
    }

}
