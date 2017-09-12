package com.ramesh.com.ramesh.trees;

/**
 * Created by RoddaR01 on 5/17/2017.
 */
import java.lang.Object;
public class BinarySearchTree {

    Node root;
    public static void main(String args[]){

        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(90);

        bst.print();
    }

    BinarySearchTree(){
        root=null;
    }

    public void insert(int data){
       root=insertNode(root, data);

    }

    public Node insertNode(Node root, int data){
        if(root==null){
            Node node= new Node(data);
            return node;
        }
        else if(data<root.data){
            root.left=insertNode(root.left,data);
        }
        else if(data>root.data){
          root.right =insertNode(root.right,data);
        }
        return root;
    }

    public void print(){
        printBST(root);
    }

    public Node printBST(Node root){
        if(root!=null){
            printBST(root.left);
            System.out.println(root.data);
            printBST(root.right);
        }
        return root;
    }







}

class Node{

    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        left=right=null;
    }


}
