import java.util.Arrays;

public class BfSelectionSortAlgo {

    public static void main(String[] args) {
        int A[] = {8, 5, 9, 1, 7};
        int[] sortedArray = sort(A);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    public static int[] sort(int[] B) {
        int n = B.length;

        for (int j = 0; j < n - 1; j++) {
            int index = j; // Initialize index of minimum element
            for (int i = j + 1; i < n; i++) {
                if (B[i] < B[index]) {
                    index = i; // Update index if a smaller element is found
                }
            }
            // Swap the found minimum element with the first element
            int temp = B[j];
            B[j] = B[index];
            B[index] = temp;
        }

        return B; // Return the sorted array
    }
}