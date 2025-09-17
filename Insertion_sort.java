import java.io.*;
import java.util.*;
class Insertion_sort{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr=new int[n];
System.out.println("Enter the elements of an array: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
insertionSort(arr,n);
System.out.println("sorted array using insertion sort: ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
public static void insertionSort(int[] arr,int n){
for(int i=0;i<n;i++)
{
int j=i;
while(j>0 && arr[j-1]>arr[j]){
swap(arr,j-1,j);
j--;
}
}
}
public static void swap(int[] arr,int i, int j){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}





