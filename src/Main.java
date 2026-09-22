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

        //BubbleSort.bubbleSortAndTime(smallestRA1, smallestRA2, smallestRA3, smallestArraySize);

        //BubbleSort.bubbleSortAndTime(mediumRA1, mediumRA2, mediumRA3, mediumArraySize);

        //BubbleSort.bubbleSortAndTime(largestRA1, largestRA2, largestRA3, largestArraySize);

        SelectionSort.selectionSortAndTime(smallestRA1, smallestRA2, smallestRA3, smallestArraySize);

        SelectionSort.selectionSortAndTime(mediumRA1, mediumRA2, mediumRA3, mediumArraySize);

        SelectionSort.selectionSortAndTime(largestRA1, largestRA2, largestRA3, largestArraySize);

    }
}
