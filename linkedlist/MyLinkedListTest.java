package com.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
         MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(70);
         MyLinkedList<Integer> mySecondNode = new MyLinkedList<>(30);
         MyLinkedList<Integer> myThirdNode = new MyLinkedList<>(56);
         MyLinkedList myLinkedList = new MyLinkedList(70);
         myLinkedList.add(myFirstNode);
         myLinkedList.add(mySecondNode);
         myLinkedList.add(myThirdNode);
         myLinkedList.printMyNode();
         boolean result = myLinkedList.head.equals(myThirdNode) &&
                          myLinkedList.head.getNext().equals(mySecondNode) &&
                          myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);



    }
}