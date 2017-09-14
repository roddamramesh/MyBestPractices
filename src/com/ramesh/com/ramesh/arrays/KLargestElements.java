package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 8/18/2017.
 */
public class KLargestElements {
    int arr[]={10,12,4,5,9,65,35,87,3};
    public static void main(String args[]){
        KLargestElements kLargestElements= new KLargestElements();
        kLargestElements.sortKLargestValues(3);
        kLargestElements.printElemets();
    }

    public void sortKLargestValues(int k){

        for(int i=0;i<arr.length-1;i++){
            if(i==k)
                break;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1);
                }
            }
        }
    }

    public void printElemets(){
        for(int i :arr){
            System.out.println(i);
        }
    }


    public void swap(int pos, int positiontoBeSwapped){
        int temp=arr[positiontoBeSwapped];
        arr[positiontoBeSwapped]=arr[pos];
        arr[pos]=temp;
    }
}
