
import java.io.*;
import java.util.*;
import java.lang.*;

class solution{
 public static void main(String[] args){
int[][] arr={{1,2,3},{4,5},{7,8,9,0}};


int ans=max1(arr);
System.out.println(ans);

 
     
 }
 static int max1(int[][]a){
  int max=Integer.MIN_VALUE;
     for(int i=0; i<a.length; i++){
         for(int j=0; j<a[i].length; j++){
             if(a[i][j]>max){
              max=a[i][j];
             
             }
         }
     }
     return max;
 }
}
   





















