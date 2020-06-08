package homework_day_one.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz liczbę");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        if (number > 0 && number < 15) {
            System.out.println("Liczba jest większa od 0 i mniejsza od 15");
        } else {
            System.out.println("Liczba nie spełnia warunków");
        }
    }
}
