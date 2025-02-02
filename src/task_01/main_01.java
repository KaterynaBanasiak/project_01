package task_01;

import java.util.Scanner;

public class main_01{

    public static void main(String[] args) {

        //Task1

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter some number: ");
        int someNumber = number.nextInt();


        if (someNumber % 3 == 0) {
            System.out.println("Your number is divisible by three!");
        } else {
            System.out.println("Your number is not divisible by three!");

            //Task2


            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter first number: ");
            double number1 = scanner.nextDouble();

            System.out.println("Please enter second number: ");
            double number2 = scanner.nextDouble();

            System.out.println("Please enter third number: ");
            double number3 = scanner.nextDouble();

            double total = number1 + number2 + number3;

            if (total % 2 == 0 && total > 0) {
                System.out.println("The sum of the three numbers is positive and even.");
            } else {
                System.out.println("The sum of the three numbers is: " + total);
            }
        }
    }
}
