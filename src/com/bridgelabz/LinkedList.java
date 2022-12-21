package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void prePend(T key) {                   // prepending    UC2
        Node<T> newNode = new Node(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        this.printLinkedList();
    }


    public void printLinkedList(){              // UC1
        Node ptr = head;   // ptr = pointer

        while(ptr != null){
            if(ptr.next !=null){
                System.out.print(ptr.key + "->");
            } else{
                System.out.print(ptr.key);
            }
            ptr = ptr.next;
        }

        System.out.println("");
    }
}
