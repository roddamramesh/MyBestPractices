package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/10/2017.
 */
public class PositiveNegative {
    int[] arr= {-5,4,-2,3,44,0,-68,44,2,-3,-4,-6,8,-35,-56,-23,-78};
    public static void main(String args[]){
        PositiveNegative positiveNegative= new PositiveNegative();
        positiveNegative.sort();
        positiveNegative.print();
    }

    public void print(){
        for (int a:arr) {
            System.out.println(a);
        }
    }

    public void sort(){
        sortPositivesAndNegatives(arr,0,arr.length-1);
    }
    public void sortPositivesAndNegatives(int arr[], int start,int end){

        int pIndex=start;
        int position= Integer.MAX_VALUE;
        int small=Integer.MAX_VALUE;

        for(int i=0;i<end;i++){
            if(arr[i]>=0&& arr[i]<small){
                small=arr[i];
                position=i;
            }
        }

        //Step 2: swap minvalue to the last element
        swap(position,end);
        for(int i=start;i<end;i++){
            if(arr[i]<=arr[end]){
                swap(i,pIndex);
                pIndex++;
            }
        }
        swap(pIndex,end);
        for(int i=0;i<end;i=i+2){
          swap(i,pIndex);
            pIndex++;
          if(pIndex>end){
              break;
          }
        }

    }
    //Swap values without using third variable
    public void swap(int num1, int num2){
//        arr[num1]=arr[num1]^arr[num2];
//        arr[num2]=arr[num1]^arr[num2];
//        arr[num1]= arr[num1]^arr[num2];
                int temp=arr[num1];
                arr[num1]=arr[num2];
                arr[num2]=temp;
    }
}
