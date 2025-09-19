import java.io.*;
import java.util.*;
class Prime_specific{
public static void main(String[] args){
ArrayList<Integer> list = new ArrayList<>();
Scanner s = new Scanner(System.in);
System.out.println("enter the value to see the prime number: ");
int val = s.nextInt();
int n= 1000;
for(int i=2;i<=n;i++){
int count=0;
for(int j=1;j<=i;j++){
if(i%j==0){
count++;
}
}
if(count==2){
list.add(i);
}
}
if(val<=list.size()){ 
System.out.println("your required prime number is: "+list.get(val));
}
}
}


 





