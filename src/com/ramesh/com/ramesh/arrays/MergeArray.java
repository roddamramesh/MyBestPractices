package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/12/2017.
 */
public class MergeArray {

    int[] arr1={2, 8, -1, -1, -1, 13, -1, 15, 20};
    int[] arr2 = {5, 7, 9, 25};

    public static void main(String args[]){
        MergeArray mergeArray= new MergeArray();
        mergeArray.moveElementstoEnd();
    }

    public void moveElementstoEnd(){
        int j=1;
        for(int i=0;i<arr1.length-2;i++){
            if(arr1[i]==-1 && arr1[j]!=-1){
                swap(arr1,i,j);
                i++;j++;
            }

        }

        for (int a:arr1) {
            System.out.println(a);
        }
    }

    public void swap(int[] arr, int val1, int val2){
        int temp=arr[val1];
        arr[val1]=arr[val2];
        arr[val2]=temp;
    }
}
