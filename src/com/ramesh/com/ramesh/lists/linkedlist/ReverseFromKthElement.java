package com.ramesh.com.ramesh.lists.linkedlist;

/**
 * Created by RoddaR01 on 5/22/2017.
 */
public class ReverseFromKthElement {

    Node head;
    public static void main(String args[]){
        ReverseFromKthElement reverseFromKthElement= new ReverseFromKthElement();
        reverseFromKthElement.insert(5);
        reverseFromKthElement.insert(4);
        reverseFromKthElement.insert(3);
        reverseFromKthElement.insert(2);
        reverseFromKthElement.insert(1);
        reverseFromKthElement.insert(0);
        reverseFromKthElement.print(reverseFromKthElement.reverseFromKElement(3));
    }

    public void print(Node node){
        Node temp=node;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public Node reverseFromKElement(int data){
        Node temp=head;
        Node reverseFrom;
        Node reverseFromEnd;

        while(temp!=null){
            if(temp.data==data){
                reverseFrom= reverseList(data,head);
                reverseFromEnd=reverseList(-1,temp.next);
                head.next=reverseFromEnd ;
                return reverseFrom;
            }
            temp=temp.next;
        }
        return null;
    }

    public Node reverseList(int data,Node node1){
        Node prev=null;
        Node current=node1;
        Node next;
        while(current!=null &&current.data!=data){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        if(data!=-1){
            Node node=new Node(data);
            node.next=prev;
           return node;
        }

        return prev;
    }

    public  void insert(int data){
        Node node= new Node(data);
       if(head==null){
           head=node;
       }
       else{
           node.next=head;
           head=node;
       }
    }


}
