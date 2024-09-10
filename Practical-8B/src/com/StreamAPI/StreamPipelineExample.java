package com.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Create a stream pipeline to filter, double, and collect the even numbers
        List<Integer> processedNumbers = numbers.stream()
                                                .filter(n -> n % 2 == 0)   // Filter even numbers
                                                .map(n -> n * 2)           // Double each even number
                                                .collect(Collectors.toList()); // Collect into a list

        // Print the resulting list
        System.out.println("Processed Numbers: " + processedNumbers);
    }
}