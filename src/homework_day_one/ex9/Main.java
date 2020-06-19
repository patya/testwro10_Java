package homework_day_one.ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imie");
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.next();
        StringBuilder reverseName = new StringBuilder();
        for (int i = name.length()-1; i >= 0; i--) {
            reverseName.append(name.charAt(i));
        }
        System.out.println(reverseName);
    }
}
