import java.io.*;
import java.util.*;
class Recursive_bubble_sort{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements: ");
for(int i = 0;i<n;i++){
arr[i]=s.nextInt();
}
rec_bubble(arr,n);
System.out.println("Sorted array using recursive bubble sort: ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
public static int[] rec_bubble(int[] arr, int n){
if(n==1){
return arr;
}
else{
for(int i=0;i<n-1;i++)
{
if(arr[i]>arr[i+1]){
int temp = arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;
}
}
return rec_bubble(arr,n-1);
}
}
}
