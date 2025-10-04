import java.io.*;
import java.util.*;
class Quick_sort{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
quick_sort(arr,0,n-1);
System.out.println("Sorted array using quick sort: ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+ " ");
}
}
public static void quick_sort(int[] arr,int low,int high){
if(low<high){
int p_index = partition(arr,low,high);
quick_sort(arr,low,p_index-1);
quick_sort(arr,p_index+1,high);
}
}
public static int partition(int[] arr, int low,int high){
int pivot = arr[low];
int i = low;
int j = high;
while(i<j){
while(arr[i]<=pivot && i<=high-1){
i++;
}
while(arr[j]>pivot && j>=low+1){
j--;
}
if(i<j){
swap(arr,i,j);
}
}
swap(arr,low,j);
return j;
}
public static void swap(int[] arr,int I,int J){
int temp=arr[I];
arr[I]=arr[J];
arr[J]=temp;
}
}










