package lecture1.exercises;

public class FilterPositiveOrEvenNumbers {

    public static void main(String[] args) {
        int[] numbers = {5, 3, -5, 8, 9, -15, 5, 68, 48, 15, -12, 35, -36, 88, 24};

        //Filter positive or even numbers
        for (int num : numbers) {
            if (num > 0 || num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
