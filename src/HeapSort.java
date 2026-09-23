public class HeapSort {
    public static void heapSortAndTime(int[] arr1, int[] arr2, int[] arr3, int size) {
        // time first run
        long startTime1 = System.nanoTime();
        heapSort(arr1);
        long endTime1 = System.nanoTime();
        long executionTime1 = (endTime1 - startTime1) / 1000000;

        // time second run
        long startTime2 = System.nanoTime();
        heapSort(arr2);
        long endTime2 = System.nanoTime();
        long executionTime2 = (endTime2 - startTime2) / 1000000;

        // time third run
        long startTime3 = System.nanoTime();
        heapSort(arr3);
        long endTime3 = System.nanoTime();
        long executionTime3 = (endTime3 - startTime3) / 1000000;

        // calculate and print average
        long avgExecutionTime = (executionTime1 + executionTime2 + executionTime3) / 3;
        System.out.println("Using heapsort on an array size of " + size +
                " takes on average " + avgExecutionTime + " ms");
    }
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}
