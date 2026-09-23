import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int smallestArraySize = 10000;
        int mediumArraySize = 100000;
        int largestArraySize = 1000000;

        int[] smallestRA1 = RandomArrayGenerator.generateRandomArray(smallestArraySize);
        int[] smallestRA2 = RandomArrayGenerator.generateRandomArray(smallestArraySize);
        int[] smallestRA3 = RandomArrayGenerator.generateRandomArray(smallestArraySize);

        int[] mediumRA1 = RandomArrayGenerator.generateRandomArray(mediumArraySize);
        int[] mediumRA2 = RandomArrayGenerator.generateRandomArray(mediumArraySize);
        int[] mediumRA3 = RandomArrayGenerator.generateRandomArray(mediumArraySize);

        int[] largestRA1 = RandomArrayGenerator.generateRandomArray(largestArraySize);
        int[] largestRA2 = RandomArrayGenerator.generateRandomArray(largestArraySize);
        int[] largestRA3 = RandomArrayGenerator.generateRandomArray(largestArraySize);

        //Note: if lines were not commented out, we would need to make clones of each array
        //rather than using the same arrays for each sorting method. This would ensure that
        //the arrays are not being sorted by the previously listed method in the code.

        //BubbleSort.bubbleSortAndTime(smallestRA1, smallestRA2, smallestRA3, smallestArraySize);

        //BubbleSort.bubbleSortAndTime(mediumRA1, mediumRA2, mediumRA3, mediumArraySize);

        //BubbleSort.bubbleSortAndTime(largestRA1, largestRA2, largestRA3, largestArraySize);

        //SelectionSort.selectionSortAndTime(smallestRA1, smallestRA2, smallestRA3, smallestArraySize);

        //SelectionSort.selectionSortAndTime(mediumRA1, mediumRA2, mediumRA3, mediumArraySize);

        //SelectionSort.selectionSortAndTime(largestRA1, largestRA2, largestRA3, largestArraySize);

        //MergeSort.mergeSortAndTime(smallestRA1, smallestRA2, smallestRA3, smallestArraySize);

        //MergeSort.mergeSortAndTime(mediumRA1, mediumRA2, mediumRA3, mediumArraySize);

        //MergeSort.mergeSortAndTime(largestRA1, largestRA2, largestRA3, largestArraySize);

        //HeapSort.heapSortAndTime(smallestRA1, smallestRA2, smallestRA3, smallestArraySize);

        //HeapSort.heapSortAndTime(mediumRA1, mediumRA2, mediumRA3, mediumArraySize);

        //HeapSort.heapSortAndTime(largestRA1, largestRA2, largestRA3, largestArraySize);

        QuickSort.quickSortAndTime(smallestRA1, smallestRA2, smallestRA3, smallestArraySize);

        QuickSort.quickSortAndTime(mediumRA1, mediumRA2, mediumRA3, mediumArraySize);

        QuickSort.quickSortAndTime(largestRA1, largestRA2, largestRA3, largestArraySize);
    }
}
