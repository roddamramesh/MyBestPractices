package com.ramesh.com.ramesh.lists.linkedlist;

import java.util.HashMap;

/**
 * Created by RoddaR01 on 5/15/2017.
 */
public class FindLoopInsideLinkedList {

    Node head= null;

    public static void main(String args[]){
        FindLoopInsideLinkedList loopInsideLinkedList= new FindLoopInsideLinkedList();
        loopInsideLinkedList.push(10);
        loopInsideLinkedList.push(20);
        loopInsideLinkedList.push(30);
        loopInsideLinkedList.push(40);
        loopInsideLinkedList.push(50);
        loopInsideLinkedList.push(60);

        loopInsideLinkedList.createLoopInsideList();


       int result= loopInsideLinkedList.findLoopInsideList();
       System.out.print("Loop occured at data "+ result);
    }


    public void createLoopInsideList(){
        int i=0;
        Node temp=head;
        while(i!=4){
            head=head.next;
            i++;
        }

        temp=temp.next;
        head.next=temp;

    }


    public int findLoopInsideList(){
        HashMap<Node,Integer> hashMap= new HashMap<Node, Integer>();


       while(head!=null){
           head= head.next;

           if(hashMap.containsKey(head.next)){
               return head.data;
           }
           else{
               hashMap.put(head.next,head.data);
           }

       }

       return 0;

    }


    public void push(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }

}
