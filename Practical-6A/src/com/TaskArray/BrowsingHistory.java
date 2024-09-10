package com.TaskArray;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowsingHistory {
    private static Deque<String> history = new ArrayDeque<>();
    private static Deque<String> forwardStack = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBrowsing History System");
            System.out.println("1. Add New Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addPage(scanner);
                case 2 -> goBack();
                case 3 -> goForward();
                case 4 -> displayCurrentPage();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }

    private static void addPage(Scanner scanner) {
        System.out.print("Enter page URL: ");
        String page = scanner.nextLine();
        history.push(page);
        forwardStack.clear();
        System.out.println("Page added to history.");
    }

    private static void goBack() {
        if (history.size() > 1) {
            forwardStack.push(history.pop());
            displayCurrentPage();
        } else {
            System.out.println("No previous page.");
        }
    }

    private static void goForward() {
        if (!forwardStack.isEmpty()) {
            history.push(forwardStack.pop());
            displayCurrentPage();
        } else {
            System.out.println("No next page.");
        }
    }

    private static void displayCurrentPage() {
        if (!history.isEmpty()) {
            System.out.println("Current page: " + history.peek());
        } else {
            System.out.println("No pages in history.");
        }
    }
}
