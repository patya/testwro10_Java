package homework_day_one.ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz liczbę w przedziale od 0 do 20");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        if (number <= 8) {
            System.out.println("Otrzymana ocena to 1");
        } else if (number == 9 || number == 10) {
            System.out.println("Otrzymana ocena to 2");
        } else if (number <= 13) {
            System.out.println("Otrzymana ocena to 3");
        } else if (number <= 16) {
            System.out.println("Otrzymana ocena to 4");
        } else if (number > 17 ) {
            System.out.println("Otrzymana ocena to 5");
        }
    }
}