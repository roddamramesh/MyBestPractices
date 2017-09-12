package com.ramesh.com.ramesh.lists.linkedlist;

/**
 * Created by RoddaR01 on 5/18/2017.
 */
public class StackNode {

    Node head;

    public boolean push(int data){
        Node newNode= new Node(data);

        if(head==null){
            head=newNode;
            return true;
        }
        else {
            newNode.next=head;
            head=newNode;
            return true;
        }

    }



    public int pop(){
        int temp;
        if(head==null){
            return -1;
        }
        else{
            temp=head.data;
            head=head.next;
        }
        return temp;
    }


    public void print(){
       Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

    public int peek(){
        if(head==null){
            return -1;
        }
        else
        {
            return head.data;
        }
    }

    public static void main(String args[]){

        StackNode stack= new StackNode();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        int i=stack.pop();
        System.out.println("Popped element is "+i);
        stack.print();

        int peek=stack.peek();
        System.out.println("Head of the element is "+peek);
    }


}


