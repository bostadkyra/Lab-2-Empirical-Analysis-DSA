public class BubbleSort {
    // timing method that takes the three arrays of the same size
    public static void bubbleSortAndTime(int[] arr1, int[] arr2, int[] arr3, int size) {
        // time first run
        long startTime1 = System.nanoTime();
        bubbleSort(arr1);
        long endTime1 = System.nanoTime();
        long executionTime1 = (endTime1 - startTime1) / 1000000;

        // time second run
        long startTime2 = System.nanoTime();
        bubbleSort(arr2);
        long endTime2 = System.nanoTime();
        long executionTime2 = (endTime2 - startTime2) / 1000000;

        // time third run
        long startTime3 = System.nanoTime();
        bubbleSort(arr3);
        long endTime3 = System.nanoTime();
        long executionTime3 = (endTime3 - startTime3) / 1000000;

        // calculate and print average
        long avgExecutionTime = (executionTime1 + executionTime2 + executionTime3) / 3;
        System.out.println("Using bubble sort on an array size of " + size +
                " takes on average " + avgExecutionTime + " ms");
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
