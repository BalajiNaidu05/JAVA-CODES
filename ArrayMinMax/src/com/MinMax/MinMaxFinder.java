package com.MinMax;

import java.util.Scanner;

public class MinMaxFinder {

    /**
     * Finds the minimum element in an array of integers.
     *
     * @param A The input array.
     * @param N The size of the array.
     * @return The minimum element in the array.
     */
    public static int setmini(int[] A, int N)
    {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] < mini) {
                mini = A[i];
            }
        }
        return mini;
    }

    /**
     * Finds the maximum element in an array of integers.
     *
     * @param A The input array.
     * @param N The size of the array.
     * @return The maximum element in the array.
     */
    public static int setmaxi(int[] A, int N)
    {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (A[i] > maxi) {
                maxi = A[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	int N = read.nextInt();
        int A[] = new int[N];
        for (int i=0;i<N;i++)
        {
            A[i] = read.nextInt();
        }
        System.out.println("Minimum element is: "
                           + setmini(A, N));
        System.out.println("Maximum element is: "
                           + setmaxi(A, N));
        read.close();
    }
}
