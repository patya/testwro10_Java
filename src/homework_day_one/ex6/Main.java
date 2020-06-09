package homework_day_one.ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("wpisz liczbę");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        if (number == 1){
            System.out.println("Styczeń");
        } else if (number ==2) {
            System.out.println("Luty");
        }else if (number == 3) {
            System.out.println("Marzec");
        }else if (number == 4) {
            System.out.println("Kwiecień");
        }else if (number == 5) {
            System.out.println("Maj");
        }else if (number == 6) {
            System.out.println("Czerwiec");
        }else if (number == 7) {
            System.out.println("Lipiec");
        }else if (number == 8) {
            System.out.println("Sierpień");
        }else if (number == 9) {
            System.out.println("Wrzesień");
        }else if (number == 10) {
            System.out.println("Październik");
        }else if (number == 11) {
            System.out.println("Listopad");
        }else if (number == 12) {
            System.out.println("Grudzień");
        } else {
            System.out.println("Liczba jest błędna");
        }
    }
}
