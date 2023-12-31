package task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayInteger1 = {1, 2, 3, 4, 5};
        Integer[] arrayInteger2 = {1, 2, 3, 4, 5};
        System.out.println(compareArrays(arrayInteger1, arrayInteger2));
    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы не равны.");
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }
}
