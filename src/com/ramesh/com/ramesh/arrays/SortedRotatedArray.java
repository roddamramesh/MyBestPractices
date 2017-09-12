package com.ramesh.com.ramesh.arrays;

import java.util.Scanner;

/**
 * Created by RoddaR01 on 9/5/2017.
 */
public class SortedRotatedArray {

    int[] arr= new int[]{11,12,13,14,15,16,17,18,19,21,22,23,24,25,26,1,2,3,4,5,6,7,8,9,10};

    public static void main(String args[]){
        SortedRotatedArray sortedRotatedArray= new SortedRotatedArray();
        System.out.println("Please Find th element to find: ");
        Scanner sc= new Scanner(System.in);
        int elementToFind=sc.nextInt();
        int pivot=sortedRotatedArray.getPivot();

        System.out.print("Pivot is "+pivot);

        int positionOfElement= sortedRotatedArray.getTheElementPosition(elementToFind,pivot);

        System.out.print("Position of element is " +positionOfElement);

    }

    int  getTheElementPosition(int elementToFind,int pivot){
        if(elementToFind<arr[arr.length-1]){
            return findElement(pivot,arr.length-1,arr,elementToFind);
        }
        else{
            return findElement(0,pivot-1,arr,elementToFind);
        }

    }

    int findElement(int start, int end, int[] arr,int elementToFind){
        int middleElement=(start+end)/2;

        if(elementToFind>arr[middleElement]){
            return findElement(middleElement,end,arr,elementToFind);
        }
        else if(elementToFind<arr[middleElement]){
            return findElement(start,middleElement,arr,elementToFind);
        }
        else {
            return middleElement;
        }


    }

    int getPivot(){
       return findPivotForGivenArray(0,arr.length,arr);
    }


    public int findPivotForGivenArray(int start,int end, int[] arr){

        int middleOfElement=(start+end)/2;

        if(arr[middleOfElement]>arr[middleOfElement+1]){
            return middleOfElement+1;
        }

        if(arr[start]>arr[middleOfElement]){
            return findPivotForGivenArray(start,middleOfElement,arr);
        }
        else{
            return findPivotForGivenArray(middleOfElement,end,arr);
        }

    }


}
