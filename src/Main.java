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


        // Start measuring execution time
        long startTime = System.nanoTime();

        //count_function(10000000);

        // Stop measuring execution time
        long endTime = System.nanoTime();

        // Calculate the execution time in milliseconds
        long executionTime = (endTime - startTime) / 1000000;

        System.out.println("Counting to 10000000 takes " + executionTime + "ms");
    }
}
