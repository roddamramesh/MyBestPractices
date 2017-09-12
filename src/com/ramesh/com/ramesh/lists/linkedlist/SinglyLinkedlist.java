package com.ramesh.com.ramesh.lists.linkedlist;

/**
 * Created by RoddaR01 on 4/27/2017.
 */
public class SinglyLinkedlist {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    public void push(int data){

        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }


    public void insertAtNode(Node prevNode, int data){

        if(prevNode== null){
           System.out.println("Previous node cannot be null");
           return;
        }
        else{
          Node newNode= new Node(data);
          newNode.next= prevNode.next;
          prevNode.next=newNode;

        }

    }

    public void insertAtEnd(int data){
        Node temp= head;
            while(head.next!=null){
                head= head.next;
            }
            Node newNode= new Node(data);
            head.next= newNode;
            head= temp;
    }


    public void pop(int data){
        Node prev=null;
        Node temp=head;
        if(temp!=null&& temp.data==data){
            head= temp.next;
            return;
        }

        while(temp!=null && temp.data!=data){
            prev= temp;
            temp=temp.next;
        }

        if(temp==null){
            return;
        }
        prev.next=temp.next;

    }

    public void deleteAtPosition(int position){
        int i=1;
        Node temp=head;
        Node prev=null;

        if(position==0){
            head=temp.next;
            return;
        }

        while(temp!=null && i<position){
            prev=temp;
            temp= temp.next;
            i++;
        }

        if(temp==null){
            return;
        }

        prev.next=temp.next;
    }

    public void print(){
        while(head!=null){
            System.out.println(head.data);
            head= head.next;
        }

    }

    public int iterativeLength( ){
        int i=0;
      Node temp= head;
        while(temp!=null){
            temp= temp.next;
            i++;
        }
        System.out.println("The length of list is "+i);
        return i;

    }


    public int getLengthUsingRecursive(Node node){
        if(node==null){
            return 0;
        }
        else
        {
          return 1+getLengthUsingRecursive(node.next);
        }
    }

    public void swapNodes(int x, int y){
        Node temp,temp1,prev=null,prev1=null,temp3=null;
        temp=head;
        temp1=head;

        while(temp!=null &&temp.data!=x){
            prev=temp;
            temp=temp.next;
        }

        while(temp1!=null && temp1.data!=y){
            prev1=temp1;
            temp1=temp1.next;
        }

        if(prev.next.data==x&& prev1 .next.data==y){
            temp3=prev1;
            prev1.next=prev.next;
            prev.next=temp3.next;
        }

    }

    public int getlength(){
        return getLengthUsingRecursive(head);
    }

    public static void main(String args[]){
        SinglyLinkedlist lst= new SinglyLinkedlist();
        lst.push(10);
        lst.push(20);
        lst.push(30);
        lst.push(40);
        lst.push(50);
        lst.swapNodes(40,20);
      //  System.out.println("Length using recursive "+lst.getlength());
       // lst.iterativeLength();
       // lst.deleteAtPosition(20);
       // lst.insertAtNode(lst.head.next.next,40);
        // lst.insertAtEnd(20);
        //lst.pop(40);
      lst.print();
    }


}
