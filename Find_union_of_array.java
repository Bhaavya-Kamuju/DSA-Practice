import java.util.*;

class Union_array{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the first array length: ");
    int n = s.nextInt();
    int[] arr1 = new int[n];
    System.out.println("Enter first array's elements:");
    for(int i=0;i<n;i++){
      arr1[i]=s.nextInt();
    }
    System.out.println("Enter the second array length: ");
    int m = s.nextInt();
    int[] arr2 = new int[m];
    System.out.println("Enter second array's elements:");
    for(int i=0;i<m;i++){
      arr2[i]=s.nextInt();
    }
    ArrayList<Integer> result = new ArrayList<>();
     result = findUnion(arr1,arr2,n,m);
    System.out.println("Result of the union of 2 arrays: ");
    for(int i=0;i<result.size();i++){
        System.out.print(result.get(i)+" ");
    }
  }
  //BRUTE FORCE APPROACH (TC = O(nlogn+mlogn)+O(n+m) , SC=O(n+m)+O(n+m))
  /*
  public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n,int m){
    ArrayList<Integer> union = new ArrayList<>();
    HashSet<Integer> hs = new HashSet<>();
    for(int i=0;i<n;i++){
      hs.add(arr1[i]);
    }
    for(int i=0;i<m;i++){
      hs.add(arr2[i]);
    }
    for(int it:hs){
      union.add(it);
    }
    return union;
  }
}
*/
/* using hashmap (TC = O(n+mlog(n+m)) , SC=O(n+m)
public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n,int m){
    ArrayList<Integer> union = new ArrayList<>();
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i=0;i<n;i++){
      hm.put(arr1[i],hm.getOrDefault(arr1[i],0)+1);
    }
    for(int i=0;i<m;i++){
      hm.put(arr2[i],hm.getOrDefault(arr2[i],0)+1);
    }
    for(int it:hm.keySet()){
      union.add(it);
    }
    return union;
  }
}
*/
    
//Optimal approach (TC = O(n+m) sc= O(n+m)
  public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n,int m){
    ArrayList<Integer> union = new ArrayList<>();
    int i = 0,j=0;
    while(i<n && j<m){
      if(arr1[i]<arr2[j]){
        if(union.size() == 0 || union.get(union.size()-1) != arr1[i]){
          union.add(arr1[i]);
        }
        i++;
      }
      else{
        if(union.size() == 0 || union.get(union.size()-1) != arr2[j]){
          union.add(arr2[j]);
        }
        j++;
      }
    }
    while(i<n){ //if elements are left in arr1
        if(union.size() == 0 || union.get(union.size()-1) != arr1[i]){
          union.add(arr1[i]);
        }
        i++;
      }
    while(j<m){ //if elements are left in arr1
        if(union.size() == 0 || union.get(union.size()-1) != arr2[j]){
          union.add(arr2[j]);
        }
        j++;
    }
    return union;
  }
}
      
        
