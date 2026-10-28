import Java_Revision.ArrayUtility;

import java.util.Scanner;
 class EqualSumPartition {
     public static void main(String[] args) {

     }
     static int totalsum(int[] arr){
         int sum = 0;
         for(int i=0; i < arr.length;i++){
             sum += arr[i];
         }
         return sum;
     }
     static boolean equalpartition(int[] arr){
         int totalsum = totalsum(arr);
         int prefixsum = 0;
         for(int i = 0 ; i < arr.length; i++){
              prefixsum = prefixsum + arr[i];
              int suffixsum = totalsum - prefixsum;
              if(suffixsum == prefixsum){
                  return true;
              }
         }
         return false;
     }
}
