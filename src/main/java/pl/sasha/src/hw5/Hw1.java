package pl.sasha.src.hw5;
import java.util.Scanner;
// по сути работает все хорошо!
public class Hw1 {
    // нужно отформатировать код
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kurs = 40.56;

        System.out.println("Пожалуйста, введите валюту:");

        String valute = sc.next();
        System.out.println("Количество валюты для обмена:");

        // здесь было бы хорошо назвать переменную иначе, чтобы было понятно, что в ней хранится
        double x = sc.nextDouble();
        if (valute.equals("eur") ) {
            System.out.println(x + "евро равны" + " " + (x * kurs) + " " + "гривен");
        }
          else if (valute.equals("uah") ) {
            System.out.println(x + " гривен равны" + " " + (x / kurs) + " " + "евро");
        }
            else {
              System.out.println("Эта валюта не поддерживается");

        }

    }
}
