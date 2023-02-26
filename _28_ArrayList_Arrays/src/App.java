package _28_ArrayList_Arrays.src;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // Duplicate elements in list is supported
        // Insert order is maintained
        // Index based

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        // Retrieving
        // System.out.println(numbers);
        // System.out.println(numbers.get(2));

        // System.out.println("nIteration #1: ");
        // // Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // // Removing items
        numbers.remove(numbers.size() - 1);

        System.out.println("nIteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }

        // // List interface
        // List<String> values = new ArrayList<String>();
    }
}