package com.ramesh.com.ramesh.strings;

import java.util.Scanner;

/**
 * Created by RoddaR01 on 9/5/2017.
 */
public class PermutationOfString {

    public static void main(String args[]){
        Scanner sc= new Scanner((System.in));
        PermutationOfString permutationOfString= new PermutationOfString();
        String str=sc.nextLine();
        permutationOfString.permute(str,0,str.length()-1);

    }


    public void permute(String str, int start, int end){

        if(start==end){
            System.out.println(" "+str);
        }
        else{
            for(int i=start;i<=end;i++){
                str= swap(str,start,end);
                permute(str,start+1,end);
                str=swap(str,end,i);
            }
        }

    }

    public String swap(String str, int start, int end ){
        char[] charArray=str.toCharArray();
        char temp=charArray[start];
        charArray[start]=charArray[end];
        charArray[end]=temp;

        return String.valueOf(charArray);

    }

}
