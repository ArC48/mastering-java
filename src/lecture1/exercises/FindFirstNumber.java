package lecture1.exercises;

public class FindFirstNumber {

    public static void main(String[] args) {
        int[][] numbers = new int[3][5];
        numbers[0] = new int[]{5, 9, 12, 36, 89};
        numbers[1] = new int[]{8, 21, 1, 19, 120};
        numbers[2] = new int[]{59, 1, 98, 7, 89};

        int target = 7;
        boolean found = false;
        //Print first occurrence of target. print only once
        for (int i = 0; i < numbers.length; i++) {
            if (found) {
                break;
            }

            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == target) {
                    System.out.println("List: " + i + " index: " + j);
                    found = true;
                    break;
                }
            }
        }

    }
}
