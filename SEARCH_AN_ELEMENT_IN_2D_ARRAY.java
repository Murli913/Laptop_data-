/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
int [][]a={{10,20,30,40}, {11,22,32,42}, {14,24,34,44}, {15,26,36,46}};
int target=44;
int r=0;
int c=a.length-1;

while(r<a.length && c>=0){
    System.out.println("0");
    if(a[r][c]==target){
       System.out.println("true");
       break;
   
        }
        else if(a[r][c]<target){r++;}
        else {c--;}
}
System.out.println("1");

	}
}
