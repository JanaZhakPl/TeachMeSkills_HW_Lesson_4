package com.teachmeskills.lesson_4;

/**
 * program creates two arrays( matrices) 3x3 of integers and multiply them.
 * first array: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}  second array: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Expected outcome:  1  2  3   1  1  1   0  0  0
 */

public class Task2 {

    public static void main(String[] args) {

        int[][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] multipleTable = new int[3][3];
        for (int i = 0; i < multipleTable.length; i++)
            for (int j = 0; j < multipleTable[i].length; j++)
                for (int k = 0; k < arr1.length; k++)
                    multipleTable[i][j] = multipleTable[i][j] + arr1[i][k] * arr2[k][j];

        for (int i = 0; i < multipleTable.length; i++) {
            for (int j = 0; j < multipleTable[0].length; j++) {
                System.out.print(" " + multipleTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
