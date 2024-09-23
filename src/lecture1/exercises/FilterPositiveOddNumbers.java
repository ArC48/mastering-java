package lecture1.exercises;

public class FilterPositiveOddNumbers {

    public static void main(String[] args) {
        int[] numbers = {5, 3, -5, 8, 9, -15, -1, 5, 68, 48, 15, -12, 35, -36, 88, 24};

        // Filter positive and odd numbers
        for (int number : numbers) {
            if (number % 2 == 1 && number > 0) {
                System.out.println(number);
            }
        }
    }
}
