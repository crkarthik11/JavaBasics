package _28_ArrayList_Arrays.src;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // 10,20,30,40,50 . . .
        int[] a = new int[500];

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(30);
        numbers.add(null);
        numbers.add(0, 60);

        // // System.out.println(numbers);

        // // System.out.println(numbers.get(0));

        // for (int i = 0; i < numbers.size(); i++) {
        // System.out.println(numbers.get(i));
        // }

        // numbers.remove(0);
        // numbers.remove(0);
        // System.out.println("New 0th Element ::" + numbers.get(0));

        // for (int i = 0; i < numbers.size(); i++) {
        // System.out.println(numbers.get(i));
        // }

        // numbers.get(index)

        // 10 10 20 30 40 40 50 60

        HashSet<Integer> numSet = new HashSet<>();
        numSet.add(10);
        numSet.add(10);
        numSet.add(20);
        numSet.add(30);
        numSet.add(40);
        numSet.add(40);
        numSet.add(50);
        numSet.add(null);
        numSet.add(null);

        System.out.println(numSet);
        System.out.println("numSet remove null");
        numSet.remove(null);
        System.out.println(numSet);
    }
}
