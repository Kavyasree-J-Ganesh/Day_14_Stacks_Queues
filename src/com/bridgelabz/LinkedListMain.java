package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
       /* LinkedList<Integer> stack = new LinkedList<>();
        System.out.println("Stack after adding 70");                  // UC1 creating stack
        stack.prePend(70);
        System.out.println("Stack after adding 30");
        stack.prePend(30);
        System.out.println("Stack after adding 56");
        stack.prePend(56);
        System.out.println("");

        System.out.println("Stack after Removing 56");              // UC2 removing all elements from stacks
        stack.pop();
        stack.peak();
        System.out.println("Stack after Removing 30");
        stack.pop();
        stack.peak();
        System.out.println("Stack after Removing 56");
        stack.pop();
        stack.peak(); */


        LinkedList<Integer> queue = new LinkedList<>();
        System.out.println("Queue after adding 56");    // UC3 creating Queue
        queue.append(56);                               // enqueueing the queue(adding elements in to queue)
        System.out.println("Queue after adding 30");
        queue.append(30);                               // enqueueing the queue
        System.out.println("Queue after adding 70");
        queue.append(70);                               // enqueueing the queue
        System.out.println("");


        System.out.println("Queue after Removing 56");              // UC4 removing elements from queue
        queue.pop();                                            // Dequeueing element
        System.out.println("Queue after Removing 30");
        queue.pop();
        System.out.println("Queue after Removing 70");
        queue.pop();
    }
}

