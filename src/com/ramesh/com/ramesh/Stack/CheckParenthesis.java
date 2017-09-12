package com.ramesh.com.ramesh.Stack;

import java.util.Stack;

/**
 * Created by RoddaR01 on 5/18/2017.
 */
public class CheckParenthesis {
     char[] charArray= {'[','(',')',']','{','}','{','[','(',')','(',')',']','(',')','}'};
     //char[] charArray={'[','(',']',')'};
     //char[] charArray={']'};
     Stack<Character> stack= new Stack<Character>();
     public static void main(String args[]){
         CheckParenthesis checkParenthesis= new CheckParenthesis();
         boolean result=  checkParenthesis.checkParenthesisExpression();
         System.out.println("All parentheses for given expression is   "+result);
     }

     public boolean checkParenthesisExpression(){
          for(int i=0;i<charArray.length;i++){
               if(charArray[i]=='(' || charArray[i]=='{' || charArray[i]=='['){
                    stack.push(charArray[i]);
               }
               else if(charArray[i]=='}' || charArray[i]==')' || charArray[i]==']') {
                    char temp;
                    if(!stack.empty()) {
                         temp = stack.pop();


                         if (charArray[i] == ')') {
                              if (temp != '(') {
                                   System.out.println("Expressions of parentheses is not matching");
                                   return false;
                              }
                         }
                         if (charArray[i] == '}') {
                              if (temp != '{') {
                                   System.out.println("Expressions of parentheses is not matching");
                                   return false;
                              }
                         }
                         if (charArray[i] == '[') {
                              if (temp != '[') {
                                   System.out.println("Expressions of parentheses is not matching");
                                   return false;
                              }
                         }
                    }
                    else {
                         return false;
                    }


               }
               else {
                    return false;
               }
          }
          if(!stack.empty())
               return false;
          return true;

     }


}
