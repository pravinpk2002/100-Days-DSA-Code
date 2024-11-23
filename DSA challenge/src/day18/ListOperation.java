package day18;

import java.util.*;

public class ListOperation {
    public static void performOperations(List<Integer> list) {
        // Add Elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After adding elements: " + list);

        // Get Element
        System.out.println("Element at index 1: " + list.get(1));

        // Add Element at a Specific Index
        list.add(1, 15);
        System.out.println("After adding 15 at index 1: " + list);

        // Set Element at a Specific Index
        list.set(2, 25);
        System.out.println("After setting 25 at index 2: " + list);

        // Delete Element from an Index
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        // Size of the List
        System.out.println("Size of the list: " + list.size());

        // Loop/Iterate on the List
        System.out.print("Elements in the list: ");
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Sort the List
        Collections.sort(list);
        System.out.println("After sorting: " + list);

    }

    public static void main(String[] args) {
        System.out.println("ArrayList Operations:");
        performOperations(new ArrayList<>());

        System.out.println("\nLinkedList Operations:");
        performOperations(new LinkedList<>());

        System.out.println("\nVector Operations:");
        performOperations(new Vector<>());
    }

}