import java.io.*;
import java.util.*;
class LeftRotate_array_by_Dplaces{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the no.of places you want to shift: ");
int d = s.nextInt();
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
leftRotate(arr,n,d);
System.out.println("An array after rotated to left by D places: ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
public static int[] leftRotate(int[] arr, int n,int d){
int[] temp = new int[n];
for(int i=0;i<d;i++){
temp[i]=arr[i];
}
for(int i=d ; i<n ; i++){
arr[i-d]=arr[i];
}
for(int i=n-d;i<n;i++){
arr[i]=temp[i-(n-d)];
}
return arr;
}
}
