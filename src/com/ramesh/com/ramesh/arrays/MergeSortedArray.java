package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/14/2017.
 */
public class MergeSortedArray {

    int[] arr1={2,-1,7,-1,-1,10,-1,45,67};
    int[] arr2={5,8,12,14};

    public static void main(String args[]){
        MergeSortedArray mergeSortedArray= new MergeSortedArray();

        mergeSortedArray.mergeArray();
        mergeSortedArray.print();
    }

    public void print(){
        for (int i:arr1) {
            System.out.println(i);
        }
    }

    public void mergeArray(){
        int k=0;
        int j=0;
        for(int i=0;i<arr1.length;i++){
            while(i<arr1.length-1 && arr1[i]==-1){
                k++;
                i++;
            }
            if(i<arr1.length-1 && arr1[i]<arr2[j] && arr1[i+1]==-1 && k==0 ){
                arr1[i+1]=arr2[j];
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j] && k!=0 && arr1[i]!=-1){
                swap(i-k,i);
                k--;
            }
            else if(arr1[i]>arr2[j]) {
                int l = i;
                int m = 0;
                while(l<arr1.length && arr1[l]!=-1){
                    m++;
                    l++;
                }
                while (m!=0){
                    swap(l,l-1);
                    l--;
                    m--;
                }
                swap(arr1[i],arr2[j]);
                j++;
            }
            else
            {
                arr1[i-1]=arr2[j];
                j++;
                arr1[i]=arr2[j];
            }



        }

    }

    public void swap(int num1, int num2){

        int temp=arr1[num1];
        arr1[num1]=arr1[num2];
        arr1[num2]=temp;
    }

}
