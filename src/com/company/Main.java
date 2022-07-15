package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] num = {-5, -3, 22, 15, -23, 9, -6, -43, 35, 11, -18, 44,89, 23, -53};
        System.out.println(Arrays.toString(number(num)));
        int mus = Arrays.toString(number(num)).length();

        double average = IntStream.of(mus).average().getAsDouble();
        System.out.println(average);

        boolean isSorted = false; // Это доп.
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < num.length-1; i++) {
                if(num[i] > num[i+1]){
                    isSorted = false;

                    buf = num[i];
                    num[i] = num[i+1];
                    num[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(num));

    }


    public static int[] number(int[] num) {
        List<Integer> list = new ArrayList<>();
        for (int n : num) {
         if (n >= 0){
             list.add(n);
         }
        }
        int[] result  =new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).intValue();
        }
        return result;
    }
}












