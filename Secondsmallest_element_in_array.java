import java.io.*;
import java.util.*;
class Secondsmallest_element_in_array{
public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("enter the size of an array: ");
       int n =s.nextInt();
	int[] arr=new int[n];
	System.out.println("enter array elements: ");
	for(int i=0;i<n;i++){
	 arr[i]=s.nextInt();
	}
	System.out.println("Second smallest element in an array: "+ secondsmallestElement(arr,n));
   }
public static int secondsmallestElement(int[] nums,int n) {
	int smallest = nums[0];
	int secondsmallest = Integer.MAX_VALUE;
	for(int i=1;i<n;i++){
	   if(nums[i]<smallest){
		secondsmallest = smallest;
		smallest = nums[i];
	   }
	   else if(nums[i]>smallest && nums[i]<secondsmallest){
		secondsmallest = nums[i];
	   }
	}
    return secondsmallest;
    }
}