import java.io.*;
import java.util.*;
class Linearsearch{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of an array: ");
int n = s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
System.out.println("Enter the search element: ");
int x = s.nextInt();
int result = linearSearch(arr,n,x);
if(result == -1){
System.out.println("Element is not found in the array");
}
else{
System.out.println("The element is found at : "+result+" index.");
System.out.println("That is the element is at "+i+1+" index");
}
}
public static int linearSearch(int[] arr,int n,int x){
int index = -1;
for(int i=0;i<n;i++){
if(arr[i]==x){
index = i;
}
}
return index;
}
}


