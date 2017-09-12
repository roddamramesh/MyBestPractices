package com.ramesh.com.ramesh.arrays;

/**
 * Created by RoddaR01 on 5/2/2017.
 */
public class SpiralMatrix {

    public static  void main(String args[]){
        int[][] array=  {   { 0, 1, 2, 3 },
                            { 11,12,13,4 },
                            { 10,15,14,5},
                                {9,8,7,6}};
        SpiralMatrix spiralMatrix= new SpiralMatrix();
        spiralMatrix.printSpiral(array);
    }

    public void printSpiral(int[][] arrayofElements){
        int t=0,d=0;
        int direction=0;
        int p= arrayofElements.length-1;
        int s= arrayofElements.length-1;


        while(t<=p && t<=s){
            if(direction==0){
                for(int i=t;i<=p;i++){
                    System.out.print("  "+arrayofElements[t][i]);
                }
                t++;
                direction=1;
            }
            if(direction==1) {
                for (int i = t; i <= p; i++) {
                    System.out.print("  " + arrayofElements[i][p]);
                }
                t++;
                direction = 2;
            }
            if(direction==2){
                for(int i =t;i>=d;i--){
                    System.out.print("  "+arrayofElements[s][i]);
                }
               s--;
                direction=3;
            }
            if(direction==3){
                for(int i=s;i>=d;i--){
                    System.out.print("  "+arrayofElements[i][d]);
                }
                p--;
               direction=0;
            }

        }

    }
}
