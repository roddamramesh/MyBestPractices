package com.ramesh.com.ramesh.strings;

/**
 * Created by RoddaR01 on 8/20/2017.
 */
public class SmallestSting {

    String longestString="This is String";

    String smallString="a";
    public static void main(String args[]){
        SmallestSting smallestSting= new SmallestSting();
      boolean res=  smallestSting.findString();

      System.out.print(" String contains " +res);

    }


    public boolean findString(){
        if(longestString.length()>smallString.length()){
            char longestCharArray[]=longestString.toCharArray();
            char smallStringArray[]=smallString.toCharArray();

            boolean result=false;

            for(int i=0;i<longestCharArray.length;i++){
                if(longestCharArray[i]==smallStringArray[0]){
                    int k=0;
                    for(int j=0;j<smallString.length();j++){

                        if (longestCharArray[i+j]==smallStringArray[j]){
                            k++;
                        }
                        if(k==smallStringArray.length){
                            return true;
                        }

                    }


                }
            }
            return result;

        }
        else {
            return false;
        }


    }


}
