/**
 *  Java program to create PriorityQueue with specified initial capacity.
 */

package com.mycollections;

import java.util.PriorityQueue;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a PriorityQueue instance.
        PriorityQueue<Double> myQueue = new PriorityQueue<>(3);

        // Checking if myQueue is empty and printing to console
        System.out.println("Empty: " + myQueue.isEmpty()); // Output: true

        // Adding elements to myQueue
        myQueue.add(9.3);
        myQueue.add(12.2);
        myQueue.add(99.0);

        // Checking if myQueue is empty and printing to console
        System.out.println("Empty: " + myQueue.isEmpty()); // Output: false

        // Checking myQueue size and printing to console
        System.out.println("Size of myQueue is " + myQueue.size());

        // Peeking head element of myQueue and printing to console
        System.out.println("First element is " + myQueue.peek());

        // Printing myQueue elements and printing to console
        System.out.println(myQueue);

        // Polling and deleting head element of myQueue and printing to console
        System.out.println("First element is " + myQueue.poll());

        // Printing myQueue elements and printing to console
        System.out.println(myQueue);

        // Checking myQueue size and printing to console
        System.out.println("Size of myQueue is " + myQueue.size());

    }
}
