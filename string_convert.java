package Recursion;

public class string_convert {
    public static void str(int x){
        if(x==0) return;
        String a[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int r=x%10;
        str(x/10);
        System.out.print(a[r]+" ");
        
    }
    public static void main(String[] args) {
        int n=2024;
        str(n);
    }
}
