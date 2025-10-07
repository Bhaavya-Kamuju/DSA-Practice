import java.io.*;
import java.util.*;
class Left_rotate_array_byOneplace{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr =new int[n];
System.out.println("Enter the elements of an array: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
leftRotate(arr,n);
System.out.println("Array after rotated to left by one place: ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
public static int[] leftRotate(int[] arr,int n){
int temp=arr[0];
for(int i=0;i<n-1;i++){
arr[i]=arr[i+1];
}
arr[n-1]=temp;
return arr;
}
}
