package com.teachmeskills.lesson_4;

import java.util.Arrays;

/**
 *  program outputs the diagonals of the given array.
 */
public class Task4 {
    public static void main(String[] args) {
        int myArray[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i == j) {
                    System.out.print(myArray[i][j] + " ");
                }
            }
        }
        System.out.println();

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
            }
            System.out.print(myArray[i][myArray.length - 1 - i] + " ");
        }
    }
}
