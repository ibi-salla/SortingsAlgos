import org.junit.jupiter.api.Test;
class DcMergeSortTest {





        @Test
        public void positiveTest() {
            int[] actual = { 5, 1, 6, 2, 3, 4 };
            int[] expected = { 1, 2, 3, 4, 5, 6 };
            DcMergeSort.mergeSort(actual,actual.length);

        }



}