import java.io.*;
import java.util.*;
class Bubble_sort{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of array: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
bubbleSort(arr,n);
System.out.println("Sorted array using bubble sort: ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
public static void bubbleSort(int[] arr, int n){
for(int i=n-1;i>=1;i--){
int didSwap=0;
for(int j=0;j<i;j++){
if(arr[j]>arr[j+1]){
int temp = arr[j+1];
arr[j+1]=arr[j];
arr[j]=temp;
didSwap=1;
}
}
if(didSwap==0){
break;
}
}
}
}
