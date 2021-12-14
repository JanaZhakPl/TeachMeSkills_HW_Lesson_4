package com.teachmeskills.lesson_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * program increment each element of the given 3d array by input number using for-loops
 */
public class Task0 {

    public static void main(String[] args) {

        int[][][] myArray = { { { 1, 2 }, { 3, 4 } }, {{7,8}}};
        System.out.println(Arrays.deepToString(myArray));

        System.out.println("Enter the integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < myArray.length; i++)
            for (int j = 0; j < myArray[i].length; j++)
                for (int z = 0; z < myArray[j].length; z++)
                    myArray[i][j][z] += n;
        System.out.println(Arrays.deepToString(myArray));
    }
}