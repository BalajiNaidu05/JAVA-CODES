package com.TaskArray;
import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    private static LinkedList<String> playlist = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addSong(scanner);
                case 2 -> removeSong(scanner);
                case 3 -> moveSong(scanner);
                case 4 -> displayPlaylist();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }

    private static void addSong(Scanner scanner) {
        System.out.print("Enter song name: ");
        String song = scanner.nextLine();
        playlist.add(song);
        System.out.println("Song added.");
    }

    private static void removeSong(Scanner scanner) {
        System.out.print("Enter song name to remove: ");
        String song = scanner.nextLine();
        if (playlist.remove(song)) {
            System.out.println("Song removed.");
        } else {
            System.out.println("Song not found.");
        }
    }

    private static void moveSong(Scanner scanner) {
        System.out.print("Enter current song position: ");
        int currentIndex = scanner.nextInt();
        System.out.print("Enter new position for the song: ");
        int newIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (currentIndex >= 0 && currentIndex < playlist.size() && newIndex >= 0 && newIndex < playlist.size()) {
            String song = playlist.remove(currentIndex);
            playlist.add(newIndex, song);
            System.out.println("Song moved.");
        } else {
            System.out.println("Invalid positions.");
        }
    }

    private static void displayPlaylist() {
        System.out.println("Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }
    }
}
