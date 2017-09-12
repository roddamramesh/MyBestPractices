package com.ramesh.com.ramesh.sortings;

import java.util.Random;

/**
 * Created by RoddaR01 on 5/8/2017.
 */
public class QuickSort {

    int[] arr={5,3,4,8,9,1,2,6,8,2,4,7};
    public static void main(String[] args){
        QuickSort quickSort= new QuickSort();
        quickSort.sortArray();
        quickSort.printSortedArray();
    }


    public void printSortedArray(){
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }

    public void sortArray(){
        sort(arr,0,11);
    }

    public void sort(int[] arr,int start, int end){
        if (start <= end) {
            int partitionIndex = partition(arr, start, end);
            sort(arr, start, partitionIndex - 1);
            sort(arr, partitionIndex + 1, end);
        }
    }

    public int partition(int[] arr,int start,int end){
        int pIndex=start;

        int pivot= arr[end];
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[pIndex];
                arr[pIndex]=temp;
                pIndex++;
            }
        }

        int temp1=arr[pIndex];
        arr[pIndex]=arr[end];
        arr[end]=temp1;

        return pIndex;
    }
}
