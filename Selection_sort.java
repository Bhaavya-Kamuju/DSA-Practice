import java.io.*;
import java.util.*;
class Selection_sort{
public static void main(String []args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the length of an array: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements of an array: ");
for(int i=0;i<n;i++){
 arr[i]=s.nextInt();
}
SelectionSort(arr,n);
System.out.println("Sorted array using selection sort: ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
public static void SelectionSort(int arr[], int n){
for(int i=0;i<=n-2;i++){
int min = i;
for(int j=i;j<=n-1;j++){
if(arr[j]<arr[min]){
min = j;
}
}
swap(arr,min,i);
}
}
public static void swap(int arr[],int min,int i){
int temp = arr[min];
arr[min]=arr[i];
arr[i]=temp;
}
}



