package pl.sasha.src.hw6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Arrays;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int first = sc.nextInt();

        System.out.println("Введите второе число");
        int second = sc.nextInt();

        System.out.println("Введите третье число");
        int third = sc.nextInt();
        System.out.println("Сумма: " + (first + second + third));

        int[] numbers = new int[]{first, second, third};

        System.out.println(Arrays.toString(numbers));
        boolean needToSort = true;

        while (needToSort) {
            needToSort = false;

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    swap(numbers, i, i - 1);
                    needToSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        int max = numbers[0];
        for (int j = 1; j < numbers.length; j++){
            if (numbers[j] > max){
                max = numbers[j];
            }
        }
        System.out.println("Максимальное число: " + max);

        int min = numbers[0];
        for (int j = 1; j < numbers.length; j++){
            if (numbers[j] < min) {
                min = numbers[j];
            }
        }
        System.out.println("Минимальное число: " + min);
    }
    private static void swap(int[] array, int left, int right){
            int tmp = array[right];
            array[right] = array[left];
            array[left] = tmp;






    }


}