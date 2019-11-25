package com.evan.strategy;
import	java.util.Arrays;

/**
 * @Description
 * @ClassName Main
 * @Author Evan
 * @date 2019.11.24 12:19
 */
public class Main {

    public static void main(String[] args) {
        int[] a = {9, 2, 3, 5, 7, 1, 4};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
