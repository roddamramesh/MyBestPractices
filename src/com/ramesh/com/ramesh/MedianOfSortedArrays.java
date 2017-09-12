//package com.ramesh.com.ramesh;
//
///**
// * Created by RoddaR01 on 5/2/2017.
// */
//public class MedianOfSortedArrays {
//    public static void main(String args[]){
//
//        MedianOfSortedArrays medianOfSortedArrays= new MedianOfSortedArrays();
//        int[] array1;
//        array1= new int[5]{1,3,5,7,8};
//
//        int[] array2= new int[5]{2,4,5,6,8};
//        medianOfSortedArrays.median()
//    }
//
////    public int median(int[] array1,int[] array2, int lengthOfArray){
////
////        boolean temp=true;
////        int i=0,j=0,k=0;
////
////        int[] array3= new int[2*lengthOfArray];
////
////        while (temp) {
////
////            if(array1[i]>=array2[j]){
////                array3[k]=array2[j];
////                k++;
////                j++;
////            }
////            else if(array1[i]<=array2[j]){
////                array3[k]=array1[i];
////                k++;
////                i++;
////            }
////
////            if(k==2*lengthOfArray-1){
////
////              return  array3[lengthOfArray]+array3[lengthOfArray]/2;
////
////            }
////
////        }
////        return 0;
////
////    }
//
//
//    public int median(int[] array1, int[] array2, int n){
//
//            if(n<=0){
//                return -1;
//            }
//            else if(n==1){
//                return (array1[0]+array2[0])/2;
//            }
//            else if(n==2){
//                return (Math.max(array1[0],array2[0])+Math.min(array1[1],array2[2]))/2;
//            }
//
//
//
//        return 0;
//
//    }
//
//}
