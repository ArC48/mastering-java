package lecture1.exercises;

public class FindMaxOccurrence {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 5, 8, 9, 15, 5, 68, 48, 15, 12, 35};
        int target = 5;

        int occurenceTargetCount = 0;
        //Find count of occurrence of target number
        for (int number: numbers) {
            if (number == target) {
                occurenceTargetCount++;
            }
        }
        System.out.println(occurenceTargetCount);
    }
}
