package lecture1.examples;

import lecture2.examples.Car;

public class IterativeStatement {

    public static void main(String[] args) {
        int[] numbers = new int[] {-1, 5, 4, 15, -100};

        //for loop
        System.out.println("Print Numbers");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i=" + numbers[i]);
        }

        //print only positive numbers
        System.out.println("Print only positive numbers");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println("i=" + numbers[i]);
            }
        }

        //Enhanced for loop
        System.out.println("Print Numbers with enhanced for loop");
        for (int i : numbers) {
            System.out.println("i=" + i);
        }

        //While loop. count to 10
        System.out.println("Count to ten with while loop");
        int count = 1;
        while (count <= 10) {
            System.out.println("count=" + count);
            count++;
        }

        //Do while loop. count to 10
        System.out.println("Count to ten with do while loop");
        int count2 = 1;
        do {
            System.out.println("count=" + count2);
            count2++;
        } while (count2 <= 10);
    }
}
