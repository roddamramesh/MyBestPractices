package com.ramesh.com.ramesh.searchings;

/**
 * Created by RoddaR01 on 8/21/2017.
 */
public class BinarySearch {


    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40,50,60,70,80,90,100};
        int n = arr.length;
        int x = 100;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }


    public int binarySearch(int[] arr,int start, int end,int elementToFind){

        int pivot=start+(end-start)/2;



        if(start<=end){
            if(elementToFind==arr[pivot]){
                return pivot;
            }
            if(elementToFind<arr[pivot]){
             return   binarySearch(arr,start,pivot-1,elementToFind);
            }else if(elementToFind>arr[pivot]){
              return  binarySearch(arr,pivot,end+1,elementToFind);
            }
        }
        return -1;
    }









}
