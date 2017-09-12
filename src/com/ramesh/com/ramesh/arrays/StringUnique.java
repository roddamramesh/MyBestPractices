package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 4/29/2017.
 */
public class StringUnique {

    public static void main(String args[]){

     StringUnique stringUnique= new StringUnique();
    boolean result= stringUnique.isUnique("Ramesh");

    System.out.println(result);

    }

    public boolean isUnique(String str){
        if(str.length()>128)
            return false;
        boolean[] charArray= new boolean[128];
        for (int i=0;i<str.length();i++){
            int val= str.charAt(i);
            if(charArray[val]==true){
                return false;
            }
            else
            {
                charArray[val]=true;
            }

        }
        return true;
    }
}
