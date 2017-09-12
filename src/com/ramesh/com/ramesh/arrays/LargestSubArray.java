package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/6/2017.
 *Finding Subrray with max Value
 **/
public class LargestSubArray {

    public static void main(String[] args){
        int[] array= {-2,-3,4,-1,-2,1,5,-3};
        LargestSubArray largestSubArray= new LargestSubArray();

        largestSubArray.findLargestArray(array);
    }

    public void findLargestArray(int[] array){

        int k=0,l=1,m=0;
        for(int i=0;i<array.length-1;i++){

            if(array[k]+array[l]<0){
                k++;
                l++;
            }
            else if(array[k]+array[l]>0){
                m=k;
                l++;
            }
        }

        System.out.print("from array index "+m +" to "+l+ "array index is the largest sum");
    }
}
