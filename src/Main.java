import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int smallestArraySize = 100000;
        int mediumArraySize = 1000000;
        int largestArraySize = 10000000;
        int[] smallestRA1 = RandomArrayGenerator.generateRandomArray(smallestArraySize);

        int[] smallestRA2 = RandomArrayGenerator.generateRandomArray(smallestArraySize);

        int[] smallestRA3 = RandomArrayGenerator.generateRandomArray(smallestArraySize);

        int[] mediumRA1 = RandomArrayGenerator.generateRandomArray(mediumArraySize);

        int[] mediumRA2 = RandomArrayGenerator.generateRandomArray(mediumArraySize);

        int[] mediumRA3 = RandomArrayGenerator.generateRandomArray(mediumArraySize);

        int[] largestRA1 = RandomArrayGenerator.generateRandomArray(largestArraySize);

        int[] largestRA2 = RandomArrayGenerator.generateRandomArray(largestArraySize);

        int[] largestRA3 = RandomArrayGenerator.generateRandomArray(largestArraySize);

        int [] smallBubble1 = smallestRA1.clone();
        // Start measuring execution time
        long smallBubble1startTime = System.nanoTime();
        BubbleSort.bubbleSort(smallBubble1);
        // Stop measuring execution time
        long smallBubble1endTime = System.nanoTime();
        // Calculate the execution time in milliseconds
        long smallBubble1ExecutionTime = (smallBubble1endTime - smallBubble1startTime) / 1000000;

        int [] smallBubble2 = smallestRA2.clone();
        long smallBubble2startTime = System.nanoTime();
        BubbleSort.bubbleSort(smallBubble2);
        long smallBubble2endTime = System.nanoTime();
        long smallBubble2ExecutionTime = (smallBubble2endTime - smallBubble2startTime) / 1000000;

        int [] smallBubble3 = smallestRA3.clone();
        long smallBubble3startTime = System.nanoTime();
        BubbleSort.bubbleSort(smallBubble3);
        long smallBubble3endTime = System.nanoTime();
        long smallBubble3ExecutionTime = (smallBubble3endTime - smallBubble3startTime) / 1000000;

        long avgSmallBubbleExecutionTime = (smallBubble1ExecutionTime + smallBubble2ExecutionTime +
                smallBubble3ExecutionTime) / 3;

        System.out.println("Using bubble sort on an array size of " + smallestArraySize +
                " takes on average " + avgSmallBubbleExecutionTime + " ms");
    }
}
