import java.io.*;
import java.util.*;
class Move_zeroes_to_END{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
moveZeroes(arr,n);
System.out.println("Array after moving zeroes to end: ");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
//BRUTE FORCE (TC=O(2n), SC=O(x) where x = no.of non-zero elements
public static int[] moveZeroes(int[] arr,int n){
ArrayList<Integer> temp = new ArrayList<>();
for(int i=0;i<n;i++)
{
if(arr[i]!=0){
temp.add(arr[i]);
}
}
for(int i=0;i<temp.size();i++){
arr[i]=temp.get(i);
}
int Nz = temp.size();//Nz = no.of non-zero elements
for(int i=Nz;i<n;i++){
arr[i]=0;
}
return arr;
}
}



