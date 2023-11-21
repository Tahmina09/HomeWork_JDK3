package task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(compareArrays(first, second));
    }

    public static <T> boolean compareArrays(ArrayList<T> one, ArrayList<T> two) {
        if (one.size() != two.size()) {
            throw new RuntimeException("Массивы не равны.");
        } else if (one.equals(two)){
            return true;
        } else {
            return false;
        }
    }
}
