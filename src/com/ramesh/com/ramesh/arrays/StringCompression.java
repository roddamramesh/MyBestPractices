package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/1/2017.
 */
public class StringCompression {

    public static void main(String[] args){
        StringCompression stringCompression= new StringCompression();
       StringBuilder resultedString= stringCompression.Compress("aabdhhssjjakkkksjjjjjjjjjjjjnnnejflkkkkkkfffff");
       System.out.println(resultedString);
    }

    public StringBuilder Compress(String str){

        char temp=' ';
        int count=0;
        StringBuilder stringBuilder=new StringBuilder();

        for(int i=0;i<str.length();i++) {

            if (temp == ' '||temp == str.charAt(i)) {
                count++;
                temp = str.charAt(i);
            } else if (temp != str.charAt(i)) {
                stringBuilder = stringBuilder.append(Character.toString(temp)).append(count);
                count = 1;
                temp = str.charAt(i);
            }

            if(i==str.length()-1){
                stringBuilder= stringBuilder.append(str.charAt(i)).append(count);
            }

        }
    return stringBuilder;
    }
}
