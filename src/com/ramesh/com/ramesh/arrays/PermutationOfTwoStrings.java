package com.ramesh.com.ramesh.arrays;

import java.util.HashMap;

/**
 * Created by RoddaR01 on 4/29/2017.
 */
public class PermutationOfTwoStrings {

    public static  void main(String args[]){

    }


    public boolean checkUnique(String str1, String str2){
        HashMap<Character,Integer> charMap= new HashMap<Character, Integer>();
        if(str1.length()!=str2.length())
            return false;

        for(int i=0;i<str1.length();i++){
            if(charMap.containsKey(str1.charAt(i))){
                charMap.put(str1.charAt(i),charMap.get(str1.charAt(i))+1);
            }else
            {
             charMap.put(str1.charAt(i),1);
            }
        }

        for(int i=0;i<str2.length();i++){
            //if(charMap.containsValue(str2.charAt(i))==str2.charAt(i));
        }
        return true;

    }
}
