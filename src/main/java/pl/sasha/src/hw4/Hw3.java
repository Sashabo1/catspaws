package pl.sasha.src.hw4;

public class Hw3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 256;

        int sum = 0;

        for (int i = a; i <= b; i = i * 2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
