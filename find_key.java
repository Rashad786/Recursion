package Recursion;
//find all the indices of key
public class find_key {
    public static void findkey(int arr[],int key,int i){
        if(i==arr.length) return;
        if(arr[i]==key) System.out.print(i+" ");
        findkey(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        findkey(arr,key,0);
        System.out.println();
    }
}
