public class MergeSort {
    public static void mergeSortAndTime(int[] arr1, int[] arr2, int[] arr3, int size) {
        // time first run
        long startTime1 = System.nanoTime();
        mergeSort(arr1, 0,arr1.length - 1);
        long endTime1 = System.nanoTime();
        long executionTime1 = (endTime1 - startTime1) / 1000000;

        // time second run
        long startTime2 = System.nanoTime();
        mergeSort(arr2,0,arr1.length - 1);
        long endTime2 = System.nanoTime();
        long executionTime2 = (endTime2 - startTime2) / 1000000;

        // time third run
        long startTime3 = System.nanoTime();
        mergeSort(arr3,0,arr1.length - 1);
        long endTime3 = System.nanoTime();
        long executionTime3 = (endTime3 - startTime3) / 1000000;

        // calculate and print average
        long avgExecutionTime = (executionTime1 + executionTime2 + executionTime3) / 3;
        System.out.println("Using merge sort on an array size of " + size +
                " takes on average " + avgExecutionTime + " ms");
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) { arr[k++] = leftArr[i++]; }
        while (j < n2) { arr[k++] = rightArr[j++]; }
    }
}
