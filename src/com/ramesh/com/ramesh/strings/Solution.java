package com.ramesh.com.ramesh.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        
        StringBuffer str= new StringBuffer();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='-'){
                 str= str.append('-');
            }else {
                int l=(int)s.charAt(i);
                int t=l+k;
                if(t>=55 &&t<=90 ){
                    str= str.append((char)(t));
                }
                else if(t>=97 &&t<=122 ){
                    str= str.append((char)(t));
                }
                else if(t>122){
                    int diff= t-122;
                    t=96+ diff;
                    str= str.append((char)(t));
                }
               else if(t>90){
                  int diff= t-90;
                    t=54+ diff;
                   str= str.append((char)(t)); 
                }

                
            }
        }
        
        System.out.println(str);
                       
    }
}
