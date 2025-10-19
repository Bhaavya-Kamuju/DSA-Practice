import java.io.*;
import java.util.*;
class FindMissing{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int[] arr = new int[n-1]; //because we have to read only n-1 length array
        System.out.println("Enter array elements: ");
        for(int i=0;i<n-1;i++){
            arr[i] = s.nextInt();
        }
        int result = findmissing(arr,n);
        
        System.out.println("The missing number is : "+result);
    }
    public static int findmissing(int[] arr,int n){
       for(int i=1;i<=n;i++){ //iterate to check 1-N numbers
           int flag = 0; //initially inc=dicates the number is not in array, if i is in array flag value becomes 1
           for(int j=0;j<n-1;j++){ //iterate over array of length n-1
               if(arr[j]==i){
                   flag =1; //If array contains i flag becomes 1
                   break;
               }
           }
           if(flag==0){ //if the element is missing flag value is zero
               return i;
           }
       }
       return -1; //This will not execute, this is written just to avoid warnings
    }
}
