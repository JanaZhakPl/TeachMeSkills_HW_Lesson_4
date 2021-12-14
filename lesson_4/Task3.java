package com.teachmeskills.lesson_4;

/**
 * program sums all elements of the array that have been created
 */

public class Task3 {
    public static void main(String[] args) {
        int[][] myArray = {{1,2,3},{4,5,6}};
        int sum = 0;

        for (int [] first :myArray){
            for (int second : first){
                sum += second;
            }
        }
        System.out.println(sum);
    }
}
