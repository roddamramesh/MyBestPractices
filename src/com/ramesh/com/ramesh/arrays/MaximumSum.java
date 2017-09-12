package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/12/2017.
 */
public class MaximumSum {

    int[] arr={1,20,3};
    public static  void main(String args[]){
        MaximumSum maximumSum= new MaximumSum();
      int sumOfValues=  maximumSum.maximumSum();
      System.out.print(sumOfValues);
    }



    public int maximumSum(){
        int previousTwoResult=0,previousOneResult=0,result=0;
        for(int i=0;i<arr.length;i++){
            if(i==0)
                result=arr[0];
            else if(i==1)
                result=Math.max(arr[0],arr[1]);
            else
               result= Math.max(previousOneResult,arr[i]+previousTwoResult);
            previousTwoResult=previousOneResult;
            previousOneResult=result;

        }
        return result;
       }

}
