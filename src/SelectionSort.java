public class SelectionSort {
    public static void selectionSortAndTime(int[] arr1, int[] arr2, int[] arr3, int size) {
        // time first run
        long startTime1 = System.nanoTime();
        selectionSort(arr1);
        long endTime1 = System.nanoTime();
        long executionTime1 = (endTime1 - startTime1) / 1000000;

        // time second run
        long startTime2 = System.nanoTime();
        selectionSort(arr2);
        long endTime2 = System.nanoTime();
        long executionTime2 = (endTime2 - startTime2) / 1000000;

        // time third run
        long startTime3 = System.nanoTime();
        selectionSort(arr3);
        long endTime3 = System.nanoTime();
        long executionTime3 = (endTime3 - startTime3) / 1000000;

        // calculate and print average
        long avgExecutionTime = (executionTime1 + executionTime2 + executionTime3) / 3;
        System.out.println("Using bubble sort on an array size of " + size +
                " takes on average " + avgExecutionTime + " ms");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
