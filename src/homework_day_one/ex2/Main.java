package homework_day_one.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the jungle");
        System.out.println("This program will show result of the equations");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int number = myScanner.nextInt();
        System.out.println("Enter second number");
        int numberSecond = myScanner.nextInt();
        System.out.println("Enter third number");
        int numberThird = myScanner.nextInt();
        int result = number + numberSecond + numberThird;
        System.out.println("The result of adding is " + result);
        int resultTwo = number - numberSecond - numberThird;
        System.out.println("The result of subtraction is " + resultTwo);
        int resultThree = number * numberSecond * numberThird;
        System.out.println("The result of multiply is  " + resultThree);
    }
}
