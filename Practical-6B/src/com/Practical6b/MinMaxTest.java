package com.Practical6b;
public class MinMaxTest {
    public static void main(String[] args) {
        // Testing with Integer array
        Integer[] intArray = {4, 2, 9, 1, 5};
        MinMax<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array: Min = " + intMinMax.findMin(intArray) + ", Max = " + intMinMax.findMax(intArray));

        // Testing with String array
        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMax<String> strMinMax = new MinMaxImpl<>();
        System.out.println("String Array: Min = " + strMinMax.findMin(strArray) + ", Max = " + strMinMax.findMax(strArray));

        // Testing with Character array
        Character[] charArray = {'a', 'z', 'c', 'b'};
        MinMax<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("Character Array: Min = " + charMinMax.findMin(charArray) + ", Max = " + charMinMax.findMax(charArray));

        // Testing with Float array
        Float[] floatArray = {3.14f, 1.59f, 2.65f, 5.35f};
        MinMax<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("Float Array: Min = " + floatMinMax.findMin(floatArray) + ", Max = " + floatMinMax.findMax(floatArray));
    }
}
