/*import java.io.*;
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
    //BRUTEFORCE APPROACH (TC = O(N^2), SC = O(1))
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
    // BETTER APPRAOCH 1 (USING HASHING i.e., Hash array) (TC=O(N)+O(N)+O(N) = O(N), SC = O(MAX+1) Where max = max no.of elements
    public static int singleOccurence(int[] arr,int n){
        int max = arr[0];
        for(int i=0;i<n;i++){
            max = Math.max(arr[i],max);
        }
        int[] hash = new int[max+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(hash[arr[i]]==1){
                return arr[i];
            }
        }
        return -1;
    }
    //Better approach 2 (USING MAP DATASTRUCTURE) (TC=O(N*logM) + O(M), where M = size of the map i.e. M = (N/2)+1. N = size of the array. , SC = O(M))
    public static int singleOccurence(int[] arr,int n){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int value = mp.getOrDefault(arr[i],0);
            mp.put(arr[i],value+1);
        }
        for(Map.Entry<Integer,Integer> it : mp.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }
}
*/
//Optimal Approach (TC = O(N), SC =O(1))
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
        System.out.println("Number occurred only once : "+result);
    }
    public static int singleOccurence(int[] arr,int n){
        int xor = 0;
        for(int i=0;i<n;i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}
