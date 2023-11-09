
import java.util.*;
import java.lang.*;

class solution{
 public static void main(String[] args){
int a[]={6,5,4,3,2,1};
int target=2;
int ans=binarysearch1(a,target);
System.out.println(ans);
 }
 
 static int binarysearch1(int b[], int x){
     //checking the array is ascending order or descending order the apply binary search
     if(b[0]>b[b.length-1]){
         int start=0;
         int end=b.length-1;
         int mid;
             while(start<=end){
          mid=start + ((end-start)/2); 
         
         if(x>b[mid]){end=mid-1;}
         else if(x<b[mid]){start=mid+1;}
         else{return mid;}}
     }
     else{
         int start=0;
         int end=b.length-1;
         int mid;
          while(start<=end){
         mid=start + ((end-start)/2);
      
         if(x>b[mid]){start=mid+1;}
         else if(x<b[mid]){end=mid-1;}
         else{return mid;}}
     }
     return -1;
 }
 
}
   





















