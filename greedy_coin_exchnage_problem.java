
import java.io.*;
import java.util.*;
import java.lang.*;

class solution{
 public static void main(String[] args){
int n=18;
int a[]={7,5,1};
int ans=mincoins(n,a);
System.out.println(ans);
 }
 static int mincoins(int x, int[] y){
     if(x==0){return 0;}
     int ans=Integer.MAX_VALUE;
     for(int i=0; i<y.length; i++){
         if(x-y[i]>=0){
             int subans=mincoins(x-y[i],y);
             if(subans !=Integer.MAX_VALUE && subans + 1 <ans){ans=subans+1;}
         }
     }
     return ans;
 }
}
   





















