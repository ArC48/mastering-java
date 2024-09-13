package lecture4.examples.runningtime;

import lecture4.examples.ArrayUtils;

public class RunningTimeExamples {

    public static void main(String[] args) {
        int[] numbers = ArrayUtils.randomInts(100, 1, 100);
        int[] sortedNumbers = ArrayUtils.sortedArray(100);

        //Find middle. constant time
        int middleNumber = IntArrayAlg.getMiddle(numbers);
        System.out.println("Middle value of numbers array: " + middleNumber);
        System.out.println();

        //binary search. logarithmic
        int targetIndex = IntArrayAlg.binarySearch(sortedNumbers, 5);
        System.out.println("Target index binary Search: " + targetIndex);
        System.out.println();


        //Search. linear time
        int targetIndex2 = IntArrayAlg.search(numbers, 5);
        System.out.println("Target index linear Search: " + targetIndex2);
        System.out.println();

        //Are all Numbers Unique. quadratic
        boolean result = IntArrayAlg.areUnique(numbers);
        System.out.println("All Numbers unique: " + result);
    }
}
