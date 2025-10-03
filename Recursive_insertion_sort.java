import java.io.*;
import java.util.*;
class Recursive_insertion_sort{
public static void main(String[] args){
int i = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements: ");
for(int k = 0;k<n;k++){
arr[k]=s.nextInt();
}
rec_insertion(arr,i,n);
System.out.println("Sorted array using recursive bubble sort: ");
for(int k=0;k<n;k++){
System.out.print(arr[k]+" ");
}
}
public static int[] rec_insertion(int[] arr,int i, int n){
if(i==n){
return arr;
}
else{
int j =i;
while(j>0 && arr[j-1]>arr[j]){
int temp=arr[j-1];
arr[j-1]=arr[j];
arr[j]=temp;
j--;
}
return rec_insertion(arr,i+1,n);
}
}
}
