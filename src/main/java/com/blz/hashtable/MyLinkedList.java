package com.blz.hashtable;

public class MyLinkedList<K> {
    public Node<K> head;
    public Node<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(Node<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            Node<K> tempNode = this.tail;
            this.tail = newNode;
            tempNode.setNext(newNode);
        }

    }

    public Node pop(Node<K> deleteNode) {
        Node tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public Node<K> search(K key) {
        Node tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public String toString() {
        return "MyLinkedListNodes{" + head + '}';
    }
}
