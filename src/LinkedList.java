package com.java.test;


public class LinkedList {
    public static void main(String args[])
    {

        NodeUtils<Integer> ll = new NodeUtils<>();

        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(50);
        ll.addNode(70);

        ll.InsertAtStart(15);

        ll.InsertAtEnd(75);

        ll.InsertInMiddle(15, 3);

        ll.deleteNode(70);

        ll.showData();


    }

}


