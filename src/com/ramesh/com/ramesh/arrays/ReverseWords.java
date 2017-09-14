package com.ramesh.com.ramesh.arrays;

import java.util.Scanner;

/**
 * Created by RoddaR01 on 9/14/2017.
 * Given a String of length N reverse the words in it. Words are separated by dots.

 Input:
 The first line contains T denoting the number of testcases. Then follows description of testcases. Each case contains a string containing spaces and characters.


 Output:
 For each test case, output a single line containing the reversed String.

 Constraints:
 1<=T<=20
 1<=Lenght of String<=2000


 Example:
 Input:
 2
 i.like.this.program.very.much
 pqr.mno

 Output:
 much.very.program.this.like.i
 mno.pqr
 */
public class ReverseWords {

    public static void main(String args[]){
        reverseWordsInString((new Scanner(System.in).nextLine()));
    }

    private static void reverseWordsInString(String s) {

        String[] str=s.split("\\.");
        StringBuffer stringBuffer= new StringBuffer();
        for(int i=str.length-1;i>=0;i--){
            stringBuffer.append(str[i]);
            if(i!=0){
                stringBuffer.append(".") ;
            }
        }
    System.out.print(stringBuffer);

    }


}
