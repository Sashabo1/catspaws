package pl.sasha.src.hw4;

public class Hw2 {
    public static void main(String[] args) {
        int am = 1;
        int time = 24;
        int cycle = time / 3;

        for (int i = 0; i < cycle; i++) {
            am = am * 2;

        }
        System.out.println(am + " " + "амеб будет через 24 часа");
    }
}
