package _31_Sets.src;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        // HashSet does not retain order.
        Set<String> set1 = new HashSet<String>();

        // LinkedHashSet remembers the order you added items in
        // Set<String> set1 = new LinkedHashSet<String>();

        // TreeSet sorts in natural order
        // Set<String> set1 = new TreeSet<String>();

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        System.out.println(set1);

        // if (!set1.isEmpty()) {
        // System.out.println("Set is empty after adding");
        // }

        // // Adding duplicate items does nothing.
        set1.add("mouse");

        System.out.println(set1);

        // // ///////// Iteration ////////////////

        for (String temp : set1) {
            System.out.println(temp);
        }

        // // ////////// Does set contains a given item? //////////
        // if (set1.contains("aardvark")) {
        // System.out.println("Contains aardvark");
        // }

        // if (set1.contains("cat")) {
        // System.out.println("Contains cat");
        // }

        // /// set2 contains some common elements with set1, and some new

        // Set<String> set2 = new TreeSet<String>();

        // set2.add("dog");
        // set2.add("cat");
        // set2.add("giraffe");
        // set2.add("monkey");
        // set2.add("ant");

        // ////////////// Intersection ///////////////////

        // Set<String> intersection = new HashSet<String>(set1);

        // intersection.retainAll(set2); // keeps similarities between set 1 and set 2

        // System.out.println(intersection);

        // ////////////// Difference /////////////////////////

        // Set<String> difference = new HashSet<String>(set2);

        // difference.removeAll(set1); // removes differences between set1 and set2,
        // prints what is left of set2
        // System.out.println(difference);
    }

}
