/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
int[] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
int target=23;
int start=0;

int end=1;
while(target>nums[end]){
    int news=end+1;
    end=end+(end-start+1)*2;
    start=news;
}
int ans=binarysearch1(nums, start,end,target);
System.out.println(ans);
    

	}
	static int binarysearch1(int[] a, int s , int e, int t){
	    while(s<=e){
	        int mid=s+((e-s)/2);
	        if(t>a[mid]){s=mid+1;}
	        else if(t<a[mid]){e=mid-1;}
	        else{
	            return mid;
	        }
	    }
	    return -1;
	}
}
