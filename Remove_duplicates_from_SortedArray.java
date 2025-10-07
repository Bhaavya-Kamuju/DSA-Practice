import java.io.*;
import java.util.*;
class Remove_duplicates_from_SortedArray{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr =new int[n];
System.out.println("Enter the elements of an array in asceding order: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
int k = removeDuplicates(arr);
System.out.println("Array after removing duplicates from sorted array: ");
for(int i=0;i<k;i++){
System.out.print(arr[i]+" ");
}
}
public static int removeDuplicates(int[] arr){
int i=0;
for(int j=1;j<arr.length;j++){
if(arr[i]!=arr[j]){
i++;
arr[i]=arr[j];
}
}
return i+1;
}
}