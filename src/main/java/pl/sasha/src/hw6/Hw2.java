package pl.sasha.src.hw6;

import java.util.Arrays;
public class Hw2 {
    public static  void main(String[] args){
        int [] myArray = new int[] {4, 2, 9, 0, 5};

        int result = 0;
        for (int i : myArray){
            result += i;

        }
        System.out.println("Результат равен: " + result / myArray.length);
    }
}
