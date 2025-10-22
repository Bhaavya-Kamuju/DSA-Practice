import java.io.*;
import java.util.*;
class single_occurence{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int result = singleOccurence(arr,n);
        if(result == -1){
            System.out.println("No number occurred only one time");
        }
        else{
            System.out.println("Number occurred only once : "+result);
        }
    }
    public static int singleOccurence(int[] arr,int n){
        for(int i=0;i<n;i++){
            int num = arr[i];
            int count = 0;
            for(int j = 0;j<n;j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }
}
