package lecture1.exercises;

public class FindOccurrenceOfNumbers {

    public static void main(String[] args) {
        int[] numbers = {7, 6, 1, 3, 7, 1, 9, 8, 6, 8, 7, 10, 4, 4, 5, 7};
        int[] counts = new int[10];
        //Count occurrences of numbers from one to ten
        for (int num: numbers) {
            counts[num - 1]++;
        }
        
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + 1 + " is in the array " + counts[i] + " times!");
        }
    }
}
