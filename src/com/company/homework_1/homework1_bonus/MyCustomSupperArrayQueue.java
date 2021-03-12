package com.company.homework_1.homework1_bonus;

import java.util.Arrays;

public class MyCustomSupperArrayQueue implements Queueble {
    Integer[] array = new Integer[0];

    @Override
    public Integer[] add(int number) {
        Integer[] array1 = new Integer[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array1[array1.length - 1] = number;
        array = array1;
        return array;
    }

    @Override
    public Integer poll() {
        if (array.length == 0) {
            return null;
        } else {
            Integer[] array2 = new Integer[array.length - 1];
            Integer fistNumber = array[0];
            for (int i = 0; i < array2.length; i++) {
                array2[i] = array[i + 1];
            }
            array = array2;
            return fistNumber;
        }
    }

    @Override
    public Integer peek() {
        return array[0];
    }

    @Override
    public String toString() {
        return "array = " + Arrays.toString(array);
    }
}
