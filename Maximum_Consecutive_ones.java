import java.io.*;
import java.util.*;
class Maximum_Consecutive_ones{
    public static void main (String[] args){
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements(0s and 1s): ");
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max = maxConsecutives(arr,n);
        System.out.println("Maximum number of consecutive ones: "+max);
    }
    // TC = O(N) AND SC = O(1)
    public static int maxConsecutives(int[] arr,int n){
        int count =0, max_count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count = 0;
            }
            if(count>max_count){
                    max_count = count;
                }
        }
        return max_count;
    }
}
