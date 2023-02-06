package com.java.test;

public class NodeUtils<T> {
    public Node head;
    public Node tail;
    public void addNode(T data) {


        Node<T> newNode = new Node<>();
        newNode.setData(data);
        newNode.setNextNode(null);

        if(head==null) {
            head = newNode;

        } else {
            Node<T> tempNode = head;
            for (int i=0; tempNode.getNextNode() != null; i++){
                tempNode = tempNode.getNextNode();
            }
            tempNode.setNextNode(newNode);
        }

    }
    public void InsertAtStart(T data) {

        Node<T> newNode = new Node<>();
        newNode.setData(data);
        newNode.setNextNode(null);

        newNode.nextNode = head;
        head= newNode;

    }
    public void InsertAtEnd(T data) {
        Node<T> newNode = new Node<>();
        newNode.setData(data);
        newNode.setNextNode(null);

        Node<T> temp1 = head;

        while (null != temp1.nextNode) {
            temp1 = temp1.nextNode;
        }
        temp1.nextNode = newNode;
    }
    public void InsertInMiddle(T data, int position) {
        Node<T> newNode = new Node<>();
        newNode.setData(data);
        newNode.setNextNode(null);

        Node<T> t1 = head;

        int count = 0;

        while(count < position - 1) {
            t1 = t1.nextNode;
            count++;
        }
        Node<T> t2 = t1.nextNode;
        newNode.nextNode = t2;
        t1.nextNode = newNode;

    }

    public void deleteNode(T data) {
        Node<T> newNode = new Node<>();
        newNode.setData(data);
        newNode.setNextNode(null);

        Node<T> t3 = head;
        Node<T> t4 = null;

    while(t3.nextNode != null) {
        t4 =t3;

        t3 = t3.nextNode;

    }
        t4.nextNode = null;
    }
    public void showData() {
        Node<T> temp = head;
        while(temp.getNextNode() != null) {
            System.out.println(temp.getData());
            temp = temp.getNextNode();
        }
        System.out.println(temp.getData());
    }
}
