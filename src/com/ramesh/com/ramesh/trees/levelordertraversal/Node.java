package com.ramesh.com.ramesh.trees.levelordertraversal;// Iterative Queue based Java program to do level order traversal
// of Binary Tree
 
/* importing the inbuilt java classes required for the program */
import java.util.*;

/* Class to represent Tree node */
class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
 
/* Class to print Level Order Traversal */
class BinaryTree {
 
    Node root;

    Map<Integer,List<Integer>> integerListMap= new HashMap<>();
 
    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    void printLevelOrder() 
    {
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node= queue.remove();

            System.out.println(node.data);

            if(node.left!=null){
                queue.add(node.left);
            }

            if(node.right!=null){
                queue.add(node.right);
            }

        }
    }

    public void print(Node node,int distance){



    }


    public static void main(String args[])
    {
        /* creating a binary tree and entering 
         the nodes */
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}