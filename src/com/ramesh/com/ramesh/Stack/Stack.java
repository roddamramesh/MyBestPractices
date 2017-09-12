package com.ramesh.com.ramesh.Stack;

/**
 * Created by RoddaR01 on 5/18/2017.
 */
public class Stack<I extends Number> {

    int MAX=1000;
    int[] arr= new int[MAX];
    int top;


    public Stack(){
        top=-1;
    }

    public boolean push(int data){

        if(top>=MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            System.out.println("Pushed value "+data+" into stack ");
            arr[++top]=data;
            return true;
        }

    }

    public int pop(){

        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            int x=arr[top--];
            return x;
        }

    }


    public boolean isEmpty(){
        if(top<0)
            return true;
        return false;

    }


    public static void main(String args[]){

        Stack<Number> stack= new Stack<Number>();
        stack.push(10);

        int i= stack.pop();

        System.out.println("Popped the value "+i+" from the stack");
        stack.push(30);


    }





}
