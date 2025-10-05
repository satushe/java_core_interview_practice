package java_core_interview_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);

        // Sorting
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Searching
        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        // Reverse Order
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // Min/Max Operations
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Min: " + min + ", Max: " + max);

        // Synchronization
        List<Integer> synchronizedList = Collections.synchronizedList(numbers);
        System.out.println("Synchronized List: " + synchronizedList);

        // Unmodifiable Collections
        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
        System.out.println("Unmodifiable List: " + unmodifiableList);
    }
}