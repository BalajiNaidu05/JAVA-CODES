package com.Lambda;
//Filename: SortStringsDescending.java
import java.util.ArrayList;
import java.util.List;

public class SortStringsDescending {
 public static void main(String[] args) {
     // Create a list of strings
     List<String> strings = new ArrayList<>();
     strings.add("apple");
     strings.add("orange");
     strings.add("banana");
     strings.add("kiwi");
     strings.add("grape");
     //Lambda Expression://
     strings.sort((s1, s2) -> s2.compareTo(s1));

     // Print the sorted list
     System.out.println("Sorted list in descending order:");
     for (String str : strings) {
         System.out.println(str);
     }
 }
}
