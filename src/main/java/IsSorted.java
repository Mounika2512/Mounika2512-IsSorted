public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order), false if arr is not sorted.
     */
    public boolean checkSort(int[] arr) {
        // Check for null or empty array
        if (arr == null || arr.length <= 1) {
            return true; // Null or single-element arrays are considered sorted
        }

        // Iterate through the array to check for sorting
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Array is unsorted if the current element is greater than the next one
            }
        }

        // Array is sorted
        return true;
    }

}
