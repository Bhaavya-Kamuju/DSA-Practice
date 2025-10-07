import java.io.*;
import java.util.*;
class Check_sorted_array{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr =new int[n];
System.out.println("Enter the elements of an array: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
if(check_array(arr,n)){
System.out.println("Array is sorted");
}
else{
System.out.println("Array is unsorted");
}
}
public static Boolean check_array(int[] arr,int n){
for(int i=1;i<n;i++){
if(arr[i-1]>arr[i]){
return false;
}
}
return true;
}
}

