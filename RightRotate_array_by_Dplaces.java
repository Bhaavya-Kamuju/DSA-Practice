import java.io.*;
import java.util.*;
class RightRotate_array_by_Dplaces{
public static void main(String[] args){
Scanner s =new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
System.out.println("Enter how many places you want to shift: ");
int d = s.nextInt();
rightRotate(arr,n,d);
System.out.println("Array after shifting to right: ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
/*BRUTEFORCE Approach
public static int[] rightRotate(int[] arr,int n, int d){
d=d%n;
if(n==0){
System.out.println("Given array length is zero");
return arr;
}
if(d>n){
return arr;
}
int[] temp = new int[d];
for(int i = n-d;i<n;i++){
temp[i-n+d]=arr[i];
}
for(int i=n-d-1;i>=0;i--){
arr[i+d]=arr[i];
}
for(int i=0;i<d;i++){
arr[i]=temp[i];
}
return arr;
}
*/
//Optimal Approach
public static int[] rightRotate(int[] arr,int n, int d){
reverse(arr,0,n-d-1);
reverse(arr,n-d,n-1);
reverse(arr,0,n-1);
return arr;
}
public static int[] reverse(int[] arr,int start,int end){
while(start<=end){
int temp = arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}
return arr;
}
}





