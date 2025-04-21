public class BfSelectionSort {
    public static void main(String args[])
    {
        int[] arr = {260,8,800,56};

        System.out.println("------Before Selection Sort-----");

        printArray(arr);

        selection(arr);//sorting array using selection sort algorithm

        System.out.println("-----After Selection Sort-----");

        printArray(arr);
    }

    public static void selection(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {  System.out.println("Sort Pass Number "+(i+1));
            int index = i;
            for (int j = i + 1; j < array.length; j++)
            {
                System.out.println("Comparing "+ array[index]  + " and " + array[j]);
                if (array[j] < array[index]){
                    System.out.println(array[index]  + " is greater than " + array[j] );
                    index = j;

                }
            }

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(array);
        }
    }
    static void printArray(int[] array){

        for(int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }


}
