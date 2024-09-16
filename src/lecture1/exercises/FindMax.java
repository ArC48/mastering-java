package lecture1.exercises;


public class FindMax {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 5, 8, 9, 15, 5, 68, 48, 15, 12, 35, 100};

        

        //Find max value in array and print to console
        int max = numbers[0];
        for (int num : numbers) {
            max = Integer.max(num, max);
        }

        System.out.println(max);
    }
}
