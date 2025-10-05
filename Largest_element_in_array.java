import java.io.*;
import java.util.*;
class Largest_element_in_array {
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("enter the size of an array: ");
       int n =s.nextInt();
	int[] arr=new int[n];
	System.out.println("enter array elements: ");
	for(int i=0;i<n;i++){
	 arr[i]=s.nextInt();
	}
	System.out.println("largest element in an array: "+ largestElement(arr));
    }
    public static int largestElement(int[] nums) {
    int max=nums[0];
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max = nums[i];
        }
    }
    return max;

    }
}