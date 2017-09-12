package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/25/2017.
 */
// Java program for implementation of Heap Sort
public class HeapSort
{
    public void sort(int arr[]) {

        int length=arr.length;

        for(int i=length/2-1;i>=0;i--){
            heapify(arr,length,i);
        }

    }

    void heapify(int arr[], int n, int i)
    {
        int leftChild=2*i+1;
        int rightChild=2*i+2;
        int largest;

        if(leftChild<n && arr[leftChild]>arr[i]){
            largest=leftChild;
        }
        else {
            largest=i;

        }
        if(rightChild<n && arr[rightChild]>arr[largest]){
            largest=rightChild;
        }

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);
        }

    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}