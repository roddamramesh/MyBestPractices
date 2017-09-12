package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/22/2017.----not done
 */
public class CountFrequencies {

    int arr[]={2, 3, 3, 2, 5};
    public static void main(String args[]){
        CountFrequencies countFrequencies= new CountFrequencies();
        countFrequencies.count();
    }

    public void count(){

        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]<0){
                i++;
                continue;
            }
            int index=arr[i]-1;
            if(arr[index]>0){
                arr[i]=arr[index];
                arr[index]=-1;
            }
            else {
                i++;
            }
        }
    }

}
