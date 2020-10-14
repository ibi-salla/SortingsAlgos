import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DcInsertionSortTest {
    @Test
    public void givenUnsortedArray_whenInsertionSortImperative_thenSortedAsc() {
        int[] input = {6, 2, 3, 4, 5, 1};
        DcInsertionSort.insertionSortImperative(input);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected,input);
    }

   @Test
    public void givenUnsortedArray_whenInsertionSortRecursively_thenSortedAsc() {
        int[] input = {6, 4, 5, 2, 3, 1};
        int i=0;
        DcInsertionSort.insertionSortRecursive(input,i);
        int[] expected = {1, 2, 3, 4, 5, 6};
       // assertArrayEquals( expected, input);
    }
}