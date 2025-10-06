import java.io.*;
import java.util.*;
class SecondLargest_element_in_array{
public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("enter the size of an array: ");
       int n =s.nextInt();
	int[] arr=new int[n];
	System.out.println("enter array elements: ");
	for(int i=0;i<n;i++){
	 arr[i]=s.nextInt();
	}
	System.out.println("Second largest element in an array: "+ secondlargestElement(arr,n));
   }
public static int secondlargestElement(int[] nums,int n) {
	int largest = nums[0];
	int secondlargest = -1;
	for(int i=1;i<n;i++){
	   if(nums[i]>largest){
		secondlargest = largest;
		largest = nums[i];
	   }
	   else if(nums[i]<largest && nums[i]>secondlargest){
		secondlargest = nums[i];
	   }
	}
    return secondlargest;
    }
}