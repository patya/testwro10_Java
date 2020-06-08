package homework_day_one.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz liczbę");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        if (number < 100) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
    }
}
