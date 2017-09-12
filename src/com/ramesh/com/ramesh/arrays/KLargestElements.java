package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 8/18/2017.
 */
public class KLargestElements {
    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
    public static void main(String args[]){
        KLargestElements kLargestElements= new KLargestElements();
        kLargestElements.sortKLargestValues(3);
    }

    public void sortKLargestValues(int k){

    }


    public void swap(int pos, int positiontoBeSwapped){
        int temp=arr[positiontoBeSwapped];
        arr[positiontoBeSwapped]=arr[pos];
        arr[pos]=temp;
    }
}
