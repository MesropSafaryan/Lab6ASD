package com;

import java.util.Random;
public class Main {
    private static int[] GetRandomArray(int size) {
        int maxValue = 100;
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue);
        }
        return array;
    }
    private static double calculatingSortingTime(SortAlgorithm srt, int[] arr){
        double startTime = System.nanoTime();
        srt.sort(arr);
        double stopTime = System.nanoTime();
        double time = stopTime - startTime;
        return time/1000000000;
    }
    public static void main (String[] args){
        SortAlgorithm srt = new SortAlgorithm();
        int N1 = 100;
        int N2 = 10000;
        int N3 = 1000000;
        var array1 = GetRandomArray(N1);
        var array2 = GetRandomArray(N2);
        var array3 = GetRandomArray(N3);
        System.out.println("100 елеметів було відсортовано за " + calculatingSortingTime(srt, array1) + " секунд");
        System.out.println("10000 елеметів було відсортовано за " + calculatingSortingTime(srt, array2) + " секунд");
        System.out.println("1000000 елеметів було відсортовано за " + calculatingSortingTime(srt, array3) + " секунд");
    }
}
