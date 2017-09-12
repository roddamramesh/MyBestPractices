package com.ramesh.com.ramesh.bitmanipulation;

/**
 * Created by RoddaR01 on 5/16/2017.
 */
public class PowerOfTwo {

    public static void main(String args[]){
        PowerOfTwo powerOfTwo= new PowerOfTwo();
       //boolean result= powerOfTwo.isPowerOfTwo(23);
      // System.out.println("is power of 2: "+result);
        int num= powerOfTwo.count_one(23);
        System.out.println("Number of ones in number : "+num);
    }

    public boolean isPowerOfTwo(int number){
        return ((number & (number - 1)) == 0);
    }


    int count_one(int n){
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }


}
