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

        int [] smallBubble1 = smallestRA1.clone();
        int [] smallBubble2 = smallestRA2.clone();
        int [] smallBubble3 = smallestRA3.clone();

        //BubbleSort.bubbleSortAndTime(smallBubble1, smallBubble2, smallBubble3, smallestArraySize);

        int [] mediumBubble1 = mediumRA1.clone();
        int [] mediumBubble2 = mediumRA2.clone();
        int [] mediumBubble3 = mediumRA3.clone();

        //BubbleSort.bubbleSortAndTime(mediumBubble1, mediumBubble2, mediumBubble3, mediumArraySize);

        int [] largeBubble1 = largestRA1.clone();
        int [] largeBubble2 = largestRA2.clone();
        int [] largeBubble3 = largestRA3.clone();

        BubbleSort.bubbleSortAndTime(largeBubble1, largeBubble2, largeBubble3, largestArraySize);

    }
}
