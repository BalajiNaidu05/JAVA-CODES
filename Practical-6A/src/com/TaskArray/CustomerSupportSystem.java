package com.TaskArray;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportSystem {
    private static Queue<String> tickets = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display All Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addTicket(scanner);
                case 2 -> processNextTicket();
                case 3 -> displayTickets();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        
        scanner.close();
    }

    private static void addTicket(Scanner scanner) {
        System.out.print("Enter ticket description: ");
        String ticket = scanner.nextLine();
        tickets.add(ticket);
        System.out.println("Ticket added.");
    }

    private static void processNextTicket() {
        if (!tickets.isEmpty()) {
            System.out.println("Processing ticket: " + tickets.poll());
        } else {
            System.out.println("No pending tickets.");
        }
    }

    private static void displayTickets() {
        System.out.println("Pending Tickets:");
        for (String ticket : tickets) {
            System.out.println("- " + ticket);
        }
    }
}
