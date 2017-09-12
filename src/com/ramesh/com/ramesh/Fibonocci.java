package com.ramesh.com.ramesh;

/**
 * Created by RoddaR01 on 5/23/2017.
 */
public class Fibonocci {


    public static void main(String atgs[]){
        Fibonocci fibonocci= new Fibonocci();

        System.out.println(fibonocci.fibonacci(3));
       // System.out.println(fibonocci.fib(100));
    }



    public int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }



    int fib (int n) {
        int fib = 0;
        int a = 1;
        for(int i=0; i<n; i++) {
            fib = fib + a;
            a = fib;
        }
        return fib;
    }
}
