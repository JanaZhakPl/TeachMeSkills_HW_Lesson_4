package com.teachmeskills.lesson_4;

import java.util.Arrays;

/**
 * program sorts the elements in the rows of the two-dimensional array in ascending order
 */

public class Task5 {

    public static void main(String[] args) {

        int [][] myArray = {{3,1,5},{4,6,2}};
        Arrays.stream(myArray).forEach(Arrays::sort);
        System.out.println(Arrays.deepToString(myArray));
    }
        }




