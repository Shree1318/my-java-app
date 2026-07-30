package cse;

import java.util.Scanner;

public class ad {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();
        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }

        System.out.println("The sum of the digits in " + originalNumber + " is " + sum);

        input.close();
    }
}
