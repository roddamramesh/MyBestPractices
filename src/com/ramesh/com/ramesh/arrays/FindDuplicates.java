package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/10/2017.
 */
public class FindDuplicates {


    public static void main(String args[]){
        int[] arr= {1,2,3,4,5,2,4,5,8,6,7,6,5,6};
        FindDuplicates findDuplicates= new FindDuplicates();
        findDuplicates.printDuplicates(arr);
    }

    public void printDuplicates(int[] arr){

        for(int i=0;i<arr.length;i++){
           if(arr[Math.abs(arr[i])]>0){
               arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
           }
           else{
               System.out.println(Math.abs(arr[i]));
           }
        }
    }

}
