import java.io.*;
import java.util.*;
class Merge_sort{
public static void mergeSort(int[] arr,int low, int high) {
   if(low>=high){
       return;
    }
   int mid =(low+high)/2;
   mergeSort(arr,low,mid);
   mergeSort(arr,mid+1,high);
   merge(arr,low,mid,high);
 }
 public static void merge(int[] arr,int low,int mid,int high){
   int[] temp = new int[high-low+1];
   int left=low;
   int right=mid+1;
   int k=0;
   while(left<=mid && right<= high){
        if(arr[left]<=arr[right]){
            temp[k++]=arr[left++];
        }
        else{
            temp[k++]=arr[right++];
        }
    }
    while(left<=mid){
         temp[k++]=arr[left++];
    }
    while(right<=high){
         temp[k++]=arr[right++];
    }
    for(int i=low; i<=high;i++){
	arr[i]=temp[i-low];
    }
   }
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter the length of an array: ");
int n =s.nextInt();
int[] arr = new int[n];
System.out.println("Enter the array elements: ");
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
int low=0, high=n-1;
mergeSort(arr,low,high);
System.out.println("Sorted array using merge sort:");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
}

/*
class Merge_sort {

    public static void mergeSort(ArrayList<Integer> nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public static void merge(ArrayList<Integer> nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (nums.get(left) <= nums.get(right)) {
                temp.add(nums.get(left));
                left++;
            } else {
                temp.add(nums.get(right));
                right++;
            }
        }

        while (left <= mid) {
            temp.add(nums.get(left));
            left++;
        }
        while (right <= high) {
            temp.add(nums.get(right));
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums.set(i, temp.get(i - low));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr.add(s.nextInt());
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int x=0;x< arr.size();x++) { //for(int x: arr){System.out.println(x+" ");}
            System.out.print(arr.get(x) + " ");
        }
    }
}
*/



 