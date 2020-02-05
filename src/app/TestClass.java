package app;

import java.util.Locale;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        double number;
        NumberChecker numberChecker = new NumberChecker();

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        do{
            System.out.println("\nPodaj liczbe:");
            number = scanner.nextDouble();
            scanner.nextLine();
        }while(!numberChecker.isRightNumber(number));
        scanner.nextLine();

    }
}
