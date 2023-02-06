package pl.sasha.src.hw5;
import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        String y = sc.next();
        String dtp = sc.next();

        System.out.println("Введите объем двигателя");
        System.out.println("Страховались ли у нас раньше?");
        if (y.equals("да") ) {
            v = v * 0.8;
        }
        else {
            v = v * 1;
        }
        System.out.println("Были ли ДТП за последний год?");
        if (dtp.equals("да")) {
           v = v * 1.2;
        }
        else {
            v = v * 1;
        }
        System.out.println(v * 0.25);
    }
}
