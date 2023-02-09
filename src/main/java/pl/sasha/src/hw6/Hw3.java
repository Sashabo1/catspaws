package pl.sasha.src.hw6;

import java.util.Arrays;

public class Hw3 {
    public static void main(String[] args) {

        int[] myArray = new int[]{3, 6, 14, 27, 13, 30};
        for (int i = 1; i < myArray.length; i++) {
            int res = i % 2;

            if (  res !=0){
                myArray[i] == 0;
            }

            else{
                myArray[i] = i;
            }
            System.out.println(myArray[i]);
        }

    }
}