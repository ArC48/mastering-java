package lecture4.examples.runningtime;

public class IntArrayAlg {

    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int lo = 0;
        int hi = array.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target < array[mid]) hi = mid - 1;
            else if (target > array[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int getMiddle(int[] a) {
        return a[a.length / 2];
    }

    public static boolean areUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j])
                    return false;
            }
        }
        return true;
    }
}
