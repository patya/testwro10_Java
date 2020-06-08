package homework_day_one.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadź pierwszą liczbę");
        Scanner myScanner = new Scanner(System.in);
        int numberOne = myScanner.nextInt();
        System.out.println("Wprowadź druga liczbę");
        int numberTwo = myScanner.nextInt();
        if (numberOne != numberTwo) {
            if (numberOne < numberTwo) {
                System.out.println("Mniejsza liczba to " + numberOne);
            } else {
                System.out.println("Mniejsza liczba to " + numberTwo);
            }
        } else {
            System.out.println("Podane liczby są równe");
        }
    }
}