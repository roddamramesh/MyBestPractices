package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/2/2017.
 */
public class StringRotation {

    public static void main(String args[]){
        StringRotation stringRotation= new StringRotation();

     boolean result=  stringRotation.checkRotation("rameesh","eshrame");
     System.out.print(result);
    }

    public boolean checkRotation(String str1,String str2) {

        if (str1.length() == str2.length()) {
            int j = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str2.charAt(j) == str1.charAt(i)) {

                    j++;
                } else {
                    j = 0;
                }
            }

            int i=0;
         while(j<str2.length()){
                if(str1.charAt(i)==str2.charAt(j)){
                    j++;
                    i++;
                }
                else
                {
                    return false;
                }
         }

         int k=0;
         while(i<str1.length()){
             if(str1.charAt(i)==str2.charAt(k)){
                 k++;
                 i++;
             }
             else{
                 return false;
             }
         }

            return true;
        } else {
            return false;
        }
    }

    public boolean checkRotation1(String str1,String str2) {

        if (str1.length() == str2.length()) {
            int j = 0;
            StringBuffer split1 = new StringBuffer();
            for (int i = 0; i < str1.length(); i++) {
                if (str2.charAt(j) == str1.charAt(i)) {
                    split1.append(str2.charAt(j));
                    j++;
                } else {
                    split1.setLength(0);
                    j = 0;
                }
            }
            String manipulatedString = str2.substring(j, str1.length()) + split1;

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != manipulatedString.charAt(i))
                    return false;
            }

            return true;
        } else {
            return false;
        }
    }

}
