import java.io.*;
import java.util.*;
class LongestSubarray_positives{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum value: ");
        int S = sc.nextInt(); //Taking target sum value
        int result = longestSubarray(arr,n,S);
        System.out.println("Length of longest subarray whose elements summation equals to given sum: "+result);
    }
  //BRUTE FORCE APPROACH (TC ~= O(N^3) , SC = O(1))
    public static int longestSubarray(int[] arr, int n,int S){
        int maxLen = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum = sum+arr[k];
                }
                if(sum == S){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}
