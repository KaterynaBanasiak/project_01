package task_02;

import java.util.Scanner;

public class main_03 {
    public static void main(String[] args) {


        //Task1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows on the aircraft: ");
        int numberOfRows = scanner.nextInt();

        System.out.println("Please enter how many seats are there in each row: ");
        int numberOfSeats = scanner.nextInt();

        System.out.println("Please enter the number of passengers who have purchased tickets: ");
        int numberOfPassengersWithTickets = scanner.nextInt();

        int numberOfFreeSeats = numberOfRows * numberOfSeats - numberOfPassengersWithTickets;

        System.out.println("There are " + numberOfFreeSeats + " empty seats left on the plane!");
    }
}