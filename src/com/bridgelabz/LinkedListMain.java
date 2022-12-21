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

        LinkedList<Integer> stack = new LinkedList<>();
        System.out.println("Queue after adding 56");    // UC1 creating stack
        stack.append(56);                               // enqueing the queue
        System.out.println("Queue after adding 30");
        stack.append(30);                               // enqueing the queue
        System.out.println("Queue after adding 70");
        stack.append(70);                               // enqueing the queue
        System.out.println("");
    }
}

