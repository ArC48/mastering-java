package lecture5.examples.filtering;

import java.util.List;

public class FilteringExample8 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 2, 8, 11, 7, 98, 85, 15, 23, 56, 78, 12, 76);

        //given values, double event numbers and count ones above 100

        int count = 0;

        for (Integer i : integers) {
            if (i % 2 == 0) {
                int doubleValue = i * 2;
                if (doubleValue > 100) {
                    count++;
                }
            }
        }

        System.out.println(count);

        long count2 = integers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .filter(i -> i > 100)
                .count();

        System.out.println(count2);
    }
}
