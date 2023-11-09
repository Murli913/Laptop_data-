
import java.io.*;
import java.util.*;
import java.lang.*;

class solution{
 public static void main(String[] args){
int[][] arr={{1,2,3},{4,5},{7,8,9,0}};

int target=3;

System.out.println(Arrays.toString(search(arr,target)));

 
     
 }
 static int[] search(int[][] a, int t){
    int b[]=new int[2];
     for(int i=0; i<a.length; i++){
         for(int j=0; j<a[i].length; j++){
             if(a[i][j]==t){
              b[0]=i;
              b[1]=j;
             
             }
         }
     }
     return b;
 }
}
   





















