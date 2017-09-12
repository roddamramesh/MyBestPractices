package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/15/2017.
 */
public class Segregate {
    int arr[]={0,1,0,1,0,0,1,1,1,0};
    public static void main(String args[]){

        Segregate segregate= new Segregate();
        segregate.segregate();
        segregate.print();

    }

    public void print(){
        for (int a:arr
             ) {

            System.out.println(a);
        }
    }

    public void segregate(){
        int k=arr.length-1;
        for(int i=0;i<arr.length;i++){

            if(arr[k]==0&& arr[i]==1 && i<k){
                arr[k]=1;
                arr[i]=0;
                k--;
                i++;
            }
            else if(i<k){
                k--;
            }

        }

    }

}
