/*package whatever //do not write package name here */

import java.io.*;
import java.lang.*;

class GFG {
    
    public static  int binarysearch(int[][] b, int r, int t){
        int ans2=0;
        int s=0;
        int e=b[0].length-1;
        while(s<=e){
        int mid=s+(e-s)/2;
        if(b[r][mid]==t){ ans2=1;
      break;
            }
        else if(b[r][mid]>t) {
            e=mid-1;
        }
        else {
            s=mid+1;
        }
     
        }
    return ans2;
    }
	public static void main (String[] args) {
int[][] a={{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
int target=12;
int row=(a.length-1)/2;
int col=(a[0].length-1);

if(a[row][col]==target){System.out.println("found");}
else if(a[row][col]>target){
    for(int i=0; i<=row; i++){
    int ans= binarysearch(a,i,target);
    if(ans==1){
            System.out.println("present1");
        break;
    }
    }
    
}

else{
    for(int i=row+1; i<a.length-1; i++){
        int ans1=binarysearch(a,i,target);
        if(ans1==1){
            System.out.println("present2");
            break;
        }
    }
}


	}
}
