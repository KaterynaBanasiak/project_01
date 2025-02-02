package task_01;

import java.util.Scanner;

public class main_01 {

    public static void main(String[] args) {

        //Task1

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter some number: ");
        int someNumber = number.nextInt();


        if (someNumber % 3 == 0) {
            System.out.println("Your number is divisible by three!");
        } else {
            System.out.println("Your number is not divisible by three!");

        }
    }
}