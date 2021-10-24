package com.gyana.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test class to merge two sorted arrays
 */
public class ArrayMerge {

    private static int[] mergeArrays(int[] array1, int[] array2) {

        List<Integer> mergedArray = new ArrayList<>();

        //check if the 1st array is blank
        if (array1.length == 0) {
            return array2;
        }

        //check if the 2nd array is blank
        if (array2.length == 0) {
            return array1;
        }

        boolean done = false;
        int counter1 = 0, counter2 = 0;

        while (!done) {

            if (array1[counter1] < array2[counter2]) {
                mergedArray.add(array1[counter1]);
                counter1++;
            } else if (array1[counter1] == array2[counter2]) {
                mergedArray.add(array1[counter1]);
                counter1++;
                counter2++;
            } else {
                mergedArray.add(array2[counter2]);
                counter2++;
            }

            if (counter1 == array1.length) {
                for (int i = counter2; i < array2.length; i++) {
                    mergedArray.add(array2[i]);
                }
                done = true;
            } else if (counter2 == array2.length) {
                for (int i = counter1; i < array1.length; i++) {
                    mergedArray.add(array1[i]);
                }
                done = true;
            }
        }

        return mergedArray.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        var result = mergeArrays(new int[]{0, 5, 13, 16,99,111,112,888,999}, new int[]{0,1,2,3,4,5,6,7,8,9,10});
        System.out.println(Arrays.toString(result));
    }
}

//[1,4,5,8] , [0,9,21,8,89]
//1<0, add 0, increment array 2 counter
//1<9, add 1, increment array 1 counter

