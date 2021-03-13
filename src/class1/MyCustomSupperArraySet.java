package class1;

import java.util.Arrays;

public class MyCustomSupperArraySet implements Listable {
    int[] array = new int[0];

    @Override
    public int[] add(int number) {
        int[] array1 = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return array;
            }
            array1[i] = array[i];
        }
        array1[array1.length - 1] = number;
        array = array1;
        return array;

    }

    @Override
    public int[] remove(int index) {
        if (array.length == 0) {
            return array;
        } else {
            int[] array2 = new int[array.length - 1];
            for (int i = 0; i < index; i++) {
                array2[i] = array[i];
            }
            for (int i = index; i < array2.length; i++) {
                array2[i] = array[i + 1];
            }
            array = array2;
        }
        return array;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int[] swap(int index1, int index2) {
        int[] array3 = new int[array.length];

        int number1 = array[index1];
        int number2 = array[index2];
        int number;
        number = number1;
        number1 = number2;
        number2 = number;

        for (int i = 0; i < array.length; i++) {
            array3[i] = array[i];
        }

        array3[index1] = number1;
        array3[index2] = number2;

        array = array3;
        return array;
    }

    @Override
    public int[] addArray(int[] addArray) {

        int[] array4 = new int[array.length + addArray.length];

        for (int i = 0; i < array.length; i++) {
            array4[i] = array[i];
        }
        for (int i = array.length; i < addArray.length + array.length; i++) {
            array4[i] = addArray[i - array.length];
        }

        array = array4;
        return array;
    }

    @Override
    public String toString() {
        return "array = " + Arrays.toString(array);
    }

}
