package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 8/18/2017.
 */
public class ArrayRotation {

    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};

    public static void main(String args[]){

        ArrayRotation arrayRotation= new ArrayRotation();
       int positionToStart= arrayRotation.findPosition(9);
       arrayRotation.rotateArray(positionToStart);
       arrayRotation.printArray();
    }

    public int findPosition(int value){

        for (int i=0;i<arr.length;i++){
            if(arr[i]==value){
               return i;
            }
        }
        return -1;
    }


    public void rotateArray(int position){
        swap(position,arr.length-1);
        int originalPosition=position;
        position++;

        for(int i=0;i<arr.length-1;i++){
            if(position>=arr.length-1){
            position=i;
            }
            if(originalPosition==i&&position<arr.length-1){
                swap(position,originalPosition);
                originalPosition=position;
                position++;
            }else if(originalPosition!=i&&position<arr.length-1){
                if(position==i){
                    position=originalPosition;
                }
                swap(position,i);
                position++;
            }
            else
            {

            }
        }



    }


    public void swap(int pos, int positiontoBeSwapped){
        int temp=arr[positiontoBeSwapped];
        arr[positiontoBeSwapped]=arr[pos];
        arr[pos]=temp;
    }

    public void printArray() {

        for(int a : arr ){
            System.out.print(a+" ");
        }
    }




}
