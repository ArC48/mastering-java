package lecture4.examples;

import java.util.Random;

public class ArrayUtils {

    private static final Random random = new Random();

    public static int[] randomInts(int size, int lowerBound, int upperBound) {
        return random.ints(size, lowerBound, upperBound).toArray();
    }

    public static int[] sortedArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        return array;
    }
}
